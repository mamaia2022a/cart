import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VizualizGrupPage } from './vizualizgrup.page';

const routes: Routes = [
  {
    path: '',
    component: VizualizGrupPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class VizualizGrupPageRoutingModule {}
