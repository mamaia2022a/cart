import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { ExcludereMemPage } from './excluderemem.page';
import { ExcludereMemPageRoutingModule } from './excluderemem-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, ExcludereMemPageRoutingModule, SharedModule],
  declarations: [ExcludereMemPage],
})
export class ExcludereMemPageModule {}
