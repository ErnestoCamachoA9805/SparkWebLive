(this.webpackJsonpfront=this.webpackJsonpfront||[]).push([[0],{196:function(e,t,n){"use strict";n.r(t);var a=n(0),c=n.n(a),o=n(14),l=n.n(o),s=(n(72),n(12)),r=(n(73),n(66)),u=n(3),i=[{value:"day",label:"Daily values"},{value:"intraDay",label:"Intraday values"},{value:"week",label:"Weekly values"},{value:"month",label:"Monthly values"}];function b(e){var t=e.option,n=e.setOption;return Object(u.jsx)(r.a,{options:i,onChange:function(e){n(e)},value:t})}var j=n(1),h=n(2),f=function(){function e(){Object(j.a)(this,e)}return Object(h.a)(e,null,[{key:"lookup",value:function(e,t,n){fetch("https://sparkliveone.herokuapp.com/facade?function=".concat(e,"&empresa=").concat(t)).then((function(e){return e.json()})).then((function(e){return n(e)}))}}]),e}(),d=n(67);function p(e){return Object(u.jsxs)("div",{children:[Object(u.jsx)("div",{className:"header",children:Object(u.jsx)("h1",{className:"title",children:"Line Chart"})}),Object(u.jsx)(d.a,{data:e.data})]})}var O=function(){var e=Object(a.useState)(null),t=Object(s.a)(e,2),n=t[0],c=t[1],o=Object(a.useState)(null),l=Object(s.a)(o,2),r=l[0],i=l[1],j=function(e){console.log(e);var t=e[Object.keys(e)[0]],n={"1. open":"rgb(100,30,22","2. high":"rgb(21,67,96","3. low":"rgb(11,83,69","4. close":"rgb(123,125,125"},a=Object.keys(t).sort(),c=[];["1. open","2. high","3. low","4. close"].forEach((function(e){var o=[];a.forEach((function(n){o.push(t[n][e])})),c.push({label:e,data:o,fill:!1,backgroundColor:"".concat(n[e],")"),borderColor:"".concat(n[e],",0.5)")})})),console.log("dataSet"),console.log(c),i({labels:a,datasets:c})};return Object(u.jsxs)("div",{children:[Object(u.jsxs)("form",{onSubmit:function(e){e.preventDefault(),f.lookup(n.value,e.target.elements[1].value,j)},children:["function:",Object(u.jsx)("br",{}),Object(u.jsx)(b,{option:n,setOption:c}),"empresa:",Object(u.jsx)("br",{}),Object(u.jsx)("input",{type:"text",name:"empresa",defaultValue:"fb"})," ",Object(u.jsx)("br",{}),Object(u.jsx)("br",{}),Object(u.jsx)("input",{type:"submit",value:"Submit"})]}),Object(u.jsx)("div",{children:r?Object(u.jsx)(p,{data:r}):null})]})};l.a.render(Object(u.jsx)(c.a.StrictMode,{children:Object(u.jsx)(O,{})}),document.getElementById("root"))},72:function(e,t,n){},73:function(e,t,n){}},[[196,1,2]]]);
//# sourceMappingURL=main.4f74cdb1.chunk.js.map