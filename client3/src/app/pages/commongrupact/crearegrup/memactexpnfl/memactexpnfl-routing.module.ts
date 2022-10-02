import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MemActExpNflPage } from './memactexpnfl.page';

const routes: Routes = [
  {
    path: '',
    component: MemActExpNflPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class MemActExpNflPageRoutingModule {}
