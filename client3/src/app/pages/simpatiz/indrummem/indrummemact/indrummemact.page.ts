import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';


@Component({
  selector: 'app-indrummemact',
  templateUrl: './indrummemact.page.html',
  styleUrls: ['./indrummemact.page.scss'],
})
export class IndrumMemActPage implements OnInit {
  frmIndrumMemAct: FormControl;
  crtactiune : any = null;
  loginResponse : any;


  constructor(private storage: Storage) 
  {
    //this.indrummemact = null;
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
    if (this.frmIndrumMemAct.valid) {
      console.log(this.frmIndrumMemAct.value);
    }
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  ngOnInit(){
    this.frmIndrumMemAct = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
