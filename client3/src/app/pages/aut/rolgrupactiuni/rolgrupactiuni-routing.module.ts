import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RolGrupActiuniPage } from './rolgrupactiuni.page';

const routes: Routes = [
  {
    path: '',
    component: RolGrupActiuniPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class RolGrupActiuniPageRoutingModule {}
