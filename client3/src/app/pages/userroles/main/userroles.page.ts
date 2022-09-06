import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';


@Component({
  selector: 'app-userroles',
  templateUrl: './userroles.page.html',
  styleUrls: ['./userroles.page.scss'],
})
export class UserRolesPage implements OnInit {
  forgot: FormControl;
  roles : any = null;
  loginResponse : any;


  constructor(private storage: Storage) 
  {
    this.roles = null;
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
              self.roles = self.loginResponse.autUser.roles;
              console.log(value);
              resolve(value);
            });
            
         });
    }

  done() {
    if (this.forgot.valid) {
      console.log(this.forgot.value);
    }
  }

  selectieRol(userrolid : number) {
      console.log("selectie rol : " + userrolid);
  }

  ngOnInit(){
    this.forgot = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.roles);
  }
}
