<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
               <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <%@taglib uri="/struts-tags" prefix="s" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="css/bootstrap.min.css">  
     <link rel="stylesheet" href="css/addbook.css">  
     <link rel="stylesheet" href="css/showbook.css">  
   <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
       <script type="text/javascript">
       document.getElementById("plots").value="hello." ;
       </script>
<title>book show</title>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default navbar-static-top" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">sanzhi.lib</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="#">图书详情</a>
						</li>
						<li>
							 <a href="#">Link</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">One more separated link</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input class="form-control" type="text" />
						</div> <button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="#">Link</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-6 column" align="center">
			<img alt="140x140" height="300px" width="200px"src="upload/${session.bookInfo.image}" />
		</div>
		<div class="col-md-6 column">
		<label id="label">名称：</label><s:property value="#session.bookInfo.name"/><br/>
		<label id="label">ISBN：</label><s:property value="#session.bookInfo.isbn"/><br/>
		<label id="label">作者：</label><s:property value="#session.bookInfo.anthor"/><br/>
		<label id="label">价格：</label><s:property value="#session.bookInfo.price"/><br/>
		<label id="label">出版社：</label><s:property value="#session.bookInfo.publishName"/><br/>
		<label id="label">出版日期：</label><s:date name="#session.bookInfo.publishDate" format="yyyy-MM-dd"/><br/>
		<label id="label">类型：</label><s:property value="#session.bookInfo.kindOf"/><br/>
		<label id="label">索书号：</label><s:property value="#session.bookInfo.callNumber"/><br/>
		<label id="label">语种：</label><s:property value="#session.bookInfo.language"/><br/>
		<label id="label">页数：</label><s:property value="#session.bookInfo.pageNo"/><br/>
		<label id="label">图书数量：</label><s:property value="#session.bookInfo.num"/><br/>
		<label id="label">版次：</label><s:property value="#session.bookInfo.edition"/><br/>
		<label id="label">藏馆地：</label><s:property value="#session.bookInfo.collection"/><br/>
		<label id="label">摘要：</label><s:property value="#session.bookInfo.abstracts"/><br/>
		<label id="label">内容简介：</label><s:property value="#session.bookInfo.plotSummary"/><br/>
		<label id="label">借阅次数：</label><s:property value="#session.bookInfo.bookCatalog.borrowTime"/><br/>
		<label id="label">续借次数：</label><s:property value="#session.bookInfo.bookCatalog.renewTime"/><br/>
		<label id="label">可借阅数量：</label><s:property value="#session.bookInfo.bookCatalog.borrowNum"/><br/>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<table class="table">
				<thead>
					<tr>
						<th>
							借阅编号
						</th>
						<th>
							藏馆状态
						</th>
						<th>
							所属藏馆
						</th>
						<th>
							应还时间
						</th>
					</tr>
				</thead>
				<tbody>
				 <c:forEach items="${bookBarcodes}" var="bb" >
					<tr >
						<c:if test="${bb.state}">
						<td>
					    ${bb.barcode}						
						</td>
						</c:if>
						<c:if test="${bb.state==false}">
						</c:if>
						<c:if test="${bb.state}">						
						<td>在馆</td>
						</c:if>
						<c:if test="${bb.state}">	
						<td>
						<s:property value="#session.bookInfo.collection"/><br/>
						</td>
						</c:if>
						<c:if test="${bb.state}">
						<td>  --  </td>
						</c:if>
					</tr>
				</c:forEach>
				<c:forEach items="${borrowLists}" var="bl" >	
					<tr >
					    <td>${bl.barcode.barcode }</td>
					    <td>借出</td>	
					    <td>
						<s:property value="#session.bookInfo.collection"/><br/>
						</td>									
                        <c:if test="${bl.state==0}">
						<td>--</td>
						</c:if>
                        <c:if test="${bl.state==1}">
                        <td>
                        <fmt:formatDate value="${bl.sReturnDate }" pattern="yyyy-MM-dd"/>
                        </td>
						</c:if>
					</tr>
					</c:forEach>
				</tbody>
			</table>	
		</div>
	</div>	
</div>
</body>
</html>