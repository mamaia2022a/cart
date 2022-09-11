import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListActVPage } from './listactv.page';

const routes: Routes = [
  {
    path: '',
    component: ListActVPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ListActVPageRoutingModule {}
