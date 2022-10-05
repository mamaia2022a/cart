import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../../shared/shared.module';
import { ActiuneSubactiuniPage } from './actiunesubactiuni.page';
import { ActiuneSubactiuniPageRoutingModule } from './actiunesubactiuni-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, ActiuneSubactiuniPageRoutingModule, SharedModule],
  declarations: [ActiuneSubactiuniPage],
})
export class ActiuneSubactiuniPageModule {}
