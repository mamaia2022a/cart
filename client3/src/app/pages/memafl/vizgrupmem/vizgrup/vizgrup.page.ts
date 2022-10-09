import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';
import { MemMembruTipRequest_Schimbare } from '../../../../payloads/mem/MemMembruTipRequest_Schimbare';
import { AuthAction } from '../../../../core/auth-guard/auth-guard.actions';
import { MemGrupRequest_Vizualizare } from '../../../../payloads/mem/MemGrupRequest_Vizualizare';
import { ActiuneParametri } from '../../../../payloads/aut/ActiuneParametri';
import { MemMembruRequest_GrupulMeuVizualizare } from '../../../../payloads/mem/MemMembruRequest_GrupulMeuVizualizare';


@Component({
  selector: 'app-vizgrup',
  templateUrl: './vizgrup.page.html',
  styleUrls: ['./vizgrup.page.scss'],
})
export class VizGrupPage implements OnInit {

  frmVizGruperea: FormGroup = new FormGroup(
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
  memGrupRequestVizualizare : MemMembruRequest_GrupulMeuVizualizare = new MemMembruRequest_GrupulMeuVizualizare();
  infogrup : any = null; //.gruinfogrupp infogrup.membriGrup infogrup.sefGrup infogrup.membru

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
              this.store.dispatch(new AuthAction.MemMembruGrupulMeuVizualizare(
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
    if (this.frmVizGrup.valid) {
      console.log(this.frmVizGrup.value);
    }*/
  }

  selectieFaActiune(actiuneid : number) {
      console.log("selectie fa actiune : " + actiuneid);
  }

  selectieMembruGrup(memMembrugrupId : number) 
  {
    console.log("selectie membru grup id:" + memMembrugrupId);
    return;
    //this.selDomZonataraid  = event.detail.value; //this.register.get("domzonatara").value;
    var parentactiuneid : number = this.crtactiune.autActiuneId;
    var grupactactiuniid : number = this.crtgrupact.autGrupactiuniId;
    var subactiuniParams = new ActiuneParametri();
    var memMembruGrup = this.getSelectedMembruGrup(memMembrugrupId, this.grupmembri);
    subactiuniParams.setData(memMembruGrup);
    subactiuniParams.title = memMembruGrup.userinfo.autUserInfoNume + " " + memMembruGrup.userinfo.autUserInfoPrenume;
    //this.storage.set("crtsubactiuniparams", subactiuniParams);
    //this.storage.set("backaction","/sefgrup/gestgrup/vizgrup");
    var backaction = "/sefgrup/gestgrup/vizgrup";
    this.store.dispatch(new AuthAction.ActiuneSubactiuni(parentactiuneid, grupactactiuniid, this.crtgrupact, 
                        subactiuniParams, backaction));
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


  onVizGruperea() {
    if (this.frmVizGruperea.valid) 
    {
      console.log(this.frmVizGruperea.value);
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
    //this.frmVizGrup = new FormControl('', [Validators.required, Validators.email]);
    console.log(this.crtactiune);
  }
}
