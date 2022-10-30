import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ActNTriCerPage } from './actntricer.page';

const routes: Routes = [
  {
    path: '',
    component: ActNTriCerPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ActNTriCerPageRoutingModule {}
