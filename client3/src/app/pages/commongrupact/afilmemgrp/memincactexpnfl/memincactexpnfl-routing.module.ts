import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MemIncActExpNflPage } from './memincactexpnfl.page';

const routes: Routes = [
  {
    path: '',
    component: MemIncActExpNflPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class MemIncActExpNflPageRoutingModule {}
