import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { PlataOnlinePage } from './plataonline.page';
import { PlataOnlinePageRoutingModule } from './plataonline-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, PlataOnlinePageRoutingModule, SharedModule],
  declarations: [PlataOnlinePage],
})
export class PlataOnlinePageModule {}
