!function(){function n(n,e){if(!(n instanceof e))throw new TypeError("Cannot call a class as a function")}function e(n,e){for(var t=0;t<e.length;t++){var i=e[t];i.enumerable=i.enumerable||!1,i.configurable=!0,"value"in i&&(i.writable=!0),Object.defineProperty(n,i.key,i)}}(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[9284],{69284:function(t,i,r){"use strict";r.r(i),r.d(i,{VizualizGrupPageModule:function(){return k}});var o=r(64762),u=r(62272),a=r(38583),s=r(3679),c=r(4050),l=r(44466),m=r(68168),p=r(41964),g=r(61628),f=r(3524),b=r(83752),d=r(83157),h=r(5971),v=function(){function t(e,i,r,u){var a=this;n(this,t),this.store=e,this.navController=i,this.platform=r,this.storage=u,this.frmVizualizGruperea=new s.cw({mesaj:new s.NI("Trimite Confirmarea Cererii de a deveni Membru",[])}),this.crtgrupact=null,this.crtactiune=null,this.grupmembri$=null,this.grupmembri=null,this.infogrup$=null,this.memGrupRequestVizualizare=new d.d,this.infogrup=null;var c=this;this.getLocalStorageData().then(function(n){return(0,o.mG)(a,void 0,void 0,regeneratorRuntime.mark(function e(){var t=this;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,c.storage.get("token");case 2:n=e.sent;case 3:if(null!=n){e.next=9;break}return e.next=6,this.storage.get("token");case 6:n=e.sent;case 7:e.next=3;break;case 9:c.token=n,this.store.dispatch(new b.g.MemGrupVizualizare(c.memGrupRequestVizualizare,c.token,"grupmembri")).subscribe(function(){return(0,o.mG)(t,void 0,void 0,regeneratorRuntime.mark(function n(){var e;return regeneratorRuntime.wrap(function(n){for(;;)switch(n.prev=n.next){case 0:return n.next=2,this.storage.get("grupmembri");case 2:e=n.sent;case 3:if(null!=e){n.next=9;break}return n.next=6,this.storage.get("grupmembri");case 6:e=n.sent;case 7:n.next=3;break;case 9:return c.grupmembri=e.membriGrup,c.infogrup=e,c.infogrup$=e,c.grupmembri$=(0,p.of)(e.membriGrup),n.next=12,this.storage.get("crtgrupact");case 12:e=n.sent;case 13:if(null!=e){n.next=19;break}return n.next=16,this.storage.get("crtgrupact");case 16:e=n.sent;case 17:n.next=13;break;case 19:c.crtgrupact=e;case 20:case"end":return n.stop()}},n,this)}))},function(n){console.log("Error Calling Action Vizualizare Grup: "+n)});case 11:case"end":return e.stop()}},e,this)}))})}var i,r,u;return i=t,(r=[{key:"getLocalStorageData",value:function(){var n=this;return new Promise(function(e){n.storage.get("crtactiune").then(function(t){n.crtactiune=t,console.log(t),e(t)})})}},{key:"done",value:function(){}},{key:"selectieFaActiune",value:function(n){console.log("selectie fa actiune : "+n)}},{key:"selectieMembruGrup",value:function(n){console.log("selectie membru grup id:"+n);var e=this.crtactiune.autActiuneId,t=this.crtgrupact.autGrupactiuniId,i=new h.o,r=this.getSelectedMembruGrup(n,this.grupmembri);i.setData(r),i.title=r.userinfo.autUserInfoNume+" "+r.userinfo.autUserInfoPrenume,this.store.dispatch(new b.g.ActiuneSubactiuni(e,t,this.crtgrupact,i,"/sefgrup/gestgrup/vizualizgrup"))}},{key:"getSelectedMembruGrup",value:function(n,e){var t=null;for(var i in e){var r=e[i];if(r.memMembrugrupId==n){t=r;break}}return t}},{key:"onVizualizGruperea",value:function(){if(this.frmVizualizGruperea.valid){console.log(this.frmVizualizGruperea.value);var n=new f.u;n.crtmemtipcod="MEMINCNFL",n.newmemtipcod="MEMACTNFL",n.crtmemrolcod="MEMINCNFL",n.newmemrolcod="MEMACTNFL",this.store.dispatch(new b.g.MemMembruTipSchimbare(n,this.token))}}},{key:"ngOnInit",value:function(){console.log(this.crtactiune)}}])&&e(i.prototype,r),u&&e(i,u),t}();v.ctorParameters=function(){return[{type:m.yh},{type:c.SH},{type:c.t4},{type:g.K}]},v=(0,o.gn)([(0,u.wA2)({selector:"app-vizualizgrup",template:'<ion-header>\n  <ion-toolbar color="dark">\n        <ion-buttons slot="start">\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\n        </ion-buttons>\n    <ion-buttons slot="secondary">\n      <ion-button>\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\n      </ion-button>\n      \x3c!-- \n      <ion-button>\n        <ion-icon slot="icon-only" name="search"></ion-icon>\n      </ion-button>\n      --\x3e\n    </ion-buttons>\n    <ion-buttons slot="primary">\n      <ion-button color="danger">\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\n      </ion-button>\n    </ion-buttons>\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\n  </ion-toolbar>  \n</ion-header>\n\n<ion-content [fullscreen]="true">\n   \n  \x3c!-- List of Text Items --\x3e\n      <ng-container *ngIf="crtactiune">\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\n     </ng-container>\n    \x3c!-- \n     <ion-grid>\n      <ion-row>\n        <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\n          <form [formGroup]="frmVizualizGruperea" (ngSubmit)="onVizualizGruperea()">\n            <ion-card color="light" class="auth-card ion-margin">\n              <ion-item color="light" class="ion-no-inner-padding-end">\n                <ion-input type="text" [readonly]="true" placeholder="Trimite Confirmarea pentru a deveni Membru Activ Neafiliat" formControlName="mesaj"></ion-input>\n              </ion-item>\n            </ion-card>\n  \n            <ion-button\n              expand="block"\n              class="ion-margin-start ion-margin-end ion-margin-bottom"\n              type="submit"\n              [disabled]="!frmVizualizGruperea.valid"\n            >\n              Confirmare Cerere Membru Activ\n            </ion-button>\n            <span class="ion-margin"></span>\n          </form>\n  \n        </ion-col>\n      </ion-row>\n    </ion-grid>\n  --\x3e\n  <ion-grid>\n    <ion-row>\n      <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\n    <ng-container *ngIf="grupmembri$">\n      \n        <ng-container *ngIf="infogrup$">\n        <ion-item color="light" class="ion-no-inner-padding-end">\n          <ion-input type="text" value="Nume Grup: {{infogrup.grup.memGrupNume}}" [readonly]="true"></ion-input>\n          \n        </ion-item>\n        <ion-item color="light" class="ion-no-inner-padding-end">\n          <ion-input type="text" value="Grup Cod Unic: {{infogrup.grup.memGrupCodunic}}" [readonly]="true"></ion-input>\n          \n        </ion-item>\n        <ion-item color="light" class="ion-no-inner-padding-end">\n          <ion-input type="text" value="\u0218ef Grup: {{infogrup.sefGrup.userinfo.autUserInfoNume}} {{infogrup.sefGrup.userinfo.autUserInfoPrenume}}" [readonly]="true"></ion-input>\n          \n        </ion-item>\n      </ng-container>\n        <ion-list>\n          <ion-item>Componen\u021ba:</ion-item>\n          <ion-item button="true" detail *ngFor=\'let grupmembru of (grupmembri$|async); let idx=index;\' \n                                        (click)="selectieMembruGrup(grupmembru.memMembrugrupId)">\n            <ion-label>\n              <h2>{{idx+1}}. {{grupmembru.userinfo.autUserInfoNume}} {{grupmembru.userinfo.autUserInfoPrenume}}</h2>\n              <p>Nume utilizator: {{grupmembru.memMembrugrupUsernume}}</p>\n            </ion-label>\n          </ion-item>\n        </ion-list>\n\n\n   </ng-container>\n</ion-col>\n</ion-row>\n</ion-grid>\n   \n    \x3c!--\n      <ng-container *ngIf="grupmembri$">\n      <ion-select placeholder="Membri Grup" formControlName="selmembrigrup" (ionChange)="selectieMembruGrup($event)">\n         <ion-select-option value="{{grupmembru.memMembrugrupUserid}}" *ngFor=\'let grupmembru of (grupmembri$|async)\'>{{grupmembru.memMembrugrupUsernume}}</ion-select-option>\n    </ion-select>\n    </ng-container>              \n  --\x3e\n\n</ion-content>\n',styles:[""]})],v);var z=r(26096),x=[{path:"",component:v}],y=function e(){n(this,e)};y=(0,o.gn)([(0,u.LVF)({imports:[z.Bz.forChild(x)],exports:[z.Bz]})],y);var k=function e(){n(this,e)};k=(0,o.gn)([(0,u.LVF)({imports:[a.ez,s.u5,c.Pc,y,l.m],declarations:[v]})],k)}}])}();
//# sourceMappingURL=9284-es5.js.map