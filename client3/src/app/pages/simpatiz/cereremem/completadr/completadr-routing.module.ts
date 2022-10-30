import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompletAdrPage } from './completadr.page';

const routes: Routes = [
  {
    path: '',
    component: CompletAdrPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CompletAdrPageRoutingModule {}
