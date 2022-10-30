!function(){function e(e,t,n,r,i,a,o){try{var s=e[a](o),u=s.value}catch(c){return void n(c)}s.done?t(u):Promise.resolve(u).then(r,i)}function t(t){return function(){var n=this,r=arguments;return new Promise(function(i,a){var o=t.apply(n,r);function s(t){e(o,i,a,s,u,"next",t)}function u(t){e(o,i,a,s,u,"throw",t)}s(void 0)})}}function n(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function r(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}function i(e,t,n){return t&&r(e.prototype,t),n&&r(e,n),e}(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[7802],{77802:function(e,r,a){"use strict";a.r(r),a.d(r,{ion_tab:function(){return u},ion_tabs:function(){return c}});var o=a(23150),s=a(77330),u=function(){function e(t){n(this,e),(0,o.r)(this,t),this.loaded=!1,this.active=!1}var r,a;return i(e,[{key:"componentWillLoad",value:(a=t(regeneratorRuntime.mark(function e(){return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:if(e.t0=this.active,!e.t0){e.next=4;break}return e.next=4,this.setActive();case 4:case"end":return e.stop()}},e,this)})),function(){return a.apply(this,arguments)})},{key:"setActive",value:(r=t(regeneratorRuntime.mark(function e(){return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,this.prepareLazyLoaded();case 2:this.active=!0;case 3:case"end":return e.stop()}},e,this)})),function(){return r.apply(this,arguments)})},{key:"changeActive",value:function(e){e&&this.prepareLazyLoaded()}},{key:"prepareLazyLoaded",value:function(){if(!this.loaded&&null!=this.component){this.loaded=!0;try{return(0,s.a)(this.delegate,this.el,this.component,["ion-page"])}catch(e){console.error(e)}}return Promise.resolve(void 0)}},{key:"render",value:function(){var e=this.tab,t=this.active,n=this.component;return(0,o.h)(o.H,{role:"tabpanel","aria-hidden":t?null:"true","aria-labelledby":"tab-button-".concat(e),class:{"ion-page":void 0===n,"tab-hidden":!t}},(0,o.h)("slot",null))}},{key:"el",get:function(){return(0,o.i)(this)}}],[{key:"watchers",get:function(){return{active:["changeActive"]}}}]),e}();u.style=":host(.tab-hidden){display:none !important}";var c=function(){function e(t){var r=this;n(this,e),(0,o.r)(this,t),this.ionNavWillLoad=(0,o.e)(this,"ionNavWillLoad",7),this.ionTabsWillChange=(0,o.e)(this,"ionTabsWillChange",3),this.ionTabsDidChange=(0,o.e)(this,"ionTabsDidChange",3),this.transitioning=!1,this.useRouter=!1,this.onTabClicked=function(e){var t=e.detail,n=t.href,i=t.tab;if(r.useRouter&&void 0!==n){var a=document.querySelector("ion-router");a&&a.push(n)}else r.select(i)}}var r,a,s,u,c;return i(e,[{key:"componentWillLoad",value:(c=t(regeneratorRuntime.mark(function e(){var t;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:if(this.useRouter||(this.useRouter=!!document.querySelector("ion-router")&&!this.el.closest("[no-router]")),this.useRouter){e.next=6;break}if(t=this.tabs,e.t0=t.length>0,!e.t0){e.next=6;break}return e.next=6,this.select(t[0]);case 6:this.ionNavWillLoad.emit();case 7:case"end":return e.stop()}},e,this)})),function(){return c.apply(this,arguments)})},{key:"componentWillRender",value:function(){var e=this.el.querySelector("ion-tab-bar");if(e){var t=this.selectedTab?this.selectedTab.tab:void 0;e.selectedTab=t}}},{key:"select",value:(u=t(regeneratorRuntime.mark(function e(t){var n;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:if(n=l(this.tabs,t),e.t0=!!this.shouldSwitch(n),!e.t0){e.next=9;break}return e.next=5,this.setActive(n);case 5:return e.next=7,this.notifyRouter();case 7:this.tabSwitch(),e.t0=!0;case 9:return e.abrupt("return",e.t0);case 10:case"end":return e.stop()}},e,this)})),function(e){return u.apply(this,arguments)})},{key:"getTab",value:(s=t(regeneratorRuntime.mark(function e(t){return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return e.abrupt("return",l(this.tabs,t));case 1:case"end":return e.stop()}},e,this)})),function(e){return s.apply(this,arguments)})},{key:"getSelected",value:function(){return Promise.resolve(this.selectedTab?this.selectedTab.tab:void 0)}},{key:"setRouteId",value:(a=t(regeneratorRuntime.mark(function e(t){var n,r=this;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:if(n=l(this.tabs,t),!this.shouldSwitch(n)){e.next=7;break}return e.next=4,this.setActive(n);case 4:e.t0={changed:!0,element:this.selectedTab,markVisible:function(){return r.tabSwitch()}},e.next=8;break;case 7:e.t0={changed:!1,element:this.selectedTab};case 8:return e.abrupt("return",e.t0);case 9:case"end":return e.stop()}},e,this)})),function(e){return a.apply(this,arguments)})},{key:"getRouteId",value:(r=t(regeneratorRuntime.mark(function e(){var t;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return t=this.selectedTab&&this.selectedTab.tab,e.abrupt("return",void 0!==t?{id:t,element:this.selectedTab}:void 0);case 2:case"end":return e.stop()}},e,this)})),function(){return r.apply(this,arguments)})},{key:"setActive",value:function(e){return this.transitioning?Promise.reject("transitioning already happening"):(this.transitioning=!0,this.leavingTab=this.selectedTab,this.selectedTab=e,this.ionTabsWillChange.emit({tab:e.tab}),e.active=!0,Promise.resolve())}},{key:"tabSwitch",value:function(){var e=this.selectedTab,t=this.leavingTab;this.leavingTab=void 0,this.transitioning=!1,e&&t!==e&&(t&&(t.active=!1),this.ionTabsDidChange.emit({tab:e.tab}))}},{key:"notifyRouter",value:function(){if(this.useRouter){var e=document.querySelector("ion-router");if(e)return e.navChanged("forward")}return Promise.resolve(!1)}},{key:"shouldSwitch",value:function(e){var t=this.selectedTab;return void 0!==e&&e!==t&&!this.transitioning}},{key:"tabs",get:function(){return Array.from(this.el.querySelectorAll("ion-tab"))}},{key:"render",value:function(){return(0,o.h)(o.H,{onIonTabButtonClick:this.onTabClicked},(0,o.h)("slot",{name:"top"}),(0,o.h)("div",{class:"tabs-inner"},(0,o.h)("slot",null)),(0,o.h)("slot",{name:"bottom"}))}},{key:"el",get:function(){return(0,o.i)(this)}}]),e}(),l=function(e,t){var n="string"==typeof t?e.find(function(e){return e.tab===t}):t;return n||console.error('tab with id: "'.concat(n,'" does not exist')),n};c.style=":host{left:0;right:0;top:0;bottom:0;display:-ms-flexbox;display:flex;position:absolute;-ms-flex-direction:column;flex-direction:column;width:100%;height:100%;contain:layout size style;z-index:0}.tabs-inner{position:relative;-ms-flex:1;flex:1;contain:layout size style}"}}])}();
//# sourceMappingURL=7802-es5.js.map