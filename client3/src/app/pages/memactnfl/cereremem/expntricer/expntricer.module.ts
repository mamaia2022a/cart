import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { ExpNTriCerPage } from './expntricer.page';
import { ExpNTriCerPageRoutingModule } from './expntricer-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, ExpNTriCerPageRoutingModule, SharedModule],
  declarations: [ExpNTriCerPage],
})
export class ExpNTriCerPageModule {}
