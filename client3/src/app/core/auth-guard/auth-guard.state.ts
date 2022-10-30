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

  @Action(AuthAction.MemMembruCerereAfiliere)
  memMembruCerereAfiliere(context: StateContext<AuthAction.MemMembruCerereAfiliere>, action: AuthAction.MemMembruCerereAfiliere) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }

  @Action(AuthAction.MemSefGrupAcceptareAfiliere)
  memMembruAcceptareAfiliere(context: StateContext<AuthAction.MemSefGrupAcceptareAfiliere>, action: AuthAction.MemSefGrupAcceptareAfiliere) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }


  @Action(AuthAction.MemMembruDezafiliere)
  memMembruCerereDezafiliere(context: StateContext<AuthAction.MemMembruDezafiliere>, action: AuthAction.MemMembruDezafiliere) {
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

  @Action(AuthAction.MemGrupCreare)
  memGrupCreare(context: StateContext<AuthAction.MemGrupCreare>, action: AuthAction.MemGrupCreare) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }  


  @Action(AuthAction.MemGrupVizualizare)
  memGrupVizualizare(context: StateContext<AuthAction.MemGrupVizualizare>, action: AuthAction.MemGrupVizualizare) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }

  @Action(AuthAction.MemMembruGrupulMeuVizualizare)
  memMembruGrupulMeuVizualizare(context: StateContext<AuthAction.MemMembruGrupulMeuVizualizare>, 
                                       action: AuthAction.MemMembruGrupulMeuVizualizare) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }


  @Action(AuthAction.MemGrupMembriInAsteptare)
  memGrupMembriInAsteptare(context: StateContext<AuthAction.MemGrupMembriInAsteptare>, action: AuthAction.MemGrupMembriInAsteptare) {
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

  @Action(AuthAction.ActiuneSubactiuni)
  actiunesubactiuni(context: StateContext<AuthAction.Grupactactiuni>, action: AuthAction.ActiuneSubactiuni) {
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

  @Action(AuthAction.Subactiune)
  subactiune(context: StateContext<AuthAction.Actiune>, action: AuthAction.Subactiune) {
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
