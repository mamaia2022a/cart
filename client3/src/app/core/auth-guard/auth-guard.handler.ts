import { Injectable } from '@angular/core';
import { NavController } from '@ionic/angular';
import { Store, Actions, ofActionDispatched, StateContext } from '@ngxs/store';
import { appConfig } from '../../app.config';
import { AuthStateModel } from './auth-guard.models';
import { AuthAction } from './auth-guard.actions';
import { HttpClient } from '@angular/common/http';
import { LoginAnswer } from '../../../app/payloads/aut/LoginAnswer';
//import { catchError, map, of } from 'rxjs';
import { async, of } from 'rxjs';
import { LoginRequest } from '../../../app/payloads/aut/LoginRequest';
import { ToastService } from '../../../app/services/toast/toast.service';
import { ApiService } from '../../../app/services/api/api.service';


import { Storage } from '@ionic/storage';
import { ValueAccessor } from '@ionic/angular/directives/control-value-accessors/value-accessor';
import { promise } from 'protractor';
import { ValidateRegistrationAnswer } from '../../payloads/aut/ValidateRegistrationAnswer';
import { MemMembruTipResponse_Schimbare } from '../../payloads/mem/MemMembruTipResponse_Schimbare';

@Injectable({ providedIn: 'root' })
export class AuthHandler {

  private ApiBaseURL: string = "http://localhost:8089";//"https://appaur.ro:8444" ; //"http://localhost:8089";//"https://appaur.ro:8444" ; //"http://185.3.95.113:8080";//"http://localhost:8089"; //;"http://185.3.95.113:8080"; //"http://www.fluierul.ro:8080";

  //---------------------------------- out
  private ApiURLAutLogin: string                              = this.ApiBaseURL + "/api/aut/user/login";
  private ApiURLAutRegister: string                           = this.ApiBaseURL + "/api/aut/user/register";
  private ApiURLAutValidateRegistration: string               = this.ApiBaseURL + "/api/aut/user/validate_registration"
  //---------------------------------- mem
  private ApiURLMemMembruTipSchimbare: string                 = this.ApiBaseURL + "/api/mem/membru/tip/schimbare";
  //---------------------------------- mem afiliat
  private ApiURLMemMembruGrupulMeuVizualizare                 =  this.ApiBaseURL + "/api/mem/membru/grupulmeu_vizualizare";
  //---------------------------------- grup
  private ApiURLMemGrupCreare: string                         = this.ApiBaseURL + "/api/mem/grup/creare";
  private ApiURLMemGrupVizualizare: string                    = this.ApiBaseURL + "/api/mem/grup/vizualizare";
  private ApiURLMemGrupMembriInAsteptare: string              = this.ApiBaseURL + "/api/mem/grup/membriinasteptare";
  //---------------- grup memmbru afiliere/dezafiliere
  private ApiURLMemMembruCerereAfiliere: string               = this.ApiBaseURL + "/api/mem/grup/membru/cerere_afiliere";
  private ApiURLMemSefGrupAcceptareAfiliere : string          = this.ApiBaseURL + "/api/mem/grup/sefgrup/acceptare_afiliere";

  private ApiURLMemMembruCerereDezafiliere: string            = this.ApiBaseURL + "/api/mem/grup/membru/cerere_dezafiliere";
  //---------------------------------- pay
  private ApiURLPayTransactionCreareDate : string             = this.ApiBaseURL + "/api/pay/transaction/crearedate";
  //---------------------------------- geo
  //zonetara/toate
  private ApiURLGeoZonetara: string                           = this.ApiBaseURL + "/api/geo/zonetara";
  //judete/zonataraid/{zonataraid}
  private ApiURLGeoJudete: string                             = this.ApiBaseURL + "/api/geo/judete";
  ///zonataraiuatd/{zonataraid}/judetid/{judetid}
  private ApiURLGeoUat: string                                = this.ApiBaseURL + "/api/geo/uat";
  private Toate                                               = "/toate";
  private ByZonataraid                                        = "/zonataraid/";
  private ByJudetid                                           = "/judetid/";
  //localitati/zonataraid/{zonataraid}/judetid/{judetid}
  private ApiURLGeoLocalitati: string                         = this.ApiBaseURL + "/api/geo/localitati";
  private ByUatid                                             = "/uatid/";
  
