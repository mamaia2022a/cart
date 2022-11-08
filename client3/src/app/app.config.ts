export const appConfig = {
  /* App languages */
  langs: {
    default: 'en',
    en: 'en',
  },

  /* App routes */
  routes: {
    tabs: {
      root: 'tabs',
      tab1: 'tab1',
    },
    userroles: {
      main: 'userroles/main',
    },
    aut: {
      logout: 'aut/logout',
      userroluri: 'aut/userroluri',
      rolgrupactiuni: 'aut/rolgrupactiuni',
      grupactactiuni: 'aut/grupactactiuni',
      actiunesubactiuni: 'aut/actiunesubactiuni'
    },
    commongrupact : {
      gestexeact : {
        listactc : "commongrupact/gestexeact/listactc",
        listactv : "commongrupact/gestexeact/listactv",
        listactt : "commongrupact/gestexeact/listactt",
      },
      crearegrup : {
        memactexpnfl : "commongrupact/crearegrup/memactexpnfl",
      },
      afilmemgrp : {
        memincactexpnfl : "commongrupact/afilmemgrp/memincactexpnfl",
      }
    },
    simpatpend : {
      confirmsim : {
        confirmsimact : "simpatpend/confirmsim/confirmsimact"
      }
    },
    simpatiz: {
      indrummem: {
        imdrummemact : "simpatiz/indrummem/indrummemact"
      },
      cereremem: {
        completadr   : "simpatiz/cereremem/completadr",
        completcnp   : "simpatiz/cereremem/completcnp",
        dovadacot    : "simpatiz/cereremem/dovadacot",
        trimitecer   : "simpatiz/cereremem/trimitecer",
        plataonline  : "simpatiz/cereremem/plataonline",

      },      
    },

    memincnfl: {
      cereremem: {
        actntricer : "memincnfl/cereremem/actntricer",
      },      
    },
    memincafl: {
      cereremem: {
        actatricer : "memincafl/cereremem/actatricer",
      },      
    },
    memactnfl: {
      cereremem: {
        expntricer : "memactnfl/cereremem/expntricer",
      },      
    },
    memactafl: {
      cereremem: {
        expatricer : "memactafl/cereremem/expatricer",
      },      
    },
    sefgrup: {
      gestgrup: {
        vizualizgrup : "sefgrup/gestgrup/vizualizgrup",
        pendingmem   : "sefgrup/gestgrup/pendingmem",
        vizualizmem  : "sefgrup/gestgrup/vizualizmem",
        excluderemem : "sefgrup/gestgrup/excluderemem",
        vizpendmem   : "sefgrup/gestgrup/vizpendmem",
        accpendmem   : "sefgrup/gestgrup/accpendmem",
      },      
    },
    memafl: {
      vizgrupmem: {
        vizgrup      : "memafl/vizgrupmem/vizgrup",
      },      
    },
    loc: {
      gestpos: {
        getlatlong : "loc/gestpos/getlatlong",
      },      
    },    
    auth: {
      login: 'auth/login',
      register: 'auth/register',
      forgot: 'auth/forgot',
      reset: 'auth/reset',
    },
    redirectOnError: 'tabs',
    redirectOnNotFound: 'tabs',
  },
};
