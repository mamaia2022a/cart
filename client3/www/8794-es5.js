!function(){function n(n,t){if(!(n instanceof t))throw new TypeError("Cannot call a class as a function")}function t(n,t){for(var o=0;o<t.length;o++){var e=t[o];e.enumerable=e.enumerable||!1,e.configurable=!0,"value"in e&&(e.writable=!0),Object.defineProperty(n,e.key,e)}}(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[8794],{48794:function(o,e,r){"use strict";r.r(e),r.d(e,{CompletAdrPageModule:function(){return g}});var i=r(64762),a=r(62272),c=r(38583),l=r(3679),u=r(4050),s=r(44466),f=r(61628),p=function(){function o(t){n(this,o),this.storage=t,this.crtactiune=null,this.getLocalStorageData().then(function(n){})}var e,r,i;return e=o,(r=[{key:"getLocalStorageData",value:function(){var n=this;return new Promise(function(t){n.storage.get("crtactiune").then(function(o){n.crtactiune=o,console.log(o),t(o)})})}},{key:"done",value:function(){this.frmCompletAdr.valid&&console.log(this.frmCompletAdr.value)}},{key:"selectieFaActiune",value:function(n){console.log("selectie fa actiune : "+n)}},{key:"ngOnInit",value:function(){this.frmCompletAdr=new l.NI("",[l.kI.required,l.kI.email]),console.log(this.crtactiune)}}])&&t(e.prototype,r),i&&t(e,i),o}();p.ctorParameters=function(){return[{type:f.K}]},p=(0,i.gn)([(0,a.wA2)({selector:"app-completadr",template:'<ion-header>\r\n  <ion-toolbar color="dark">\r\n        <ion-buttons slot="start">\r\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\r\n        </ion-buttons>\r\n    <ion-buttons slot="secondary">\r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\r\n      </ion-button>\r\n      \x3c!-- \r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="search"></ion-icon>\r\n      </ion-button>\r\n      --\x3e\r\n    </ion-buttons>\r\n    <ion-buttons slot="primary">\r\n      <ion-button color="danger">\r\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\r\n      </ion-button>\r\n    </ion-buttons>\r\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\r\n  </ion-toolbar>  \r\n</ion-header>\r\n\r\n<ion-content [fullscreen]="true">\r\n   \r\n  \x3c!-- List of Text Items --\x3e\r\n      <ng-container *ngIf="crtactiune">\r\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\r\n     </ng-container>\r\n  \r\n\r\n\r\n</ion-content>\r\n',styles:[""]})],p);var b=r(26096),h=[{path:"",component:p}],m=function t(){n(this,t)};m=(0,i.gn)([(0,a.LVF)({imports:[b.Bz.forChild(h)],exports:[b.Bz]})],m);var g=function t(){n(this,t)};g=(0,i.gn)([(0,a.LVF)({imports:[c.ez,l.u5,u.Pc,m,s.m],declarations:[p]})],g)}}])}();
//# sourceMappingURL=8794-es5.js.map