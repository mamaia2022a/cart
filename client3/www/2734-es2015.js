(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[2734],{52734:function(o,r,n){"use strict";n.r(r),n.d(r,{UserRoluriPageModule:function(){return f}});var e=n(64762),l=n(62272),i=n(38583),t=n(3679),s=n(4050),u=n(44466),a=n(61628),c=n(68168),g=n(41964),p=n(83752);let h=class{constructor(o,r,n){this.storage=o,this.store=r,this.menuController=n;var l=this;this.getLocalStorageData().then(o=>(0,e.mG)(this,void 0,void 0,function*(){for(var o=yield l.storage.get("loginresponse");null==o;)o=yield l.storage.get("loginresponse");l.loginResponse=o,l.userroluri=l.loginResponse.autUser.roles,l.userroluri$=(0,g.of)(l.userroluri),console.log(o)})).catch(o=>(0,e.mG)(this,void 0,void 0,function*(){for(var o=yield l.storage.get("loginresponse");null==o;)o=yield l.storage.get("loginresponse");l.loginResponse=o,l.userroluri=l.loginResponse.autUser.roles,l.userroluri$=(0,g.of)(l.userroluri),console.log(o)}))}getLocalStorageData(){var o=this;return new Promise(r=>{o.storage.get("xxx").then(o=>{console.log(o),r(o)})})}done(){this.frmUserRoluri.valid&&console.log(this.frmUserRoluri.value)}selectieRol(o){console.log("selectie rol : "+o),this.store.dispatch(new p.g.Rolgrupactiunii(o,this.loginResponse))}ngOnInit(){this.frmUserRoluri=new t.NI("",[t.kI.required,t.kI.email]),console.log(this.userroluri)}toggleProfileMenu(){console.log("toggleProfileMenu");this.menuController.toggle("profile").then(()=>{})}};h.ctorParameters=()=>[{type:a.K},{type:c.yh},{type:s._q}],h=(0,e.gn)([(0,l.wA2)({selector:"app-userroles",template:'<ion-header>\r\n  <ion-toolbar color="dark">\r\n    <ion-buttons slot="secondary">\r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="person-circle"></ion-icon>\r\n      </ion-button>\r\n      \x3c!-- \r\n      <ion-button>\r\n        <ion-icon slot="icon-only" name="search"></ion-icon>\r\n      </ion-button>\r\n      --\x3e\r\n    </ion-buttons>\r\n    <ion-buttons slot="primary">\r\n      <ion-menu-button menuId="mainmenu"></ion-menu-button>\r\n      \x3c!-- \r\n      <ion-button color="danger">\r\n        <ion-icon slot="icon-only" ios="ellipsis-horizontal" md="ellipsis-vertical"></ion-icon>\r\n      </ion-button>\r\n    --\x3e\r\n    </ion-buttons>\r\n    <ion-title>Bine Ai Venit ! &nbsp; &nbsp; &nbsp; </ion-title>\r\n  </ion-toolbar>  \r\n</ion-header>\r\n\r\n<ion-content [fullscreen]="true">\r\n  \x3c!-- List of Text Items --\x3e\r\n\r\n      <ng-container *ngIf="userroluri$">\r\n        <h3>Func\u021biile dumneavoastr\u0103 \xeen Partid</h3>\r\n        <ion-list>\r\n          <ion-item button="true" detail *ngFor=\'let userrol of userroluri\' (click)="selectieRol(userrol.autUserrolId)">\r\n            <ion-label>\r\n              <h2>{{userrol.rol.autRolDisplayNume}}</h2>\r\n              <p>{{userrol.rol.autRolDisplaydescriere}}</p>\r\n            </ion-label>\r\n          </ion-item>\r\n\r\n          \x3c!--\r\n          <ion-item detail *ngFor=\'let rol of roles\' (click)="selectieRol(rol.autUserrolId)">\r\n            <ion-label>\r\n              <h2>{{rol.rol.autRolDisplayNume}}</h2>\r\n              <p>{{rol.rol.autRolDisplaydescriere}}</p>\r\n            </ion-label>\r\n          </ion-item>\r\n          \r\n          \r\n          <button width="100%" ion-item *ngFor=\'let userrol of userroluri\' (click)="selectieRol(userrol.autUserrolId)"> \r\n            <ion-label>\r\n              <h2>{{userrol.rol.autRolDisplayNume}}</h2>\r\n              <p>{{userrol.rol.autRolDisplaydescriere}}</p>\r\n            </ion-label>\r\n\r\n          </button>\r\n          --\x3e\r\n        </ion-list>\r\n     </ng-container>\r\n\r\n\r\n</ion-content>\r\n',styles:[""]})],h);var d=n(26096);const m=[{path:"",component:h}];let b=class{};b=(0,e.gn)([(0,l.LVF)({imports:[d.Bz.forChild(m)],exports:[d.Bz]})],b);let f=class{};f=(0,e.gn)([(0,l.LVF)({imports:[i.ez,t.u5,s.Pc,b,u.m],declarations:[h]})],f)}}]);
//# sourceMappingURL=2734-es2015.js.map