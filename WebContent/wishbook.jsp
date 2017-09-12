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
      <link rel="stylesheet" href="css/wishbook.css">  
   <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <link href="searchbook/css/styles1.css" type="text/css" rel="stylesheet"/>   
   <script src="js/bootstrap.min.js"></script>
   <script src="js/addbook.js"></script>
   <script src="js/matching.js"></script>
       <script src="adminsuccess/js/myjs.js"></script>
       <script type="text/javascript">
       function setPage() {//设置跳到第几页
    	   var pageNum = $('#jump').val().trim();//获取跳页输入框的值
    	   var a=Number(pageNum);
    	   var pageTotal = $('#total').val();
    	   alert(pageNum);
    	   alert(pageTotal);
    	   if(a>0 && a<=pageTotal){//获取的值pageNum 不是数字或者小于0的时候跳到第一页
    	   	location.href = 'showLargess?pageNow='+pageNum;
    	   }
    	   else{
    	   	alert("输入有误，请重新输入");
    	   }
    	   }
       </script>
     
<title>读者心愿单</title>
</head>
<body>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="modal fade" id="modal-container-535882" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								详情
							</h4>
						</div>
						<div class="modal-body">
							<span id="span_content"></span>
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						</div>
					</div>
					
				</div>
				
			</div>
			
		</div>
	</div>
</div>


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
							 <a href="#">读者心愿单</a>
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
					读者心愿单信息 <small>sanzhi.lib.cn</small>
				</h1>
			</div>
			<div>
					
		<form action="showWishBook">
               <input id="showallButton" type="submit" value="显示全部" class="btn btn-default">
               </form>
        <form action="showNotcheckedWB">
               <input id="showNotchecked" type="submit" value="未查看" class="btn btn-default">
        </form>
        <form action="showNotcheckedWB">
               <input id="joinButton" type="submit" value="一键加入导购单" class="btn btn-default">
        </form>
        <form action="showNotcheckedWB">
               <input id="ignoreButton" type="submit" value="一键忽略" class="btn btn-default">
        </form>
			
			</div>
			
			
			
			<div class="container">
	<div class="row clearfix" id="table1">
		<div class="col-md-12 column">
               <table class="table" border="0" cellpadding="0" cellspacing="0" width="860px" align="center">
					<tr>
					<th></th>
						<th>
							图书名称
						</th>
						<th>
							作者
						</th>
						<th>
							喜欢理由
						</th>
						<th>
							状态
						</th>
						<th>
							操作
						</th>
					</tr>
				<s:iterator value="#request.wishBooks" var="wb">
				<tbody>
					<tr>
					 <td width="50px"><input type="checkbox" name="checkbox" value="${wb.id}"/></td>
						<td>
							<s:property value="#wb.name"/>
						</td>
						<td>
							<s:property value="#wb.anthor"/>
						</td>
						<td>
						<a href="#modal-container-535882" style="color: blue;" onclick="showReason('${wb.reason}');" id="modal-535882"  role="button" class="btn" data-toggle="modal">喜欢理由</a>
						</td>
						<s:if test="#wb.state==0">
						<td>
						未查看
						</td>
						</s:if>
						
						<s:if test="#wb.state==1">
						<td>
						已查看
						</td>
						</s:if>

						<s:if test="#wb.state==2">
						<td>
						忽略
						</td>
						</s:if>
												
						<td>
							<a href="#" style="color: blue;">加入导购单</a>
							<a href="#" style="color: red;">忽略</a>
						</td>
					</tr>
					</tbody>
					</s:iterator>
					</table>
		
		
		</div>
		</div>
		</div>
			
			
		</div>
	</div>
	
	<div id="button-div" >
			 <s:set name="page" value="#request.page"></s:set>  
			 当前是第<s:property value="#page.pageNow"/>页，共<s:property value="#page.totalPage"/>页  
        <s:if test="#page.hasFirst">  
            <a href="showWishBook?pageNow=1"  target="main">首页</a>  
        </s:if>  
        <s:if test="#page.hasPre">  
            <a href="showWishBook?pageNow=<s:property value="#page.pageNow-1"/> "  target="main">&lt;上一页</a>  
        </s:if> 
<s:if test="#page.totalPage>0">
  <s:if test="#page.totalPage>10" >
        <s:if test="#page.pageNow>=1 && #page.pageNow<=6" >
            <s:bean name="org.apache.struts2.util.Counter" id="counter">
               <s:param name="first" value="1" />
               <s:param name="last" value="10" />
               <s:iterator>
                  <a href="showWishBook?pageNow=<s:property/>"> <s:property/></a>
               </s:iterator>
            </s:bean>
        </s:if>
        <s:if test="#page.pageNow>6 && #page.pageNow<=#page.totalPage-4">
            <s:bean name="org.apache.struts2.util.Counter" id="counter">
               <s:param name="first" value="#page.pageNow-5" />
               <s:param name="last" value="#page.pageNow+4" />
               <s:iterator>
                  <a href="showWishBook?pageNow=<s:property/>"> <s:property/></a>
               </s:iterator>
            </s:bean>
        </s:if>
        <s:if test="#page.pageNow>#page.totalPage-4 && #page.pageNow<=#page.totalPage">
               <s:bean name="org.apache.struts2.util.Counter" id="counter">
               <s:param name="first" value="#page.totalPage-9" />
               <s:param name="last" value="#page.totalPage" />
               <s:iterator>
                  <a href="showWishBook?pageNow=<s:property/>"> <s:property/></a>
               </s:iterator>
               </s:bean>
        </s:if>
  </s:if> 
  <s:else> 
  <s:bean name="org.apache.struts2.util.Counter" id="counter">
               <s:param name="first" value="1" />
               <s:param name="last" value="#page.totalPage" />
               <s:iterator>
                  <a href="showWishBook?pageNow=<s:property/>"> <s:property/></a>
               </s:iterator>
            </s:bean>
  </s:else>
  </s:if>
<s:if test="#page.hasNext">  
             <a  href="showWishBook?pageNow=<s:property value="#page.pageNow+1" />" target="main">下一页&gt;</a>  
        </s:if>  
         <s:if test="#page.hasLast">  
            <a href="showWishBook?pageNow=<s:property value="#page.totalPage"/>"  target="main">尾页&gt;&gt;</a>  
        </s:if>
        &nbsp;&nbsp;&nbsp;&nbsp;跳到第<input type="text" id="jump" size="3"/><input type="hidden" id="total" value="${page.totalPage}">页<input name="jumpButton" type="button" value="跳转 "  class="btn btn-default" size="20" onclick="setPage()"/>
			 
			</div>
	
	
	<div class="row clearfix" id="u5">
		<div class="col-md-12 column">
		<img alt="140x140" src="images/addbook/always.png" /> 
		</div><!-- height="300px" width="1160px" -->
		</div>
</div>
</body>
</html>