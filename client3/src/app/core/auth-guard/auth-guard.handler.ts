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

@Injectable({ providedIn: 'root' })
export class AuthHandler {


  private ApiURL: string = "http://fluierul.ro:8080/api/aut/user/login";//"http://localhost:8080/api/aut/user/login";

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
              toastService.default("Nume utilizator sau Parola sunt Incorete! Vă rugăm reîncercați [" + error.message + "]");
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
      this.navController.navigateRoot(appConfig.routes.auth.login);
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
      return this.apiService.post(this.ApiURL, loginAction.loginRequest).subscribe(data  => {  
        let response : any = data;
        console.log(data);
        console.log(response.accessToken);
        //this.storage.set('access_token', response.accessToken);
        //var decodedUser = this.jwtHelper.decodeToken(response.accessToken);
        //console.log(decodedUser);
        console.log(response);
        storage.set("loginresponse", response);
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
        toastService.default("Nume utilizator sau Parola sunt Incorete! Vă rugăm reîncercați [" + error.message + "]");
        return this.navController.navigateRoot(appConfig.routes.auth.login);
      })
    });

  //});

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