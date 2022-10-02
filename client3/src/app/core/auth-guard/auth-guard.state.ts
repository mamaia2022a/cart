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

  @Action(AuthAction.ValidateRegistration)
  validateRegistration(context: StateContext<AuthAction.ValidateRegistration>, action: AuthAction.ValidateRegistration) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }

  @Action(AuthAction.MemMembruTipSchimbare)
  memMembruTipSchimbare(context: StateContext<AuthAction.MemMembruTipSchimbare>, action: AuthAction.MemMembruTipSchimbare) {
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


  @Action(AuthAction.GeoZonetara)
  geozonetara(context: StateContext<AuthAction.GeoZonetara>, action: AuthAction.GeoZonetara) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }


  @Action(AuthAction.GeoJudete)
  geojudete(context: StateContext<AuthAction.GeoJudete>, action: AuthAction.GeoJudete) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }


  @Action(AuthAction.GeoUateuri)
  geouat(context: StateContext<AuthAction.GeoUateuri>, action: AuthAction.GeoUateuri) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }

}
