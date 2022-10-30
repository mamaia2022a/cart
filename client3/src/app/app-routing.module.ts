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
    path: 'aut/logout',
    loadChildren: () => import('./pages/aut/logout/logout.module').then((m) => m.LogoutPageModule),
  },
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
  {
    path: 'aut/actiunesubactiuni',
    loadChildren: () => import('./pages/aut/actiunesubactiuni/actiunesubactiuni.module').then((m) => m.ActiuneSubactiuniPageModule),
  },
  //-----------------------------
  //  Creare Grup
  //-----------------------------
  {
    path: 'commongrupact/crearegrup/memactexpnfl',
    loadChildren: () => import('./pages/commongrupact/crearegrup/memactexpnfl/memactexpnfl.module').then((m) => m.MemActExpNflPageModule),
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
  //  Afiliere Grup
  //-----------------------------
  {
    path: 'commongrupact/afilmemgrp/memincactexpnfl',
    loadChildren: () => import('./pages/commongrupact/afilmemgrp/memincactexpnfl/memincactexpnfl.module').then((m) => m.MemIncActExpNflPageModule),
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
  
  //-----------------------------
  //  Membru Incepator Neafiliat
  //-----------------------------
  {
    path: 'memincnfl/cereremem/actntricer',
    loadChildren: () => import('./pages/memincnfl/cereremem/actntricer/actntricer.module').then((m) => m.ActNTriCerPageModule),
  },
  //-----------------------------
  //  Membru Incepator Afiliat
  //-----------------------------
  {
    path: 'memincafl/cereremem/actatricer',
    loadChildren: () => import('./pages/memincafl/cereremem/actatricer/actatricer.module').then((m) => m.ActATriCerPageModule),
  },


  //-----------------------------
  //  Membru Activ Neafiliat
  //-----------------------------
  {
    path: 'memactnfl/cereremem/expntricer',
    loadChildren: () => import('./pages/memactnfl/cereremem/expntricer/expntricer.module').then((m) => m.ExpNTriCerPageModule),
  },
  //-----------------------------
  //  Membru Activ Afiliat
  //-----------------------------
  {
    path: 'memactafl/cereremem/expatricer',
    loadChildren: () => import('./pages/memactafl/cereremem/expatricer/expatricer.module').then((m) => m.ExpATriCerPageModule),
  },


  //-----------------------------
  //  Membri Afiliati (Incepatori, Activi sau Experimentati)
  //-----------------------------
  {
    path: 'memafl/vizgrupmem/vizgrup',
    loadChildren: () => import('./pages/memafl/vizgrupmem/vizgrup/vizgrup.module').then((m) => m.VizGrupPageModule),
  },


  //-----------------------------
  //  Sef Grup
  //-----------------------------
  {
    path: 'sefgrup/gestgrup/vizualizgrup',
    loadChildren: () => import('./pages/sefgrup/gestgrup/vizualizgrup/vizualizgrup.module').then((m) => m.VizualizGrupPageModule),
  },
  {
    path: 'sefgrup/gestgrup/pendingmem',
    loadChildren: () => import('./pages/sefgrup/gestgrup/pendingmem/pendingmem.module').then((m) => m.PendingMemPageModule),
  },
  {
    path: 'sefgrup/gestgrup/vizualizmem',
    loadChildren: () => import('./pages/sefgrup/gestgrup/vizualizmem/vizualizmem.module').then((m) => m.VizualizMemPageModule),
  },
  {
    path: 'sefgrup/gestgrup/excluderemem',
    loadChildren: () => import('./pages/sefgrup/gestgrup/excluderemem/excluderemem.module').then((m) => m.ExcludereMemPageModule),
  },
  {
    path: 'sefgrup/gestgrup/vizpendmem',
    loadChildren: () => import('./pages/sefgrup/gestgrup/vizpendmem/vizpendmem.module').then((m) => m.VizPendMemPageModule),
  },
  {
    path: 'sefgrup/gestgrup/accpendmem',
    loadChildren: () => import('./pages/sefgrup/gestgrup/accpendmem/accpendmem.module').then((m) => m.AccPendMemPageModule),
  },

  //-----------------------------
  //  Location
  //-----------------------------
  {
    path: 'loc/gestpos/getlatlong',
    loadChildren: () => import('./pages/loc/gestpos/getlatlong/getlatlong.module').then((m) => m.GetLatLongPageModule),
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
