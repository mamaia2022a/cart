!function(){function n(n,t){if(!(n instanceof t))throw new TypeError("Cannot call a class as a function")}function t(n,t){for(var e=0;e<t.length;e++){var o=t[e];o.enumerable=o.enumerable||!1,o.configurable=!0,"value"in o&&(o.writable=!0),Object.defineProperty(n,o.key,o)}}(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[8263],{28263:function(e,o,i){"use strict";i.r(o),i.d(o,{ActNTriCerPageModule:function(){return y}});var r=i(64762),a=i(62272),c=i(38583),s=i(3679),u=i(4050),l=i(44466),m=i(68168),f=i(61628),p=i(3524),b=i(83752),h=function(){function e(t,o,i,a){var c=this;n(this,e),this.store=t,this.navController=o,this.platform=i,this.storage=a,this.frmActNTriCererea=new s.cw({mesaj:new s.NI("Confirmare pentru Membru Activ Neafiliat",[])}),this.crtactiune=null;var u=this;this.getLocalStorageData().then(function(n){return(0,r.mG)(c,void 0,void 0,regeneratorRuntime.mark(function t(){return regeneratorRuntime.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,u.storage.get("token");case 2:n=t.sent;case 3:if(null!=n){t.next=9;break}return t.next=6,this.storage.get("token");case 6:n=t.sent;case 7:t.next=3;break;case 9:u.token=n;case 10:case"end":return t.stop()}},t,this)}))})}var o,i,a;return o=e,(i=[{key:"getLocalStorageData",value:function(){var n=this;return new Promise(function(t){n.storage.get("crtactiune").then(function(e){n.crtactiune=e,console.log(e),t(e)})})}},{key:"done",value:function(){}},{key:"selectieFaActiune",value:function(n){console.log("selectie fa actiune : "+n)}},{key:"onActNTriCererea",value:function(){if(this.frmActNTriCererea.valid){console.log(this.frmActNTriCererea.value);var n=new p.u;n.crtmemtipcod="MEMINCNFL",n.newmemtipcod="MEMACTNFL",n.crtmemrolcod="MEMINCNFL",n.newmemrolcod="MEMACTNFL",this.store.dispatch(new b.g.MemMembruTipSchimbare(n,this.token))}}},{key:"ngOnInit",value:function(){console.log(this.crtactiune)}}])&&t(o.prototype,i),a&&t(o,a),e}();h.ctorParameters=function(){return[{type:m.yh},{type:u.SH},{type:u.t4},{type:f.K}]},h=(0,r.gn)([(0,a.wA2)({selector:"app-actntricer",template:'<ion-header>\n  <ion-toolbar color="dark">\n        <ion-buttons slot="start">\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\n        </ion-buttons>\n    <ion-buttons slot="secondary">\n      <ion-button>\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\n      </ion-button>\n      \x3c!-- \n      <ion-button>\n        <ion-icon slot="icon-only" name="search"></ion-icon>\n      </ion-button>\n      --\x3e\n    </ion-buttons>\n    <ion-buttons slot="primary">\n      <ion-button color="danger">\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\n      </ion-button>\n    </ion-buttons>\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\n  </ion-toolbar>  \n</ion-header>\n\n<ion-content [fullscreen]="true">\n   \n  \x3c!-- List of Text Items --\x3e\n      <ng-container *ngIf="crtactiune">\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\n     </ng-container>\n  \n     <ion-grid>\n      <ion-row>\n        <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\n          <form [formGroup]="frmActNTriCererea" (ngSubmit)="onActNTriCererea()">\n            <ion-card color="light" class="auth-card ion-margin">\n              <ion-item color="light" class="ion-no-inner-padding-end">\n                <ion-input type="text" [readonly]="true" placeholder="Trimite Confirmarea pentru a deveni Membru Activ Neafiliat" formControlName="mesaj"></ion-input>\n              </ion-item>\n            </ion-card>\n  \n            <ion-button\n              expand="block"\n              class="ion-margin-start ion-margin-end ion-margin-bottom"\n              type="submit"\n              [disabled]="!frmActNTriCererea.valid"\n            >\n              Trimite Cerere Membru Activ\n            </ion-button>\n            <span class="ion-margin"></span>\n          </form>\n  \n        </ion-col>\n      </ion-row>\n    </ion-grid>\n  \n\n\n\n</ion-content>\n',styles:[""]})],h);var g=i(26096),d=[{path:"",component:h}],v=function t(){n(this,t)};v=(0,r.gn)([(0,a.LVF)({imports:[g.Bz.forChild(d)],exports:[g.Bz]})],v);var y=function t(){n(this,t)};y=(0,r.gn)([(0,a.LVF)({imports:[c.ez,s.u5,u.Pc,v,l.m],declarations:[h]})],y)}}])}();
//# sourceMappingURL=8263-es5.js.map