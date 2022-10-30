import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, SelectControlValueAccessor, Validators } from '@angular/forms';

import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';
import { MemMembruTipRequest_Schimbare } from '../../../../payloads/mem/MemMembruTipRequest_Schimbare';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';
import { MemGrupRequest_Vizualizare } from '../../../../payloads/mem/MemGrupRequest_Vizualizare';
import { ActiuneParametri } from '../../../../payloads/aut/ActiuneParametri';


@Component({
  selector: 'app-vizualizmem',
  templateUrl: './vizualizmem.page.html',
  styleUrls: ['./vizualizmem.page.scss'],
})
export class VizualizMemPage implements OnInit {

  frmVizualizMemerea: FormGroup = new FormGroup(
    {
       mesaj: new FormControl('Trimite Confirmarea Cererii de a deveni Membru',[]),// [Validators.required, Validators.minLength(8), Validators.maxLength(16)]),
    });
  crtgrupact = null;
  crtactiune : any = null;
  loginResponse : any;
  token : string;
  grupmembri$ : Observable<any> = null;
  grupmembri  : any = null;
  infogrup$ : Observable<any> = null;
  memGrupRequestVizualizare : MemGrupRequest_Vizualizare = new MemGrupRequest_Vizualizare();
  infogrup : any = null; //.gruinfogrupp infogrup.membriGrup infogrup.sefGrup infogrup.membru

  crtsubactiune$        : Observable<any> = null;
  crtsubactiune         : any = null;
  crtsubactiuniparams$  : Observable<any> = null;
  crtsubactiuniparams   : any = null;
  membru  : any = null;

  constructor(private store: Store, private navController: NavController, private platform: Platform, private storage: Storage)  
  {
    var self = this;

    //this.confirmsimact = null;
    var self = this;
    this.getLocalStorageData()
            .then(async data =>{
              data = await self.storage.get("token");
              while (data == null) 
                data = await this.storage.get("token");
              //---
              self.token = <string>(data);

              //---------------------------
              var storageResultKey = "grupmembri";
              this.store.dispatch(new AuthAction.MemGrupVizualizare(
                                        self.memGrupRequestVizualizare, self.token, storageResultKey)).subscribe(async () => 
              {
                //console.log('Call Action Mem Grup Vizualizare: ');
                
                var data = await this.storage.get(storageResultKey);
                while (data == null) 
                  data = await this.storage.get(storageResultKey);
                //---
                self.grupmembri = data.membriGrup;
                self.infogrup   = data; 
                self.infogrup$   = data; 
                self.grupmembri$ = of(data.membriGrup);
          
                var data = await this.storage.get("crtgrupact");
                while (data == null) 
                  data = await this.storage.get("crtgrupact");
                //---
                self.crtgrupact = data;

                var data2 = await this.storage.get("crtsubactiuniparams");
                while (data2 == null) 
                  data2 = await this.storage.get("crtsubactiuniparams");
                //---
                self.crtsubactiuniparams = data2;
                self.crtsubactiuniparams$ = of(data2);
                self.membru = data2.params;

                var data3 = await this.storage.get("crtsubactiune");
                while (data3 == null) 
                  data3 = await this.storage.get("crtsubactiune");
                //---
                self.crtsubactiune = data3;
                self.crtsubactiune$ = of(data3);

              },
              error => {
                console.log('Error Calling Action Vizualizare Grup: ' + error);
              }
              );          
              //------------------------
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
    /**
    if (this.frmVizualizMem.valid) {
      console.log(this.frmVizualizMem.value);
    }*/
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  selectieMembruGrup(memMembrugrupId : number) 
  {
    console.log("selectie membru grup id:" + memMembrugrupId);
    //this.selDomZonataraid  = event.detail.value; //this.register.get("domzonatara").value;
    var parentactiuneid : number = this.crtactiune.autActiuneId;
    var grupactactiuniid : number = this.crtgrupact.autGrupactiuniId;
    var actiuneParams = new ActiuneParametri();
    var memMembruGrup = this.getSelectedMembruGrup(memMembrugrupId, this.grupmembri);
    actiuneParams.setData(memMembruGrup);
    //this.store.dispatch(new AuthAction.ActiuneSubactiuni(parentactiuneid, grupactactiuniid, this.crtgrupact, actiuneParams));
  }


  getSelectedMembruGrup(memMembrugrupId : number, arrmembrigrup : any) : any
  {
    var selMembruGrup = null;
    //var crtMembruGrup = null;
    for (let idx in arrmembrigrup)
    {
      var crtMembruGrup = arrmembrigrup[idx];
      if (crtMembruGrup.memMembrugrupId == memMembrugrupId)
      {
        selMembruGrup = crtMembruGrup;
        break;
      }
    }
    return selMembruGrup;
  }


  onVizualizMemerea() {
    if (this.frmVizualizMemerea.valid) 
    {
      console.log(this.frmVizualizMemerea.value);
      var memMembruTipRequestSchimbare : MemMembruTipRequest_Schimbare = new MemMembruTipRequest_Schimbare();
      //---
      memMembruTipRequestSchimbare.crtmemtipcod = "MEMINCNFL";
	    memMembruTipRequestSchimbare.newmemtipcod = "MEMACTNFL";
      //---
	    memMembruTipRequestSchimbare.crtmemrolcod = "MEMINCNFL";
	    memMembruTipRequestSchimbare.newmemrolcod = "MEMACTNFL";
      //---
      this.store.dispatch(new AuthAction.MemMembruTipSchimbare(memMembruTipRequestSchimbare, this.token));

    }
  }

  ngOnInit(){
    //this.frmVizualizMem = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
