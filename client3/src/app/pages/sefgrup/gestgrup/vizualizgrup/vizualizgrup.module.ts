import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { VizualizGrupPage } from './vizualizgrup.page';
import { VizualizGrupPageRoutingModule } from './vizualizgrup-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, VizualizGrupPageRoutingModule, SharedModule],
  declarations: [VizualizGrupPage],
})
export class VizualizGrupPageModule {}
