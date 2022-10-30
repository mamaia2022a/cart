import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GetLatLongPage } from './getlatlong.page';

const routes: Routes = [
  {
    path: '',
    component: GetLatLongPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class GetLatLongPageRoutingModule {}
