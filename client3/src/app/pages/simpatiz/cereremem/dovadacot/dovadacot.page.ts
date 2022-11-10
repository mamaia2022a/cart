import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';
import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';
import { PayDataRequest_Creare } from '../../../../payloads/pay/PayDataRequest_Creare';



@Component({
  selector: 'app-dovadacot',
  templateUrl: './dovadacot.page.html',
  styleUrls: ['./dovadacot.page.scss'],
})
export class DovadaCotPage implements OnInit {
  frmDovadaCot: FormControl;
  crtactiune : any = null;
  loginResponse : any;

  token : string ;


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

  /** 
  constructor(private storage: Storage) 
  {
    //this.dovadacot = null;
    this.getLocalStorageData()
            .then(data =>{

              var self = this;
              this.getLocalStorageData()
                      .then(async data =>{
                        data = await self.storage.get("token");
                        while (data == null) 
                          data = await this.storage.get("token");
                        //---
                        self.token = <string>(data);
                  
                      })
          
                  //ok
            })
  }*/

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
    if (this.frmDovadaCot.valid) {
      console.log(this.frmDovadaCot.value);
    }
  }

  selectiePlata(tipplata : string) {
    console.log("selectie tip plata : " + tipplata);
    var payDataRequestCreare :  PayDataRequest_Creare = new PayDataRequest_Creare();
    //---
    if (tipplata == "100")
    {
      payDataRequestCreare.amount = 100.00; 
      payDataRequestCreare.order_desc = "PlataPachetStandard100"; 

    }else if (tipplata == "1000")
    {
      payDataRequestCreare.amount = 1000.00;
      payDataRequestCreare.order_desc = "PlataPachetStandard1000"; 

    }else if (tipplata == "5000")
    {
      payDataRequestCreare.amount = 5000.00; 
      payDataRequestCreare.order_desc = "PlataPachetStandard5000"; 
    }else{
      return ; //to do : am platit deja 
    }
    payDataRequestCreare.amount = 0.1; //test
    payDataRequestCreare.curr   = "RON"
    //---
    this.store.dispatch(new AuthAction.PlataCotizatie(payDataRequestCreare, this.token, "paydata"));

  }

  ngOnInit(){
    this.frmDovadaCot = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
