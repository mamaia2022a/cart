import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';
import { Store } from '@ngxs/store';
import { AuthAction } from '../../../core/auth-guard/auth-guard.actions';


@Component({
  selector: 'app-rolgrupactiuni',
  templateUrl: './rolgrupactiuni.page.html',
  styleUrls: ['./rolgrupactiuni.page.scss'],
})
export class RolGrupActiuniPage implements OnInit {
  frmRolGrupActiuni: FormControl;
  crtrol : any = null;
  loginResponse : any;


  constructor(private storage: Storage, private store: Store) 
  {
    //this.rolgrupactiuni = null;
    this.getLocalStorageData()
            .then(data =>{
                  //ok
            })
  }

  getLocalStorageData(){
    var self =this;
    return new Promise(resolve => {
      self.storage.get("crtrol")
        .then( value => 
            { 
              self.crtrol = value;
              console.log(value);
              resolve(value);
            });
            
         });
    }

  done() {
    if (this.frmRolGrupActiuni.valid) {
      console.log(this.frmRolGrupActiuni.value);
    }
  }

  selectieGrupActiune(rolgrupactid : number) {
      console.log("selectie rolgrupactid : " + rolgrupactid);
      this.store.dispatch(new AuthAction.Grupactactiuni(rolgrupactid, this.crtrol));
  }

  ngOnInit(){
    this.frmRolGrupActiuni = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtrol);
  }
}
