import { Injectable } from '@angular/core';
import { NavController } from '@ionic/angular';
import { Store, Actions, ofActionDispatched, StateContext } from '@ngxs/store';
import { appConfig } from '../../app.config';
import { AuthStateModel } from './auth-guard.models';
import { AuthAction } from './auth-guard.actions';
import { HttpClient } from '@angular/common/http';
import { LoginAnswer } from '../../../app/payloads/aut/LoginAnswer';
//import { catchError, map, of } from 'rxjs';
import { of } from 'rxjs';
import { LoginRequest } from '../../../app/payloads/aut/LoginRequest';
import { ToastService } from '../../../app/services/toast/toast.service';
import { ApiService } from '../../../app/services/api/api.service';


import { Storage } from '@ionic/storage';
import { ValueAccessor } from '@ionic/angular/directives/control-value-accessors/value-accessor';

@Injectable({ providedIn: 'root' })
export class AuthHandler {


  private ApiURL: string = "http://localhost:8080/api/aut/user/login";

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
    storage.create();
    //var token = storage.get("token");
    //storage.set("token", "TEST");

    
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
        this.navController.navigateRoot(appConfig.routes.userroles.main);//appConfig.routes.auth.register) ;//appConfig.routes.tabs.root);
        return;
        //return of(true);
      },
      (error) => {
        console.log("Error" + error);
        toastService.default("Nume utilizator sau Parola sunt Incorete! Vă rugăm reîncercați [" + error.message + "]");
        return this.navController.navigateRoot(appConfig.routes.auth.login);
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