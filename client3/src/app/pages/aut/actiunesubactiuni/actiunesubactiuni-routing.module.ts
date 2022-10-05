import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ActiuneSubactiuniPage } from './actiunesubactiuni.page';

const routes: Routes = [
  {
    path: '',
    component: ActiuneSubactiuniPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ActiuneSubactiuniPageRoutingModule {}
