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
      grupactactiuni: 'aut/grupactactiuni'
    },
    commongrupact : {
      gestexeact : {
        listactc : "commongrupact/gestexeact/listactc",
        listactv : "commongrupact/gestexeact/listactv",
        listactt : "commongrupact/gestexeact/listactt",
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
        completadr : "simpatiz/cereremem/completadr",
        completcnp : "simpatiz/cereremem/completcnp",
        dovadacot  : "simpatiz/cereremem/dovadacot",
        trimitecer : "simpatiz/cereremem/trimitecer",
      },      
    },

    memincnfl: {
      cereremem: {
        actntricer : "memincnfl/cereremem/actntricer",
      },      
    },
    memincafl: {
      cereremem: {
        actatricer : "memincnfl/cereremem/actatricer",
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
