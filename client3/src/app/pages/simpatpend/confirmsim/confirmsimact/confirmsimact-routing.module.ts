import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ConfirmSimActPage } from './confirmsimact.page';

const routes: Routes = [
  {
    path: '',
    component: ConfirmSimActPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ConfirmSimActPageRoutingModule {}