    /**
    constructor(private actions$: Actions, private navController: NavController, 
                                         private http: HttpClient, private toastService: ToastService) 
    {
      this.actions$.pipe(
          ofActionDispatched(AuthAction.Login),
          map((action: AuthAction.Login) => {
            var loginRequest : LoginRequest = {
              "username": "alexm2",
              "password": "turda"
            };
            var id = action.userId;
            return this.http.post(this.ApiURL, loginRequest).subscribe(data  => {
              let response : any = data
              console.log(data)
              console.log(response.accessToken)
              //this.storage.set('access_token', response.accessToken);
              //var decodedUser = this.jwtHelper.decodeToken(response.accessToken);
              //console.log(decodedUser);
              console.log(response);
              //auth.isAuth = true;
              this.navController.navigateRoot(appConfig.routes.userroles.main);//appConfig.routes.auth.register) ;//appConfig.routes.tabs.root);
              return;
              //return of(true);
            },
            (error) => {
              console.log("Error" + error);
              toastService.default("Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i [" + error.message + "]");
              return this.navController.navigateRoot(appConfig.routes.auth.login);
            })
          })
      )
    }                                    
    */

  //(auth: AuthStateModel)
  constructor(private actions$: Actions, private navController: NavController, 
              private http: HttpClient, private toastService: ToastService, 
              private apiService: ApiService, private store: Store, private storage: Storage) {
    //var token = storage.get("token");
    //storage.create().then((value) => 
    //{
      //console.log(value);
      // expected output: "Success!"
    
    //var token = storage.get("token");
    //storage.set("token", "TEST");

    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.PlataCotizatie)).subscribe(async data2 => 
      {
        let payPlataCotizatieAction : AuthAction.PlataCotizatie = data2;
        console.log("payPlataCotizatieAction");
        var payDataRequestCreare = payPlataCotizatieAction.payDataRequestCreare;
        var storageResultKey = payPlataCotizatieAction.storageResultKey;
        console.log();payDataRequestCreare
        return this.apiService.post(this.ApiURLPayTransactionCreareDate,
                                    payPlataCotizatieAction.payDataRequestCreare, 
                                    {"Authorization" : `Bearer ${payPlataCotizatieAction.token}`}).subscribe(data  => {  
          let response : any = data;
          console.log(response);
          storage.set(storageResultKey, response);
          this.navController.navigateRoot(appConfig.routes.simpatiz.cereremem.plataonline);
          return;
          //return of(response);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare Pay Transaction Creare Date : " + error.error.message);// + error.error.trace);//"Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i.");
          //return this.navController.navigateRoot(appConfig.routes.auth.login);
        })
      });

      
    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.MemMembruGrupulMeuVizualizare)).subscribe(async data2 => 
      {
        let memGrupulMeuVizualizareAction : AuthAction.MemMembruGrupulMeuVizualizare = data2;
        console.log("memGrupVizualizare");
        var memMembruRequestVizualizare = memGrupulMeuVizualizareAction.memGrupRequestVizualizare;
        var storageResultKey = memGrupulMeuVizualizareAction.storageResultKey;
        console.log(memMembruRequestVizualizare);
        return this.apiService.post(this.ApiURLMemMembruGrupulMeuVizualizare,
                                    memGrupulMeuVizualizareAction.memGrupRequestVizualizare, 
                                    {"Authorization" : `Bearer ${memGrupulMeuVizualizareAction.token}`}).subscribe(data  => {  
          let response : any = data;
          console.log(response);
          storage.set(storageResultKey, response);
          return of(response);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare Vizualizare Grup din care fac parte : " + error.error.message);// + error.error.trace);//"Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i.");
          //return this.navController.navigateRoot(appConfig.routes.auth.login);
        })
      });


    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.MemSefGrupAcceptareAfiliere)).subscribe(data2 => 
      {
        let actionMemSefGrupAcceptareAfiliere: AuthAction.MemSefGrupAcceptareAfiliere = data2;
        console.log("Acceptare Afiliere");
        var memMemSefGrupAcceptareAfiliere = actionMemSefGrupAcceptareAfiliere.memSefGrupRequestAcceptareAfiliere;
        console.log(actionMemSefGrupAcceptareAfiliere);
        return this.apiService.post(this.ApiURLMemSefGrupAcceptareAfiliere,
                                    actionMemSefGrupAcceptareAfiliere.memSefGrupRequestAcceptareAfiliere,
                                    {"Authorization" : `Bearer ${actionMemSefGrupAcceptareAfiliere.token}`}).subscribe(data  => {  
          let response  = data;
          //console.log(data);
          this.storage.remove("grupmembri");
          this.storage.remove("grupmembriinasteptare");
          console.log(response);

          toastService.default("A??i trimis cu succes Acceptul sau Refuzul Dvs. la Cererea de Afiliere la Grup.") ;
          this.navController.navigateRoot(appConfig.routes.aut.grupactactiuni);
          return;
          //return of(true);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare Cerere de Afiliere : " + error.error.message);// + error.error.trace);//"Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i.");
          //return this.navController.navigateRoot(appConfig.routes.auth.login);
        })
  
      });


    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.MemGrupMembriInAsteptare)).subscribe(async data2 => 
      {
        let memGrupMembriInAsteptareAction : AuthAction.MemGrupMembriInAsteptare = data2;
        console.log("memGrupMembriInAsteptare");
        var memMembruRequestMembriInAsteptare = memGrupMembriInAsteptareAction.memGrupRequestMembriInAsteptare;
        var storageResultKey = memGrupMembriInAsteptareAction.storageResultKey;
        console.log(memMembruRequestMembriInAsteptare);
        return this.apiService.post(this.ApiURLMemGrupMembriInAsteptare,
                                    memGrupMembriInAsteptareAction.memGrupRequestMembriInAsteptare, 
                                    {"Authorization" : `Bearer ${memGrupMembriInAsteptareAction.token}`}).subscribe(data  => {  
          let response : any = data;
          console.log(response);
          storage.set(storageResultKey, response);
          return of(response);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare Grup Vizualizare Membri In Asteptare: " + error.error.message);// + error.error.trace);//"Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i.");
          //return this.navController.navigateRoot(appConfig.routes.auth.login);
        })
      });


    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.Subactiune)).subscribe(data2 => 
    {
      console.log("Handler Subactiune 5");
      var crtActiune : AuthAction.Subactiune = data2;
      var grupact : any = crtActiune.crtGrupAct;
      var grupactactiuneid = crtActiune.subactiuneid ;
      var crtGrupActActiune = null;
      var selSubactiune = null;
      console.log(grupact);
      console.log(grupactactiuneid);
      for (let idx in grupact.grupactactiunisec)
      {
        //console.log(grupact.grupactactiuni);
        crtGrupActActiune = grupact.grupactactiunisec[idx];
        //console.log(crtGrupActActiune);
        //console.log(crtGrupActActiune.autGrupactactiuneId);
        if (crtGrupActActiune.actiune.autActiuneId == crtActiune.subactiuneid)
        {
          selSubactiune = crtGrupActActiune.actiune;
          break;
        }
      }
      if (selSubactiune == null)
      {
        console.log("Cannot find Subactiune");
        return;
      }
      console.log("Subactiune selected");
      console.log(selSubactiune);
      storage.set("crtsubactiune", selSubactiune);
      //-----------------------
      //  Gestiune Grup - Vizualizare membru
      //-----------------------
      if (selSubactiune.autActiuneCod == "GESTGRUPVIZUALIZMEM")
      {
        this.navController.navigateRoot(appConfig.routes.sefgrup.gestgrup.vizualizmem);
        return ;
      }
      //-----------------------
      //  Gestiune Grup - Excludere membru
      //-----------------------
      if (selSubactiune.autActiuneCod == "GESTGRUPEXCLUDEREMEM")
      {
        this.navController.navigateRoot(appConfig.routes.sefgrup.gestgrup.excluderemem);
        return ;
      }
      //-----------------------
      //  Gestiune Grup - Vizualizare membru in asteptare
      //-----------------------
      if (selSubactiune.autActiuneCod == "GESTGRUPVIZPENDMEM")
      {
        this.navController.navigateRoot(appConfig.routes.sefgrup.gestgrup.vizpendmem);
        return ;
      }
      //-----------------------
      //  Gestiune Grup - Acceptare sau Refuzare membru Nou
      //-----------------------
      if (selSubactiune.autActiuneCod == "GESTGRUPACCPENDMEM")
      {
        this.navController.navigateRoot(appConfig.routes.sefgrup.gestgrup.accpendmem);
        return ;
      }

      
    });

    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.MemMembruCerereAfiliere)).subscribe(data2 => 
      {
        let actionMemMembruCerereAfiliere: AuthAction.MemMembruCerereAfiliere = data2;
        console.log("Cerere Afiliere");
        var memMembruRequestCerereAfiliere = actionMemMembruCerereAfiliere.memMembruRequestCerereAfiliere;
        console.log( actionMemMembruCerereAfiliere);
        return this.apiService.post(this.ApiURLMemMembruCerereAfiliere,
                                    actionMemMembruCerereAfiliere.memMembruRequestCerereAfiliere,
                                    {"Authorization" : `Bearer ${actionMemMembruCerereAfiliere.token}`}).subscribe(data  => {  
          let response : ValidateRegistrationAnswer = data;
          //console.log(data);
          console.log(response);
          toastService.default("A??i trimis cu succes cererea de Afiliere la Grup. Ve??i fi notificat c??nd se va aproba.") ;
          //this.navController.navigateRoot(appConfig.routes.auth.login);
          return;
          //return of(true);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare Cerere de Afiliere : " + error.error.message);// + error.error.trace);//"Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i.");
          //return this.navController.navigateRoot(appConfig.routes.auth.login);
        })
  
      });

    //__________________________________________________________________________
    //  Actiune - Subactiuni
    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.ActiuneSubactiuni)).subscribe(data2 => 
    {
      console.log("Handler Actiune Subactiune 6");
      var crtActiune : AuthAction.ActiuneSubactiuni = data2;
      var grupact : any = crtActiune.crtGrupAct;
      var grupactactiuneid = crtActiune.grupactactiuneid ;
      var parentactiuneid = crtActiune.parentactiuneid;
      var subactiuniParams = crtActiune.subactiuniParams;
      var backaction = crtActiune.backaction;
      var crtGrupActActiune = null;
      var selActiune = null;
      console.log(grupact);
      console.log(grupactactiuneid);
      console.log(parentactiuneid);
      var selSubactiuni = [];
      for (let idx in grupact.grupactactiunisec)
      {
        crtGrupActActiune = grupact.grupactactiunisec[idx];
        if (crtGrupActActiune.autGrupactactiuneGrupactid == crtActiune.grupactactiuneid)
        {
          if (crtGrupActActiune.autGrupactactiuneParentactid == crtActiune.parentactiuneid)
          {
            selSubactiuni.push(crtGrupActActiune.actiune);
          }
        }
      }
      if (selSubactiuni.length == 0)
      {
        console.log("Cannot find selSubactiuni");
        return;
      }
      //console.log("Actiune selected");
      console.log(selSubactiuni);
      storage.set("crtsubactiuni", selSubactiuni);
      storage.set("crtsubactiuniparams", subactiuniParams);
      storage.set("backaction",backaction);  
      this.navController.navigateRoot(appConfig.routes.aut.actiunesubactiuni);
      return;
    });

    
    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.Actiune)).subscribe(data2 => 
    {
      console.log("Handler Actiune 5");
      var crtActiune : AuthAction.Actiune = data2;
      var grupact : any = crtActiune.crtGrupAct;
      var grupactactiuneid = crtActiune.grupactactiuneid ;
      var crtGrupActActiune = null;
      var selActiune = null;
      console.log(grupact);
      console.log(grupactactiuneid);
      for (let idx in grupact.grupactactiuni)
      {
        console.log(grupact.grupactactiuni);
        crtGrupActActiune = grupact.grupactactiuni[idx];
        console.log(crtGrupActActiune);
        console.log(crtGrupActActiune.autGrupactactiuneId);
        if (crtGrupActActiune.autGrupactactiuneId == crtActiune.grupactactiuneid)
        {
          selActiune = crtGrupActActiune.actiune;
          break;
        }
      }
      if (selActiune == null)
      {
        console.log("Cannot find Actiune");
        return;
      }
      console.log("Actiune selected");
      console.log(selActiune);
      storage.set("crtactiune", selActiune);
      //-----------------------
      //  Cerere Dezafiliere Grup
      //-----------------------
      if (selActiune.autActiuneCod == "DAFLGRPMEMMEMINCACTEXPAFL")
      {
        //this.navController.navigateRoot(appConfig.routes.commongrupact.afilmemgrp.memincactexpnfl);
        return ;
      }
      //-----------------------
      //  Cerere Afiliere Grup
      //-----------------------
      if (selActiune.autActiuneCod == "AFILGRPMEMMEMINCACTEXPNFL")
      {
        this.navController.navigateRoot(appConfig.routes.commongrupact.afilmemgrp.memincactexpnfl);
        return ;
      }
      //-----------------------
      //  Vizualizare Grup
      //-----------------------
      if (selActiune.autActiuneCod == "GESTGRUPVIZUALIZGRUP")
      {
        this.navController.navigateRoot(appConfig.routes.sefgrup.gestgrup.vizualizgrup);
        return ;
      }
      //-----------------------
      //  Un Membru Vizualizare Grupul din care face parte
      //-----------------------
      if (selActiune.autActiuneCod == "VIZGRUPMEMVIZGRUP")
      {
        this.navController.navigateRoot(appConfig.routes.memafl.vizgrupmem.vizgrup);
        return ;
      }
      

      //-----------------------
      //  Sef Grup - Pending Membri
      //-----------------------
      if (selActiune.autActiuneCod == "GESTGRUPPENDINGMEM")
      {
        this.navController.navigateRoot(appConfig.routes.sefgrup.gestgrup.pendingmem);
        return ;
      }
      //-----------------------
      //  Creare Grup
      //-----------------------
      if (selActiune.autActiuneCod == "CREAREGRUPMEMACTEXPNFL")
      {
        this.navController.navigateRoot(appConfig.routes.commongrupact.crearegrup.memactexpnfl);
        return ;
      }
      //-----------------------
      // 
      //-----------------------
      if (selActiune.autActiuneCod == "CONFIRMSIMACT")
      {
        this.navController.navigateRoot(appConfig.routes.simpatpend.confirmsim.confirmsimact);
        return ;
      }
      //-----------------------
      //-----------------------
      if (selActiune.autActiuneCod == "INDRUMMEMACT")
      {
        this.navController.navigateRoot(appConfig.routes.simpatiz.indrummem.imdrummemact);
        return ;
      }
      if (selActiune.autActiuneCod == "CEREREMEMCOMPLETADR")
      {
        this.navController.navigateRoot(appConfig.routes.simpatiz.cereremem.completadr);
        return ;
      }
      if (selActiune.autActiuneCod == "CEREREMEMCOMPLETCNP")
      {
        this.navController.navigateRoot(appConfig.routes.simpatiz.cereremem.completcnp);
        return ;
      }
      if (selActiune.autActiuneCod == "CEREREMEMDOVADACOT")
      {
        this.navController.navigateRoot(appConfig.routes.simpatiz.cereremem.dovadacot);
        return ;
      }
      if (selActiune.autActiuneCod == "CEREREMEMTRIMITECER")
      {
        this.navController.navigateRoot(appConfig.routes.simpatiz.cereremem.trimitecer);
        return ;
      }
      //-----------------------
      // MEM INC NFL
      //-----------------------
      if (selActiune.autActiuneCod == "CEREREMEMACTNTRICER")
      {
        this.navController.navigateRoot(appConfig.routes.memincnfl.cereremem.actntricer);
        return ;
      }

      //-----------------------
      // MEM INC AFL
      //-----------------------
      if (selActiune.autActiuneCod == "CEREREMEMACTATRICER")
      {
        this.navController.navigateRoot(appConfig.routes.memincafl.cereremem.actatricer);
        return ;
      }
      
      //-----------------------
      // MEM ACT NFL
      //-----------------------
      if (selActiune.autActiuneCod == "CEREREMEMEXPNTRICER")
      {
        this.navController.navigateRoot(appConfig.routes.memactnfl.cereremem.expntricer);
        return ;
      }
      //-----------------------
      // MEM ACT AFL
      //-----------------------
      if (selActiune.autActiuneCod == "CEREREMEMEXPATRICER")
      {
        this.navController.navigateRoot(appConfig.routes.memactafl.cereremem.expatricer);
        return ;
      }
      //-----------------------
      //-----------------------
      if (selActiune.autActiuneCod == "GESTACTEXELISTACTC")
      {
        this.navController.navigateRoot(appConfig.routes.commongrupact.gestexeact.listactc);
        return ;
      }
      if (selActiune.autActiuneCod == "GESTACTEXELISTACTV")
      {
        this.navController.navigateRoot(appConfig.routes.commongrupact.gestexeact.listactv);
        return ;
      }
      if (selActiune.autActiuneCod == "GESTACTEXELISTACTT")
      {
        this.navController.navigateRoot(appConfig.routes.commongrupact.gestexeact.listactt);
        return ;
      }
      return;    
    });


  

    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.Grupactactiuni)).subscribe(data2 => 
    {
      console.log("Handler GrupAct Actiuni 4");
      var crtAction : AuthAction.Grupactactiuni = data2;
      var rol : any = crtAction.crtRol;
      var rolgrupactid = crtAction.rolgrupactid ;
      var crtRolGrupAct = null;
      var selGrupAct = null;
      for (let idx in rol.rolgrupact)
      {
        console.log(rol.rolgrupact);
        crtRolGrupAct = rol.rolgrupact[idx];
        console.log(crtRolGrupAct);
        console.log(crtRolGrupAct.autRolgrupactId);
        if (crtRolGrupAct.autRolgrupactId == crtAction.rolgrupactid)
        {
          selGrupAct = crtRolGrupAct.grupactiuni;
          break;
        }
      }
      if (selGrupAct == null)
      {
        console.log("Cannot find GrupAct");
        return;
      }
      console.log("GrupAct selected");
      console.log(selGrupAct);
      storage.set("crtgrupact", selGrupAct);
      this.navController.navigateRoot(appConfig.routes.aut.grupactactiuni);//appConfig.routes.auth.register) ;//appConfig.routes.tabs.root);
      return;    
    });

    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.Rolgrupactiunii)).subscribe(data2 => 
    {
      console.log("Handler Rol Grup Actiuni 3");
      var crtAction : AuthAction.Rolgrupactiunii = data2;
      var logAns : any = crtAction.loginAnswer;
      var selRol = null;
      var crtUserRol : any;
      console.log(crtAction.userrolid);
      for (let idx in logAns.autUser.roles)
      {
        console.log(logAns.autUser.roles);
        crtUserRol = logAns.autUser.roles[idx];
        console.log(crtUserRol);
        console.log(crtUserRol.autUserrolId);
        if (crtUserRol.autUserrolId == crtAction.userrolid)
        {
          selRol = crtUserRol.rol;
          break;
        }
      }
      if (selRol == null)
      {
        console.log("Cannot find Rol");
        return;
      }
      console.log(selRol);
      storage.set("crtrol", selRol);
      this.navController.navigateRoot(appConfig.routes.aut.rolgrupactiuni);//appConfig.routes.auth.register) ;//appConfig.routes.tabs.root);
      return;    
    });

    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.Logout)).subscribe(data2 => 
    {
      let logoutAction : AuthAction.Logout = data2;
      console.log("Logout");
      this.navController.navigateRoot(appConfig.routes.auth.login);
    });

    
    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.Register)).subscribe(data2 => 
    {
      let registerAction : AuthAction.Register = data2;
      console.log("Register");
      var registerRequest = registerAction.registerRequest;
      console.log(registerRequest);
      return this.apiService.post(this.ApiURLAutRegister, registerAction.registerRequest).subscribe(data  => {  
        let response : any = data;
        //console.log(data);
        console.log(response);
        toastService.default("Felicit??ri! V-a??i ??nregistrat cu Succes. V?? rug??m s?? v?? Loga??i");
        this.navController.navigateRoot(appConfig.routes.auth.login);
        return;
        //return of(true);
      },
      (error) => {
        console.log("Error" + error);
        toastService.default("Eroare ??nregistrare : " + error.error.message);// + error.error.trace);//"Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i.");
        //return this.navController.navigateRoot(appConfig.routes.auth.login);
      })

    });

    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.ValidateRegistration)).subscribe(data2 => 
      {
        let validateRegistrationAction : AuthAction.ValidateRegistration = data2;
        console.log("Register");
        var validateRegistrationRequest = validateRegistrationAction.validateRegistrationRequest;
        console.log(validateRegistrationRequest);
        return this.apiService.post(this.ApiURLAutValidateRegistration,
                                    validateRegistrationAction.validateRegistrationRequest,
                                    {"Authorization" : `Bearer ${validateRegistrationAction.token}`}).subscribe(data  => {  
          let response : ValidateRegistrationAnswer = data;
          //console.log(data);
          console.log(response);
          if (response.codValidareAcceptat == "y")
          {
            toastService.default("Felicit??ri! V-a??i Validat ??nregistrarea cu succes. V?? rug??m s?? v?? Loga??i");
            this.navController.navigateRoot(appConfig.routes.auth.login);
          }else{
            toastService.default("Cod validare Invalid! V?? rug??m s?? introduce??i Codul de Validare corect");
            //this.navController.navigateRoot(appConfig.routes.auth.login);
          }
          return;
          //return of(true);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare ??nregistrare : " + error.error.message);// + error.error.trace);//"Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i.");
          //return this.navController.navigateRoot(appConfig.routes.auth.login);
        })
  
      });
  
    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.MemMembruTipSchimbare)).subscribe(data2 => 
      {
        let memMembruTipSchimbareAction : AuthAction.MemMembruTipSchimbare = data2;
        console.log("MemMembruTipSchimbare");
        var memMembruTipRequestSchimbare = memMembruTipSchimbareAction.memMembruTipRequestSchimbare;
        console.log(memMembruTipRequestSchimbare);
        return this.apiService.post(this.ApiURLMemMembruTipSchimbare,
                                    memMembruTipSchimbareAction.memMembruTipRequestSchimbare,
                                    {"Authorization" : `Bearer ${memMembruTipSchimbareAction.token}`}).subscribe(data  => {  
          let response : MemMembruTipResponse_Schimbare = data;
          //console.log(data);
          console.log(response);
          toastService.default("Felicit??ri! Cererea a fost trimis cu succes. V?? rug??m s?? v?? Re-Loga??i");
          this.navController.navigateRoot(appConfig.routes.auth.login);
          return;
          //return of(true);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare ??nregistrare : " + error.error.message);// + error.error.trace);//"Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i.");
          //return this.navController.navigateRoot(appConfig.routes.auth.login);
        })
  
      });


    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.MemGrupCreare)).subscribe(data2 => 
      {
        let memGrupCreareAction : AuthAction.MemGrupCreare = data2;
        console.log("memGrupCreare");
        var memMembruRequestCreare = memGrupCreareAction.memGrupRequestCreare;
        console.log(memMembruRequestCreare);
        return this.apiService.post(this.ApiURLMemGrupCreare,
                                    memGrupCreareAction.memGrupRequestCreare, 
                                    {"Authorization" : `Bearer ${memGrupCreareAction.token}`}).subscribe(data  => {  
          let response : MemMembruTipResponse_Schimbare = data;
          //console.log(data);
          console.log(response);
          toastService.default("Felicit??ri! V-a??i creat Propriul Grup cu succes. V?? rug??m s?? v?? Re-Loga??i");
          this.navController.navigateRoot(appConfig.routes.auth.login);
          return;
          //return of(true);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare Creare Grup : " + error.error.message);// + error.error.trace);//"Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i.");
          //return this.navController.navigateRoot(appConfig.routes.auth.login);
        })
  
      });

    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.MemGrupVizualizare)).subscribe(async data2 => 
      {
        let memGrupVizualizareAction : AuthAction.MemGrupVizualizare = data2;
        console.log("memGrupVizualizare");
        var memMembruRequestVizualizare = memGrupVizualizareAction.memGrupRequestVizualizare;
        var storageResultKey = memGrupVizualizareAction.storageResultKey;
        console.log(memMembruRequestVizualizare);
        return this.apiService.post(this.ApiURLMemGrupVizualizare,
                                    memGrupVizualizareAction.memGrupRequestVizualizare, 
                                    {"Authorization" : `Bearer ${memGrupVizualizareAction.token}`}).subscribe(data  => {  
          let response : any = data;
          console.log(response);
          storage.set(storageResultKey, response);
          return of(response);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare Vizualizare Grup : " + error.error.message);// + error.error.trace);//"Nume utilizator sau Parola sunt Incorete! V?? rug??m re??ncerca??i.");
          //return this.navController.navigateRoot(appConfig.routes.auth.login);
        })
      });
  

    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.Login)).subscribe(data2 => 
    {
      let loginAction : AuthAction.Login = data2;
      //var id = auth.accessToken;
      //let mod : AuthStateModel = data2;
      /** 
      var loginRequest : LoginRequest = {
        "username": "alexm2",
        "password": "turda"
      };*/
      //return this.http.post(this.ApiURL, loginAction.loginRequest).subscribe(data  => {
      return this.apiService.post(this.ApiURLAutLogin, loginAction.loginRequest).subscribe(async data  => {  
        let response : any = data;
        console.log(data);
        console.log(response.accessToken);
        //this.storage.set('access_token', response.accessToken);
        //var decodedUser = this.jwtHelper.decodeToken(response.accessToken);
        //console.log(decodedUser);
        console.log(response);
        storage.set("loginresponse", response);
        storage.set("token", response.accessToken);
        var a = 1
        //loginAction.loginAnswer.response = response;
        //auth.isAuth = true;
        //var id = action.userId;
        /**
        var auth = this.store.select('auth');
        auth.subscribe(data7 => {
          let response : any = data7;
          console.log(data7)
   
        })*/
        //this.storage.set('access_token', response.accessToken);
        /** 
        this.store.select(AuthStateModel).subscribe(info => {
          //window.alert(info.user.name);
          info.response = response;
        });    */
        this.navController.navigateRoot(appConfig.routes.aut.userroluri);//appConfig.routes.auth.register) ;//appConfig.routes.tabs.root);
        return;
        //return of(true);
      },
      (error) => {
        console.log("Error" + error);
        toastService.default("Login e??uat ! " + error.error.message);
        return this.navController.navigateRoot(appConfig.routes.auth.login);
      })
    });

  //});

    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.GeoZonetara)).subscribe(async data2 => 
    {
        let geoZonetaraAction : AuthAction.GeoZonetara = data2;
        var storageResultKey = geoZonetaraAction.storageResultKey;
        console.log("Action Geo Zone Tara [storageResultKey=" + storageResultKey + "]");
        // ----
        this.apiService.get(this.ApiURLGeoZonetara + this.Toate, {}).subscribe(data  => {  
          let response : any = data;
          console.log(response);
          storage.set(storageResultKey, response);
          return of(response);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare: Nu se pote ob??ine lista de Zonetara");
          return of(false);
        })  
    });
    

    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.GeoJudete)).subscribe(async data2 => 
    {
        let geoJudeteAction :AuthAction.GeoJudete = data2;
        var zonataraid       = geoJudeteAction.zonataraid;
        var storageResultKey = geoJudeteAction.storageResultKey;
        console.log("Action Geo Judete [zonataraid=" + zonataraid + " , storageResultKey=" + storageResultKey + "]");
        // ----
        this.apiService.get(this.ApiURLGeoJudete + this.ByZonataraid + zonataraid, {}).subscribe(data  => {  
          let response : any = data;
          console.log(response);
          storage.set(storageResultKey, response);
          return of(response);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare: Nu se poate ob??ine lista de jude??e");
          return of(false);
        })  
    });


    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.GeoUateuri)).subscribe(async data2 => 
      {
          let geoUateuriAction :AuthAction.GeoUateuri = data2;
          var zonataraid       = geoUateuriAction.zonataraid;
          var judetid          = geoUateuriAction.judetid;
          var storageResultKey = geoUateuriAction.storageResultKey;
          console.log("Action Geo Uat [zonataraid=" + zonataraid + " , judetid=" + judetid + " , storageResultKey=" + storageResultKey + "]");
          // ----
          this.apiService.get(this.ApiURLGeoUat + this.ByZonataraid + zonataraid + this.ByJudetid + judetid, {}).subscribe(data  => {  
            let response : any = data;
            console.log(response);
            storage.set(storageResultKey, response);
            return of(response);
          },
          (error) => {
            console.log("Error" + error);
            toastService.default("Eroare: Nu se poate ob??ine lista de unitati administrativ teritoriale");
            return of(false);
          })  
      });
  
  
    //__________________________________________________________________________
    this.actions$.pipe(ofActionDispatched(AuthAction.GeoLocalitati)).subscribe(async data2 => 
    {
        let geoLocalitatiAction :AuthAction.GeoLocalitati = data2;
        var zonataraid       = geoLocalitatiAction.zonataraid;
        var judetid          = geoLocalitatiAction.judetid;
        var uatid            = geoLocalitatiAction.uatid;
        var storageResultKey = geoLocalitatiAction.storageResultKey;
        console.log("Action Geo Localit????i [zonataraid=" + zonataraid + " , judetid=" + judetid + " , uatid=" + uatid + " , storageResultKey=" + storageResultKey + "]");
        // ----
        this.apiService.get(this.ApiURLGeoLocalitati + this.ByZonataraid + zonataraid 
                                                     + this.ByJudetid + judetid + this.ByUatid + uatid, {}).subscribe(data  => {  
          let response : any = data;
          console.log(response);
          storage.set(storageResultKey, response);
          return of(response);
        },
        (error) => {
          console.log("Error" + error);
          toastService.default("Eroare: Nu se poate ob??ine lista de localit????i");
          return of(false);
        })  
    });


  }
}


/**
 * 
 *       return this.http.post(this.ApiURL, loginRequest).pipe(
        map((response: { data: LoginAnswer }) => 
        {
          console.log(response);
          auth.isAuth = true;
          this.navController.navigateRoot(appConfig.routes.auth.register) ;//appConfig.routes.tabs.root);
          return;  
        },
        catchError((error: Error) => {
          auth.isAuth = false;
          return this.navController.navigateRoot(appConfig.routes.auth.login);
        })     

        
      if (auth.isAuth) {
        this.navController.navigateRoot(appConfig.routes.tabs.root);
        return;
      }
      this.navController.navigateRoot(appConfig.routes.auth.login);

      */