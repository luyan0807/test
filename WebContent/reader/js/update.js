
function nameblur()
  {
  var getuser=document.getElementById('name');
  var getdiv1=document.getElementById('tdname');
  var  str =/^[\u4e00-\u9fa5]{0,}$/; 
   if(getuser.value=='')
     getdiv1.innerHTML='';
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML='';
	}
	 else  
	 getdiv1.innerHTML='用户名格式不正确，请写中文';
	getuser.style.background="#FFF";
	
}


function usernameblur()
  {
  var getuser=document.getElementById('username');
  var getdiv1=document.getElementById('tdusername');
  var  str =/^[\u4e00-\u9fa5]{0,}$/; 
   if(getuser.value=='')
     getdiv1.innerHTML='';
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML='';
	}
	 else  
	 getdiv1.innerHTML='姓名格式不正确，请写中文';
	getuser.style.background="#FFF";
	
}


function xueliblur()
  {
  var getuser=document.getElementById('xueli');
  var getdiv1=document.getElementById('tdxueli');
  var  str =/^[\u4e00-\u9fa5]{0,}$/; 
   if(getuser.value=='')
     getdiv1.innerHTML='';
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML='';
	}
	 else  
	 getdiv1.innerHTML='学历格式不正确，请写中文';
	getuser.style.background="#FFF";
	
}

function workblur()
  {
  var getuser=document.getElementById('work');
  var getdiv1=document.getElementById('tdwork');
  var  str =/^[\u4e00-\u9fa5]{0,}$/; 
   if(getuser.value=='')
     getdiv1.innerHTML='';
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML='';
	}
	 else  
	 getdiv1.innerHTML='职位格式不正确，请写中文';
	getuser.style.background="#FFF";
	
}

function companyblur()
  {
  var getuser=document.getElementById('company');
  var getdiv1=document.getElementById('tdcompany');
  var  str =/^[\u4e00-\u9fa5]{0,}$/; 
   if(getuser.value=='')
     getdiv1.innerHTML='';
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML='';
	}
	 else  
	 getdiv1.innerHTML='工作单位格式不正确，请写中文';
	getuser.style.background="#FFF";
	
}


function birthdayblur()
  {
  var getuser=document.getElementById('birthday');
  var getdiv1=document.getElementById('tdbirthday');
 var str= /^(19|20)\d{2}-(1[0-2]|0?[1-9])-(0?[1-9]|[1-2][0-9]|3[0-1])$/; 
   if(getuser.value=='')
     getdiv1.innerHTML='';
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML='';
	}
	 else  
	 getdiv1.innerHTML='出生日期格式不正确，如：2010-02-05';
	getuser.style.background="#FFF";
	
}

function postalcodeblur()
  {
  var getuser=document.getElementById('postalcode');
  var getdiv1=document.getElementById('tdpostalcode');
 var str=/^[1-9]\d{5}(?!\d)$/; 
   if(getuser.value=='')
     getdiv1.innerHTML='';
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML='';
	}
	 else  
	 getdiv1.innerHTML='邮政编码格式不正确，如：342400';
	getuser.style.background="#FFF";
	
}

function phoneblur(){
 var getphone=document.getElementById('phone');
  var gettdphone=document.getElementById('tdphone');
  var  str =/^[1][0-9]{10}$/; 
   if(getphone.value=='')
     gettdphone.innerHTML='';
	 else if(str.test(getphone.value))
	{
		gettdphone.innerHTML='';
	}
	 else  
	 gettdphone.innerHTML='电话格式不正确，如：18296134271';
	getphone.style.background="#FFF";
}
//用正则表达式验邮箱的输入
function emailblur(){
 var getemail=document.getElementById('email');
  var gettdemail=document.getElementById('tdemail');
  var  str =/\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/; 
   if(getemail.value=='')
     gettdemail.innerHTML='';
	 else if(str.test(getemail.value))
	{
		gettdemail.innerHTML='';
	}
	 else  
	 gettdemail.innerHTML='邮箱格式不正确，如：1910975064@qq.com';
	getemail.style.background="#FFF";
}


function addrblur(){
 var getaddr=document.getElementById('addr');
  var gettdaddr=document.getElementById('tdaddr');
  var  str =/^\S/; 
   if(getaddr.value=='')
     gettdaddr.innerHTML='';
	 else if(str.test(getaddr.value))
	{
		gettdaddr.innerHTML='';
	}
	 else  
	 gettdaddr.innerHTML='地址格式不正确';
	getaddr.style.background="#FFF";
}




function oldpwdblur()
  {
  var getuser=document.getElementById('oldpwd');
  var getdiv1=document.getElementById('tdoldpwd');
 var str=/^[0-9a-zA-Z_#]{6,16}$/; 
   if(getuser.value=='')
     getdiv1.innerHTML='旧密码不能为空';
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML='';
	}
	 else  
	 getdiv1.innerHTML='格式不正确';
	getuser.style.background="#FFF";
	
}

function newpwdblur()
  {
  var getuser=document.getElementById('newpwd');
  var getdiv1=document.getElementById('tdnewpwd');
 var str=/^[0-9a-zA-Z_#]{6,16}$/; 
   if(getuser.value=='')
     getdiv1.innerHTML='新密码不能为空';
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML='';
	}
	 else  
	 getdiv1.innerHTML='格式不正确,6-16位，由字母（区分大小写）、数字、符号组成';
	getuser.style.background="#FFF";
	
}



//采用onblur事件再次输入密码与原密码对比是否相同  
function repblur(){
var getrep=document.getElementById('repwd');
 var getdiv1=document.getElementById('tdrepwd');
  var getpwd=document.getElementById('tdnewpwd');
    if(getrep.value=='')
	    getdiv1.innerHTML='密码不能为空！！';
  else if(getrep.value!=getpwd.value)
     getdiv1.innerHTML='两次密码输入不一致！！';
	else 
	 getdiv1.innerHTML='';
getrep.style.background="#FFF";
}