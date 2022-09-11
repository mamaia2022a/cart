import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';


@Component({
  selector: 'app-completadr',
  templateUrl: './completadr.page.html',
  styleUrls: ['./completadr.page.scss'],
})
export class CompletAdrPage implements OnInit {
  frmCompletAdr: FormControl;
  crtactiune : any = null;
  loginResponse : any;


  constructor(private storage: Storage) 
  {
    //this.completadr = null;
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
    if (this.frmCompletAdr.valid) {
      console.log(this.frmCompletAdr.value);
    }
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  ngOnInit(){
    this.frmCompletAdr = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
