(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[4655],{64655:function(n,t,e){"use strict";e.r(t),e.d(t,{MemIncActExpNflPageModule:function(){return b}});var o=e(64762),i=e(62272),r=e(38583),l=e(3679),c=e(4050),a=e(44466),s=e(83752),u=e(68168),m=e(61628);class g{constructor(){}}let d=class{constructor(n,t,e,i){this.store=n,this.navController=t,this.platform=e,this.storage=i,this.frmCerereAfiliere=new l.cw({codunicgrup:new l.NI("",[l.kI.required,l.kI.minLength(8),l.kI.maxLength(16)])}),this.crtrol=null,this.crtactiune=null;var r=this;this.getLocalStorageData().then(n=>(0,o.mG)(this,void 0,void 0,function*(){for(n=yield r.storage.get("token");null==n;)n=yield this.storage.get("token");r.token=n;for(var t=yield r.storage.get("crtrol");null==n;)t=yield this.storage.get("crtrol");r.crtrol=t}))}getLocalStorageData(){var n=this;return new Promise(t=>{n.storage.get("crtactiune").then(e=>{n.crtactiune=e,console.log(e),t(e)})})}selectieFaActiune(n){console.log("selectie fa actiune : "+n)}ngOnInit(){console.log(this.crtactiune)}onTrimiteCerereaDeAfiliere(){if(this.frmCerereAfiliere.valid){console.log(this.frmCerereAfiliere.value);var n=new g;n.grupcodunic=this.frmCerereAfiliere.value.codunicgrup,n.crtmemrolcod=this.crtrol.autRolCod,n.crtmemtipcod=this.crtrol.autRolCod,this.store.dispatch(new s.g.MemMembruCerereAfiliere(n,this.token))}}done(){}};d.ctorParameters=()=>[{type:u.yh},{type:c.SH},{type:c.t4},{type:m.K}],d=(0,o.gn)([(0,i.wA2)({selector:"app-memincactexpnfl",template:'<ion-header>\n  <ion-toolbar color="dark">\n        <ion-buttons slot="start">\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\n        </ion-buttons>\n    <ion-buttons slot="secondary">\n      <ion-button>\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\n      </ion-button>\n      \x3c!-- \n      <ion-button>\n        <ion-icon slot="icon-only" name="search"></ion-icon>\n      </ion-button>\n      --\x3e\n    </ion-buttons>\n    <ion-buttons slot="primary">\n      <ion-button color="danger">\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\n      </ion-button>\n    </ion-buttons>\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\n  </ion-toolbar>  \n</ion-header>\n\n<ion-content [fullscreen]="true">\n   \n  \x3c!-- List of Text Items --\x3e\n      <ng-container *ngIf="crtactiune">\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\n     </ng-container>\n  \n     <ion-grid>\n      <ion-row>\n        <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\n          <form [formGroup]="frmCerereAfiliere" (ngSubmit)="onTrimiteCerereaDeAfiliere()">\n            <ion-card color="light" class="auth-card ion-margin">\n              <ion-item color="light" class="ion-no-inner-padding-end">\n                <ion-input type="text" placeholder="Introduce\u021bi Codul Unic al Grupului la care dori\u021bi s\u0103 v\u0103 afilia\u021bi" \n                                       formControlName="codunicgrup"></ion-input>\n              </ion-item>\n            </ion-card>\n  \n            <ion-button\n              expand="block"\n              class="ion-margin-start ion-margin-end ion-margin-bottom"\n              type="submit"\n              [disabled]="!frmCerereAfiliere.valid"\n            >\n              Trimite Cerere Afiliere\n            </ion-button>\n            <span class="ion-margin"></span>\n          </form>\n  \n        </ion-col>\n      </ion-row>\n    </ion-grid>\n  \n\n</ion-content>\n',styles:[""]})],d);var p=e(26096);const h=[{path:"",component:d}];let f=class{};f=(0,o.gn)([(0,i.LVF)({imports:[p.Bz.forChild(h)],exports:[p.Bz]})],f);let b=class{};b=(0,o.gn)([(0,i.LVF)({imports:[r.ez,l.u5,c.Pc,f,a.m],declarations:[d]})],b)}}]);
//# sourceMappingURL=4655-es2015.js.map