(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[5360],{65360:function(n,t,o){"use strict";o.r(t),o.d(t,{ListActCPageModule:function(){return p}});var r=o(64762),e=o(62272),i=o(38583),c=o(3679),s=o(4050),a=o(44466),l=o(61628);let u=class{constructor(n){this.storage=n,this.crtactiune=null,this.getLocalStorageData().then(n=>{})}getLocalStorageData(){var n=this;return new Promise(t=>{n.storage.get("crtactiune").then(o=>{n.crtactiune=o,console.log(o),t(o)})})}done(){this.frmListActC.valid&&console.log(this.frmListActC.value)}selectieFaActiune(n){console.log("selectie fa actiune : "+n)}ngOnInit(){this.frmListActC=new c.NI("",[c.kI.required,c.kI.email]),console.log(this.crtactiune)}};u.ctorParameters=()=>[{type:l.K}],u=(0,r.gn)([(0,e.wA2)({selector:"app-listactc",template:'<ion-header>\r\n  <ion-toolbar color="dark">\r\n        <ion-buttons slot="start">\r\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\r\n        </ion-buttons>\r\n    <ion-buttons slot="secondary">\r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\r\n      </ion-button>\r\n      \x3c!-- \r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="search"></ion-icon>\r\n      </ion-button>\r\n      --\x3e\r\n    </ion-buttons>\r\n    <ion-buttons slot="primary">\r\n      <ion-button color="danger">\r\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\r\n      </ion-button>\r\n    </ion-buttons>\r\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\r\n  </ion-toolbar>  \r\n</ion-header>\r\n\r\n<ion-content [fullscreen]="true">\r\n   \r\n  \x3c!-- List of Text Items --\x3e\r\n      <ng-container *ngIf="crtactiune">\r\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\r\n     </ng-container>\r\n  \r\n\r\n\r\n</ion-content>\r\n',styles:[""]})],u);var b=o(26096);const g=[{path:"",component:u}];let h=class{};h=(0,r.gn)([(0,e.LVF)({imports:[b.Bz.forChild(g)],exports:[b.Bz]})],h);let p=class{};p=(0,r.gn)([(0,e.LVF)({imports:[i.ez,c.u5,s.Pc,h,a.m],declarations:[u]})],p)}}]);
//# sourceMappingURL=5360-es2015.js.map