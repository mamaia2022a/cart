import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { ActATriCerPage } from './actatricer.page';
import { ActATriCerPageRoutingModule } from './actatricer-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, ActATriCerPageRoutingModule, SharedModule],
  declarations: [ActATriCerPage],
})
export class ActATriCerPageModule {}
