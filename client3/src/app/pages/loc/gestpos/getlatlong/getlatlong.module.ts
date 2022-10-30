import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { GetLatLongPage } from './getlatlong.page';
import { GetLatLongPageRoutingModule } from './getlatlong-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, GetLatLongPageRoutingModule, SharedModule],
  declarations: [GetLatLongPage],
})
export class GetLatLongPageModule {}
