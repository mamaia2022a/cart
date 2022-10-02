import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ExpATriCerPage } from './expatricer.page';

const routes: Routes = [
  {
    path: '',
    component: ExpATriCerPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ExpATriCerPageRoutingModule {}
