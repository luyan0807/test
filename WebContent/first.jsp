<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fullPage.js/2.6.7/jquery.fullPage.css"/>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.0/jquery.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/fullPage.js/2.6.7/jquery.fullPage.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jQuery-slimScroll/1.3.6/jquery.slimscroll.min.js"></script>
<style>
body{
	color:#0FF;
}
.section1{
	background:#999;
}
.section2{
	background:#999;
	text-align:center;
}
.section3{
	background:#999;
}
.section4{
	background:#999;
}
.section5{
	background:#FFF;
}
.slide{
	text-align:center;
</style>
<title>无标题文档</title>
</head>
<script>
$(document).ready(function(){
	$("#fullpage").fullpage({
		verticalCentered:true,
		controlArrows:false,
		navigation:true,
		 //scrollOverflow:true
	});
});
</script>
<body>
<div id="fullpage">
  <div class="section section1" >
  <iframe src="index1.jsp" width="1360" height="640" frameborder="0" 
  marginheight="0" marginwidth="0" scrolling="no" ></iframe>
</div>
    <div class="section section2">
	  <iframe src="index2.jsp" width="1360" height="640" frameborder="0" 
  marginheight="0" marginwidth="0" scrolling="no" ></iframe>
   </div>
     <div class="section section3">
	 <iframe src="index3.jsp" width="1360" height="640" frameborder="0" 
  marginheight="0" marginwidth="0" scrolling="no" ></iframe>
     </div>
    <div class="section section4">
	<iframe src="index4.jsp" width="1360" height="640" frameborder="0" 
  marginheight="0" marginwidth="0" scrolling="no" ></iframe>
    </div>
	  <div class="section section5">
	<iframe src="index5.jsp" width="1360" height="640" frameborder="0" 
  marginheight="0" marginwidth="0" scrolling="no" ></iframe>
    </div>
</div>

</body>
</html>
