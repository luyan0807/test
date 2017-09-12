/**
 * 
 */
var key2code = {65:"a",66:"b",67:"c",68:"d",69:"e",70:"f",71:"g",72:"h",73:"i",74:"j", 
75:"k",76:"l",77:"m",78:"n",79:"o",80:"p",81:"q",82:"r",83:"s",84:"t", 
85:"u",86:"v",87:"w",88:"x",89:"y",90:"z",49:"1",50:"2",51:"3",52:"4", 
53:"5",54:"6",55:"7",56:"8",57:"9",48:"0" }; 
var inp = ""; 
function showOptions(obj){ 
if(event.keyCode==32){ 
inp =""; 
return; 
} 
var tmp = inp; 
tmp += key2code[event.keyCode]?key2code[event.keyCode]:""; 
var someNodeList = obj.getElementsByTagName('option'); 
var index = -1; 
for(var i=0;i<someNodeList.length;i++){ 
var sm = toPinyinShengmu(someNodeList[i].innerHTML); 
if(sm.indexOf(tmp)==0){ 
index = i; 
break; 
} 
} 
if(index>=0){ 
obj.selectedIndex = index; 
inp = tmp; 
} 
} 
function showOptions2(obj){ 
if(event.keyCode==32){ 
inp =""; 
return; 
} 
var tmp = inp; 
tmp += key2code[event.keyCode]?key2code[event.keyCode]:""; 
var someNodeList = obj.getElementsByTagName('option'); 
var index = -1; 
var choose = []; 
for(var i=someNodeList.length-1;i>0;i--){ 
var sm = toPinyinShengmu(someNodeList[i].innerHTML); 
if(sm.indexOf(tmp)==0){ 
inp = tmp; 
choose[choose.length] = someNodeList[i]; 
obj.removeChild(someNodeList[i]); 
} 
} 
if(choose.length>0){ 
someNodeList = obj.getElementsByTagName('option'); 
var len = someNodeList.length; 
for(var i=0;i<len;i++){ 
choose[choose.length] = someNodeList[i]; 
} 
for(var i=0;i<choose.length;i++){ 
obj.appendChild(choose[i]); 
} 
obj.selectedIndex = 0; 
} 
someNodeList = null; 
choose = null; 
} 
	