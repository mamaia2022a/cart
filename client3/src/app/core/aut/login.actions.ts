import { Action } from '@ngxs/store';
import { LoginAnswer } from 'src/app/payloads/aut/LoginAnswer';
import { LoginRequest } from 'src/app/payloads/aut/LoginRequest';
import { LogoutAnswer } from 'src/app/payloads/aut/LogoutAnswer';
import { LogoutRequest } from 'src/app/payloads/aut/LogoutRequest';


export const LOGIN =                 '[AUT] Login';
export const LOGIN_SUCCESS =         '[AUT] Login Success';
export const LOGIN_FAIL =            '[AUT] Login Fail';
export const LOGOUT =                '[AUT] Logout';
export const LOGOUT_SUCCESS =        '[AUT] Logout Success';
export const LOGOUT_FAIL =           '[AUT] Logout Fail';


/**
 * Login / Logout Actions
 */
Action
export class LoginAction 
{
  readonly type = LOGIN;
  constructor(public payload: LoginRequest) { }
}

Action 
export class LoginSuccessAction
{
  readonly type = LOGIN_SUCCESS;

  constructor(public payload: LoginAnswer) { }
}

Action 
export class LoginFailAction 
{
  readonly type = LOGIN_FAIL;

  constructor(public payload: LoginAnswer) { }
}


Action
export class LogoutAction 
{
  readonly type = LOGIN;
  constructor(public payload: LogoutRequest) { }
}

Action 
export class LogoutSuccessAction
{
  readonly type = LOGIN_SUCCESS;

  constructor(public payload: LogoutAnswer) { }
}

Action 
export class LogoutFailAction 
{
  readonly type = LOGIN_FAIL;

  constructor(public payload: LogoutAnswer) { }
}



export type Actions
  = LoginAction
  | LoginSuccessAction
  | LoginFailAction
  | LogoutAction
  | LogoutSuccessAction
  | LogoutFailAction
  ;


/**
 * import { createAction, props } from '@ngrs/store';
import ToDo from './todo';

export const GetToDoAction = createAction('[ToDo] - Get ToDo');

export const CreateToDoAction = createAction(
  '[ToDo] - Create ToDo',
  props<ToDo>()
);

export const BeginGetToDoAction = createAction('[ToDo] - Begin Get ToDo');

export const SuccessGetToDoAction = createAction(
  '[ToDo] - Success Get ToDo',
  props<{ payload: ToDo[] }>()
);

export const BeginCreateToDoAction = createAction(
  '[ToDo] - Begin Create ToDo',
  props<{ payload: ToDo }>()
);

export const SuccessCreateToDoAction = createAction(
  '[ToDo] - Success Create ToDo',
  props<{ payload: ToDo }>()
);

export const ErrorToDoAction = createAction('[ToDo] - Error', props<Error>());
//import { Action } from '@ngrx/store';
*/
//import { Book } from '../models/book';
