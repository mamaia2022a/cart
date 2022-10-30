import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { ListActCPage } from './listactc.page';
import { ListActCPageRoutingModule } from './listactc-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, ListActCPageRoutingModule, SharedModule],
  declarations: [ListActCPage],
})
export class ListActCPageModule {}
