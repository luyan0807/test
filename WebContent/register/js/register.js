
        $('#tbPassword').focus(function () {
            $('#pwdLevel_1').attr('class', 'ywz_zhuce_hongxian');
            $('#tbPassword').keyup();
        });

        $('#tbPassword').keyup(function () {
            var __th = $(this);

            if (!__th.val()) {
                $('#pwd_tip').hide();
                $('#pwd_err').show();
                Primary();
                return;
            }
            if (__th.val().length < 6) {
                $('#pwd_tip').hide();
                $('#pwd_err').show();
                Weak();
                return;
            }
            var _r = checkPassword(__th);
            if (_r < 1) {
                $('#pwd_tip').hide();
                $('#pwd_err').show();
                Primary();
                return;
            }

            if (_r > 0 && _r < 2) {
                Weak();
            } else if (_r >= 2 && _r < 4) {
                Medium();
            } else if (_r >= 4) {
                Tough();
            }

            $('#pwd_tip').hide();
            $('#pwd_err').hide();
        });

     

        function Primary() {
            $('#pwdLevel_1').attr('class', 'ywz_zhuce_huixian');
            $('#pwdLevel_2').attr('class', 'ywz_zhuce_huixian');
            $('#pwdLevel_3').attr('class', 'ywz_zhuce_huixian');
        }

        function Weak() {
            $('#pwdLevel_1').attr('class', 'ywz_zhuce_hongxian');
            $('#pwdLevel_2').attr('class', 'ywz_zhuce_huixian');
            $('#pwdLevel_3').attr('class', 'ywz_zhuce_huixian');
        }

        function Medium() {
            $('#pwdLevel_1').attr('class', 'ywz_zhuce_hongxian');
            $('#pwdLevel_2').attr('class', 'ywz_zhuce_hongxian2');
            $('#pwdLevel_3').attr('class', 'ywz_zhuce_huixian');
        }

        function Tough() {
            $('#pwdLevel_1').attr('class', 'ywz_zhuce_hongxian');
            $('#pwdLevel_2').attr('class', 'ywz_zhuce_hongxian2');
            $('#pwdLevel_3').attr('class', 'ywz_zhuce_hongxian3');
        }
        function checkPassword(pwdinput) {
            var maths, smalls, bigs, corps, cat, num;
            var str = $(pwdinput).val()
            var len = str.length;

            var cat = /.{16}/g
            if (len == 0) return 1;
            if (len > 16) { $(pwdinput).val(str.match(cat)[0]); }
            cat = /.*[\u4e00-\u9fa5]+.*$/
            if (cat.test(str)) {
                return -1;
            }
            cat = /\d/;
            var maths = cat.test(str);
            cat = /[a-z]/;
            var smalls = cat.test(str);
            cat = /[A-Z]/;
            var bigs = cat.test(str);
            var corps = corpses(pwdinput);
            var num = maths + smalls + bigs + corps;

            if (len < 6) { return 1; }

            if (len >= 6 && len <= 8) {
                if (num == 1) return 1;
                if (num == 2 || num == 3) return 2;
                if (num == 4) return 3;
            }

            if (len > 8 && len <= 11) {
                if (num == 1) return 2;
                if (num == 2) return 3;
                if (num == 3) return 4;
                if (num == 4) return 5;
            }

            if (len > 11) {
                if (num == 1) return 3;
                if (num == 2) return 4;
                if (num > 2) return 5;
            }
        }

        function corpses(pwdinput) {
            var cat = /./g
            var str = $(pwdinput).val();
            var sz = str.match(cat)
            for (var i = 0; i < sz.length; i++) {
                cat = /\d/;
                maths_01 = cat.test(sz[i]);
                cat = /[a-z]/;
                smalls_01 = cat.test(sz[i]);
                cat = /[A-Z]/;
                bigs_01 = cat.test(sz[i]);
                if (!maths_01 && !smalls_01 && !bigs_01) { return true; }
            }
            return false;
        }
        
	window.onload=init;
	//函数初始化
