(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[8812],{48812:function(n,t,e){"use strict";e.r(t),e.d(t,{ExpATriCerPageModule:function(){return f}});var o=e(64762),i=e(62272),r=e(38583),a=e(3679),s=e(4050),c=e(44466),l=e(68168),u=e(61628),m=e(3524),p=e(83752);let d=class{constructor(n,t,e,i){this.store=n,this.navController=t,this.platform=e,this.storage=i,this.frmExpATriCererea=new a.cw({mesaj:new a.NI("Confirmare pentru Membru Experimentat Afiliat",[])}),this.crtactiune=null;var r=this;this.getLocalStorageData().then(n=>(0,o.mG)(this,void 0,void 0,function*(){for(n=yield r.storage.get("token");null==n;)n=yield this.storage.get("token");r.token=n}))}getLocalStorageData(){var n=this;return new Promise(t=>{n.storage.get("crtactiune").then(e=>{n.crtactiune=e,console.log(e),t(e)})})}done(){}selectieFaActiune(n){console.log("selectie fa actiune : "+n)}onExpATriCererea(){if(this.frmExpATriCererea.valid){console.log(this.frmExpATriCererea.value);var n=new m.u;n.crtmemtipcod="MEMACTAFL",n.newmemtipcod="MEMEXPAFL",n.crtmemrolcod="MEMACTAFL",n.newmemrolcod="MEMEXPAFL",this.store.dispatch(new p.g.MemMembruTipSchimbare(n,this.token))}}ngOnInit(){console.log(this.crtactiune)}};d.ctorParameters=()=>[{type:l.yh},{type:s.SH},{type:s.t4},{type:u.K}],d=(0,o.gn)([(0,i.wA2)({selector:"app-expatricer",template:'<ion-header>\n  <ion-toolbar color="dark">\n        <ion-buttons slot="start">\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\n        </ion-buttons>\n    <ion-buttons slot="secondary">\n      <ion-button>\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\n      </ion-button>\n      \x3c!-- \n      <ion-button>\n        <ion-icon slot="icon-only" name="search"></ion-icon>\n      </ion-button>\n      --\x3e\n    </ion-buttons>\n    <ion-buttons slot="primary">\n      <ion-button color="danger">\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\n      </ion-button>\n    </ion-buttons>\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\n  </ion-toolbar>  \n</ion-header>\n\n<ion-content [fullscreen]="true">\n   \n  \x3c!-- List of Text Items --\x3e\n      <ng-container *ngIf="crtactiune">\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\n     </ng-container>\n  \n     <ion-grid>\n      <ion-row>\n        <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\n          <form [formGroup]="frmExpATriCererea" (ngSubmit)="onExpATriCererea()">\n            <ion-card color="light" class="auth-card ion-margin">\n              <ion-item color="light" class="ion-no-inner-padding-end">\n                <ion-input type="text" [readonly]="true" placeholder="Trimite Confirmarea pentru a deveni Membru Experimentat Afiliat" formControlName="mesaj"></ion-input>\n              </ion-item>\n            </ion-card>\n  \n            <ion-button\n              expand="block"\n              class="ion-margin-start ion-margin-end ion-margin-bottom"\n              type="submit"\n              [disabled]="!frmExpATriCererea.valid"\n            >\n               Trimite Cerere Membru Experimentat\n            </ion-button>\n            <span class="ion-margin"></span>\n          </form>\n  \n        </ion-col>\n      </ion-row>\n    </ion-grid>\n  \n\n\n\n</ion-content>\n',styles:[""]})],d);var g=e(26096);const b=[{path:"",component:d}];let h=class{};h=(0,o.gn)([(0,i.LVF)({imports:[g.Bz.forChild(b)],exports:[g.Bz]})],h);let f=class{};f=(0,o.gn)([(0,i.LVF)({imports:[r.ez,a.u5,s.Pc,h,c.m],declarations:[d]})],f)}}]);
//# sourceMappingURL=8812-es2015.js.map