(self.webpackChunkcart2=self.webpackChunkcart2||[]).push([[1296],{81296:function(e,t,n){"use strict";n.r(t),n.d(t,{KEYBOARD_DID_CLOSE:function(){return r},KEYBOARD_DID_OPEN:function(){return i},copyVisualViewport:function(){return D},keyboardDidClose:function(){return g},keyboardDidOpen:function(){return p},keyboardDidResize:function(){return b},resetKeyboardAssist:function(){return u},setKeyboardClose:function(){return f},setKeyboardOpen:function(){return h},startKeyboardAssist:function(){return d},trackViewportChanges:function(){return y}});const i="ionKeyboardDidShow",r="ionKeyboardDidHide";let o={},s={},a=!1;const u=()=>{o={},s={},a=!1},d=e=>{c(e),e.visualViewport&&(s=D(e.visualViewport),e.visualViewport.onresize=()=>{y(e),p()||b(e)?h(e):g(e)&&f(e)})},c=e=>{e.addEventListener("keyboardDidShow",t=>h(e,t)),e.addEventListener("keyboardDidHide",()=>f(e))},h=(e,t)=>{w(e,t),a=!0},f=e=>{l(e),a=!1},p=()=>{const e=(o.height-s.height)*s.scale;return!a&&o.width===s.width&&e>150},b=e=>a&&!g(e),g=e=>a&&s.height===e.innerHeight,w=(e,t)=>{const n=t?t.keyboardHeight:e.innerHeight-s.height,r=new CustomEvent(i,{detail:{keyboardHeight:n}});e.dispatchEvent(r)},l=e=>{const t=new CustomEvent(r);e.dispatchEvent(t)},y=e=>{o=Object.assign({},s),s=D(e.visualViewport)},D=e=>({width:Math.round(e.width),height:Math.round(e.height),offsetTop:e.offsetTop,offsetLeft:e.offsetLeft,pageTop:e.pageTop,pageLeft:e.pageLeft,scale:e.scale})}}]);
//# sourceMappingURL=1296-es2015.js.map