function init()
{ var get=document.getElementsByTagName('input');
  for(var i=0;i<get.length;i++)
    {
		get[i].onfocus=function()
	  {
		  this.style.background="#CF0";
	   }
	}
} 

//用正则表达式验证名字的输入
function nameblur()
  {
  var getuser=document.getElementById('name');
  var getdiv1=document.getElementById('tdname');
  var  str =/^[\u4e00-\u9fa5]{0,}$/; 
   if(getuser.value=='')
     getdiv1.innerHTML='姓名不能为空！！';
	 else if(str.test(getuser.value))
	{
		getdiv1.innerHTML='';
	}
	 else  
	 getdiv1.innerHTML='姓名格式不正确';
	getuser.style.background="#FFF";
	
}
//用正则表达式验身份证的输入
function id_numblur(){
var getid=document.getElementById("id_num");
var gettd=document.getElementById("tdid");
var str=/^[1-9]\d{5}[1-2]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
 if(getid.value==''){
   gettd.innerHTML='身份证号不能为空';
 }
 else if(str.test(getid.value)){
 gettd.innerHTML='';
}
else 
 gettd.innerHTML='身份证号输入格式有误';
 getid.style.background="#FFF";
}

// 运用onmouseup事件给予提示
function pwdup(){
var getpwd=document.getElementById("tbPassword");
var gettdpwd=document.getElementById("tdpassword");
 gettdpwd.innerHTML='6-16位，由字母（区分大小写）、数字、符号组成';
 getpwd.style.background="#CF0";
}
// 运用onmouseover事件给予提示
function pwdout(){
var getpwd=document.getElementById("tbPassword");
var gettdpwd=document.getElementById("tdpassword");
if(getpwd.value==''){
gettdpwd.innerHTML='密码不能为空！！！！';
}
else
gettdpwd.innerHTML='';
getpwd.style.background="#FFF";
}

//采用onblur事件再次输入密码与原密码对比是否相同  
function repblur(){
var getrep=document.getElementById('repassword');
 var getdiv1=document.getElementById('tdrepwd');
  var getpwd=document.getElementById('tbPassword');
    if(getrep.value=='')
	    getdiv1.innerHTML='密码不能为空！！';
  else if(getrep.value!=getpwd.value)
     getdiv1.innerHTML='两次密码输入不一致！！';
	else 
	 getdiv1.innerHTML='';
getrep.style.background="#FFF";
}

//用正则表达式验电话的输入
function phoneblur(){
 var getphone=document.getElementById('phone');
  var gettdphone=document.getElementById('tdphone');
  var  str =/^[1][0-9]{10}$/; 
   if(getphone.value=='')
     gettdphone.innerHTML='电话不能为空！！';
	 else if(str.test(getphone.value))
	{
		gettdphone.innerHTML='';
	}
	 else  
	 gettdphone.innerHTML='电话格式不正确';
	getphone.style.background="#FFF";
}
//用正则表达式验邮箱的输入
function emailblur(){
 var getemail=document.getElementById('email');
  var gettdemail=document.getElementById('tdemail');
  var  str =/\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/; 
   if(getemail.value=='')
     gettdemail.innerHTML='邮箱不能为空！！';
	 else if(str.test(getemail.value))
	{
		gettdemail.innerHTML='';
	}
	 else  
	 gettdemail.innerHTML='邮箱格式不正确';
	getemail.style.background="#FFF";
}

//用正则表达式验地址的输入
function addrblur(){
 var getaddr=document.getElementById('addr');
  var gettdaddr=document.getElementById('tdaddr');
  var  str =/^\S/; 
   if(getaddr.value=='')
     gettdaddr.innerHTML='地址不能为空！！';
	 else if(str.test(getaddr.value))
	{
		gettdaddr.innerHTML='';
	}
	 else  
	 gettdaddr.innerHTML='地址格式不正确';
	getaddr.style.background="#FFF";
}