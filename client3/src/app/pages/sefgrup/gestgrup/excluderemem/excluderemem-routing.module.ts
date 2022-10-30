import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ExcludereMemPage } from './excluderemem.page';

const routes: Routes = [
  {
    path: '',
    component: ExcludereMemPage,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ExcludereMemPageRoutingModule {}
