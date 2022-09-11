import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Storage } from '@ionic/storage';


@Component({
  selector: 'app-listactt',
  templateUrl: './listactt.page.html',
  styleUrls: ['./listactt.page.scss'],
})
export class ListActTPage implements OnInit {
  frmListActT: FormControl;
  crtactiune : any = null;
  loginResponse : any;


  constructor(private storage: Storage) 
  {
    //this.listactt = null;
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
    if (this.frmListActT.valid) {
      console.log(this.frmListActT.value);
    }
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  ngOnInit(){
    this.frmListActT = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
