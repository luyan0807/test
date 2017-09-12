<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="systemAdmin_1/css/ListInfo.css">
</head>
<body >

<div id="Layer1" >
 <div id="Layer2"><a href="" class="menu">个人信息</a></div>
  
  
  <div id="Layer3"><a href="" class="menu">借阅排行</a></div>
  
  
  <div id="Layer4"><a href="" class="menu">额度标准</a></div>
  
  
  <div id="Layer5"><a href="" class="menu">三只公告</a></div>
  
  
  <div id="Layer6"><a href="" class="menu">活动预告</a></div>
  
  
  <div id="Layer7"><a href="" class="menu">数据备份</a></div>
  
  
  <div id="Layer8"><a href="" class="menu">读者咨询</a></div>
  
  
  <div id="Layer9"><a href="" class="menu">超期缴费</a></div>
  
  
  
</div>



<div id="Layer10">

  <div id="Layer11">
   <form  action="S_updateInfoServlet?&url=u" method="post" id="update">
    <div id="Layer12">
      <table width="485" height="217" >
        <tr>
          <td width="68" class="td_1">姓名：</td>
          <td width="159" class="td_2">${Info.name }</td>
          <td width="53" class="td_1">性别：</td>
          <td width="185" class="td_2">${Info.sex }</td>
        </tr>
        <tr>
          <td class="td_1">证件号：</td>
          <td class="td_2">${Info.IDCard }</td>
          <td class="td_1">生日：</td>
          <td class="td_2">${Info.birthday }</td>
        </tr>
        <tr>
          <td class="td_1">手机号：</td>
          <td class="td_2">${Info.phone }</td>
          <td class="td_1">民族：</td>
          <td class="td_2">${Info.nation }</td>
        </tr>
        <tr>
          <td class="td_1">邮箱：</td>
          <td class="td_2">${Info.email}</td>
          <td class="td_1">住址：</td>
          <td class="td_2">${Info.addr }</td>
        </tr>
      </table>
	  
	</div>
	
	
    <div id="Layer13"><input name="" type="submit" value="修改"  id="sub" /></div>
  </form>
  </div>
</div>
</body>
</html>
