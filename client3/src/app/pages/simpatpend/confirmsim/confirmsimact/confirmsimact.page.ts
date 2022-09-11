import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';


@Component({
  selector: 'app-confirmsimact',
  templateUrl: './confirmsimact.page.html',
  styleUrls: ['./confirmsimact.page.scss'],
})
export class ConfirmSimActPage implements OnInit {
  frmConfirmSimAct: FormControl;
  crtactiune : any = null;
  loginResponse : any;


  constructor(private storage: Storage) 
  {
    //this.confirmsimact = null;
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
    if (this.frmConfirmSimAct.valid) {
      console.log(this.frmConfirmSimAct.value);
    }
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  ngOnInit(){
    this.frmConfirmSimAct = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
