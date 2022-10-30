import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { PendingMemPage } from './pendingmem.page';
import { PendingMemPageRoutingModule } from './pendingmem-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, PendingMemPageRoutingModule, SharedModule],
  declarations: [PendingMemPage],
})
export class PendingMemPageModule {}
