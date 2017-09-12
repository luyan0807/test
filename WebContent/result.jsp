<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table  border="1" align="center">
  <tr>
    <th scope="col">封面</th>
    <th scope="col">名称</th>
    <th scope="col">ISBN</th>
     <th scope="col">作者</th>
      <th scope="col">出版社</th>
       <th scope="col">出版日期</th>
        <th scope="col">索书号</th>
         <th scope="col">价格</th>
         <th scope="col">分类</th>
         <th scope="col">语言</th>
         <th scope="col">可借复本</th>
  </tr>
  <c:forEach items="${books}" var="it" >
  <tr>
    <td><img height="50" src='upload/${it.image}'/></td>
    <td>${it.name }</td>
    <td>${it.isbn}</td>
    <td>${it.anthor }</td>
    <td>${it.pubishname }</td>
    <td>${it.publishdate }</td>
    <td>${it.callnumber }</td>
    <td>${it.price }</td>
    <td>${it.kindof}</td>
    <td>${it.language}</td>
    <td>${it.num }</td>
  </tr>
  </c:forEach>
</table>
      
</body>
</html>