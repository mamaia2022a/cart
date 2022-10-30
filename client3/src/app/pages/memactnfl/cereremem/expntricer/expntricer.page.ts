import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';
import { MemMembruTipRequest_Schimbare } from '../../../../payloads/mem/MemMembruTipRequest_Schimbare';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';


@Component({
  selector: 'app-expntricer',
  templateUrl: './expntricer.page.html',
  styleUrls: ['./expntricer.page.scss'],
})
export class ExpNTriCerPage implements OnInit {

  frmExpNTriCererea: FormGroup = new FormGroup(
    {
       mesaj: new FormControl('Trimite Confirmarea pentru Membru Experimentat Neafiliat',[]),// [Validators.required, Validators.minLength(8), Validators.maxLength(16)]),
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
    if (this.frmExpNTriCer.valid) {
      console.log(this.frmExpNTriCer.value);
    }*/
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  onExpNTriCererea() {
    if (this.frmExpNTriCererea.valid) 
    {
      console.log(this.frmExpNTriCererea.value);
      var memMembruTipRequestSchimbare : MemMembruTipRequest_Schimbare = new MemMembruTipRequest_Schimbare();
      //---
      memMembruTipRequestSchimbare.crtmemtipcod = "MEMACTNFL";
	    memMembruTipRequestSchimbare.newmemtipcod = "MEMEXPNFL";
      //---
	    memMembruTipRequestSchimbare.crtmemrolcod = "MEMACTNFL";
	    memMembruTipRequestSchimbare.newmemrolcod = "MEMEXPNFL";
      //---
      this.store.dispatch(new AuthAction.MemMembruTipSchimbare(memMembruTipRequestSchimbare, this.token));

    }
  }

  ngOnInit(){
    //this.frmExpNTriCer = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
