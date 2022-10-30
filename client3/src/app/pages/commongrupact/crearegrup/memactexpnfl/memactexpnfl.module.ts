import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { MemActExpNflPage } from './memactexpnfl.page';
import { MemActExpNflPageRoutingModule } from './memactexpnfl-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, MemActExpNflPageRoutingModule, SharedModule],
  declarations: [MemActExpNflPage],
})
export class MemActExpNflPageModule {}
