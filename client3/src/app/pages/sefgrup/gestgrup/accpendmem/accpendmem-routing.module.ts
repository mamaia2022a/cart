import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccPendMemPage } from './accpendmem.page';

const routes: Routes = [
  {
    path: '',
    component: AccPendMemPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AccPendMemPageRoutingModule {}
