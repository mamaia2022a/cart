import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';
import { SharedModule } from '../../.././../shared/shared.module';
import { CompletAdrPage } from './completadr.page';
import { CompletAdrPageRoutingModule } from './completadr-routing.module';

@NgModule({
  imports: [CommonModule, FormsModule, IonicModule, CompletAdrPageRoutingModule, SharedModule],
  declarations: [CompletAdrPage],
})
export class CompletAdrPageModule {}
