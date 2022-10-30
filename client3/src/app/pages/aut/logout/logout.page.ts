import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormControl, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { AuthAction } from '../../../core/auth-guard/auth-guard.actions';
import { Storage } from '@ionic/storage';
import { Store } from '@ngxs/store';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.page.html',
  styleUrls: ['./logout.page.scss'],
})


export class LogoutPage implements OnInit {
  loginResponse: any;
  logout: FormGroup = new FormGroup( 
    {
      logoutMessage: new FormControl('', [Validators.required, Validators.maxLength(150)]),
    },
  );

  constructor(private storage: Storage, private store: Store)
  {

    this.getLocalStorageData()
    .then(data =>{
          //ok
    })
  }

  getLocalStorageData()
  {
    var self =this;
    return new Promise(resolve => {
    self.storage.get("loginresponse")
    .then( value => 
      { 
        self.loginResponse = value;
        console.log(value);
        resolve(value);
      });
      
    });
  }

  onLogout() {
    //if (this.logout.valid) {
      console.log(this.logout.value);
      this.store.dispatch(new AuthAction.Logout(this.loginResponse, false));
    //}
  }

  ngOnInit(): void {}

}
