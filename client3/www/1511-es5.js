!function(){function n(n,t){if(!(n instanceof t))throw new TypeError("Cannot call a class as a function")}function t(n,t){for(var e=0;e<t.length;e++){var o=t[e];o.enumerable=o.enumerable||!1,o.configurable=!0,"value"in o&&(o.writable=!0),Object.defineProperty(n,o.key,o)}}(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[1511],{31511:function(e,o,i){"use strict";i.r(o),i.d(o,{GetLatLongPageModule:function(){return k}});var a=i(64762),r=i(62272),s=i(38583),c=i(3679),l=i(4050),u=i(44466),m=i(68168),g=i(61628),p=i(3524),d=i(83752),h=function(){function e(t,o,i,r){var s=this;n(this,e),this.store=t,this.navController=o,this.platform=i,this.storage=r,this.isTracking=!1,this.frmGetLatLongerea=new c.cw({mesaj:new c.NI("",[])}),this.crtactiune=null;var l=this;this.getLocalStorageData().then(function(n){return(0,a.mG)(s,void 0,void 0,regeneratorRuntime.mark(function t(){return regeneratorRuntime.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,l.storage.get("token");case 2:n=t.sent;case 3:if(null!=n){t.next=9;break}return t.next=6,this.storage.get("token");case 6:n=t.sent;case 7:t.next=3;break;case 9:l.token=n;case 10:case"end":return t.stop()}},t,this)}))})}var o,i,r;return o=e,(i=[{key:"getLocalStorageData",value:function(){var n=this;return new Promise(function(t){n.storage.get("crtactiune").then(function(e){n.crtactiune=e,console.log(e),t(e)})})}},{key:"done",value:function(){}},{key:"selectieFaActiune",value:function(n){console.log("selectie fa actiune : "+n)}},{key:"onGetLatLongerea",value:function(){if(this.frmGetLatLongerea.valid){console.log(this.frmGetLatLongerea.value);var n=new p.u;n.crtmemtipcod="MEMINCNFL",n.newmemtipcod="MEMACTNFL",n.crtmemrolcod="MEMINCNFL",n.newmemrolcod="MEMACTNFL",this.store.dispatch(new d.g.MemMembruTipSchimbare(n,this.token))}}},{key:"ngOnInit",value:function(){}},{key:"ngAfterViewInit",value:function(){var n={center:new google.maps.LatLng(44.439663,26.096306),zoom:15,mapTypeId:google.maps.MapTypeId.ROADMAP};this.map=new google.maps.Map(this.gmapElement.nativeElement,n),this.setupListener(this.map,"click")}},{key:"findMe",value:function(){var n=this;navigator.geolocation?navigator.geolocation.getCurrentPosition(function(t){document.getElementById("framemapid"),n.framemapElement.nativeElement.src="http://maps.google.com/maps?q="+t.coords.latitude+"%2C"+t.coords.longitude+"&z=17&output=embed&t=h",n.showPosition(t)}):alert("Geolocation is not supported by this browser.")}},{key:"showPosition",value:function(n){this.currentLat=n.coords.latitude,this.currentLong=n.coords.longitude;var t=new google.maps.LatLng(n.coords.latitude,n.coords.longitude);this.map.panTo(t),this.marker?this.marker.setPosition(t):this.marker=new google.maps.Marker({position:t,map:this.map,title:"Got you!"})}},{key:"trackMe",value:function(){var n=this;navigator.geolocation?(this.isTracking=!0,navigator.geolocation.watchPosition(function(t){n.showTrackingPosition(t)})):alert("Geolocation is not supported by this browser.")}},{key:"setupListener",value:function(n,t){google.maps.event.addListener(n,t,function(n){"click"==t&&alert(n.latLng.lat()+" - "+n.latLng.lng())})}},{key:"showTrackingPosition",value:function(n){console.log("tracking postion:  ".concat(n.coords.latitude," - ").concat(n.coords.longitude)),this.currentLat=n.coords.latitude,this.currentLong=n.coords.longitude;var t=new google.maps.LatLng(n.coords.latitude,n.coords.longitude);this.map.panTo(t),this.marker?this.marker.setPosition(t):this.marker=new google.maps.Marker({position:t,map:this.map,title:"Got you!"})}}])&&t(o.prototype,i),r&&t(o,r),e}();h.ctorParameters=function(){return[{type:m.yh},{type:l.SH},{type:l.t4},{type:g.K}]},h.propDecorators={gmapElement:[{type:r.i9L,args:["gmap",{static:!1}]}],framemapElement:[{type:r.i9L,args:["framemap"]}]},h=(0,a.gn)([(0,r.wA2)({selector:"app-getlatlong",template:'\n\n<ion-header>\n  <ion-toolbar color="dark">\n        <ion-buttons slot="start">\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\n        </ion-buttons>\n    <ion-buttons slot="secondary">\n      <ion-button>\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\n      </ion-button>\n      \x3c!-- \n      <ion-button>\n        <ion-icon slot="icon-only" name="search"></ion-icon>\n      </ion-button>\n      --\x3e\n    </ion-buttons>\n    <ion-buttons slot="primary">\n      <ion-button color="danger">\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\n      </ion-button>\n    </ion-buttons>\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\n  </ion-toolbar>  \n</ion-header>\n\n<ion-content [fullscreen]="true">\n   \n  <h3>Geo-Loca\u021bie</h3>\n  \x3c!-- List of Text Items \n      <ng-container *ngIf="crtactiune">\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\n     </ng-container>\n    --\x3e\n     \x3c!--\n     <ion-grid>\n      <ion-row>\n        <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\n          <form [formGroup]="frmGetLatLongerea" (ngSubmit)="onGetLatLongerea()">\n            <ion-card color="light" class="auth-card ion-margin">\n              <ion-item color="light" class="ion-no-inner-padding-end">\n                <ion-input type="text" [readonly]="true" placeholder="Trimite Confirmarea pentru a deveni Membru Activ Neafiliat" formControlName="mesaj"></ion-input>\n              </ion-item>\n            </ion-card>\n  \n            <ion-button\n              expand="block"\n              class="ion-margin-start ion-margin-end ion-margin-bottom"\n              type="submit"\n              [disabled]="!frmGetLatLongerea.valid"\n            >\n              Confirmare Cerere Membru Activ\n            </ion-button>\n            <span class="ion-margin"></span>\n          </form>\n  \n        </ion-col>\n      </ion-row>\n    </ion-grid>\n  --\x3e\n  \n  <div class="container">\n    \x3c!-- \n    <div style="text-align:center">\n      <h1>\n        Google Map Geolocation\n      </h1>\n    </div>\n  --\x3e\n  \x3c!--\n    <div class="alert alert-warning">\n      Nota: Daca "Track me" este activ, refresh page ca sa recativati Find me !\n    </div>\n  --\x3e\n    <div>\n      <div>\n        <ion-button [disabled]="isTracking" (click)="findMe()">Click pentru Loca\u021bia mea</ion-button>\n        \x3c!-- <button  (click)="trackMe()">Track me</button> --\x3e\n      </div>\n      <div class="text-white">\n        <span>Latitude: {{currentLat}}</span>\n        <span> - Longitudine: {{currentLong}}</span>\n      </div>\n      <iframe #framemap id="framemapid" style="width:100%;height:400px"\n             src="http://maps.google.com/maps?q=44.439663%2C26.096306&z=18&output=embed&t=h"></iframe>\n      <br>\n      <div class="row">\n        <div class="col-md-12">\n          <div class="text-center">\n            <h3>\n              <div #gmap [hidden]="true" style="width:100%;height:600px"></div>\n            </h3>\n          </div>\n        </div>\n      </div>\n    </div>\n    <br>\n  </div>\n  \n \n\n\n</ion-content>\n',styles:[""]})],h);var f=i(26096),v=[{path:"",component:h}],b=function t(){n(this,t)};b=(0,a.gn)([(0,r.LVF)({imports:[f.Bz.forChild(v)],exports:[f.Bz]})],b);var k=function t(){n(this,t)};k=(0,a.gn)([(0,r.LVF)({imports:[s.ez,c.u5,l.Pc,b,u.m],declarations:[h]})],k)}}])}();
//# sourceMappingURL=1511-es5.js.map