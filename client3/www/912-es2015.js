(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[912],{96308:function(n,t,o){"use strict";o.r(t),o.d(t,{ListActTPageModule:function(){return p}});var e=o(64762),i=o(62272),c=o(38583),s=o(3679),a=o(4050),r=o(44466),l=o(61628);let u=class{constructor(n){this.storage=n,this.crtactiune=null,this.getLocalStorageData().then(n=>{})}getLocalStorageData(){var n=this;return new Promise(t=>{n.storage.get("crtactiune").then(o=>{n.crtactiune=o,console.log(o),t(o)})})}done(){this.frmListActT.valid&&console.log(this.frmListActT.value)}selectieFaActiune(n){console.log("selectie fa actiune : "+n)}ngOnInit(){this.frmListActT=new s.NI("",[s.kI.required,s.kI.email]),console.log(this.crtactiune)}};u.ctorParameters=()=>[{type:l.K}],u=(0,e.gn)([(0,i.wA2)({selector:"app-listactt",template:'<ion-header>\n  <ion-toolbar color="dark">\n        <ion-buttons slot="start">\n          <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/aut/grupactactiuni"></ion-back-button>\n        </ion-buttons>\n    <ion-buttons slot="secondary">\n      <ion-button>\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\n      </ion-button>\n      \x3c!-- \n      <ion-button>\n        <ion-icon slot="icon-only" name="search"></ion-icon>\n      </ion-button>\n      --\x3e\n    </ion-buttons>\n    <ion-buttons slot="primary">\n      <ion-button color="danger">\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\n      </ion-button>\n    </ion-buttons>\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\n  </ion-toolbar>  \n</ion-header>\n\n<ion-content [fullscreen]="true">\n   \n  \x3c!-- List of Text Items --\x3e\n      <ng-container *ngIf="crtactiune">\n        <h3>{{crtactiune.autActiuneDisplaynume}}</h3>\n     </ng-container>\n  \n\n\n</ion-content>\n',styles:[""]})],u);var b=o(26096);const g=[{path:"",component:u}];let h=class{};h=(0,e.gn)([(0,i.LVF)({imports:[b.Bz.forChild(g)],exports:[b.Bz]})],h);let p=class{};p=(0,e.gn)([(0,i.LVF)({imports:[c.ez,s.u5,a.Pc,h,r.m],declarations:[u]})],p)}}]);
//# sourceMappingURL=912-es2015.js.map