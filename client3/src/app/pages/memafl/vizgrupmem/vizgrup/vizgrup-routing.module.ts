import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VizGrupPage } from './vizgrup.page';

const routes: Routes = [
  {
    path: '',
    component: VizGrupPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class VizGrupPageRoutingModule {}
