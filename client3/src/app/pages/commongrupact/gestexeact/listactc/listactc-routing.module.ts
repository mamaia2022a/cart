import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListActCPage } from './listactc.page';

const routes: Routes = [
  {
    path: '',
    component: ListActCPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ListActCPageRoutingModule {}
