!function(){function n(n,t){if(!(n instanceof t))throw new TypeError("Cannot call a class as a function")}function t(n,t){for(var o=0;o<t.length;o++){var e=t[o];e.enumerable=e.enumerable||!1,e.configurable=!0,"value"in e&&(e.writable=!0),Object.defineProperty(n,e.key,e)}}(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[9833],{9833:function(o,e,i){"use strict";i.r(e),i.d(e,{DovadaCotPageModule:function(){return d}});var r=i(64762),a=i(62272),c=i(38583),u=i(3679),l=i(4050),s=i(44466),f=i(61628),b=function(){function o(t){n(this,o),this.storage=t,this.crtactiune=null,this.getLocalStorageData().then(function(n){})}var e,i,r;return e=o,(i=[{key:"getLocalStorageData",value:function(){var n=this;return new Promise(function(t){n.storage.get("crtactiune").then(function(o){n.crtactiune=o,console.log(o),t(o)})})}},{key:"done",value:function(){this.frmDovadaCot.valid&&console.log(this.frmDovadaCot.value)}},{key:"selectieFaActiune",value:function(n){console.log("selectie fa actiune : "+n)}},{key:"ngOnInit",value:function(){this.frmDovadaCot=new u.NI("",[u.kI.required,u.kI.email]),console.log(this.crtactiune)}}])&&t(e.prototype,i),r&&t(e,r),o}();b.ctorParameters=function(){return[{type:f.K}]},b=(0,r.gn)([(0,a.wA2)({selector:"app-dovadacot",template:'<ion-header>\r\n  <ion-toolbar color="dark">\r\n        <ion-buttons slot="start">\r\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\r\n        </ion-buttons>\r\n    <ion-buttons slot="secondary">\r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\r\n      </ion-button>\r\n      \x3c!-- \r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="search"></ion-icon>\r\n      </ion-button>\r\n      --\x3e\r\n    </ion-buttons>\r\n    <ion-buttons slot="primary">\r\n      <ion-button color="danger">\r\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\r\n      </ion-button>\r\n    </ion-buttons>\r\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\r\n  </ion-toolbar>  \r\n</ion-header>\r\n\r\n<ion-content [fullscreen]="true">\r\n   \r\n  \x3c!-- List of Text Items --\x3e\r\n      <ng-container *ngIf="crtactiune">\r\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\r\n     </ng-container>\r\n  \r\n\r\n\r\n</ion-content>\r\n',styles:[""]})],b);var h=i(26096),p=[{path:"",component:b}],g=function t(){n(this,t)};g=(0,r.gn)([(0,a.LVF)({imports:[h.Bz.forChild(p)],exports:[h.Bz]})],g);var d=function t(){n(this,t)};d=(0,r.gn)([(0,a.LVF)({imports:[c.ez,u.u5,l.Pc,g,s.m],declarations:[b]})],d)}}])}();
//# sourceMappingURL=9833-es5.js.map