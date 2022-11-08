import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PlataOnlinePage } from './plataonline.page';

const routes: Routes = [
  {
    path: '',
    component: PlataOnlinePage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PlataOnlinePageRoutingModule {}
