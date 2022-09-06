import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
//import { Actions, createEffect, ofType } from "@ngxs/store";
import { Action, Actions } from "@ngxs/store";
import { Observable, of } from "rxjs";
import { catchError, map, mergeMap, filter, take } from "rxjs/operators";
import {Store } from "@ngxs/store";
import * as LoginActions from "./login.actions";
//import ToDo from "./todo";
//import ToDoState from "./todo.state";
import { LoginAnswer } from "src/app/payloads/aut/LoginAnswer";
/** 
@Injectable()
export class ToDoEffects {
  constructor(
    //private store: Store<{ todos: ToDoState }>,
    private http: HttpClient,
    private action$: Actions
  ) {}

  private ApiURL: string = "https://reqres.in/api/users";

  LoginActions$: Observable<Action> = createEffect(() =>
    this.action$.pipe(
      ofType(LoginActions.LoginAction),
      mergeMap(action => {
      console.log(action, 'action');
        return this.http.get(this.ApiURL).pipe(
          map((response: { data: LoginAnswer }) => {
            console.log(response);
            return new LoginActions.LoginSuccessAction(response.data);
          }),
          catchError((error: Error) => {
            return of(new LoginActions.LoginFailAction(error));
          })
        )
      }
      ),
      take(1)
    )
  );
}
*/