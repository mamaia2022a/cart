import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { AccPendMemPage } from './accpendmem.page';
import { AccPendMemPageRoutingModule } from './accpendmem-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, AccPendMemPageRoutingModule, SharedModule],
  declarations: [AccPendMemPage],
})
export class AccPendMemPageModule {}
