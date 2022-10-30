// eslint-disable-next-line @typescript-eslint/no-namespace
import { of } from 'rxjs/internal/observable/of';
import { LoginAnswer } from '../../../../app/payloads/aut/LoginAnswer';
import { LoginRequest } from '../../../../app/payloads/aut/LoginRequest';
import {ApiService} from '../../../../app/services/api/api.service'

export namespace RolGrupActiuniAction {
  export class Rolgrupactiuni {
    
    static readonly type = '[Rolgrupactiuni] Rol Grup Actiuni';
    constructor(public userrolid : number, public loginAnswer: LoginAnswer) 
    {
    
    }
  }
}


