import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompletCNPPage } from './completcnp.page';

const routes: Routes = [
  {
    path: '',
    component: CompletCNPPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CompletCNPPageRoutingModule {}
