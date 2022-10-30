import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { ExpATriCerPage } from './expatricer.page';
import { ExpATriCerPageRoutingModule } from './expatricer-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, ExpATriCerPageRoutingModule, SharedModule],
  declarations: [ExpATriCerPage],
})
export class ExpATriCerPageModule {}
