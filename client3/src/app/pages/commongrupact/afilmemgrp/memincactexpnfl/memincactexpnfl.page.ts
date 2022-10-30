import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';
import { ValidateRegistrationRequest } from '../../../../payloads/aut/ValidateRegistrationRequest';

import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';
import { MemMembruRequest_CerereAfiliere } from '../../../../payloads/mem/MemMembruRequest_CerereAfiliere';


@Component({
  selector: 'app-memincactexpnfl',
  templateUrl: './memincactexpnfl.page.html',
  styleUrls: ['./memincactexpnfl.page.scss'],
})

export class MemIncActExpNflPage implements OnInit {
  frmCerereAfiliere: FormGroup = new FormGroup(
    {
       codunicgrup: new FormControl('', [Validators.required, Validators.minLength(8), Validators.maxLength(16)]),
    });

  crtrol : any = null;
  crtactiune : any = null;
  loginResponse : any;
  token : string;

  constructor(private store: Store, private navController: NavController, private platform: Platform, private storage: Storage)  
  {
    //this.memincactexpnfl = null;
    var self = this;
    this.getLocalStorageData()
            .then(async data =>{
              data = await self.storage.get("token");
              while (data == null) 
                data = await this.storage.get("token");
              //---
              self.token = <string>(data);
        
              var data2 = await self.storage.get("crtrol");
              while (data == null) 
                data2 = await this.storage.get("crtrol");
              //---
              self.crtrol = data2;
            })
  }

  getLocalStorageData(){
    var self =this;
    return new Promise(resolve => {
      self.storage.get("crtactiune")
        .then( value => 
            { 
              self.crtactiune = value;
              console.log(value);
              resolve(value);
            });
            
         });
    }


  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  ngOnInit(){
    //this.frmMemIncActExpNfl = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }


  onTrimiteCerereaDeAfiliere() {
    if (this.frmCerereAfiliere.valid)
    {
      console.log(this.frmCerereAfiliere.value);
      var memMembruRequestCerereAfiliere : MemMembruRequest_CerereAfiliere = new MemMembruRequest_CerereAfiliere();
      memMembruRequestCerereAfiliere.grupcodunic   = this.frmCerereAfiliere.value["codunicgrup"];
      memMembruRequestCerereAfiliere.crtmemrolcod  = this.crtrol.autRolCod;
      memMembruRequestCerereAfiliere.crtmemtipcod  = this.crtrol.autRolCod;
      this.store.dispatch(new AuthAction.MemMembruCerereAfiliere(memMembruRequestCerereAfiliere, this.token));
    }
  }

  done() {
  }
  
}
