import { Component, OnInit, ViewChild } from '@angular/core';
import { AbstractControl, FormControl, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { AuthAction } from '../../../core/auth-guard/auth-guard.actions';
import { RegisterRequest } from '../../../payloads/aut/RegisterRequest';
import { IonSelect, NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable, of } from 'rxjs';
import { Storage } from '@ionic/storage';

@Component({
  selector: 'app-register',
  templateUrl: './register.page.html',
  styleUrls: ['./register.page.scss'],
})


export class RegisterPage implements OnInit {
  // refer to the select via the template reference
  //@ViewChild('domZoneTaraSelect', { static: false }) domZoneTaraSelect: IonSelect;
  //@ViewChild('domJudeteSelect', { static: false }) domJudeteSelect: IonSelect;
  //@ViewChild('domLocalitatiSelect', { static: false }) domLocalitatiSelect: IonSelect;

  register: FormGroup = new FormGroup(
    {
       username: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(150)]),
       password: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(150)]),
       passwordConfirm: new FormControl(null, [Validators.required, Validators.minLength(5), Validators.maxLength(150)]),
       nume: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       prenume: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       telefon: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       email: new FormControl('', [Validators.maxLength(150)]),
       datanasterii: new FormControl('', [Validators.maxLength(150)]),
       sex: new FormControl('', [Validators.maxLength(150)]),
       domzonatara: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       domjudet: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       domuat: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       domlocalitate: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       domcodpostal: new FormControl('', [, Validators.maxLength(150)]),
       domadresa: new FormControl('', [, Validators.maxLength(150)]),
       rezdifdom: new FormControl('n', [Validators.required, Validators.maxLength(150)]),
       rezzonatara: new FormControl('', [Validators.maxLength(150)]),
       rezjudet: new FormControl('', [Validators.maxLength(150)]),
       rezuat: new FormControl('', [Validators.maxLength(150)]),
       rezlocalitate: new FormControl('', [Validators.maxLength(150)]),
       rezcodpostal: new FormControl('', [Validators.maxLength(150)]),
       rezadresa: new FormControl('', [Validators.maxLength(150)]),
       refmembrucodunic: new FormControl('', [Validators.maxLength(150)]),
    },
    { validators: [this.passwordConfirmMatchValidator]
    },
  );

  //obsActionRegister: Observable<any>;
  //obsActionJudete: Observable<any>;

  zonetara$ : Observable<any> = null;
  
  //------------- pentru domiciliu
  selDomZonataraid : number ;
  
  domjudete$ : Observable<any> = null;
  domjudete : Array<any> = null;

  selDomJudetid : number ;

  domuateuri$ : Observable<any> = null;
  domuateuri : Array<any> = null;

  selDomUatid : number ;


  domlocalitati$ : Observable<any> = null;
  domlocalitati : Array<any> = null;

  selDomLocalitateid : number ;

  //------------- pentru rezidenta 
  selRezZonataraid : number ;

  rezjudete$ : Observable<any> = null;
  rezjudete : Array<any> = null;

  selRezJudetid : number ;

  rezuateuri$ : Observable<any> = null;
  rezuateuri : Array<any> = null;

  selRezUatid : number ;

  rezlocalitati$ : Observable<any> = null;
  rezlocalitati : Array<any> = null;

  selRezLocalitateid : number ;

  selDomDifRez : string;
  showRezidenta : boolean ;

  

  constructor(private store: Store, private navController: NavController, private platform: Platform, private storage: Storage) 
  {
    this.showRezidenta = false;
    //this.loadZonetara("zonetara");
    var self = this;
    var storageResultKey = "zonetara";
    this.store.dispatch(new AuthAction.GeoZonetara(storageResultKey)).subscribe(async () => {
      //console.log('Call Action GeoZonetara: ');
      
      var data = await this.storage.get(storageResultKey);
      while (data == null) 
        data = await this.storage.get(storageResultKey);
      //---
      self.zonetara$ = of(data);

    },
    error => {
      console.log('Error Calling Action GeoZoneTara: ' + error);
    }
    );
  }  


  loadZonetara(storageResultKey: string) 
  {
    var self = this;
    this.store.dispatch(new AuthAction.GeoZonetara(storageResultKey)).subscribe(async () => {
      //console.log('Call Action GeoZonetara: ');
      
      var data = await this.storage.get(storageResultKey);
      while (data == null) 
        data = await this.storage.get(storageResultKey);
      //---
      self.zonetara$ = of(data);

    },
    error => {
      console.log('Error Calling Action GeoZoneTara: ' + error);
    }
    );
  }


  loadJudete(zonataraid : number, storageResultKey: string) 
  {
    var self = this;
    this.store.dispatch(new AuthAction.GeoJudete(zonataraid, storageResultKey)).subscribe(async () => {
      console.log('Call Action GeoJudete: ');
      var data = await this.storage.get(storageResultKey);
      while (data == null) 
      {
        data = await this.storage.get(storageResultKey);
      }
      //---
      if (storageResultKey == "domjudete")
        self.domjudete$ = of(data);      
      else if (storageResultKey == "rezjudete")
        self.rezjudete$ = of(data);      

    },
    error => {
      console.log('Error Calling Action GeoJudete: ' + error);
    }
    );
  }


  loadUateuri(zonataraid : number, judetid : number, storageResultKey: string) 
  {
    var self = this;
    this.store.dispatch(new AuthAction.GeoUateuri(zonataraid, judetid, storageResultKey)).subscribe(async () => {
      console.log('Call Action GeoUateuri: ');
      var data = await this.storage.get(storageResultKey);
      while (data == null) 
      {
        data = await this.storage.get(storageResultKey);
      }
      //---
      if (storageResultKey == "domuateuri")
        self.domuateuri$ = of(data);      
      else if (storageResultKey == "rezuateuri")
        self.rezuateuri$ = of(data);      

    },
    error => {
      console.log('Error Calling Action GeoUateuri: ' + error);
    }
    );
  }  

  loadLocalitati(zonataraid : number, judetid : number, uatid: number, storageResultKey: string) 
  {
    var self = this;
    this.store.dispatch(new AuthAction.GeoLocalitati(zonataraid, judetid, uatid, storageResultKey)).subscribe(async () => {
      console.log('Call Action GeoLocalitati: ');
      var data = await this.storage.get(storageResultKey);
      while (data == null) 
      {
        data = await this.storage.get(storageResultKey);
      }
      //---
      if (storageResultKey == "domlocalitati")
        self.domlocalitati$ = of(data);      
      else if (storageResultKey == "rezlocalitati")
        self.rezlocalitati$ = of(data);      

    },
    error => {
      console.log('Error Calling Action GeoLocalitati: ' + error);
    }
    );
  }  


  selectieDomZonatara(event : any) 
  {
    console.log("selectie dom zona tara id:" + event.detail.value);
    this.selDomZonataraid  = event.detail.value; //this.register.get("domzonatara").value;
    console.log(this.selDomJudetid);
    this.domjudete$ = null;
    this.domuateuri$ = null;
    this.domlocalitati$ = null;
    this.selDomJudetid = null;
    this.selDomUatid = null;
    this.selDomLocalitateid = null;
    this.storage.remove("domjudete");
    this.register.get("domjudet").reset();
    this.storage.remove("domuateuri");
    this.register.get("domuat").reset();
    this.storage.remove("domlocalitati");
    this.register.get("domlocalitate").reset();
    this.loadJudete(this.selDomZonataraid, "domjudete");
  }


  selectieDomJudet(event : any) 
  {
    console.log("selectie dom judet id:" + event.detail.value);
    this.selDomJudetid  = event.detail.value; //this.register.get("domjudet").value;
    console.log(this.selDomJudetid);
    this.domuateuri$ = null;
    this.domlocalitati$ = null;
    this.selDomUatid = null;
    this.selDomLocalitateid = null;
    this.storage.remove("domuateuri");
    this.register.get("domuat").reset();
    this.storage.remove("domlocalitati");
    this.register.get("domlocalitate").reset();
    if (this.selDomJudetid == 0)
      return;
    this.loadUateuri(this.selDomZonataraid, this.selDomJudetid, "domuateuri");
  }


  selectieDomUat(event : any) 
  {
    console.log("selectie dom uat id:" + event.detail.value);
    this.selDomUatid  = event.detail.value; //this.register.get("domjudet").value;
    console.log(this.selDomUatid);
    this.domlocalitati$ = null;
    this.selDomLocalitateid = null;
    this.storage.remove("domlocalitati");
    this.register.get("domlocalitate").reset();
    if (this.selDomJudetid == 0)
      return;
    if (this.selDomUatid == 0)
      return;      
    this.loadLocalitati(this.selDomZonataraid, this.selDomJudetid, this.selDomUatid, "domlocalitati");

  }


  selectieDomLocalitate(event : any) 
  {
    console.log("selectie dom localitate id:" + event.detail.value);
    this.selDomLocalitateid  = event.detail.value; //this.register.get("domjudet").value;
    console.log(this.selDomLocalitateid);
  }


  selectieDomDifRez(event : any) 
  {
    console.log("selectie dom dif rez:" + event.detail.value);
    this.selDomDifRez  = event.detail.value; //this.register.get("domjudet").value;
    console.log(this.selDomDifRez);
    if (this.selDomDifRez == "n")
      this.showRezidenta = false;
    else
      this.showRezidenta  = true;
  }


  selectieRezZonatara(event : any) 
  {
    console.log("selectie rez zona tara id:" + event.detail.value);
    this.selRezZonataraid  = event.detail.value; //this.register.get("domzonatara").value;
    console.log(this.selRezJudetid);
    this.rezjudete$ = null;
    this.rezuateuri$ = null;
    this.rezlocalitati$ = null;
    this.selRezJudetid = null;
    this.selRezUatid = null;
    this.selRezLocalitateid = null;
    this.storage.remove("rezjudete");
    this.register.get("rezjudet").reset();
    this.storage.remove("rezuateuri");
    this.register.get("rezuat").reset();
    this.storage.remove("rezlocalitati");
    this.register.get("rezlocalitate").reset();
    this.loadJudete(this.selRezZonataraid, "rezjudete");
  }


  selectieRezJudet(event : any) 
  {
    console.log("selectie rez judet id:" + event.detail.value);
    this.selRezJudetid  = event.detail.value; //this.register.get("domjudet").value;
    console.log(this.selRezJudetid);
    this.rezuateuri$ = null;
    this.rezlocalitati$ = null;
    this.selRezUatid = null;
    this.selRezLocalitateid = null;
    this.storage.remove("rezuateuri");
    this.register.get("rezuat").reset();
    this.storage.remove("rezlocalitati");
    this.register.get("rezlocalitate").reset();
    if (this.selRezJudetid == 0)
      return;
    this.loadUateuri(this.selRezZonataraid, this.selRezJudetid, "rezuateuri");
  }


  selectieRezUat(event : any) 
  {
    console.log("selectie rez uat id:" + event.detail.value);
    this.selRezUatid  = event.detail.value; //this.register.get("domjudet").value;
    console.log(this.selRezUatid);
    this.rezlocalitati$ = null;
    this.selRezLocalitateid = null;
    this.storage.remove("rezlocalitati");
    this.register.get("rezlocalitate").reset();
    if (this.selRezJudetid == 0)
      return;
    if (this.selRezUatid == 0)
      return;      
    this.loadLocalitati(this.selRezZonataraid, this.selRezJudetid, this.selRezUatid, "rezlocalitati");

  }


  selectieRezLocalitate(event : any) 
  {
    console.log("selectie rez localitate id:" + event.detail.value);
    this.selRezLocalitateid  = event.detail.value; //this.register.get("domjudet").value;
    console.log(this.selRezLocalitateid);
  }


  onRegister() {
    if (this.register.valid) {
      console.log(this.register.value);
      var registerRequest : RegisterRequest = new RegisterRequest();
      registerRequest.username         = this.register.value["username"];
      registerRequest.password         = this.register.value["password"];
      registerRequest.nume             = this.register.value["nume"];
      registerRequest.prenume          = this.register.value["prenume"];
      registerRequest.telefon          = this.register.value["telefon"];
      registerRequest.email            = this.register.value["email"];
      registerRequest.sex              = this.register.value["sex"];
      var strdatanasterii              = this.register.value["datanasterii"];
      registerRequest.datanasterii     = parseInt(strdatanasterii.toString().substring(0,4))*10000 + 
                                         parseInt(strdatanasterii.toString().substring(5,7))*100 +
                                         parseInt(strdatanasterii.toString().substring(9,10)) ;
      registerRequest.domZonataraid    = this.register.value["domzonatara"];
      registerRequest.domJudetid       = this.register.value["domjudet"];
      registerRequest.domUatid         = this.register.value["domuat"];
      registerRequest.domLocalitateid  = this.register.value["domlocalitate"];
      registerRequest.domCodpostal     = this.register.value["domcodpostal"];
      registerRequest.domAdresa        = this.register.value["domadresa"];
      registerRequest.rezdifdedom      = this.register.value["rezdifdom"];
      if (registerRequest.rezdifdedom == "y")
      {
        registerRequest.rezZonataraid    = this.register.value["rezzonatara"];
        registerRequest.rezJudetid       = this.register.value["rezjudet"];
        registerRequest.rezUatid         = this.register.value["rezuat"];
        registerRequest.rezLocalitateid  = this.register.value["rezlocalitate"];
        registerRequest.rezCodpostal     = this.register.value["rezcodpostal"];
        registerRequest.rezAdresa        = this.register.value["rezadresa"];
      }else{
        registerRequest.rezZonataraid    = null;
        registerRequest.rezJudetid       = null;
        registerRequest.rezUatid         = null;
        registerRequest.rezLocalitateid  = null;
        registerRequest.rezCodpostal     = null;
        registerRequest.rezAdresa        = null;
      }
      registerRequest.refmembrucodunic   = this.register.value["rezmembrucodunic"];
      if (registerRequest.refmembrucodunic === null)
        registerRequest.refmembrucodunic = null;
      this.store.dispatch(new AuthAction.Register(registerRequest));
      //this.obsActionRegister = this.store.dispatch(new AuthAction.Register(registerRequest));
      /** 
      this.obsActionRegister.subscribe(
        info => {
          console.log('REGISTER: ' + info);
        },
        error => {
          console.log('REGISTER ERROR: ' + error);
        }
      );*/

    }
  }

  ngOnInit(): void {}

  passwordConfirmMatchValidator(g: AbstractControl): ValidationErrors | null {
    const password = g.get('password');
    const passwordConfirm = g.get('passwordConfirm');

    if (passwordConfirm.hasError('required') || passwordConfirm.hasError('minlength')) {
      return;
    }

    if (password.value !== passwordConfirm.value) {
      passwordConfirm.setErrors({
        mismatch: true,
      });
    } else {
      passwordConfirm.setErrors(null);
    }
  }
 
  rezjudetMatchValidator(g: AbstractControl): ValidationErrors | null {
    const rezdifdom = g.get('rezdifdom');
    const rezjudet = g.get('rezjudet');
    console.log("rzdiform" + rezdifdom.value);
    if (rezdifdom.value == 0){
      rezjudet.setErrors(null);
      return ({validRezjudet: true});  
    }
    
    return ({validRezjudet: false});  
  }

      /*
    this.judete.subscribe(judetee => 
    {
      var judet = judetee[selIdx];
      console.log(judet);
    });*/

    /** 
    var zonataraid : number = 1;
    var self = this;
    this.store.dispatch(new AuthAction.GeoJudete(zonataraid,"domjudete")).subscribe(async () => {
      console.log('GEO JUDETE: ');
      var data = await this.storage.get('judete');
      if (data == null) 
      {
        data = await this.storage.get('judete');
      }
      //---
      self.judete = of(data);
       
      //self.getLocalStorageData()
      //.then(data =>{
      //  self.judete = of(data);
      //})
      
    },
    error => {
      console.log('GEO JUDETE ERROR: ' + error);
    }
    );
  }*/
   
    /**   
    this.store.dispatch(new AuthAction.GeoJudete(zonataraid)).subscribe(
        info => {
          console.log('GEO JUDETE: ' + info);
          this.getLocalStorageData()
          .then(data =>{
                //ok
          })
        },
        error => {
          console.log('GEO JUDETE ERROR: ' + error);
        }
      );
      */

  /** 
  getLocalStorageData(){
    var self =this;
    return new Promise(resolve => {
      self.storage.get("judete")
        .then( value => 
            { 
              //if (value == null)
                //return this.store.dispatch(new AuthAction.GeoJudete(1));
              //self.judete = of(value);
              //console.log(value);
              resolve(value);
            });
            
         });
    }*/


  /**
  authUrl = "https://sampleapi.herokuapp.com"
  authHeaders;

  getToken() {
  this.storage.get('token').then((token) => {
    console.log('Bearer ' + token);
    this.authHeaders = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer ' + token
      })
  }
  });
  }

  getInfo(): Observable<Info> {
  return this.http.get<Info>(this.authUrl + '/api/users/info', this.authHeaders).pipe(
    catchError(this.handleError)
  );
  }

  ionViewDidLoad() {
    this._dashboardService.getToken();
    this._dashboardService.getInfo().subscribe(
      info => {
        console.log('USER INFO: ' + info);
        this.info = info
      },
      error => {
        console.log('INFO ERROR: ' + error);
      }
    );
    }


    public GetLocations(apiUrl, siteKey, pLocationKey){

    return new Promise((resolve, reject) => {
        this.http.get(apiUrl + "site/" + siteKey + "/location/" + pLocationKey)
          .map(res => res.json())
          .subscribe(data => {
              resolve(data);     //Corrected
          },
          err =>{
            reject(err);
          });
    });
}
    */
}
