import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../../shared/shared.module';
import { UserRoluriPage } from './userroluri.page';
import { UserRoluriPageRoutingModule } from './userroluri-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, UserRoluriPageRoutingModule, SharedModule],
  declarations: [UserRoluriPage],
})
export class UserRoluriPageModule {}
