import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';
import { MemMembruTipRequest_Schimbare } from '../../../../payloads/mem/MemMembruTipRequest_Schimbare';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';


@Component({
  selector: 'app-expatricer',
  templateUrl: './expatricer.page.html',
  styleUrls: ['./expatricer.page.scss'],
})
export class ExpATriCerPage implements OnInit {

  frmExpATriCererea: FormGroup = new FormGroup(
    {
       mesaj: new FormControl('Trimite Confirmarea pentru a deveni Membru Experimentat Afiliat',[]),// [Validators.required, Validators.minLength(8), Validators.maxLength(16)]),
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
    if (this.frmExpATriCer.valid) {
      console.log(this.frmExpATriCer.value);
    }*/
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  onExpATriCererea() {
    if (this.frmExpATriCererea.valid) 
    {
      console.log(this.frmExpATriCererea.value);
      var memMembruTipRequestSchimbare : MemMembruTipRequest_Schimbare = new MemMembruTipRequest_Schimbare();
      //---
      memMembruTipRequestSchimbare.crtmemtipcod = "MEMACTAFL";
	    memMembruTipRequestSchimbare.newmemtipcod = "MEMEXPAFL";
      //---
	    memMembruTipRequestSchimbare.crtmemrolcod = "MEMACTAFL";
	    memMembruTipRequestSchimbare.newmemrolcod = "MEMEXPAFL";
      //---
      this.store.dispatch(new AuthAction.MemMembruTipSchimbare(memMembruTipRequestSchimbare, this.token));

    }
  }

  ngOnInit(){
    //this.frmExpATriCer = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
