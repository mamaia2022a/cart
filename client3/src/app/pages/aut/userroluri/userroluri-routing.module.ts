import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserRoluriPage } from './userroluri.page';

const routes: Routes = [
  {
    path: '',
    component: UserRoluriPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class UserRoluriPageRoutingModule {}
