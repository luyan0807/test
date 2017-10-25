<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <%@taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="css/bootstrap.min.css">  
     <link rel="stylesheet" href="css/addbook.css">  
   <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <link href="searchbook/css/styles1.css" type="text/css" rel="stylesheet"/>   
   <script src="js/bootstrap.min.js"></script>
   <script src="js/addbook.js"></script>
   <script src="js/matching.js"></script>
   <script src="js/booklist.js"></script>
       <script type="text/javascript">
       </script>
     
<title>图书导购单</title>
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
							 <a href="#">图书导购单</a>
						</li>
						<li>
							 <a href="#">首页</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">更多<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">资源</a>
								</li>
								<li>
									 <a href="#">服务</a>
								</li>
								<li>
									 <a href="#">活动</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">专题</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">关于我们</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input class="form-control" type="text" />
						</div> <button type="submit" class="btn btn-default">检索</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="#">我的图书馆</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">关于读者<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">读者留言</a>
								</li>
								<li>
									 <a href="#">借阅排行</a>
								</li>
								<li>
									 <a href="#">读者咨询</a>
								</li>
								<li class="divider">
								</li>
								 <li>
									 <a href="#">读者意见</a>
								</li> 
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-6 column">
					<img alt="140x140" height="300px" width="580px" src="images/addbook/logo.jpg" />
				</div>
				<div class="col-md-6 column">
					<div class="carousel slide" id="carousel-705543">
						<ol class="carousel-indicators">
							<li class="active" data-slide-to="0" data-target="#carousel-705543">
							</li>
							<li data-slide-to="1" data-target="#carousel-705543">
							</li>
							<li data-slide-to="2" data-target="#carousel-705543">
							</li>
						</ol>
						<div class="carousel-inner">
							<div class="item active" style=" height: 300px; width: 580px ">
								<img alt="" width="580px" src="images/addbook/book1.jpg" />
								<div class="carousel-caption">
									<h4>
										SANZHI LIBRARY
									</h4>
									<p>
										welcome to you
									</p>
								</div>
							</div>
							<div class="item" style=" height: 300px; width: 580px ">
								<img alt="" width="580px" src="images/addbook/book2.jpg" />
								<div class="carousel-caption">
									<h4>
										BOOK WORLD
									</h4>
									<p>
										always read book
									</p>
								</div>
							</div>
							<div class="item" style=" height: 300px; width: 580px ">
								<img alt="" width="580px"src="images/addbook/book3.jpg" />
								<div class="carousel-caption">
									<h4>
										BOOK LIFE
									</h4>
									<p>
										read what you want
									</p>
								</div>
							</div>
						</div> <a class="left carousel-control" href="#carousel-705543" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-705543" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
					</div>
				</div>
			</div>
			<div class="page-header">
				<h1>
					图书导购单 <small>sanzhi.lib.cn</small>
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix" id="u5">
		<div class="col-md-12 column">
		<img alt="140x140" src="images/addbook/always.png" /> 
		</div><!-- height="300px" width="1160px" -->
		</div>
		
		<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			 <a id="modal-535882" href="#modal-container-535882" role="button" class="btn" data-toggle="modal">创建图书导购单</a>
			
			<div class="modal fade" id="modal-container-535882" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								图书导购单
							</h4>
						</div>
						<form action="saveBookList" method="post">
						<div class="modal-body">
									<label>导购单名称</label> <input name="name" class="form-control" />
									<label>导购目的</label><input name="reason" class="form-control" />
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
							  <input value="创建" type="submit" class="btn btn-primary"/>
							
						</div>
                        </form>
					</div>
				</div>
				
			</div>
			
		</div>
	</div>
</div>


 <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">

			<div class="modal fade" id="modal-container-695345" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								图书导购单
							</h4>
						</div>
						<form action="Largessupdate">
						<div class="modal-body">
                          
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> <input value="打印" type="submit" class="btn btn-primary"/>
						</div>
						</form>
					</div>
					
				</div>
				
			</div>
			
		</div>
	</div>
</div>
		
<!-- 	//<button>打印</button> -->
    <form action="showBookList">
    <button type="submit">我的图书导购单</button>
    </form>
<s:iterator value="#request.bookLists" var="li"> 
    <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="panel-group" id="panel-614287<s:property value="#li.id"/>">
				<div class="panel panel-default">
					<div class="panel-heading">
						 <a onclick="showlist(<s:property value="#li.id"/>)" class="panel-title collapsed" style="color: blue;text-decoration:none;" data-toggle="collapse" data-parent="#panel-614287" href="#panel-element-532983<s:property value="#li.id"/>">
						 <s:property value="#li.name"/> --- <s:date name="#li.createDate" format="yyyy-MM-dd"/> --- <s:property value="#li.reason"/></a>
                         <a href="/BMS-ssh/deleteBookList?booklist_id=<s:property value="#li.id"/>" style="color:red;">删除</a>	 
					</div>
					<div id="panel-element-532983<s:property value="#li.id"/>" class="panel-collapse collapse">
						<div class="panel-body">
	
	<table class="table">
				<thead>
					<tr>
						<th>
							书名
						</th>
						<th>
							作者
						</th>
						<th>
							版次
						</th>
						<th>
							数量
						</th>
						<th>
							操作
						</th>
					</tr>
				</thead>
			<tbody>
			<s:iterator value="#request.bookInfoLists" var="bl">
			<s:if test="#bl.bookList_id==#li.id">
			<tr>
			<td><s:property value="#bl.bookname"/></td>
			<td><s:property value="#bl.author"/></td>
			<td><s:property value="#bl.edition"/></td>
			<td><s:property value="#bl.num"/></td>
			<td><a href="/BMS-ssh/deleteBookInfoList?bookInfoList_id=<s:property value="#bl.id"/>" >删除</a></td>
			</tr>
			</s:if>
			</s:iterator>
			</tbody>
				</table>
	
	<form action="addBookInfoList" method="post">
	<input type="hidden" name="bookList_id" value="<s:property value="#li.id"/>"/>
	<label>题名</label><input type="text" name="bookname"/>
	<label>作者</label><input type="text" name="author"/>
	<label>版次</label><input type="text" name="edition"/>
	<label>数量</label><input type="text" name="num"/>
	<input type="submit" value="添加" class="btn btn-default" />
	</form>
						</div>
					</div>
				</div>
			</div>
			</div>
		</div>
	</div>
</s:iterator>
    
   
		
</div>
</body>
</html>