import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DovadaCotPage } from './dovadacot.page';

const routes: Routes = [
  {
    path: '',
    component: DovadaCotPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DovadaCotPageRoutingModule {}
