!function(){function n(n,e){if(!(n instanceof e))throw new TypeError("Cannot call a class as a function")}function e(n,e){for(var r=0;r<e.length;r++){var t=e[r];t.enumerable=t.enumerable||!1,t.configurable=!0,"value"in t&&(t.writable=!0),Object.defineProperty(n,t.key,t)}}(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[2459],{2459:function(r,t,o){"use strict";o.r(t),o.d(t,{TrimiteCerPageModule:function(){return y}});var i=o(64762),a=o(62272),c=o(38583),s=o(3679),u=o(4050),l=o(44466),m=o(68168),f=o(61628),p=o(3524),b=o(83752),h=function(){function r(e,t,o,a){var c=this;n(this,r),this.store=e,this.navController=t,this.platform=o,this.storage=a,this.frmTrimiteCererea=new s.cw({mesaj:new s.NI("Trimite Confirmarea Cererii de a deveni Membru",[])}),this.crtactiune=null;var u=this;this.getLocalStorageData().then(function(n){return(0,i.mG)(c,void 0,void 0,regeneratorRuntime.mark(function e(){return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,u.storage.get("token");case 2:n=e.sent;case 3:if(null!=n){e.next=9;break}return e.next=6,this.storage.get("token");case 6:n=e.sent;case 7:e.next=3;break;case 9:u.token=n;case 10:case"end":return e.stop()}},e,this)}))})}var t,o,a;return t=r,(o=[{key:"getLocalStorageData",value:function(){var n=this;return new Promise(function(e){n.storage.get("crtactiune").then(function(r){n.crtactiune=r,console.log(r),e(r)})})}},{key:"done",value:function(){}},{key:"selectieFaActiune",value:function(n){console.log("selectie fa actiune : "+n)}},{key:"onTrimiteCererea",value:function(){if(this.frmTrimiteCererea.valid){console.log(this.frmTrimiteCererea.value);var n=new p.u;n.crtmemtipcod="SIMPATIZ",n.newmemtipcod="MEMINCNFL",n.crtmemrolcod="SIMPATIZ",n.newmemrolcod="MEMINCNFL",this.store.dispatch(new b.g.MemMembruTipSchimbare(n,this.token))}}},{key:"ngOnInit",value:function(){console.log(this.crtactiune)}}])&&e(t.prototype,o),a&&e(t,a),r}();h.ctorParameters=function(){return[{type:m.yh},{type:u.SH},{type:u.t4},{type:f.K}]},h=(0,i.gn)([(0,a.wA2)({selector:"app-trimitecer",template:'<ion-header>\r\n  <ion-toolbar color="dark">\r\n        <ion-buttons slot="start">\r\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\r\n        </ion-buttons>\r\n    <ion-buttons slot="secondary">\r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\r\n      </ion-button>\r\n      \x3c!-- \r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="search"></ion-icon>\r\n      </ion-button>\r\n      --\x3e\r\n    </ion-buttons>\r\n    <ion-buttons slot="primary">\r\n      <ion-button color="danger">\r\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\r\n      </ion-button>\r\n    </ion-buttons>\r\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\r\n  </ion-toolbar>  \r\n</ion-header>\r\n\r\n<ion-content [fullscreen]="true">\r\n   \r\n  \x3c!-- List of Text Items --\x3e\r\n      <ng-container *ngIf="crtactiune">\r\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\r\n     </ng-container>\r\n  \r\n     <ion-grid>\r\n      <ion-row>\r\n        <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\r\n          <form [formGroup]="frmTrimiteCererea" (ngSubmit)="onTrimiteCererea()">\r\n            <ion-card color="light" class="auth-card ion-margin">\r\n              <ion-item color="light" class="ion-no-inner-padding-end">\r\n                <ion-input type="text" [readonly]="true" placeholder="Trimite Confirmarea Cererii de a deveni Membru" formControlName="mesaj"></ion-input>\r\n              </ion-item>\r\n            </ion-card>\r\n  \r\n            <ion-button\r\n              expand="block"\r\n              class="ion-margin-start ion-margin-end ion-margin-bottom"\r\n              type="submit"\r\n              [disabled]="!frmTrimiteCererea.valid"\r\n            >\r\n              Confirmare Cerere Membru\r\n            </ion-button>\r\n            <span class="ion-margin"></span>\r\n          </form>\r\n  \r\n        </ion-col>\r\n      </ion-row>\r\n    </ion-grid>\r\n  \r\n\r\n\r\n\r\n</ion-content>\r\n',styles:[""]})],h);var d=o(26096),g=[{path:"",component:h}],v=function e(){n(this,e)};v=(0,i.gn)([(0,a.LVF)({imports:[d.Bz.forChild(g)],exports:[d.Bz]})],v);var y=function e(){n(this,e)};y=(0,i.gn)([(0,a.LVF)({imports:[c.ez,s.u5,u.Pc,v,l.m],declarations:[h]})],y)}}])}();
//# sourceMappingURL=2459-es5.js.map