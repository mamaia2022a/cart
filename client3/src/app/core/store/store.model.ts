import { RouterStateModel } from '@ngxs/router-plugin';
//import { LoginAnswer } from 'src/app/payloads/aut/LoginAnswer';
//import { MessageDetailPageStateModel } from '../../pages/message-detail/message-detail.model';
//import { SettingsPageStateModel } from '../../pages/settings/settings.model';
//import { MainPageStateModel } from '../../tabs/main/main.model';
//import { MessagesPageStateModel } from '../../tabs/messages/messages.model';
//import { ProfilePageStateModel } from '../../tabs/profile/profile.model';
//import { ServicesPageStateModel } from '../../tabs/services/services.model';
import { AuthStateModel } from '../auth-guard/auth-guard.models';

export interface AppStoreModel {
  auth: AuthStateModel;
  //main: MainPageStateModel;
  //services: ServicesPageStateModel;
  //messages: MessagesPageStateModel;
  //profile: ProfilePageStateModel;
  //settings: SettingsPageStateModel;
  //messageDetail: MessageDetailPageStateModel;
  router: RouterStateModel;
}

export interface AppStoreLoadingStatesModel {
  isLoading: boolean;
  isFailed: boolean;
  isSuccess: boolean;
  error: string;
}
