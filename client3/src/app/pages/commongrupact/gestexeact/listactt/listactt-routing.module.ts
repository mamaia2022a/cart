import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListActTPage } from './listactt.page';

const routes: Routes = [
  {
    path: '',
    component: ListActTPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ListActTPageRoutingModule {}
