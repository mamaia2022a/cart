import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { appConfig } from './app.config';
import { AuthGuardAfterLoginService } from './core/auth-guard/auth-guard.service';

const routes: Routes = [
  /** 
  {
    path: '',
    redirectTo: appConfig.routes.tabs.root,
    pathMatch: 'full',
  },
  */
  {
    path: '',
    redirectTo: 'auth',
    pathMatch: 'full',
  },

  /** 
  {
    path: appConfig.routes.tabs.root,
    loadChildren: () => import('./tabs/tabs.module').then((m) => m.TabsPageModule),
    canActivate: [AuthGuardAfterLoginService],
  },*/

  /* Auth routes */
  {
    path: 'auth',
    loadChildren: () => import('./pages/auth/auth.module').then((m) => m.AuthPageModule),
  },

  /** 
  {
    path: 'userroles/main',
    loadChildren: () => import('./pages/userroles/main/userroles.module').then((m) => m.UserRolesPageModule),
  },  
  */
  {
    path: 'aut/userroluri',
    loadChildren: () => import('./pages/aut/userroluri/userroluri.module').then((m) => m.UserRoluriPageModule),
  },
  {
    path: 'aut/rolgrupactiuni',
    loadChildren: () => import('./pages/aut/rolgrupactiuni/rolgrupactiuni.module').then((m) => m.RolGrupActiuniPageModule),
  },  
  {
    path: 'aut/grupactactiuni',
    loadChildren: () => import('./pages/aut/grupactactiuni/grupactactiuni.module').then((m) => m.GrupActActiuniPageModule),
  },

  //-----------------------------
  //  Gestiune Executie Activitati
  //-----------------------------
  {
    path: 'commongrupact/gestexeact/listactc',
    loadChildren: () => import('./pages/commongrupact/gestexeact/listactc/listactc.module').then((m) => m.ListActCPageModule),
  },
  {
    path: 'commongrupact/gestexeact/listactv',
    loadChildren: () => import('./pages/commongrupact/gestexeact/listactv/listactv.module').then((m) => m.ListActVPageModule),
  },
  {
    path: 'commongrupact/gestexeact/listactt',
    loadChildren: () => import('./pages/commongrupact/gestexeact/listactt/listactt.module').then((m) => m.ListActTPageModule),
  },


  //-----------------------------
  //  Simpatizant in Asteptare
  //-----------------------------
  {
    path: 'simpatpend/confirmsim/confirmsimact',
    loadChildren: () => import('./pages/simpatpend/confirmsim/confirmsimact/confirmsimact.module').then((m) => m.ConfirmSimActPageModule),
  },


  //-----------------------------
  //  Simpatizant 
  //-----------------------------
  {
    path: 'simpatiz/indrummem/indrummemact',
    loadChildren: () => import('./pages/simpatiz/indrummem/indrummemact/indrummemact.module').then((m) => m.IndrumMemActPageModule),
  },

  {
    path: 'simpatiz/cereremem/completadr',
    loadChildren: () => import('./pages/simpatiz/cereremem/completadr/completadr.module').then((m) => m.CompletAdrPageModule),
  },
  {
    path: 'simpatiz/cereremem/completcnp',
    loadChildren: () => import('./pages/simpatiz/cereremem/completcnp/completcnp.module').then((m) => m.CompletCNPPageModule),
  },
  {
    path: 'simpatiz/cereremem/dovadacot',
    loadChildren: () => import('./pages/simpatiz/cereremem/dovadacot/dovadacot.module').then((m) => m.DovadaCotPageModule),
  },
  {
    path: 'simpatiz/cereremem/trimitecer',
    loadChildren: () => import('./pages/simpatiz/cereremem/trimitecer/trimitecer.module').then((m) => m.TrimiteCerPageModule),
  },
  
  /* Other routes */
  /** 
  {
    path: 'message-detail/:messageId',
    loadChildren: () => import('./pages/message-detail/message-detail.module').then((m) => m.MessageDetailPageModule),
    canActivate: [AuthGuardAfterLoginService],
  },*/

  /* Redirect routes */
  {
    path: 'error',
    redirectTo: appConfig.routes.redirectOnError,
  },
  {
    path: '**',
    redirectTo: appConfig.routes.redirectOnNotFound,
  },
];
@NgModule({
  imports: [RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })],
  exports: [RouterModule],
})
export class AppRoutingModule {}
