import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../../shared/shared.module';
import { RolGrupActiuniPage } from './rolgrupactiuni.page';
import { RolGrupActiuniPageRoutingModule } from './rolgrupactiuni-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, RolGrupActiuniPageRoutingModule, SharedModule],
  declarations: [RolGrupActiuniPage],
})
export class RolGrupActiuniPageModule {}
