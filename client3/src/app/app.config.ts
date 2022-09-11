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
