import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';


@Component({
  selector: 'app-trimitecer',
  templateUrl: './trimitecer.page.html',
  styleUrls: ['./trimitecer.page.scss'],
})
export class TrimiteCerPage implements OnInit {
  frmTrimiteCer: FormControl;
  crtactiune : any = null;
  loginResponse : any;


  constructor(private storage: Storage) 
  {
    //this.trimitecer = null;
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
    if (this.frmTrimiteCer.valid) {
      console.log(this.frmTrimiteCer.value);
    }
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  ngOnInit(){
    this.frmTrimiteCer = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
