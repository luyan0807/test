/**
 * 
 */
//验证姓名合法性
function nameblur()
  {
  var getuser=document.getElementById('u4_input');
  var getdiv1=document.getElementById('laName');
  var  str =/^[\u4e00-\u9fa5]{0,}$/; 
   if(getuser.value=='')
   {
     getdiv1.innerHTML='姓名不能为空';
     return false;
   }
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
		return true;
	}
	 else  
	 {
	 getdiv1.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
	 return false;
	 }
}

//验证身份证号合法性
function id_numblur(){
	var getid=document.getElementById("u7_input");
	var gettd=document.getElementById("laIdno");
	var str=/^[1-9]\d{5}[1-2]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
	 if(getid.value==''){
	   gettd.innerHTML='身份证号不能为空';
	   return false;
	 }
	 else if(str.test(getid.value)){
	 gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	 return true;
	}
	else{
	 gettd.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
	 return false;
	}
	}
//输入提示
function pwdup(){
	var getpwd=document.getElementById("u10_input");
	var gettdpwd=document.getElementById("laPassword");
	 gettdpwd.innerHTML='6-16位，由字母（区分大小写）、数字、符号组成>';
	 getpwd.style.background="#ADD8E6";
	}
//判断密码是否为空
function pwdout(){
	var getpwd=document.getElementById("u10_input");
	var gettdpwd=document.getElementById("laPassword");
	if(getpwd.value==''){
	gettdpwd.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
	return false;
	}
	else
	gettdpwd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	getpwd.style.background="#FFF";
	return true;
	}
//验证密码合法性
function pwdblur(){
	var getpwd=document.getElementById("u10_input");
	var gettdpwd=document.getElementById("laPassword");
	var pwd=$.trim(getpwd.value);
	if(pwd.length<6 || pwd.length>16){
		gettdpwd.innerHTML='密码长度为6-16';
		return false;
	}
	else
		gettdpwd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	return true;
	
}
//验证确认密码合法性
function repblur(){
	var getrep=document.getElementById('u10_inputa');
	 var getdiv1=document.getElementById('laCheckpassword');
	  var getpwd=document.getElementById('u10_input');
	    if(getrep.value==''){
		    getdiv1.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
		    return false;
	    }
	  else if(getrep.value!=getpwd.value){
	     getdiv1.innerHTML='两次密码输入不一致！！';
	     return false;   
	  }
		else 
		 getdiv1.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	getrep.style.background="#FFF";
	return true;
	}
//验证手机合法性
function phoneblur(){
	 var getphone=document.getElementById('u19_input');
	  var gettdphone=document.getElementById('laPhone');
	  var  str =/^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/; 
	   if(getphone.value==''){
	     gettdphone.innerHTML='手机号码不能为空';
	     return false;
	   }
		 else if(str.test(getphone.value))
		{
			gettdphone.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
			return true;
		}
		 else  
		 gettdphone.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
		getphone.style.background="#FFF";
		return false;
	}
//验证邮箱 合法性
function emailblur(){
	 var getemail=document.getElementById('u22_input');
	  var gettdemail=document.getElementById('laEmail');
	  var  str =/\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/; 
	   if(getemail.value==''){
	     gettdemail.innerHTML='邮箱不能为空！！';
	   return false;}
		 else if(str.test(getemail.value))
		{
			gettdemail.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
			return true;
		}
		 else  
		 gettdemail.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
		getemail.style.background="#FFF";
		return false;
	}
//验证地址合法性
function addrblur(){
	 var getaddr=document.getElementById('u25_input');
	  var gettdaddr=document.getElementById('laAddress');
	  var  str =/^\S/; 
	   if(getaddr.value==''){
	     gettdaddr.innerHTML='地址不能为空！！';
	   return false;
	   }
		 else if(str.test(getaddr.value))
		{
			gettdaddr.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
			return true;
		}
		 else  
		 gettdaddr.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
		getaddr.style.background="#FFF";
		return false;
	}
//提交表单的合法性
function validate_required(form) {
	var phone=$.trim(form.phone.value);
	if(form.type.value==null || form.type.value==""){
		alert("请选择管理员类型");
		return false;
	}
	else if(form.sex.value==null || form.sex.value==""){
		alert("请选择性别");
		return false;
	}
	else if(phone.length!=11) 
      { 
          alert('请输入有效的手机号码！'); 
          return false; 
      }
	else if(!nameblur()){
		alert("姓名格式错误");
		return false;
	}
	else if(!id_numblur()){
		alert("身份证号错误");
		return false;
	}
	else if(!pwdblur()){
		alert("密码格式错误");
		return false;
	}
	else if(!repblur()){
		alert("确认密码错误");
		return false;
	}
	else if(!phoneblur()){
		alert("手机格式错误");
		return false;
	}
	else if(!emailblur()){
		alert("邮箱格式错误");
		return false;
	}
	else if(!addrblur()){
		alert("地址格式错误");
		return false;
	}
	
	  
}
//检查身份证号是否已经存在
	$(function(){
	$(":input[name=idno]").change(function(){
							var val=$(this).val();
							val=$.trim(val);
							var $this = $(this);
							if(val !=""){
								 $.ajax({  
							  	        url: "checkIdno",  
							  	        type: "POST",
							  	        async: false,
							  	        data:{"idno":val},
							  	        success:function(data){  
							  	        	if(data == "1")
							  	        {
											}
											else if(data == "0")
											{
                                                alert("该身份证号已被注册");
												$("#u7_input")[0].value="";
												$("#u7_input").focus();
											}
											else{
												alert("服务器错误");
											}
												
							  	        }
								 });
							}else{
									alert("身份证号不能为空");
									$(this).val("");
									$this.focus();
										}
							  	  });
						});