// eslint-disable-next-line @typescript-eslint/no-namespace
import { of } from 'rxjs/internal/observable/of';
import { LoginAnswer } from '../../../app/payloads/aut/LoginAnswer';
import { LoginRequest } from '../../../app/payloads/aut/LoginRequest';
import {ApiService} from '../../../app/services/api/api.service'
import { RegisterRequest } from '../../payloads/aut/RegisterRequest';
import { MemMembruTipRequest_Schimbare } from '../../payloads/mem/MemMembruTipRequest_Schimbare';
import { MemGrupRequest_Creare } from '../../payloads/mem/MemGrupRequest_Creare';
import { MemGrupRequest_Vizualizare} from '../../payloads/mem/MemGrupRequest_Vizualizare';
import { MemGrupRequest_MembriInAsteptare} from '../../payloads/mem/MemGrupRequest_MembriInAsteptare';
import { MemMembruRequest_AcceptareAfiliere} from '../../payloads/mem/MemMembruRequest_AcceptareAfiliere';

import { MemMembruRequest_GrupulMeuVizualizare} from '../../payloads/mem/MemMembruRequest_GrupulMeuVizualizare';

import { ValidateRegistrationRequest} from '../../payloads/aut/ValidateRegistrationRequest';
import { ActiuneParametri} from '../../payloads/aut/ActiuneParametri';

import { MemMembruRequest_CerereAfiliere } from '../../payloads/mem/MemMembruRequest_CerereAfiliere';
import { MemMembruRequest_Dezafiliere } from '../../payloads/mem/MemMembruRequest_Dezafiliere';


export namespace AuthAction {
  export class Login {
    public loginAnswer: any;
    static readonly type = '[Login] User login';
    constructor(public loginRequest : LoginRequest, public isAuth: boolean = true) 
    {
      this.loginAnswer = new LoginAnswer();
    }
  }
  export class Logout {
    static readonly type = '[Logout] User logout';
    constructor(public loginAnswer : LoginAnswer, public isAuth: boolean = false) {}
  }

  export class Register {
    static readonly type = '[Register] Register user';
    constructor(public registerRequest: RegisterRequest) {}
  }

  export class ValidateRegistration {
    static readonly type = '[ValidateRegistration] Validate registration';
    constructor(public validateRegistrationRequest: ValidateRegistrationRequest, public token: string) {}
  }

  export class MemMembruTipSchimbare {
    static readonly type = '[MemMembruTipSchimbare] Membru Tip Schimbare';
    constructor(public memMembruTipRequestSchimbare: MemMembruTipRequest_Schimbare, public token: string) {}
  }

  export class MemMembruCerereAfiliere {
    static readonly type = '[MemMembruCerereAfiliere] Membru Cerere Afiliere';
    constructor(public memMembruRequestCerereAfiliere: MemMembruRequest_CerereAfiliere, public token: string) {}
  }

  export class MemSefGrupAcceptareAfiliere {
    static readonly type = '[MemSefGrupAcceptareAfiliere] Sef Grup Acceptare Afiliere';
    constructor(public memSefGrupRequestAcceptareAfiliere: MemMembruRequest_AcceptareAfiliere, public token: string) {}
  }

  export class MemMembruDezafiliere {
    static readonly type = '[MemMembruDezafiliere] Membru Membru Dezafiliere';
    constructor(public memMembruRequestDezafiliere: MemMembruRequest_Dezafiliere, public token: string) {}
  }

  export class MemGrupCreare {
    static readonly type = '[MemGrupCreare] Mem Grup Creare';
    constructor(public memGrupRequestCreare: MemGrupRequest_Creare, public token: string) {}
  }

  export class MemGrupVizualizare {
    static readonly type = '[MemGrupVizualizare] Mem Grup Vizualizare';
    constructor(public memGrupRequestVizualizare: MemGrupRequest_Vizualizare, public token: string, public storageResultKey: string) {}
  }

  export class MemMembruGrupulMeuVizualizare {
    static readonly type = '[MemMembruGrupulMeuVizualizare] Mem Membru Grupul Meu Vizualizare';
    constructor(public memGrupRequestVizualizare: MemMembruRequest_GrupulMeuVizualizare, public token: string, public storageResultKey: string) {}
  }

  export class MemGrupMembriInAsteptare {
    static readonly type = '[MemGrupMembriInAsteptare] Mem Grup Membri In Asteptare';
    constructor(public memGrupRequestMembriInAsteptare: MemGrupRequest_MembriInAsteptare, public token: string, public storageResultKey: string) {}
  }

  export class Rolgrupactiunii {
    static readonly type = '[Rolgrupactiunii] Rol Grup Actiunii';
    constructor(public userrolid, public loginAnswer : LoginAnswer) {}
  }

  export class Grupactactiuni {
    static readonly type = '[Grupactactiuni] Grup Act Actiunii';
    constructor(public rolgrupactid, public crtRol : any) {}
  }

  export class ActiuneSubactiuni {
    static readonly type = '[ActiuneSubactiuni] Actiune Subactiuni';
    constructor(public parentactiuneid, public grupactactiuneid, public crtGrupAct : any, 
                public subactiuniParams: ActiuneParametri, public backaction : string) {}
  }

  export class Actiune {
    static readonly type = '[Actiune] Actiune';
    constructor(public grupactactiuneid, public crtGrupAct : any) {}
  }

  export class Subactiune {
    static readonly type = '[Subactiune] Subactiune';
    constructor(public subactiuneid, public crtGrupAct : any) {}
  }

  export class GeoZonetara {
    static readonly type = '[GeoZonetara] Geo Zone Tara';
    constructor(public storageResultKey: string) {}
  }

  export class GeoJudete {
    static readonly type = '[GeoJudete] Geo Judete';
    constructor(public zonataraid: number, public storageResultKey: string) {}
  }


  export class GeoUateuri {
    static readonly type = '[GeoUateuri] Geo Uateuri';
    constructor(public zonataraid: number, public judetid: number, public storageResultKey) {}
  }

  export class GeoLocalitati {
    static readonly type = '[GeoLocalitati] Geo Localitati';
    constructor(public zonataraid: number, public judetid: number, public  uatid: number, public storageResultKey) {}
  }

}


/**
var payload=
{
  "username": "alexm",
  "password": "turda"
}
//https://stackblitz.com/edit/angular-d6jctm?file=src%2Fapp%2Ftodo.reducer.ts
//https://stackoverflow.com/questions/41820016/how-to-trigger-and-ngrx-action-after-2-http-requests-return-values-to-the-store
//var headers = new HttpHeaders();
////headers.append('Access-Control-Allow-Origin' , '*');
////headers.append('Access-Control-Allow-Methods', 'POST');
//headers.append('Accept','application/json');
//headers.append('Content-Type','application/json');
//headers.append('Access-Control-Allow-Origin' , '*');
//headers.append('Access-Control-Allow-Methods', 'POST');
//headers.append('Access-Control-Allow-Methods', 'application/json');
//"http://localhost:8080/api/auth/signin",payload, {headers : headers}
//let YourHeaders = {'Content-Type':'application/json'};
//, {headers : {'Access-Control-Allow-Origin':'*'}}
apiService.post("http://localhost:8080/api/aut/user/login", payload)
  .subscribe(data  => {
  let response : any = data
  console.log(data)
  console.log(response.accessToken)
  //this.storage.set('access_token', response.accessToken);
  //var decodedUser = this.jwtHelper.decodeToken(response.accessToken);
  //console.log(decodedUser);
  return of(true);
},
(error) => {
  console.log("Error" + error)
})

}
}
*/