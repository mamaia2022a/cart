import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ExpNTriCerPage } from './expntricer.page';

const routes: Routes = [
  {
    path: '',
    component: ExpNTriCerPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ExpNTriCerPageRoutingModule {}
