import { Component, ElementRef, Inject, OnInit, ViewChild } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';
import { MemMembruTipRequest_Schimbare } from '../../../../payloads/mem/MemMembruTipRequest_Schimbare';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';


import { InAppBrowser, InAppBrowserEvent, InAppBrowserOptions } from '@ionic-native/in-app-browser';

@Component({
  selector: 'app-getlatlong',
  templateUrl: './getlatlong.page.html',
  styleUrls: ['./getlatlong.page.scss'],
})
export class GetLatLongPage implements OnInit {

  @ViewChild('gmap', { static: false }) public gmapElement: ElementRef;
  @ViewChild('framemap') public framemapElement: ElementRef;
 // @ViewChild('gmap') gmapElement: HTMLDivElement;
  map: google.maps.Map;

  isTracking = false;

  currentLat: any;
  currentLong: any;

  marker: google.maps.Marker;

  frmGetLatLongerea: FormGroup = new FormGroup(
    {
       mesaj: new FormControl('',[]),// [Validators.required, Validators.minLength(8), Validators.maxLength(16)]),
    });
  crtactiune : any = null;
  loginResponse : any;
  token : string;

   iab: typeof InAppBrowser;
  constructor(private store: Store, private navController: NavController, 
  private platform: Platform, private storage: Storage )  
  {
    //this.confirmsimact = null;
    var self = this;
    this.getLocalStorageData()
            .then(async data =>{
              data = await self.storage.get("token");
              while (data == null) 
                data = await this.storage.get("token");
              //---
              self.token = <string>(data);
        
            })
  }

  getLocalStorageData(){
    var self =this;
    return new Promise(resolve => {
      self.storage.get("crtactiune")
        .then( value => 
            { 
              self.crtactiune = value;
              console.log(value);
              resolve(value);
            });
            
         });
    }

  done() {
    /**
    if (this.frmGetLatLong.valid) {
      console.log(this.frmGetLatLong.value);
    }*/
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  onGetLatLongerea() {
    if (this.frmGetLatLongerea.valid) 
    {
      console.log(this.frmGetLatLongerea.value);
      var memMembruTipRequestSchimbare : MemMembruTipRequest_Schimbare = new MemMembruTipRequest_Schimbare();
      //---
      memMembruTipRequestSchimbare.crtmemtipcod = "MEMINCNFL";
	    memMembruTipRequestSchimbare.newmemtipcod = "MEMACTNFL";
      //---
	    memMembruTipRequestSchimbare.crtmemrolcod = "MEMINCNFL";
	    memMembruTipRequestSchimbare.newmemrolcod = "MEMACTNFL";
      //---
      this.store.dispatch(new AuthAction.MemMembruTipSchimbare(memMembruTipRequestSchimbare, this.token));

    }
  }

/**
  ngOnInit(){
    //this.frmGetLatLong = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
*/

  /** 
  ngOnInit() {
  }*/

  ngOnInit(){

    //iab = new InAppBrowser();
    var options : InAppBrowserOptions= {
      location : 'yes',//Or 'no' 
      hidden : 'no', //Or  'yes'
      clearcache : 'yes',
      clearsessioncache : 'yes',
      zoom : 'yes',//Android only ,shows browser zoom controls 
      hardwareback : 'yes',
      mediaPlaybackRequiresUserAction : 'no',
      shouldPauseOnSuspend : 'no', //Android only 
      closebuttoncaption : 'Close', //iOS only
      disallowoverscroll : 'no', //iOS only 
      toolbar : 'yes', //iOS only 
      enableViewportScale : 'no', //iOS only 
      allowInlineMediaPlayback : 'no',//iOS only 
      presentationstyle : 'pagesheet',//iOS only 
      fullscreen : 'yes',//Windows only    
    };
  }
  

  ngAfterViewInit() {
    //console.log(this.myDiv.nativeElement.innerHTML);
    var mapProp = {  
      center: new google.maps.LatLng(44.439663, 26.096306),
      zoom: 15,
      mapTypeId: google.maps.MapTypeId.ROADMAP
    };
    this.map = new google.maps.Map(this.gmapElement.nativeElement, mapProp);
    this.setupListener(this.map,"click");
  }
  findMe() {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition((position) => {
        const iframe =  document.getElementById('framemapid') as HTMLIFrameElement;//@44.4291494,26.1434725,14z
        //iframe.contentWindow.location.replace("https://www.google.com/maps/@?api=1&map_action=map&center=" + position.coords.latitude +
          //         "%2C" + position.coords.longitude + "&zoom=12&basemap=street&output=embed");
       this.framemapElement.nativeElement.src = "http://maps.google.com/maps?q="+ position.coords.latitude 
                             + "%2C" + position.coords.longitude + "&z=17&output=embed";

        this.showPosition(position);
      });
    } else {
      alert("Geolocation is not supported by this browser.");
    }
  }

  showPosition(position) {
    this.currentLat = position.coords.latitude;
    this.currentLong = position.coords.longitude;

    let location = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
    this.map.panTo(location);

    if (!this.marker) {
      this.marker = new google.maps.Marker({
        position: location,
        map: this.map,
        title: 'Got you!'
      });
    }
    else {
      this.marker.setPosition(location);
    }
  }

  trackMe() {
    if (navigator.geolocation) {
      this.isTracking = true;
      navigator.geolocation.watchPosition((position) => {
        this.showTrackingPosition(position);
      });
    } else {
      alert("Geolocation is not supported by this browser.");
    }
  }

