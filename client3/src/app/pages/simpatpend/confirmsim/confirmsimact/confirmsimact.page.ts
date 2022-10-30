import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';
import { ValidateRegistrationRequest } from '../../../../payloads/aut/ValidateRegistrationRequest';

import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';


@Component({
  selector: 'app-confirmsimact',
  templateUrl: './confirmsimact.page.html',
  styleUrls: ['./confirmsimact.page.scss'],
})

export class ConfirmSimActPage implements OnInit {
  frmValidateRegistration: FormGroup = new FormGroup(
    {
       codvalidare: new FormControl('', [Validators.required, Validators.minLength(8), Validators.maxLength(16)]),
    });
  crtactiune : any = null;
  loginResponse : any;
  token : string;

  constructor(private store: Store, private navController: NavController, private platform: Platform, private storage: Storage)  
  {
    //this.confirmsimact = null;
    var self = this;
    this.getLocalStorageData()
            .then(async data =>{
              data = await self.storage.get("token");
              while (data == null) 
                data = await this.storage.get("token");
              //---
              self.token = <string>(data);
        
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
    //this.frmConfirmSimAct = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }


  onValidateRegistration() {
    if (this.frmValidateRegistration.valid)
    {
      console.log(this.frmValidateRegistration.value);
      var validateRegistrationRequest : ValidateRegistrationRequest = new ValidateRegistrationRequest();
      validateRegistrationRequest.codValidare   = this.frmValidateRegistration.value["codvalidare"];
      this.store.dispatch(new AuthAction.ValidateRegistration(validateRegistrationRequest, this.token));
    }
  }

  done() {
  }
  
}
