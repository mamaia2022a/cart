(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[4655],{64655:function(n,r,t){"use strict";t.r(r),t.d(r,{MemIncActExpNflPageModule:function(){return b}});var e=t(64762),o=t(62272),i=t(38583),l=t(3679),c=t(4050),a=t(44466),s=t(83752),u=t(68168),m=t(61628);class g{constructor(){}}let d=class{constructor(n,r,t,o){this.store=n,this.navController=r,this.platform=t,this.storage=o,this.frmCerereAfiliere=new l.cw({codunicgrup:new l.NI("",[l.kI.required,l.kI.minLength(8),l.kI.maxLength(16)])}),this.crtrol=null,this.crtactiune=null;var i=this;this.getLocalStorageData().then(n=>(0,e.mG)(this,void 0,void 0,function*(){for(n=yield i.storage.get("token");null==n;)n=yield this.storage.get("token");i.token=n;for(var r=yield i.storage.get("crtrol");null==n;)r=yield this.storage.get("crtrol");i.crtrol=r}))}getLocalStorageData(){var n=this;return new Promise(r=>{n.storage.get("crtactiune").then(t=>{n.crtactiune=t,console.log(t),r(t)})})}selectieFaActiune(n){console.log("selectie fa actiune : "+n)}ngOnInit(){console.log(this.crtactiune)}onTrimiteCerereaDeAfiliere(){if(this.frmCerereAfiliere.valid){console.log(this.frmCerereAfiliere.value);var n=new g;n.grupcodunic=this.frmCerereAfiliere.value.codunicgrup,n.crtmemrolcod=this.crtrol.autRolCod,n.crtmemtipcod=this.crtrol.autRolCod,this.store.dispatch(new s.g.MemMembruCerereAfiliere(n,this.token))}}done(){}};d.ctorParameters=()=>[{type:u.yh},{type:c.SH},{type:c.t4},{type:m.K}],d=(0,e.gn)([(0,o.wA2)({selector:"app-memincactexpnfl",template:'<ion-header>\r\n  <ion-toolbar color="dark">\r\n        <ion-buttons slot="start">\r\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\r\n        </ion-buttons>\r\n    <ion-buttons slot="secondary">\r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\r\n      </ion-button>\r\n      \x3c!-- \r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="search"></ion-icon>\r\n      </ion-button>\r\n      --\x3e\r\n    </ion-buttons>\r\n    <ion-buttons slot="primary">\r\n      <ion-button color="danger">\r\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\r\n      </ion-button>\r\n    </ion-buttons>\r\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\r\n  </ion-toolbar>  \r\n</ion-header>\r\n\r\n<ion-content [fullscreen]="true">\r\n   \r\n  \x3c!-- List of Text Items --\x3e\r\n      <ng-container *ngIf="crtactiune">\r\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\r\n     </ng-container>\r\n  \r\n     <ion-grid>\r\n      <ion-row>\r\n        <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\r\n          <form [formGroup]="frmCerereAfiliere" (ngSubmit)="onTrimiteCerereaDeAfiliere()">\r\n            <ion-card color="light" class="auth-card ion-margin">\r\n              <ion-item color="light" class="ion-no-inner-padding-end">\r\n                <ion-input type="text" placeholder="Introduce\u021bi Codul Unic al Grupului la care dori\u021bi s\u0103 v\u0103 afilia\u021bi" \r\n                                       formControlName="codunicgrup"></ion-input>\r\n              </ion-item>\r\n            </ion-card>\r\n  \r\n            <ion-button\r\n              expand="block"\r\n              class="ion-margin-start ion-margin-end ion-margin-bottom"\r\n              type="submit"\r\n              [disabled]="!frmCerereAfiliere.valid"\r\n            >\r\n              Trimite Cerere Afiliere\r\n            </ion-button>\r\n            <span class="ion-margin"></span>\r\n          </form>\r\n  \r\n        </ion-col>\r\n      </ion-row>\r\n    </ion-grid>\r\n  \r\n\r\n</ion-content>\r\n',styles:[""]})],d);var p=t(26096);const h=[{path:"",component:d}];let f=class{};f=(0,e.gn)([(0,o.LVF)({imports:[p.Bz.forChild(h)],exports:[p.Bz]})],f);let b=class{};b=(0,e.gn)([(0,o.LVF)({imports:[i.ez,l.u5,c.Pc,f,a.m],declarations:[d]})],b)}}]);
//# sourceMappingURL=4655-es2015.js.map