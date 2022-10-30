import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';
import { MemMembruTipRequest_Schimbare } from '../../../../payloads/mem/MemMembruTipRequest_Schimbare';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';
import { MemGrupRequest_Creare } from '../../../../payloads/mem/MemGrupRequest_Creare';


@Component({
  selector: 'app-memactexpnfl',
  templateUrl: './memactexpnfl.page.html',
  styleUrls: ['./memactexpnfl.page.scss'],
})
export class MemActExpNflPage implements OnInit {

  frmMemActExpNfl: FormGroup = new FormGroup(
    {
      grupnume: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(20)]),
    });
  crtactiune : any = null;
  loginResponse : any;
  token : string;
  crtrol : any;

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
        
              var data2 = await self.storage.get("crtrol");
              while (data == null) 
                data2 = await this.storage.get("crtrol");
              //---
              self.crtrol = <string>(data2);
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
    if (this.frmMemActExpNfl.valid) {
      console.log(this.frmMemActExpNfl.value);
    }*/
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  onMemActExpNfl() {
    if (this.frmMemActExpNfl.valid) 
    {
      console.log(this.frmMemActExpNfl.value);
      var memGrupRequestCreare : MemGrupRequest_Creare = new MemGrupRequest_Creare();
      memGrupRequestCreare.grupnume    = this.frmMemActExpNfl.value["grupnume"];
      //---
      memGrupRequestCreare.crtmemtipcod = this.crtrol.autRolCod; //"MEMACTNFL";
	    memGrupRequestCreare.newmemtipcod = "SEFGRUP";
      //---
	    memGrupRequestCreare.crtmemrolcod = this.crtrol.autRolCod; //"MEMACTNFL";
	    memGrupRequestCreare.newmemrolcod = "SEFGRUP";
      //---
      this.store.dispatch(new AuthAction.MemGrupCreare(memGrupRequestCreare, this.token));

    }
  }

  ngOnInit(){
    //this.frmMemActExpNfl = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
