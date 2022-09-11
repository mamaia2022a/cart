import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { CompletCNPPage } from './completcnp.page';
import { CompletCNPPageRoutingModule } from './completcnp-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, CompletCNPPageRoutingModule, SharedModule],
  declarations: [CompletCNPPage],
})
export class CompletCNPPageModule {}
