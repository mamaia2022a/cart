!function(){function e(e,t){for(var i=0;i<t.length;i++){var o=t[i];o.enumerable=o.enumerable||!1,o.configurable=!0,"value"in o&&(o.writable=!0),Object.defineProperty(e,o.key,o)}}function t(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[2099],{92099:function(i,o,n){"use strict";n.r(o),n.d(o,{RegisterPageModule:function(){return k}});var r=n(64762),a=n(62272),l=n(38583),s=n(3679),u=n(4050),c=n(44466),d=n(83752),m=function e(){t(this,e)},h=n(68168),g=n(41964),p=n(61628),z=function(){function i(e,o,n,a){var l=this;t(this,i),this.store=e,this.navController=o,this.platform=n,this.storage=a,this.register=new s.cw({username:new s.NI("",[s.kI.required,s.kI.minLength(5),s.kI.maxLength(150)]),password:new s.NI("",[s.kI.required,s.kI.minLength(5),s.kI.maxLength(150)]),passwordConfirm:new s.NI(null,[s.kI.required,s.kI.minLength(5),s.kI.maxLength(150)]),nume:new s.NI("",[s.kI.required,s.kI.maxLength(150)]),prenume:new s.NI("",[s.kI.required,s.kI.maxLength(150)]),telefon:new s.NI("",[s.kI.required,s.kI.maxLength(150)]),email:new s.NI("",[s.kI.required,s.kI.maxLength(150)]),datanasterii:new s.NI("",[s.kI.maxLength(150)]),sex:new s.NI("",[s.kI.maxLength(150)]),domzonatara:new s.NI("",[s.kI.required,s.kI.maxLength(150)]),domjudet:new s.NI("",[s.kI.required,s.kI.maxLength(150)]),domuat:new s.NI("",[s.kI.required,s.kI.maxLength(150)]),domlocalitate:new s.NI("",[s.kI.required,s.kI.maxLength(150)]),domcodpostal:new s.NI("",[,s.kI.maxLength(150)]),domadresa:new s.NI("",[,s.kI.maxLength(150)]),rezdifdom:new s.NI("n",[s.kI.required,s.kI.maxLength(150)]),rezzonatara:new s.NI("",[s.kI.maxLength(150)]),rezjudet:new s.NI("",[s.kI.maxLength(150)]),rezuat:new s.NI("",[s.kI.maxLength(150)]),rezlocalitate:new s.NI("",[s.kI.maxLength(150)]),rezcodpostal:new s.NI("",[s.kI.maxLength(150)]),rezadresa:new s.NI("",[s.kI.maxLength(150)]),refmembrucodunic:new s.NI("",[s.kI.maxLength(150)])},{validators:[this.passwordConfirmMatchValidator]}),this.zonetara$=null,this.domjudete$=null,this.domjudete=null,this.domuateuri$=null,this.domuateuri=null,this.domlocalitati$=null,this.domlocalitati=null,this.rezjudete$=null,this.rezjudete=null,this.rezuateuri$=null,this.rezuateuri=null,this.rezlocalitati$=null,this.rezlocalitati=null,this.showRezidenta=!1;var u=this;this.store.dispatch(new d.g.GeoZonetara("zonetara")).subscribe(function(){return(0,r.mG)(l,void 0,void 0,regeneratorRuntime.mark(function e(){var t;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,this.storage.get("zonetara");case 2:t=e.sent;case 3:if(null!=t){e.next=9;break}return e.next=6,this.storage.get("zonetara");case 6:t=e.sent;case 7:e.next=3;break;case 9:u.zonetara$=(0,g.of)(t);case 10:case"end":return e.stop()}},e,this)}))},function(e){console.log("Error Calling Action GeoZoneTara: "+e)})}var o,n,a;return o=i,(n=[{key:"loadZonetara",value:function(e){var t=this,i=this;this.store.dispatch(new d.g.GeoZonetara(e)).subscribe(function(){return(0,r.mG)(t,void 0,void 0,regeneratorRuntime.mark(function t(){var o;return regeneratorRuntime.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,this.storage.get(e);case 2:o=t.sent;case 3:if(null!=o){t.next=9;break}return t.next=6,this.storage.get(e);case 6:o=t.sent;case 7:t.next=3;break;case 9:i.zonetara$=(0,g.of)(o);case 10:case"end":return t.stop()}},t,this)}))},function(e){console.log("Error Calling Action GeoZoneTara: "+e)})}},{key:"loadJudete",value:function(e,t){var i=this,o=this;this.store.dispatch(new d.g.GeoJudete(e,t)).subscribe(function(){return(0,r.mG)(i,void 0,void 0,regeneratorRuntime.mark(function e(){var i;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return console.log("Call Action GeoJudete: "),e.next=3,this.storage.get(t);case 3:i=e.sent;case 4:if(null!=i){e.next=10;break}return e.next=7,this.storage.get(t);case 7:i=e.sent;case 8:e.next=4;break;case 10:"domjudete"==t?o.domjudete$=(0,g.of)(i):"rezjudete"==t&&(o.rezjudete$=(0,g.of)(i));case 11:case"end":return e.stop()}},e,this)}))},function(e){console.log("Error Calling Action GeoJudete: "+e)})}},{key:"loadUateuri",value:function(e,t,i){var o=this,n=this;this.store.dispatch(new d.g.GeoUateuri(e,t,i)).subscribe(function(){return(0,r.mG)(o,void 0,void 0,regeneratorRuntime.mark(function e(){var t;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return console.log("Call Action GeoUateuri: "),e.next=3,this.storage.get(i);case 3:t=e.sent;case 4:if(null!=t){e.next=10;break}return e.next=7,this.storage.get(i);case 7:t=e.sent;case 8:e.next=4;break;case 10:"domuateuri"==i?n.domuateuri$=(0,g.of)(t):"rezuateuri"==i&&(n.rezuateuri$=(0,g.of)(t));case 11:case"end":return e.stop()}},e,this)}))},function(e){console.log("Error Calling Action GeoUateuri: "+e)})}},{key:"loadLocalitati",value:function(e,t,i,o){var n=this,a=this;this.store.dispatch(new d.g.GeoLocalitati(e,t,i,o)).subscribe(function(){return(0,r.mG)(n,void 0,void 0,regeneratorRuntime.mark(function e(){var t;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return console.log("Call Action GeoLocalitati: "),e.next=3,this.storage.get(o);case 3:t=e.sent;case 4:if(null!=t){e.next=10;break}return e.next=7,this.storage.get(o);case 7:t=e.sent;case 8:e.next=4;break;case 10:"domlocalitati"==o?a.domlocalitati$=(0,g.of)(t):"rezlocalitati"==o&&(a.rezlocalitati$=(0,g.of)(t));case 11:case"end":return e.stop()}},e,this)}))},function(e){console.log("Error Calling Action GeoLocalitati: "+e)})}},{key:"selectieDomZonatara",value:function(e){console.log("selectie dom zona tara id:"+e.detail.value),this.selDomZonataraid=e.detail.value,console.log(this.selDomJudetid),this.domjudete$=null,this.domuateuri$=null,this.domlocalitati$=null,this.selDomJudetid=null,this.selDomUatid=null,this.selDomLocalitateid=null,this.storage.remove("domjudete"),this.register.get("domjudet").reset(),this.storage.remove("domuateuri"),this.register.get("domuat").reset(),this.storage.remove("domlocalitati"),this.register.get("domlocalitate").reset(),this.loadJudete(this.selDomZonataraid,"domjudete")}},{key:"selectieDomJudet",value:function(e){console.log("selectie dom judet id:"+e.detail.value),this.selDomJudetid=e.detail.value,console.log(this.selDomJudetid),this.domuateuri$=null,this.domlocalitati$=null,this.selDomUatid=null,this.selDomLocalitateid=null,this.storage.remove("domuateuri"),this.register.get("domuat").reset(),this.storage.remove("domlocalitati"),this.register.get("domlocalitate").reset(),0!=this.selDomJudetid&&this.loadUateuri(this.selDomZonataraid,this.selDomJudetid,"domuateuri")}},{key:"selectieDomUat",value:function(e){console.log("selectie dom uat id:"+e.detail.value),this.selDomUatid=e.detail.value,console.log(this.selDomUatid),this.domlocalitati$=null,this.selDomLocalitateid=null,this.storage.remove("domlocalitati"),this.register.get("domlocalitate").reset(),0!=this.selDomJudetid&&0!=this.selDomUatid&&this.loadLocalitati(this.selDomZonataraid,this.selDomJudetid,this.selDomUatid,"domlocalitati")}},{key:"selectieDomLocalitate",value:function(e){console.log("selectie dom localitate id:"+e.detail.value),this.selDomLocalitateid=e.detail.value,console.log(this.selDomLocalitateid)}},{key:"selectieDomDifRez",value:function(e){console.log("selectie dom dif rez:"+e.detail.value),this.selDomDifRez=e.detail.value,console.log(this.selDomDifRez),"n"==this.selDomDifRez?this.showRezidenta=!1:this.showRezidenta=!0}},{key:"selectieRezZonatara",value:function(e){console.log("selectie rez zona tara id:"+e.detail.value),this.selRezZonataraid=e.detail.value,console.log(this.selRezJudetid),this.rezjudete$=null,this.rezuateuri$=null,this.rezlocalitati$=null,this.selRezJudetid=null,this.selRezUatid=null,this.selRezLocalitateid=null,this.storage.remove("rezjudete"),this.register.get("rezjudet").reset(),this.storage.remove("rezuateuri"),this.register.get("rezuat").reset(),this.storage.remove("rezlocalitati"),this.register.get("rezlocalitate").reset(),this.loadJudete(this.selRezZonataraid,"rezjudete")}},{key:"selectieRezJudet",value:function(e){console.log("selectie rez judet id:"+e.detail.value),this.selRezJudetid=e.detail.value,console.log(this.selRezJudetid),this.rezuateuri$=null,this.rezlocalitati$=null,this.selRezUatid=null,this.selRezLocalitateid=null,this.storage.remove("rezuateuri"),this.register.get("rezuat").reset(),this.storage.remove("rezlocalitati"),this.register.get("rezlocalitate").reset(),0!=this.selRezJudetid&&this.loadUateuri(this.selRezZonataraid,this.selRezJudetid,"rezuateuri")}},{key:"selectieRezUat",value:function(e){console.log("selectie rez uat id:"+e.detail.value),this.selRezUatid=e.detail.value,console.log(this.selRezUatid),this.rezlocalitati$=null,this.selRezLocalitateid=null,this.storage.remove("rezlocalitati"),this.register.get("rezlocalitate").reset(),0!=this.selRezJudetid&&0!=this.selRezUatid&&this.loadLocalitati(this.selRezZonataraid,this.selRezJudetid,this.selRezUatid,"rezlocalitati")}},{key:"selectieRezLocalitate",value:function(e){console.log("selectie rez localitate id:"+e.detail.value),this.selRezLocalitateid=e.detail.value,console.log(this.selRezLocalitateid)}},{key:"onRegister",value:function(){if(this.register.valid){console.log(this.register.value);var e=new m;e.username=this.register.value.username,e.password=this.register.value.password,e.nume=this.register.value.nume,e.prenume=this.register.value.prenume,e.telefon=this.register.value.telefon,e.email=this.register.value.email,e.sex=this.register.value.sex;var t=this.register.value.datanasterii;e.datanasterii=1e4*parseInt(t.toString().substring(0,4))+100*parseInt(t.toString().substring(5,7))+parseInt(t.toString().substring(9,10)),e.domZonataraid=this.register.value.domzonatara,e.domJudetid=this.register.value.domjudet,e.domUatid=this.register.value.domuat,e.domLocalitateid=this.register.value.domlocalitate,e.domCodpostal=this.register.value.domcodpostal,e.domAdresa=this.register.value.domadresa,e.rezdifdedom=this.register.value.rezdifdom,"y"==e.rezdifdedom?(e.rezZonataraid=this.register.value.rezzonatara,e.rezJudetid=this.register.value.rezjudet,e.rezUatid=this.register.value.rezuat,e.rezLocalitateid=this.register.value.rezlocalitate,e.rezCodpostal=this.register.value.rezcodpostal,e.rezAdresa=this.register.value.rezadresa):(e.rezZonataraid=null,e.rezJudetid=null,e.rezUatid=null,e.rezLocalitateid=null,e.rezCodpostal=null,e.rezAdresa=null),e.refmembrucodunic=this.register.value.rezmembrucodunic,null===e.refmembrucodunic&&(e.refmembrucodunic=null),this.store.dispatch(new d.g.Register(e))}}},{key:"ngOnInit",value:function(){}},{key:"passwordConfirmMatchValidator",value:function(e){var t=e.get("password"),i=e.get("passwordConfirm");i.hasError("required")||i.hasError("minlength")||(t.value!==i.value?i.setErrors({mismatch:!0}):i.setErrors(null))}},{key:"rezjudetMatchValidator",value:function(e){var t=e.get("rezdifdom"),i=e.get("rezjudet");return console.log("rzdiform"+t.value),0==t.value?(i.setErrors(null),{validRezjudet:!0}):{validRezjudet:!1}}}])&&e(o.prototype,n),a&&e(o,a),i}();z.ctorParameters=function(){return[{type:h.yh},{type:u.SH},{type:u.t4},{type:p.K}]},z=(0,r.gn)([(0,a.wA2)({selector:"app-register",template:'<ion-header class="ion-no-border">\r\n  <ion-toolbar>\r\n    <ion-buttons slot="start">\r\n      <ion-back-button [text]="\'backButtonTitle\' | translate" defaultHref="/auth/login"></ion-back-button>\r\n    </ion-buttons>\r\n    <ion-title>\xcenregistrare</ion-title>\r\n  </ion-toolbar>\r\n</ion-header>\r\n\r\n<ion-content [fullscreen]="true" class="auth-page">\r\n  <ion-grid>\r\n    <ion-row>\r\n      <ion-col class="ion-text-center" size-md="6" size-lg="5" size-xs="12">\r\n        <form [formGroup]="register" (ngSubmit)="onRegister()">\r\n          <ion-card color="light" class="auth-card ion-margin">\r\n            <ion-item color="light" class="ion-no-inner-padding-end">\r\n              <ion-input type="text" placeholder="Nume utilizator (minim 5)" formControlName="username"></ion-input>\r\n            </ion-item>\r\n            <ion-item color="light" class="ion-no-inner-padding-end">\r\n              <ion-input type="password" placeholder="Parola (minim 5)" formControlName="password"></ion-input>\r\n            </ion-item>\r\n            <ion-item color="light" class="ion-no-inner-padding-end">\r\n              <ion-input type="password" placeholder="Parola (confirmare)" formControlName="passwordConfirm">\r\n              </ion-input>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ion-input type="text" placeholder="Nume" formControlName="nume"></ion-input>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ion-input type="text" placeholder="Prenume" formControlName="prenume"></ion-input>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ion-input type="text" placeholder="Telefon" formControlName="telefon"></ion-input>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ion-input type="text" placeholder="Email" formControlName="email"></ion-input>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ion-select placeholder="Sexul" formControlName="sex">\r\n                <ion-select-option value="f">Feminin</ion-select-option>\r\n                <ion-select-option value="m">Masculin</ion-select-option>\r\n              </ion-select>\r\n            </ion-item> \r\n            <ion-item color="light">\r\n               <ion-datetime placeholder="Data Na\u0219terii"  displayFormat="YYYYMMDD" formControlName="datanasterii"></ion-datetime>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ng-container *ngIf="zonetara$">\r\n                <ion-select #domZoneTaraSelect placeholder="Ave\u021bi Domiciliul \xeen \u021aar\u0103 sau \xeen Diaspora?" formControlName="domzonatara" (ionChange)="selectieDomZonatara($event)">\r\n                   <ion-select-option value="{{zonatara.geoZonaTaraId}}" *ngFor=\'let zonatara of (zonetara$|async)\'>{{zonatara.geoZonaTaraNume}}</ion-select-option>\r\n              </ion-select>\r\n              </ng-container>              \r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ng-container *ngIf="domjudete$">\r\n                <ion-select #domJudeteSelect placeholder="Jude\u021bul de domiciliu" formControlName="domjudet" (ionChange)="selectieDomJudet($event)">\r\n                   <ion-select-option value="{{judet.geoJudetId}}" *ngFor=\'let judet of (domjudete$|async)\'>{{judet.geoJudetNume}}</ion-select-option>\r\n              </ion-select>\r\n              </ng-container>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ng-container *ngIf="domuateuri$">\r\n                <ion-select #domUateuriSelect placeholder="Unitatea administrativ Teritoriala de domiciliu" formControlName="domuat" (ionChange)="selectieDomUat($event)">\r\n                   <ion-select-option value="{{uat.geoUatId}}" *ngFor=\'let uat of (domuateuri$|async)\'>{{uat.geoUatNume}}</ion-select-option>\r\n              </ion-select>\r\n              </ng-container>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ng-container *ngIf="domlocalitati$">\r\n                <ion-select #domLocalitatiSelect placeholder="Localitatea de domiciliu" formControlName="domlocalitate" (ionChange)="selectieDomLocalitate($event)">\r\n                   <ion-select-option value="{{localitate.geoLocalitateId}}" *ngFor=\'let localitate of (domlocalitati$|async)\'>{{localitate.geoLocalitateNume}}</ion-select-option>\r\n              </ion-select>\r\n              </ng-container>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ion-input type="text" placeholder="Codul Postal la Domiciliu" formControlName="domcodpostal"></ion-input>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ion-input type="text" placeholder="Adresa de Domiciliu" formControlName="domadresa"></ion-input>\r\n            </ion-item>\r\n            <ion-item color="light">\r\n              <ion-select placeholder="Reziden\u021ba e diferit\u0103 dec\xe2t domiciliu din CI?" formControlName="rezdifdom" (ionChange)="selectieDomDifRez($event)">\r\n                <ion-select-option value="y">Reziden\u021ba e diferit\u0103 dec\xe2t Domiciliu din CI</ion-select-option>\r\n                <ion-select-option value="n">Reziden\u021ba nu e diferit\u0103 dec\xe2t Domiciliu din CI</ion-select-option>\r\n              </ion-select>\r\n            </ion-item>\r\n\r\n\r\n            <div *ngIf="showRezidenta">\r\n              <ion-item color="light">\r\n                <ng-container *ngIf="zonetara$">\r\n                  <ion-select #rezZoneTaraSelect placeholder="Ave\u021bi Reziden\u021ba \xeen \u021aar\u0103 sau \xeen Diaspora?" formControlName="rezzonatara" (ionChange)="selectieRezZonatara($event)">\r\n                    <ion-select-option value="{{zonatara.geoZonaTaraId}}" *ngFor=\'let zonatara of (zonetara$|async)\'>{{zonatara.geoZonaTaraNume}}</ion-select-option>\r\n                </ion-select>\r\n                </ng-container>              \r\n              </ion-item>\r\n              <ion-item color="light">\r\n                <ng-container *ngIf="rezjudete$">\r\n                  <ion-select #rezJudeteSelect placeholder="Jude\u021bul de reziden\u021b\u0103" formControlName="rezjudet" (ionChange)="selectieRezJudet($event)">\r\n                    <ion-select-option value="{{judet.geoJudetId}}" *ngFor=\'let judet of (rezjudete$|async)\'>{{judet.geoJudetNume}}</ion-select-option>\r\n                </ion-select>\r\n                </ng-container>\r\n              </ion-item>\r\n              <ion-item color="light">\r\n                <ng-container *ngIf="rezuateuri$">\r\n                  <ion-select #rezUateuriSelect placeholder="Unitatea administrativ Teritoriala de reziden\u021b\u0103" formControlName="rezuat" (ionChange)="selectieRezUat($event)">\r\n                    <ion-select-option value="{{uat.geoUatId}}" *ngFor=\'let uat of (rezuateuri$|async)\'>{{uat.geoUatNume}}</ion-select-option>\r\n                </ion-select>\r\n                </ng-container>\r\n              </ion-item>\r\n              <ion-item color="light">\r\n                <ng-container *ngIf="rezlocalitati$">\r\n                  <ion-select #rezLocalitatiSelect placeholder="Localitatea de reziden\u021b\u0103" formControlName="rezlocalitate" (ionChange)="selectieRezLocalitate($event)">\r\n                    <ion-select-option value="{{localitate.geoLocalitateId}}" *ngFor=\'let localitate of (rezlocalitati$|async)\'>{{localitate.geoLocalitateNume}}</ion-select-option>\r\n                </ion-select>\r\n                </ng-container>\r\n              </ion-item>\r\n              <ion-item color="light">\r\n                <ion-input type="text" placeholder="Codul Postal la Reziden\u021b\u0103" formControlName="rezcodpostal"></ion-input>\r\n              </ion-item>\r\n              <ion-item color="light">\r\n                <ion-input type="text" placeholder="Adresa de Reziden\u021b\u0103" formControlName="rezadresa"></ion-input>\r\n              </ion-item>\r\n            </div>\r\n            <ion-item color="light">\r\n              <ion-input type="text" placeholder="Codul unic al Membrului care te-a recomandat (Op\u021bional)" formControlName="refmembrucodunic"></ion-input>\r\n            </ion-item>\r\n          </ion-card>\r\n\r\n          <ion-button\r\n            expand="block"\r\n            class="ion-margin-start ion-margin-end ion-margin-bottom"\r\n            type="submit"\r\n            [disabled]="!register.valid"\r\n          >\r\n            \xcenregistrare\r\n          </ion-button>\r\n          <span class="ion-margin"></span>\r\n        </form>\r\n\r\n        <p class="ion-margin">\r\n          <ion-text>\r\n            Ap\u0103s\xe2nd butonul "\xcenregistrare", sunte\u021bi de acord cu:\r\n            <a href="http://">Terms of Service</a>\r\n            \u0219i cu:\r\n            <a href="http://">Privacy Policy</a>\r\n          </ion-text>\r\n        </p>\r\n      </ion-col>\r\n    </ion-row>\r\n  </ion-grid>\r\n</ion-content>\r\n',styles:[""]})],z);var f=n(26096),v=[{path:"",component:z}],I=function e(){t(this,e)};I=(0,r.gn)([(0,a.LVF)({imports:[f.Bz.forChild(v)],exports:[f.Bz]})],I);var k=function e(){t(this,e)};k=(0,r.gn)([(0,a.LVF)({imports:[l.ez,s.u5,u.Pc,I,c.m],declarations:[z]})],k)}}])}();
//# sourceMappingURL=2099-es5.js.map