
	
	function idnum(){
		  var getuser=document.getElementById('id_num');
		   if(getuser.value=='手机号码/身份证号')
			   getuser.value='';
		  getuser.style.color='#000';
		   
	}
	function idnum_1(){
		var getuser=document.getElementById('id_num');
		   if(getuser.value=='')
			   getuser.value='手机号码/身份证号';
		  getuser.style.color='#CCC';
		    
	}
	
	function pwdblur(){
		var getpwd=document.getElementById("password");
		if(getpwd.value=='')
			getpwd.value='password';
		getpwd.style.color='#000';
	}

	function pwdfocus(){
		var getpwd=document.getElementById("password");
		if(getpwd.value=='password')
			getpwd.value='';
		getpwd.style.color='#CCC';
	}