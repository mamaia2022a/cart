import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { ListActTPage } from './listactt.page';
import { ListActTPageRoutingModule } from './listactt-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, ListActTPageRoutingModule, SharedModule],
  declarations: [ListActTPage],
})
export class ListActTPageModule {}
