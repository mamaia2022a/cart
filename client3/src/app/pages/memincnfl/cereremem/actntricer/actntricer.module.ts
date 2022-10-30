import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { ActNTriCerPage } from './actntricer.page';
import { ActNTriCerPageRoutingModule } from './actntricer-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, ActNTriCerPageRoutingModule, SharedModule],
  declarations: [ActNTriCerPage],
})
export class ActNTriCerPageModule {}
