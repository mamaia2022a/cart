import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ActATriCerPage } from './actatricer.page';

const routes: Routes = [
  {
    path: '',
    component: ActATriCerPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ActATriCerPageRoutingModule {}
