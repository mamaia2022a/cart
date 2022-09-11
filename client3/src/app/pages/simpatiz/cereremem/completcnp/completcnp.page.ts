import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';


@Component({
  selector: 'app-completcnp',
  templateUrl: './completcnp.page.html',
  styleUrls: ['./completcnp.page.scss'],
})
export class CompletCNPPage implements OnInit {
  frmCompletCNP: FormControl;
  crtactiune : any = null;
  loginResponse : any;


  constructor(private storage: Storage) 
  {
    //this.completcnp = null;
    this.getLocalStorageData()
            .then(data =>{
                  //ok
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
    if (this.frmCompletCNP.valid) {
      console.log(this.frmCompletCNP.value);
    }
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  ngOnInit(){
    this.frmCompletCNP = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
