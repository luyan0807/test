<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <% String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServletPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript">
function reloadCode(){
	var time=new Date().getTime();
	document.getElementById("imagecode").src="<%=request.getContextPath()%>/servlet/ImageServlet?d="+time;
	}
</script>
</head>
<body>
<a href="#" rel="popuprel3" class="popup"><img src="images/u0.jpg" width="37" height="38" /></a>
<div class="popupbox3" id="popuprel3" >
	<div id="intabdiv3" >
	<form name="formlogin" method="post" action="../LoginServlet" id="formlogin">
		<h1 id="id_h2">欢迎登录</h1>
        <div id="denglu">
        <div id="denglu1"> <img src="images/u0.jpg" height="160" width="160"  align="middle"/></div>
        <div id="denglu2">
             <div class="in">
              <input type="text" id="id_num" name="id_num" value="手机号码/身份证号"
               onfocus="idnum()" onblur="idnum_1()" />
              <span class="sp"><a href="">用户注册</a></span>
              </div> 
              <div class="in">
               <input type="password" value="password" id="password" name="password" onfocus="pwdfocus()" onblur="pwdblur()" >
               <span class="sp"><a href="">找回密码</a></span>
               </div>
              <div class="in"> 
              <label><input type="checkbox" value="" name="rememberPwd">记住密码</label>
               <label><input type="checkbox" value="" name="automaticLogin">自动登录</label>
               </div>
              <div class="in">  
              <input type="text" name="checkcode"value="" id="in_check"  />
	      <img alt="验证码" id="imagecode" src="<%=request.getContextPath()%>/servlet/ImageServlet"/>
	      <span class="sp"><a href="javascript:reloadCode();">换一张</a></span>
	      </div>
              <div class="in"> 
              <a href="#" class="login-btn" style="background-image:url(images/login.jpg)"><input name="submit" type="submit" value="登录"  id="sub" /></a>
              </div>
        </div>
        </div>
        </form>
	</div>
</div>
</body>
</html>