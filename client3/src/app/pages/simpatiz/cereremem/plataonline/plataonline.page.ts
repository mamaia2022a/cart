import { AfterViewInit, Component, ElementRef, Inject, OnInit, QueryList, ViewChild, ViewChildren } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';
import { PayDataResponse_Creare } from '../../../../payloads/pay/PayDataResponse_Creare';
import { Observable, of } from 'rxjs';


@Component({
  selector: 'app-plataonline',
  templateUrl: './plataonline.page.html',
  styleUrls: ['./plataonline.page.scss'],
})
export class PlataOnlinePage implements AfterViewInit {

  @ViewChild('framemap') public framemapElement: ElementRef;
  
  frmplataonline: FormControl;



  crtactiune : any = null;
  loginResponse : any;

  paydata$ : Observable<any> = null;
  paydata  : PayDataResponse_Creare = null;
  url : string;

  constructor(private storage: Storage) 
  {
    //this.plataonline = null
    var self = this;
    this.getLocalStorageData()
      .then(async () => {

        var data = await this.storage.get("paydata");
        while (data == null) 
          data = await this.storage.get("paydata");
        //---
        self.paydata   = data
        self.url  = "https://secure.euplatesc.ro/tdsprocess/tranzactd.php?" +
                   "amount=" + self.paydata.amount + 
                   "&curr="       + self.paydata.curr        +
                   "&invoice_id=" + self.paydata.invoice_id  +
                   "&order_desc=" + self.paydata.order_desc  +
                   "&merch_id="   + self.paydata.merch_id    +
                   "&timestamp="  + self.paydata.timestamp   +
                   "&nonce="      + self.paydata.nonce       +
                   "&fp_hash="    + self.paydata.fp_hash     +
                   "&ExtraData[silenturl]="  + self.paydata.ipnurl +
                   "&ExtraData[backtosite]=" + self.paydata.backtositeurl ;
                   //"&ExtraData[silenturl]=http://turda.hopto.org:8089/api/pay/ipn&ExtraData[backtosite]=http://www.appaur.ro/";
                   //&ExtraData[successurl]=http://www.appaur.ro& ExtraData[failedurl]=http://www.appaur.ro/&ExtraData[ep_target]=self&ExtraData[backtosite]=http://www.appaur.ro/";
        self.paydata$  = of(data);
        self.framemapElement.nativeElement.src = self.url;
        //"https://secure.euplatesc.ro/tdsprocess/tranzactd.php?amount=0.1&curr=RON&invoice_id=1667867443808&order_desc=TEST&merch_id=44840999634&timestamp=20221108003043&nonce=ABCDEF0123456789&fp_hash=ca9a8e44d55d0e7ad6de1650383c744c";
        //self.url;
        //"https://secure.euplatesc.ro/tdsprocess/tranzactd.php?amount=0.01&curr=RON&invoice_id=21&order_desc=PLATA_DE_TEST_1&merch_id=44840999634&timestamp=20221030160100&nonce=ABCDEF0123456789&fp_hash=627699e11b712e8bbccf177965b654dd&ExtraData[silenturl]=http://turda.hopto.org:8089/api/pay/ipn&ExtraData[successurl]=http://www.appaur.ro& ExtraData[failedurl]=http://www.appaur.ro/&ExtraData[ep_target]=self&ExtraData[backtosite]=http://www.appaur.ro/" 

            
      });
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
    if (this.frmplataonline.valid) {
      console.log(this.frmplataonline.value);
    }
  }

  selectiePlata(tipplata : string) {
      console.log("selectie tip plata : " + tipplata);
  }

  ngOnInit(){
    this.frmplataonline = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
    //this.framePayElement.nativeElement.src = this.url ;

  }

  ///@ViewChildren(MyComponent) childrenComponent: QueryList<MyComponent>;

  public ngAfterViewInit(): void
  {
    //this.framemapElement.nativeElement.src = this.url;
    //this.framemapElement.changes.subscribe((comps: QueryList<framemapElement>) =>
    //{
      // Now you can access to the child component
    ////});
  }

  /** 
  public ngAfterViewInit(): void
    {
        var self = this;
        this.framemapElement.nativeElement.subscribe((comps: any) =>
        {
            //this.SearchGrid = comps.first;
            self.framemapElement.nativeElement.src = self.url;
          });


    }*/

}
