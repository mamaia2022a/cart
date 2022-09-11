import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { ListActVPage } from './listactv.page';
import { ListActVPageRoutingModule } from './listactv-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, ListActVPageRoutingModule, SharedModule],
  declarations: [ListActVPage],
})
export class ListActVPageModule {}
