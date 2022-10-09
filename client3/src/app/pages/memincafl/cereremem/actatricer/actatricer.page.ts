import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';
import { MemMembruTipRequest_Schimbare } from '../../../../payloads/mem/MemMembruTipRequest_Schimbare';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';


@Component({
  selector: 'app-actatricer',
  templateUrl: './actatricer.page.html',
  styleUrls: ['./actatricer.page.scss'],
})
export class ActATriCerPage implements OnInit {

  frmActATriCererea: FormGroup = new FormGroup(
    {
       mesaj: new FormControl('Trimite Confirmarea pentru a deveni Membru Activ Afiliat',[]),// [Validators.required, Validators.minLength(8), Validators.maxLength(16)]),
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
    if (this.frmActATriCer.valid) {
      console.log(this.frmActATriCer.value);
    }*/
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  onActATriCererea() {
    if (this.frmActATriCererea.valid) 
    {
      console.log(this.frmActATriCererea.value);
      var memMembruTipRequestSchimbare : MemMembruTipRequest_Schimbare = new MemMembruTipRequest_Schimbare();
      //---
      memMembruTipRequestSchimbare.crtmemtipcod = "MEMINCAFL";
	    memMembruTipRequestSchimbare.newmemtipcod = "MEMACTAFL";
      //---
	    memMembruTipRequestSchimbare.crtmemrolcod = "MEMINCAFL";
	    memMembruTipRequestSchimbare.newmemrolcod = "MEMACTAFL";
      //---
      this.store.dispatch(new AuthAction.MemMembruTipSchimbare(memMembruTipRequestSchimbare, this.token));

    }
  }

  ngOnInit(){
    //this.frmActATriCer = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
