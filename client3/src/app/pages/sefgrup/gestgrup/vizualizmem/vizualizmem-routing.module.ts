import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VizualizMemPage } from './vizualizmem.page';

const routes: Routes = [
  {
    path: '',
    component: VizualizMemPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class VizualizMemPageRoutingModule {}
