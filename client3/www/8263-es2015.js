(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[8263],{28263:function(n,t,r){"use strict";r.r(t),r.d(t,{ActNTriCerPageModule:function(){return f}});var o=r(64762),e=r(62272),i=r(38583),a=r(3679),c=r(4050),s=r(44466),l=r(68168),u=r(61628),m=r(3524),p=r(83752);let d=class{constructor(n,t,r,e){this.store=n,this.navController=t,this.platform=r,this.storage=e,this.frmActNTriCererea=new a.cw({mesaj:new a.NI("Confirmare pentru Membru Activ Neafiliat",[])}),this.crtactiune=null;var i=this;this.getLocalStorageData().then(n=>(0,o.mG)(this,void 0,void 0,function*(){for(n=yield i.storage.get("token");null==n;)n=yield this.storage.get("token");i.token=n}))}getLocalStorageData(){var n=this;return new Promise(t=>{n.storage.get("crtactiune").then(r=>{n.crtactiune=r,console.log(r),t(r)})})}done(){}selectieFaActiune(n){console.log("selectie fa actiune : "+n)}onActNTriCererea(){if(this.frmActNTriCererea.valid){console.log(this.frmActNTriCererea.value);var n=new m.u;n.crtmemtipcod="MEMINCNFL",n.newmemtipcod="MEMACTNFL",n.crtmemrolcod="MEMINCNFL",n.newmemrolcod="MEMACTNFL",this.store.dispatch(new p.g.MemMembruTipSchimbare(n,this.token))}}ngOnInit(){console.log(this.crtactiune)}};d.ctorParameters=()=>[{type:l.yh},{type:c.SH},{type:c.t4},{type:u.K}],d=(0,o.gn)([(0,e.wA2)({selector:"app-actntricer",template:'<ion-header>\r\n  <ion-toolbar color="dark">\r\n        <ion-buttons slot="start">\r\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\r\n        </ion-buttons>\r\n    <ion-buttons slot="secondary">\r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\r\n      </ion-button>\r\n      \x3c!-- \r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="search"></ion-icon>\r\n      </ion-button>\r\n      --\x3e\r\n    </ion-buttons>\r\n    <ion-buttons slot="primary">\r\n      <ion-button color="danger">\r\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\r\n      </ion-button>\r\n    </ion-buttons>\r\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\r\n  </ion-toolbar>  \r\n</ion-header>\r\n\r\n<ion-content [fullscreen]="true">\r\n   \r\n  \x3c!-- List of Text Items --\x3e\r\n      <ng-container *ngIf="crtactiune">\r\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\r\n     </ng-container>\r\n  \r\n     <ion-grid>\r\n      <ion-row>\r\n        <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\r\n          <form [formGroup]="frmActNTriCererea" (ngSubmit)="onActNTriCererea()">\r\n            <ion-card color="light" class="auth-card ion-margin">\r\n              <ion-item color="light" class="ion-no-inner-padding-end">\r\n                <ion-input type="text" [readonly]="true" placeholder="Trimite Confirmarea pentru a deveni Membru Activ Neafiliat" formControlName="mesaj"></ion-input>\r\n              </ion-item>\r\n            </ion-card>\r\n  \r\n            <ion-button\r\n              expand="block"\r\n              class="ion-margin-start ion-margin-end ion-margin-bottom"\r\n              type="submit"\r\n              [disabled]="!frmActNTriCererea.valid"\r\n            >\r\n              Trimite Cerere Membru Activ\r\n            </ion-button>\r\n            <span class="ion-margin"></span>\r\n          </form>\r\n  \r\n        </ion-col>\r\n      </ion-row>\r\n    </ion-grid>\r\n  \r\n\r\n\r\n\r\n</ion-content>\r\n',styles:[""]})],d);var g=r(26096);const b=[{path:"",component:d}];let h=class{};h=(0,o.gn)([(0,e.LVF)({imports:[g.Bz.forChild(b)],exports:[g.Bz]})],h);let f=class{};f=(0,o.gn)([(0,e.LVF)({imports:[i.ez,a.u5,c.Pc,h,s.m],declarations:[d]})],f)}}]);
//# sourceMappingURL=8263-es2015.js.map