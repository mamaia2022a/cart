import { Injectable } from '@angular/core';
import { NavController } from '@ionic/angular';
import { Store, Actions, ofActionDispatched, StateContext } from '@ngxs/store';
import { appConfig } from '../../../app.config';
//import { AuthStateModel } from './rol_grupactiuni.models';
import { RolGrupActiuniAction } from './rol_grupactiuni.actions';
import { HttpClient } from '@angular/common/http';
import { LoginAnswer } from '../../../../app/payloads/aut/LoginAnswer';
//import { catchError, map, of } from 'rxjs';
import { of } from 'rxjs';
import { LoginRequest } from '../../../../app/payloads/aut/LoginRequest';
import { ToastService } from '../../../../app/services/toast/toast.service';
import { ApiService } from '../../../../app/services/api/api.service';


import { Storage } from '@ionic/storage';
import { ValueAccessor } from '@ionic/angular/directives/control-value-accessors/value-accessor';

@Injectable({ providedIn: 'root' })
export class RolGrupActiuniHandler {

  constructor(private actions$: Actions, private navController: NavController, 
              private http: HttpClient, private toastService: ToastService, 
              private apiService: ApiService, private store: Store, private storage: Storage) {

    //console.log("rol grup actiuni handler");
    this.actions$.pipe(ofActionDispatched(RolGrupActiuniAction.Rolgrupactiuni)).subscribe(data2 => 
    {
      console.log("rol grup actiuni handler 2");
      let rolGrupAction : RolGrupActiuniAction.Rolgrupactiuni = data2;
      //this.navController.navigateRoot(appConfig.routes.aut.rolgrupactiuni);//appConfig.routes.auth.register) ;//appConfig.routes.tabs.root);
      return;
    });
    /** ,
      (error) => 
      {
        console.log("Error" + error);
        toastService.default("Nume utilizator sau Parola sunt Incorete! Vă rugăm reîncercați [" + error.message + "]");
        return this.navController.navigateRoot(appConfig.routes.auth.login);
      }
      */
  } 
}



