import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { IndrumMemActPage } from './indrummemact.page';

const routes: Routes = [
  {
    path: '',
    component: IndrumMemActPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class IndrumMemActPageRoutingModule {}
