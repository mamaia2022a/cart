import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PendingMemPage } from './pendingmem.page';

const routes: Routes = [
  {
    path: '',
    component: PendingMemPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PendingMemPageRoutingModule {}
