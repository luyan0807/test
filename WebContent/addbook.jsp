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
   <script src="js/bootstrap.min.js"></script>
   <script src="js/addbook.js"></script>
   <script src="js/matching.js"></script>
       <script type="text/javascript">
       </script>
     
<title>图书信息录入</title>
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
							 <a href="#">图书信息录入</a>
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
					图书信息录入 <small>sanzhi.lib.cn</small>
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-4 column">
			<img alt="140x140" src="images/addbook/cover.jpg" class="img-thumbnail" />
		</div>
		<div class="col-md-4 column">
			<form action="bookinfo" class="form-inline" method="post" enctype="multipart/form-data">
				<div class="form-group">
					 <label>图书名称</label>
					 <label id="laName" class="trip"></label>
					 <div >
					 <input id="name" class="form-control" name="name" type="text" onblur="nameblur()"/>
					 </div>
				</div>
				<!-- for="exampleInputEmail1" -->
				<div class="form-group">
					 <label>ISBN</label>
				     <label id="laIsbn" class="trip"></label>
					 <div >
					 <input class="form-control" name="isbn" type="text"  id="isbn" onblur="isbnblur()"/>
					 </div>
				</div>
					<div class="form-group">
					 <label for="exampleInputPassword1">作者</label>
					 <label id="laAnthor" class="trip"></label>
					 <div >
					 <input id="anthor" class="form-control" name="anthor" type="text"  onblur="anthorblur()" />
					 </div>
				</div>
					<div class="form-group">
					 <label for="exampleInputPassword1">价格</label>
					 <label id="laPrice" class="trip"></label>
					 <div >
					 <input class="form-control" id="price" onblur="priceblur()" name="price" type="text"  />
					 </div>
				</div>
					<div class="form-group">
					 <label for="exampleInputPassword1">分类</label>
					 <div >
					 <select name="kindof" class="form-control" style="width:170px">
					 <option value="J-计算机">J-计算机</option>
					 <option value="W-文学">W-文学</option>
					 <option value="Y-艺术">Y-艺术</option>
					 <option value="J-经管">J-经管</option>
					 <option value="R-人文社科">R-人文社科</option>
					 <option value="S-少儿">S-少儿</option>
					 <option value="J-进口原版">J-进口原版</option>
					 <option value="S-生活">S-生活</option>
					 <option value="K-科技">K-科技</option>
					 <option value="W-外语">W-外语</option>
					 <option value="K-考试">K-考试</option>
					 <option value="L-离职">L-离职</option>
					 <option value="X-学术">X-学术</option>
					 </select> 
					<%--  <input class="form-control" name="kindof" type="text" value="${book.kindOf}" /> --%>
					 </div>
				</div>
					<div class="form-group">
					 <label for="exampleInputPassword1">索书号</label>
					 <label id="lacallnumber" class="trip"></label>
					 <div >
					 <input id="callnumber" class="form-control" name="callnumber" type="text" onblur="callnumberblur()" />
					 </div>
				</div>
					<div class="form-group">
					 <label for="exampleInputPassword1">语言</label>
					 <div >
					 <select name="language" class="form-control" style="width:170px">
					 <option value="Z-中文">Z-中文</option>
					 <option value="英文">Y-英文</option>
					</select>
				<!-- 	 <input class="form-control" name="language" type="text"  /> -->
					 </div>
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">藏馆地</label>
					 <div >
					 <select name="collection" class="form-control" style="width:170px">
					 <option value="南昌图书馆（八一广场）">南昌图书馆（八一广场）</option>
					 <option value="南昌图书馆（瑶湖）">南昌图书馆（瑶湖）</option>
					 </select>
					 <!-- <input class="form-control"name="collection" type="text" /> -->
					 </div>
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">内容简介</label>
					 <label id="laplotSummary" class="trip"></label>
					 <div >
					<textarea id="plots" class="form-control" rows="6" cols="50" name="plotSummary" onblur="plotSummaryblur()"></textarea>
					 </div>
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">封面</label>
					 <div >
					 <input type="file" name="image" id="imageUrl"/>
					 </div>
				</div>
		</div>
		<div class="col-md-4 column">
        <div class="form-group">
					 <label for="exampleInputPassword1">出版社</label>
					  <label id="lapublishname" class="trip"></label>
					 <input id="publishname" class="form-control" name="publishname" type="text" onblur="publishnameblur()"  />
					 
				</div>
		<div class="form-group">
					 <label for="exampleInputPassword1">出版日期</label>
					  <label id="lapublishdate" class="trip"></label>
					 <div >
					 <input id="publishdate" class="form-control" name="publishdate" type="text" onblur="publishdateblur()" onkeyup="publishdateup()"/>
					 </div>
				</div>
		<div class="form-group">
					 <label for="exampleInputPassword1">页数</label>
					 <label id="lapageNo" class="trip"></label>
					 <div >
					 <input id="pageNo" class="form-control" name="pageNo" type="text" onblur="numblur('pageNo')" />
					 </div>
				</div>
       <div class="form-group">
					 <label for="exampleInputPassword1">版次</label>
					 <label id="laedition" class="trip"></label>
					 <div >
					 <input id="edition" class="form-control" name="edition" type="text" onblur="numblur('edition')" />
					 </div>
				</div>
			<div class="form-group">
					 <label for="exampleInputPassword1">数量</label>
					 <label id="lanum" class="trip"></label>
					 <div >
					 <input id="Num" class="form-control" name="num" type="text" onblur="Numblur()" />
					 </div>
				</div>
		<div class="form-group">
					 <label for="exampleInputPassword1">摘要</label>
					 <label id="laabstracts" class="trip"></label>
					 <div >
					 <textarea id="abstracts" class="form-control" rows="3" cols="50" name="abstracts" onblur="abstractsblur()"></textarea>
					 </div>
				</div>
<%-- 				<input type="hidden" name="id" value="${book.id}" /> --%>
				 <input id="u3" type="submit" class="btn btn-default" value="提交" onclick="return validate_required(this.form)"/>
		</div>
	</div>
	</form>
	<div class="row clearfix" id="u5">
		<div class="col-md-12 column">
		<img alt="140x140" src="images/addbook/always.png" /> 
		</div><!-- height="300px" width="1160px" -->
		</div>
</div>
</body>
</html>