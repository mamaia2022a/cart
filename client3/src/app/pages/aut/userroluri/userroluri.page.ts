import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { IonContent, MenuController } from '@ionic/angular';
import { Storage } from '@ionic/storage';
import { Store } from '@ngxs/store';
import { RolGrupActiuniAction } from '../../../core/aut/rol_grupactiuni/rol_grupactiuni.actions';
import { AuthAction } from '../../../core/auth-guard/auth-guard.actions';


@Component({
  selector: 'app-userroles',
  templateUrl: './userroluri.page.html',
  styleUrls: ['./userroluri.page.scss'],
})
export class UserRoluriPage implements OnInit {
  frmUserRoluri: FormControl;
  userroluri: any = null;
  loginResponse: any;


  constructor(private storage: Storage, private store: Store, private menuController: MenuController) 
  {
    //this.userroluri = null;
    this.getLocalStorageData()
            .then(data =>{
                  //ok
            })
  }

  getLocalStorageData(){
    var self =this;
    return new Promise(resolve => {
      self.storage.get("loginresponse")
        .then( value => 
            { 
              self.loginResponse = value;
              self.userroluri = self.loginResponse.autUser.roles;
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

