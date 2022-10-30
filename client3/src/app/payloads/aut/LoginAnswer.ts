import { State } from "@ngxs/store";

export class LoginAnswer
{
    username:string;
    password:string;
    response : any;

    constructor(){
        this.username = "";
        this.password = "";
        this.response = null;
    }
}
