import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { AuthAction } from '../../../core/auth-guard/auth-guard.actions';


@Component({
  selector: 'app-actiunesubactiuni',
  templateUrl: './actiunesubactiuni.page.html',
  styleUrls: ['./actiunesubactiuni.page.scss'],
})
export class ActiuneSubactiuniPage implements OnInit {
  frmActiuneSubactiuni: FormControl;
  crtgrupact : any = null;
  loginResponse : any;

  crtactiune : any; 
  crtsubactiuni$ : Observable<any>
  crtsubactiuni : any;
  backaction : string;
  crtsubactiuniparams$ : Observable<any>
  crtsubactiuniparams  : any;

  constructor(private storage: Storage, private store: Store)  
  {
    //this.actiunesubactiuni = null;
    var self = this;
    this.getLocalStorageData()
            .then(async data =>{
                  //ok
                  var data2 = await this.storage.get("crtgrupact");
                  while (data2 == null) 
                    data2 = await this.storage.get("crtgrupact");
                  //---
                  self.crtgrupact = data2;

                  var data1 = await this.storage.get("crtactiune");
                  while (data1 == null) 
                    data1 = await this.storage.get("crtactiune");
                  //---
                  self.crtactiune = data1;

                  var data3 = await this.storage.get("crtsubactiuni");
                  while (data3 == null) 
                    data3 = await this.storage.get("crtsubactiuni");
                  //---
                  self.crtsubactiuni = data3;
                  self.crtsubactiuni$ = of(data3);


                  var data4 = await this.storage.get("backaction");
                  while (data4 == null) 
                    data4 = await this.storage.get("backaction");
                  self.backaction = data4;

                  var data5 = await this.storage.get("crtsubactiuniparams");
                  while (data5 == null) 
                    data5 = await this.storage.get("crtsubactiuniparams");
                  //---
                  self.crtsubactiuniparams = data5;
                  self.crtsubactiuniparams$ = of(data5);

            })
  }

  getLocalStorageData(){
    var self =this;
    return new Promise(resolve => {
      self.storage.get("crtgrupact")
        .then( value => 
            { 
              self.crtgrupact= value;
              console.log(value);
              resolve(value);
            });
            
         });
    }

  done() {
    if (this.frmActiuneSubactiuni.valid) {
      console.log(this.frmActiuneSubactiuni.value);
    }
  }

  selectieGrupactactiune(subactiuneid : number) {
      console.log("selectie grupactactiuneid : " + subactiuneid);
      this.store.dispatch(new AuthAction.Subactiune(subactiuneid, this.crtgrupact));
  }

  ngOnInit(){
    this.frmActiuneSubactiuni = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtgrupact);
  }
}
