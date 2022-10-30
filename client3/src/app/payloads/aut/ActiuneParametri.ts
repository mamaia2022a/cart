import { State } from "@ngxs/store";

export class ActiuneParametri
{
    params: any;
    title : string;

    constructor(){
      this.params = null;
    }

    public setData(params: any)
    {
      this.params = params;
    }

    public getData() : any
    {
      return this.params;
    }

}
