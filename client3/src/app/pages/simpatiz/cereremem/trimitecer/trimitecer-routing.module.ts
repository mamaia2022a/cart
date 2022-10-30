import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TrimiteCerPage } from './trimitecer.page';

const routes: Routes = [
  {
    path: '',
    component: TrimiteCerPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class TrimiteCerPageRoutingModule {}
