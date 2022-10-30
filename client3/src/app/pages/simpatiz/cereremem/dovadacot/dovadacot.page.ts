import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';


@Component({
  selector: 'app-dovadacot',
  templateUrl: './dovadacot.page.html',
  styleUrls: ['./dovadacot.page.scss'],
})
export class DovadaCotPage implements OnInit {
  frmDovadaCot: FormControl;
  crtactiune : any = null;
  loginResponse : any;


  constructor(private storage: Storage) 
  {
    //this.dovadacot = null;
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
    if (this.frmDovadaCot.valid) {
      console.log(this.frmDovadaCot.value);
    }
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  ngOnInit(){
    this.frmDovadaCot = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
