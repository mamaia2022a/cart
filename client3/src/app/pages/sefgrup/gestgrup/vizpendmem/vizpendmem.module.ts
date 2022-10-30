import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { VizPendMemPage } from './vizpendmem.page';
import { VizPendMemPageRoutingModule } from './vizpendmem-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, VizPendMemPageRoutingModule, SharedModule],
  declarations: [VizPendMemPage],
})
export class VizPendMemPageModule {}
