import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';
import { Store } from '@ngxs/store';
import { AuthAction } from '../../../core/auth-guard/auth-guard.actions';


@Component({
  selector: 'app-grupactactiuni',
  templateUrl: './grupactactiuni.page.html',
  styleUrls: ['./grupactactiuni.page.scss'],
})
export class GrupActActiuniPage implements OnInit {
  frmGrupActActiuni: FormControl;
  crtgrupact : any = null;
  loginResponse : any;


  constructor(private storage: Storage, private store: Store)  
  {
    //this.grupactactiuni = null;
    this.getLocalStorageData()
            .then(data =>{
                  //ok
            })
  }

  getLocalStorageData(){
    var self =this;
    return new Promise(resolve => {
      self.storage.get("crtgrupact")
        .then( value => 
            { 
              self.crtgrupact= value;
              console.log(value);
              resolve(value);
            });
            
         });
    }

  done() {
    if (this.frmGrupActActiuni.valid) {
      console.log(this.frmGrupActActiuni.value);
    }
  }

  selectieGrupactactiune(grupactactiuneid : number) {
      console.log("selectie grupactactiuneid : " + grupactactiuneid);
      this.store.dispatch(new AuthAction.Actiune(grupactactiuneid, this.crtgrupact));
  }

  ngOnInit(){
    this.frmGrupActActiuni = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtgrupact);
  }
}
