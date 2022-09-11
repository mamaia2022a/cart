import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../../shared/shared.module';
import { GrupActActiuniPage } from './grupactactiuni.page';
import { GrupActActiuniPageRoutingModule } from './grupactactiuni-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, GrupActActiuniPageRoutingModule, SharedModule],
  declarations: [GrupActActiuniPage],
})
export class GrupActActiuniPageModule {}
