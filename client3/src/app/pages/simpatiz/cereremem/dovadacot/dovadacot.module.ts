import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { DovadaCotPage } from './dovadacot.page';
import { DovadaCotPageRoutingModule } from './dovadacot-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, DovadaCotPageRoutingModule, SharedModule],
  declarations: [DovadaCotPage],
})
export class DovadaCotPageModule {}