  setupListener(map, name) {
    google.maps.event.addListener(map, name, function(e) {
        if (name == "click") {
            //alert(e.latLng.lat().toFixed(6));
            alert(e.latLng.lat() + " - " + e.latLng.lng());
        }
    });
  }


  showTrackingPosition(position) {
    console.log(`tracking postion:  ${position.coords.latitude} - ${position.coords.longitude}`);
    this.currentLat = position.coords.latitude;
    this.currentLong = position.coords.longitude;

    let location = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
    this.map.panTo(location);

    if (!this.marker) {
      this.marker = new google.maps.Marker({
        position: location,
        map: this.map,
        title: 'Got you!'
      });
    }
    else {
      this.marker.setPosition(location);
    }
  }

}


/**
 * browser.executeScript({code:'window.getSelection().toString();'}).then((selection)=>{
packet.text = selection[0];});
 */

    /** 
    var requestPath = "/";
    var version= "";
    var merchantID="";
    var acquirerID="";
    const pageContent = '<html><head></head><body>' +
    '<form name="redirect" id="redirect" action="' + requestPath + '" method="post">' +
    '<input type="hidden" name="Version" value="' + version + '">' +
    '<input type="hidden" name="MerID" value="' + merchantID + '">' +
    '<input type="hidden" name="AcqID" value="' + acquirerID + '">' +
  
    '</form> <script type="text/javascript">document.getElementById("redirect").submit();</script>' +
    '</body></html>';
  
  const pageContentUrl = 'data:text/html;base64,' + btoa(pageContent);
  
  const browserRef = InAppBrowser
    .create(
      pageContentUrl,
      '_blank',
      options
    );
  
  browserRef.on('loadstop').subscribe(event => {
    console.log('loadstop started');
    console.log(event);
    console.log('loadstop url', event.url);
  
    if (event.url == 'https://www.google.com') {
      console.log(JSON.stringify(event));
      browserRef.close();
    }
  
  });
    return;
    var close;
    var closeLoop;
    */
    //------------ const browser = InAppBrowser.create('https://www.google.com','_system',options);//{location:'no'});
    /** 
    browser.on('loadstop').subscribe((event: InAppBrowserEvent) => {
      console.log("LOG: API Response");
      console.log(event.url);
      return;
      browser.insertCSS({
        "code": ".youtube_done_button { position: fixed; bottom: 0; width: 100%; background: rgba(0, 0, 0, 0.8); color: #2196F3; padding: 10px; font-size: 20px;}"   
      });

      //setting close to false when the InAppBrowser is opened
      browser.executeScript({
         code: "localStorage.setItem('close', 'false');"
      });
         
      //creating and attaching a button with click listener to the opened page
      browser.executeScript({
            code: "(function() { var body = document.querySelector('body'); var button = document.createElement('div'); button.innerHTML = 'Done'; button.classList.add('youtube_done_button'); button.onclick = function() { localStorage.setItem('close', 'true'); }; body.appendChild(button); })();"                
      });
            
      closeLoop = setInterval(function() {
        browser.executeScript({
            code: "localStorage.getItem('close'); close = values[0]; if (close == \"true\") {clearInterval(closeLoop);win.close();}"
            })}, 1000);

    });
    */
/** 
    openInAppBrowser() {
      var close;
      var closeLoop;
              
      var win = InAppBrowser.create('http://youtube.com', '_blank', 'location=no');
  
      win.on('loadstop')
      {
        win.insertCSS({
          "code": ".youtube_done_button { position: fixed; bottom: 0; width: 100%; background: rgba(0, 0, 0, 0.8); color: #2196F3; padding: 10px; font-size: 20px;}"   
        });
  
        //setting close to false when the InAppBrowser is opened
        win.executeScript({
           code: "localStorage.setItem('close', 'false');"
        });
           
        //creating and attaching a button with click listener to the opened page
        win.executeScript({
              code: "(function() { var body = document.querySelector('body'); var button = document.createElement('div'); button.innerHTML = 'Done'; button.classList.add('youtube_done_button'); button.onclick = function() { localStorage.setItem('close', 'true'); }; body.appendChild(button); })();"                
        });
              
        closeLoop = setInterval(function() {
          win.executeScript({
              code: "localStorage.getItem('close'); close = values[0]; if (close == \"true\") {clearInterval(closeLoop);win.close();}"
              })}, 1000);
      }
    }
  */
    /** 
    test() {
      //injecting the CSS
      win.insertCSS({
          "code": ".youtube_done_button { position: fixed; bottom: 0; width: 100%; background: rgba(0, 0, 0, 0.8); color: #2196F3; padding: 10px; font-size: 20px;}"   
      });
  
      //setting close to false when the InAppBrowser is opened
      win.executeScript({
          code: "localStorage.setItem('close', 'false');"
      });
           
      //creating and attaching a button with click listener to the opened page
      win.executeScript({
              code: "(function() { var body = document.querySelector('body'); var button = document.createElement('div'); button.innerHTML = 'Done'; button.classList.add('youtube_done_button'); button.onclick = function() { localStorage.setItem('close', 'true'); }; body.appendChild(button); })();"                
      });
              
      closeLoop = setInterval(function() {
          win.executeScript({
              code: "localStorage.getItem('close');"
          },
          function(values) {
              close = values[0];
              if (close == "true") {
                   clearInterval(closeLoop);
                   win.close();
              }
          });
      }, 1000);
  }*/
  