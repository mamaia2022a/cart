import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../../shared/shared.module';
import { UserRolesPage } from './userroles.page';
import { UserRolesPageRoutingModule } from './userroles-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, UserRolesPageRoutingModule, SharedModule],
  declarations: [UserRolesPage],
})
export class UserRolesPageModule {}
