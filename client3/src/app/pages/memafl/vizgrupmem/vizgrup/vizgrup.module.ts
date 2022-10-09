import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { VizGrupPage } from './vizgrup.page';
import { VizGrupPageRoutingModule } from './vizgrup-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, VizGrupPageRoutingModule, SharedModule],
  declarations: [VizGrupPage],
})
export class VizGrupPageModule {}
