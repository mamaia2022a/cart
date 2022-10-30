import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { VizualizMemPage } from './vizualizmem.page';
import { VizualizMemPageRoutingModule } from './vizualizmem-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, VizualizMemPageRoutingModule, SharedModule],
  declarations: [VizualizMemPage],
})
export class VizualizMemPageModule {}
