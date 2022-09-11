// eslint-disable-next-line @typescript-eslint/no-namespace
import { of } from 'rxjs/internal/observable/of';
import { LoginAnswer } from '../../../app/payloads/aut/LoginAnswer';
import { LoginRequest } from '../../../app/payloads/aut/LoginRequest';
import {ApiService} from '../../../app/services/api/api.service'

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
    constructor(public isAuth: boolean = false) {}
  }

  export class Rolgrupactiunii {
    static readonly type = '[Rolgrupactiunii] Rol Grup Actiunii';
    constructor(public userrolid, public loginAnswer : LoginAnswer) {}
  }

  export class Grupactactiuni {
    static readonly type = '[Grupactactiuni] Grup Act Actiunii';
    constructor(public rolgrupactid, public crtRol : any) {}
  }

  export class Actiune {
    static readonly type = '[Actiune] Actiune';
    constructor(public grupactactiuneid, public crtGrupAct : any) {}
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