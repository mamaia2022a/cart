!function(){function n(n,t){if(!(n instanceof t))throw new TypeError("Cannot call a class as a function")}function t(n,t){for(var o=0;o<t.length;o++){var e=t[o];e.enumerable=e.enumerable||!1,e.configurable=!0,"value"in e&&(e.writable=!0),Object.defineProperty(n,e.key,e)}}(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[5360],{65360:function(o,e,i){"use strict";i.r(e),i.d(e,{ListActCPageModule:function(){return m}});var c=i(64762),a=i(62272),r=i(38583),s=i(3679),u=i(4050),l=i(44466),f=i(61628),b=function(){function o(t){n(this,o),this.storage=t,this.crtactiune=null,this.getLocalStorageData().then(function(n){})}var e,i,c;return e=o,(i=[{key:"getLocalStorageData",value:function(){var n=this;return new Promise(function(t){n.storage.get("crtactiune").then(function(o){n.crtactiune=o,console.log(o),t(o)})})}},{key:"done",value:function(){this.frmListActC.valid&&console.log(this.frmListActC.value)}},{key:"selectieFaActiune",value:function(n){console.log("selectie fa actiune : "+n)}},{key:"ngOnInit",value:function(){this.frmListActC=new s.NI("",[s.kI.required,s.kI.email]),console.log(this.crtactiune)}}])&&t(e.prototype,i),c&&t(e,c),o}();b.ctorParameters=function(){return[{type:f.K}]},b=(0,c.gn)([(0,a.wA2)({selector:"app-listactc",template:'<ion-header>\n  <ion-toolbar color="dark">\n        <ion-buttons slot="start">\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\n        </ion-buttons>\n    <ion-buttons slot="secondary">\n      <ion-button>\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\n      </ion-button>\n      \x3c!-- \n      <ion-button>\n        <ion-icon slot="icon-only" name="search"></ion-icon>\n      </ion-button>\n      --\x3e\n    </ion-buttons>\n    <ion-buttons slot="primary">\n      <ion-button color="danger">\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\n      </ion-button>\n    </ion-buttons>\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\n  </ion-toolbar>  \n</ion-header>\n\n<ion-content [fullscreen]="true">\n   \n  \x3c!-- List of Text Items --\x3e\n      <ng-container *ngIf="crtactiune">\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\n     </ng-container>\n  \n\n\n</ion-content>\n',styles:[""]})],b);var h=i(26096),p=[{path:"",component:b}],g=function t(){n(this,t)};g=(0,c.gn)([(0,a.LVF)({imports:[h.Bz.forChild(p)],exports:[h.Bz]})],g);var m=function t(){n(this,t)};m=(0,c.gn)([(0,a.LVF)({imports:[r.ez,s.u5,u.Pc,g,l.m],declarations:[b]})],m)}}])}();
//# sourceMappingURL=5360-es5.js.map