!function(){function n(n,e){if(!(n instanceof e))throw new TypeError("Cannot call a class as a function")}function e(n,e){for(var t=0;t<e.length;t++){var r=e[t];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(n,r.key,r)}}(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[5311],{15311:function(t,r,i){"use strict";i.r(r),i.d(r,{ExcludereMemPageModule:function(){return y}});var o=i(64762),a=i(62272),u=i(38583),s=i(3679),c=i(4050),l=i(44466),m=i(68168),b=i(41964),g=i(61628),p=i(83752),f=i(83157),d=i(5971),h=function(){function t(e,r,i,a){var u=this;n(this,t),this.store=e,this.navController=r,this.platform=i,this.storage=a,this.frmExcludereMembru=new s.cw({mesaj:new s.NI("Trimite Confirmarea Cererii de a deveni Membru",[])}),this.crtgrupact=null,this.crtactiune=null,this.grupmembri$=null,this.grupmembri=null,this.infogrup$=null,this.memGrupRequestVizualizare=new f.d,this.infogrup=null,this.crtsubactiune$=null,this.crtsubactiune=null,this.crtsubactiuniparams$=null,this.crtsubactiuniparams=null,this.membru=null;var c=this;this.getLocalStorageData().then(function(n){return(0,o.mG)(u,void 0,void 0,regeneratorRuntime.mark(function e(){var t=this;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,c.storage.get("token");case 2:n=e.sent;case 3:if(null!=n){e.next=9;break}return e.next=6,this.storage.get("token");case 6:n=e.sent;case 7:e.next=3;break;case 9:c.token=n,this.store.dispatch(new p.g.MemGrupVizualizare(c.memGrupRequestVizualizare,c.token,"grupmembri")).subscribe(function(){return(0,o.mG)(t,void 0,void 0,regeneratorRuntime.mark(function n(){var e,t,r;return regeneratorRuntime.wrap(function(n){for(;;)switch(n.prev=n.next){case 0:return n.next=2,this.storage.get("grupmembri");case 2:e=n.sent;case 3:if(null!=e){n.next=9;break}return n.next=6,this.storage.get("grupmembri");case 6:e=n.sent;case 7:n.next=3;break;case 9:return c.grupmembri=e.membriGrup,c.infogrup=e,c.infogrup$=e,c.grupmembri$=(0,b.of)(e.membriGrup),n.next=12,this.storage.get("crtgrupact");case 12:e=n.sent;case 13:if(null!=e){n.next=19;break}return n.next=16,this.storage.get("crtgrupact");case 16:e=n.sent;case 17:n.next=13;break;case 19:return c.crtgrupact=e,n.next=22,this.storage.get("crtsubactiuniparams");case 22:t=n.sent;case 23:if(null!=t){n.next=29;break}return n.next=26,this.storage.get("crtsubactiuniparams");case 26:t=n.sent;case 27:n.next=23;break;case 29:return c.crtsubactiuniparams=t,c.crtsubactiuniparams$=(0,b.of)(t),c.membru=t.params,n.next=32,this.storage.get("crtsubactiune");case 32:r=n.sent;case 33:if(null!=r){n.next=39;break}return n.next=36,this.storage.get("crtsubactiune");case 36:r=n.sent;case 37:n.next=33;break;case 39:c.crtsubactiune=r,c.crtsubactiune$=(0,b.of)(r);case 40:case"end":return n.stop()}},n,this)}))},function(n){console.log("Error Calling Action Vizualizare Grup: "+n)});case 11:case"end":return e.stop()}},e,this)}))})}var r,i,a;return r=t,(i=[{key:"getLocalStorageData",value:function(){var n=this;return new Promise(function(e){n.storage.get("crtactiune").then(function(t){n.crtactiune=t,console.log(t),e(t)})})}},{key:"done",value:function(){}},{key:"selectieFaActiune",value:function(n){console.log("selectie fa actiune : "+n)}},{key:"selectieMembruGrup",value:function(n){console.log("selectie membru grup id:"+n),this.crtactiune.autActiuneId,this.crtgrupact.autGrupactiuniId;var e=new d.o,t=this.getSelectedMembruGrup(n,this.grupmembri);e.setData(t)}},{key:"getSelectedMembruGrup",value:function(n,e){var t=null;for(var r in e){var i=e[r];if(i.memMembrugrupId==n){t=i;break}}return t}},{key:"onExcludereMembru",value:function(){this.frmExcludereMembru.valid&&console.log(this.frmExcludereMembru.value)}},{key:"ngOnInit",value:function(){console.log(this.crtactiune)}}])&&e(r.prototype,i),a&&e(r,a),t}();h.ctorParameters=function(){return[{type:m.yh},{type:c.SH},{type:c.t4},{type:g.K}]},h=(0,o.gn)([(0,a.wA2)({selector:"app-excluderemem",template:'<ion-header>\n  <ion-toolbar color="dark">\n        <ion-buttons slot="start">\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/actiunesubactiuni"></ion-back-button>\n        </ion-buttons>\n    <ion-buttons slot="secondary">\n      <ion-button>\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\n      </ion-button>\n      \x3c!-- \n      <ion-button>\n        <ion-icon slot="icon-only" name="search"></ion-icon>\n      </ion-button>\n      --\x3e\n    </ion-buttons>\n    <ion-buttons slot="primary">\n      <ion-button color="danger">\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\n      </ion-button>\n    </ion-buttons>\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\n  </ion-toolbar>  \n</ion-header>\n\n<ion-content [fullscreen]="true">\n\n  <ng-container *ngIf="crtsubactiune$">\n    <h3>{{crtsubactiune.autActiuneDisplaynume}}</h3>\n  </ng-container>\n\n  <ion-grid>\n    <ion-row>\n      <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\n\n     </ion-col>\n    </ion-row>\n  </ion-grid>\n\n\n  <ion-grid>\n    <ion-row>\n      <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\n        <ng-container *ngIf="crtsubactiuniparams$">\n        \n          <ion-item color="light" class="ion-no-inner-padding-end">\n            <ion-input type="text" value="Nume: {{membru.userinfo.autUserInfoNume}}" [readonly]="true"></ion-input>\n          </ion-item>\n          <ion-item color="light" class="ion-no-inner-padding-end">\n            <ion-input type="text" value="Prenume: {{membru.userinfo.autUserInfoPrenume}}" [readonly]="true"></ion-input>\n          </ion-item>\n        </ng-container>\n\n          <form [formGroup]="frmExcludereMembru" (ngSubmit)="onExcludereMembru()">\n            \x3c!--\n            <ion-card color="light" class="auth-card ion-margin">\n              <ion-item color="light" class="ion-no-inner-padding-end">\n                <ion-input type="text" [readonly]="true" placeholder="Confirma\u021bi c\u0103 dori\u021bi excluderea acestui Membru din Grup" formControlName="mesaj"></ion-input>\n              </ion-item>\n            </ion-card>\n            --\x3e\n              <ion-button\n              expand="block"\n              class="ion-margin-start ion-margin-end ion-margin-bottom"\n              type="submit"\n              [disabled]="!frmExcludereMembru.valid"\n            >\n              Exclude\u021bi Membrul din grup\n            </ion-button>\n          \n            <span class="ion-margin"></span>\n          </form>\n      </ion-col>\n    </ion-row>\n  </ion-grid>\n\n</ion-content>\n',styles:[""]})],h);var x=i(26096),v=[{path:"",component:h}],k=function e(){n(this,e)};k=(0,o.gn)([(0,a.LVF)({imports:[x.Bz.forChild(v)],exports:[x.Bz]})],k);var y=function e(){n(this,e)};y=(0,o.gn)([(0,a.LVF)({imports:[u.ez,s.u5,c.Pc,k,l.m],declarations:[h]})],y)}}])}();
//# sourceMappingURL=5311-es5.js.map