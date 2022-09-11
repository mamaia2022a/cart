import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { ConfirmSimActPage } from './confirmsimact.page';
import { ConfirmSimActPageRoutingModule } from './confirmsimact-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, ConfirmSimActPageRoutingModule, SharedModule],
  declarations: [ConfirmSimActPage],
})
export class ConfirmSimActPageModule {}
