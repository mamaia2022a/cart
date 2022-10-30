import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VizPendMemPage } from './vizpendmem.page';

const routes: Routes = [
  {
    path: '',
    component: VizPendMemPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class VizPendMemPageRoutingModule {}
