import { Injectable } from '@angular/core';
import { Action, State, StateContext } from '@ngxs/store';
import { RolGrupActiuniAction } from './rol_grupactiuni.actions';
import { RolGrupActiuniStateModel } from './rol_grupactiuni.models';

export const initialState: RolGrupActiuniStateModel = {
};

@State<RolGrupActiuniStateModel>({
  name: 'rolgrupactiuni',
  defaults: initialState,
})
@Injectable()
export class RolGrupActiuniGuardState {

  @Action(RolGrupActiuniAction.Rolgrupactiuni)
  rolgrupactiunii(context: StateContext<RolGrupActiuniAction.Rolgrupactiuni>, action: RolGrupActiuniAction.Rolgrupactiuni) {
    const state = context.getState();
    context.setState({
      ...state,
      ...action,
    });
  }

}
