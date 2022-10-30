import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';
import { MemMembruTipRequest_Schimbare } from '../../../../payloads/mem/MemMembruTipRequest_Schimbare';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';


@Component({
  selector: 'app-trimitecer',
  templateUrl: './trimitecer.page.html',
  styleUrls: ['./trimitecer.page.scss'],
})
export class TrimiteCerPage implements OnInit {

  frmTrimiteCererea: FormGroup = new FormGroup(
    {
       mesaj: new FormControl('Trimite Confirmarea Cererii de a deveni Membru',[]),// [Validators.required, Validators.minLength(8), Validators.maxLength(16)]),
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

  done() {
    /**
    if (this.frmTrimiteCer.valid) {
      console.log(this.frmTrimiteCer.value);
    }*/
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  onTrimiteCererea() {
    if (this.frmTrimiteCererea.valid) 
    {
      console.log(this.frmTrimiteCererea.value);
      var memMembruTipRequestSchimbare : MemMembruTipRequest_Schimbare = new MemMembruTipRequest_Schimbare();
      //---
      memMembruTipRequestSchimbare.crtmemtipcod = "SIMPATIZ";
	    memMembruTipRequestSchimbare.newmemtipcod = "MEMINCNFL";
      //---
	    memMembruTipRequestSchimbare.crtmemrolcod = "SIMPATIZ";
	    memMembruTipRequestSchimbare.newmemrolcod = "MEMINCNFL";
      //---
      this.store.dispatch(new AuthAction.MemMembruTipSchimbare(memMembruTipRequestSchimbare, this.token));

    }
  }

  ngOnInit(){
    //this.frmTrimiteCer = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
