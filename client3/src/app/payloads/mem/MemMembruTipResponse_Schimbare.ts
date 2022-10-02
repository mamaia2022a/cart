import { State } from "@ngxs/store";

export class MemMembruTipResponse_Schimbare
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
