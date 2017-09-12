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
<script src="js/register.js" type="text/javascript"></script>
<link href="css/xiniu.css" rel="stylesheet" type="text/css" />
<link href="css/register.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
function reloadCode(){
	var time=new Date().getTime();
	document.getElementById("imagecode").src="<%=request.getContextPath()%>/servlet/ImageServlet?d="+time;
	}
</script>
</head>
<body>
<div id="Layer1" >
<div id="imge"><img src="images/7fb8b80591b714ab6833c29840667510.jpg" width="440" height="90" /></div>
<form name="form1" method="post" action="../RegisterServlet" id="form1">
  <div id="Layer2">
    <table width="440" height="438" bgcolor="#E7F5DC">
      <tr >
        <th class="th_1">姓名：</th>
        <td class="td_1"><input name="name" type="text" class="in"  id="name" onblur="nameblur()"/></td>
		<td  id="tdname" class="tdwarm">&nbsp;</td>
      </tr>
      <tr>
        <th class="th_1">身份证：</th>
        
        <td class="td_1"><input name="id_num" type="text" class="in" id="id_num" onblur="id_numblur()"/></td>
		<td align="left" id="tdid" class="tdwarm">&nbsp;</td>
      </tr>
      <tr>
        <th id="thpwd">设置密码：</th>
        
        <td class="td_1">
         <input name="tbPassword" type="password" id="tbPassword"  class="in" onmouseup="pwdup()" onmousemove="pwdout()" onblur="pwdblur()"/>
           </td>
			<td  id="tdpassword" class="tdwarm">&nbsp;</td>
      </tr>
      <tr>
        <th class="th_1">确认密码：</th>
        
        <td class="td_1"><input name="repassword" type="password" class="in"  id="repassword" onblur="repblur()"/></td>
		<td  id="tdrepwd" class="tdwarm">&nbsp;</td>
      </tr>
      <tr>
        <th class="th_1">电话：</th>
       
        <td class="td_1"><input name="phone" type="text" class="in"  id="phone" onblur="phoneblur()" /></td>
		 <td  id="tdphone" class="tdwarm">&nbsp;</td>
      </tr>
      <tr>
        <th class="th_1">邮箱：</th>
        
        <td class="td_1"><input name="email" type="text" class="in" id="email" onblur="emailblur()" /></td>
		<td  id="tdemail" class="tdwarm">&nbsp;</td>
      </tr>
	     <tr>
        <th class="th_1">地址：</th>
        
        <td class="td_1"><input name="addr" type="text" class="in" id="addr" onblur="addrblur()" /></td>
		<td id="tdaddr" class="tdwarm">&nbsp;</td>
      </tr>
      <tr>
        <th height="34" align="right" scope="row">性别：</th>
       
        <td><div id="Layer8" align="left">
            <label>
            <input type="radio" name="sex" value="男" />
              男 </label>
            <label id="sex" >
            <input type="radio" name="sex" value="女"  />
女</label>
            
        </div></td>
		 <td>&nbsp;</td>
      </tr>
	  <tr>
	  <th height="30" align="right">验证码:</th>
	  <td class="td_1">  <input type="text" name="checkcode"value="" id="in_check"  />
	      <img alt="验证码" id="imagecode"
	      src="<%=request.getContextPath()%>/servlet/ImageServlet"/>
	     </td>
	  <td> <a href="javascript: reloadCode();">换一张</a></td>
	  </tr>
	   <tr>
	  <th height="37"></th>
	  <td align="left"> <input name="submit" type="submit" value="提交"  id="sub" />   
	  <label id="reset" >
	  <input name="reset" type="reset"  value="重置"  id="res"/>
	  </label></td>
	  <td></td>
	  </tr>
    </table>
  </div>
</form>
</div>
</body>
</html>