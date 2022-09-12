import { Injectable } from '@angular/core';
import { Action, State, StateContext } from '@ngxs/store';
import { AuthAction } from './auth-guard.actions';
import { AuthStateModel } from './auth-guard.models';

export const initialState: AuthStateModel = {
  isAuth: false,
  accessToken: '',
  refreshToken: '',
};

@State<AuthStateModel>({
  name: 'auth',
  defaults: initialState,
})
@Injectable()
export class AuthGuardState {
  @Action(AuthAction.Login)
  login(context: StateContext<AuthAction.Login>, action: AuthAction.Login) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }

  @Action(AuthAction.Logout)
  logout(context: StateContext<AuthAction.Logout>) {
    const state = context.getState();
    context.setState({
      ...state,
      isAuth: false,
    });
  }


  @Action(AuthAction.Register)
  register(context: StateContext<AuthAction.Register>, action: AuthAction.Register) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }

  @Action(AuthAction.Rolgrupactiunii)
  rolgrupactiunii(context: StateContext<AuthAction.Rolgrupactiunii>, action: AuthAction.Rolgrupactiunii) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }

  @Action(AuthAction.Grupactactiuni)
  grupactactiuni(context: StateContext<AuthAction.Grupactactiuni>, action: AuthAction.Grupactactiuni) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }

  @Action(AuthAction.Actiune)
  actiune(context: StateContext<AuthAction.Actiune>, action: AuthAction.Actiune) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }

}
