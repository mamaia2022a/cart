import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { MemIncActExpNflPage } from './memincactexpnfl.page';
import { MemIncActExpNflPageRoutingModule } from './memincactexpnfl-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, MemIncActExpNflPageRoutingModule, SharedModule],
  declarations: [MemIncActExpNflPage],
})
export class MemIncActExpNflPageModule {}
