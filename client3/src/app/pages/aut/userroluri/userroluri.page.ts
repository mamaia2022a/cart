import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { IonContent, MenuController } from '@ionic/angular';
import { Storage } from '@ionic/storage';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { RolGrupActiuniAction } from '../../../core/aut/rol_grupactiuni/rol_grupactiuni.actions';
import { AuthAction } from '../../../core/auth-guard/auth-guard.actions';


@Component({
  selector: 'app-userroles',
  templateUrl: './userroluri.page.html',
  styleUrls: ['./userroluri.page.scss'],
})
export class UserRoluriPage implements OnInit {
  frmUserRoluri: FormControl;
  userroluri: any ;
  userroluri$: Observable<any> ;
  loginResponse: any;


  constructor(private storage: Storage, private store: Store, private menuController: MenuController) 
  {
    //this.userroluri = null;
    /*
    var self = this;
    async () => {
      var data2 = await self.storage.get("loginresponse");
      while (data2 == null) 
        data2 = await self.storage.get("loginresponse");
      //---
      self.loginResponse = data2;
      self.userroluri = self.loginResponse.autUser.roles;
      self.userroluri$ = of(self.userroluri);
      console.log(data2);
    }
    */
   var self = this;
    
    this.getLocalStorageData()
       
            .then(async data =>{
              var data2 = await self.storage.get("loginresponse");
              while (data2 == null) 
                data2 = await self.storage.get("loginresponse");
              //---
              self.loginResponse = data2;
              self.userroluri = self.loginResponse.autUser.roles;
              self.userroluri$ = of(self.userroluri);
              console.log(data2);
        
            })
            .catch(async data =>{
              var data2 = await self.storage.get("loginresponse");
              while (data2 == null) 
                data2 = await self.storage.get("loginresponse");
              //---
              self.loginResponse = data2;
              self.userroluri = self.loginResponse.autUser.roles;
              self.userroluri$ = of(self.userroluri);
              console.log(data2);
        
            })
          
  }

  getLocalStorageData(){
    var self =this;
    return new Promise(resolve => {
      self.storage.get("xxx")
        .then( value => 
            { 
              //self.loginResponse = value;
              //self.userroluri = self.loginResponse.autUser.roles;
              //self.userroluri$ = of(self.userroluri);
              console.log(value);
              resolve(value);
            });
            
         });
    }

  done() {
    if (this.frmUserRoluri.valid) {
      console.log(this.frmUserRoluri.value);
    }
  }

  selectieRol(userrolid : number) {
      console.log("selectie rol : " + userrolid);
      //this.store.dispatch(new RolGrupActiuniAction.Rolgrupactiuni(userrolid, this.loginResponse));
      this.store.dispatch(new AuthAction.Rolgrupactiunii(userrolid, this.loginResponse));
  }

  ngOnInit(){
    this.frmUserRoluri = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.userroluri);
  }

  toggleProfileMenu() {
    console.log('toggleProfileMenu');
    //this.menuController.toggle('profile');
    
    var self = this;
    this.menuController.toggle("profile").then(() => {
      //this.menuController.open();
    });
  }

}

