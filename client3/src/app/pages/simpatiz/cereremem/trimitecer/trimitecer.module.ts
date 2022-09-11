import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { TrimiteCerPage } from './trimitecer.page';
import { TrimiteCerPageRoutingModule } from './trimitecer-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, TrimiteCerPageRoutingModule, SharedModule],
  declarations: [TrimiteCerPage],
})
export class TrimiteCerPageModule {}
