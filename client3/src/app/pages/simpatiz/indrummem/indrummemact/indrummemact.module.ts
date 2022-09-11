import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { IndrumMemActPage } from './indrummemact.page';
import { IndrumMemActPageRoutingModule } from './indrummemact-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, IndrumMemActPageRoutingModule, SharedModule],
  declarations: [IndrumMemActPage],
})
export class IndrumMemActPageModule {}
