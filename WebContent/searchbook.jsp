<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
          <%@taglib uri="/struts-tags" prefix="s" %>  
          <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>search</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link rel="stylesheet" href="css/bootstrap.min.css">  
    <link rel="stylesheet" href="css/addbook.css">  
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <link href="searchbook/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="searchbook/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="searchbook/css/styles.css" type="text/css" rel="stylesheet"/>
    <link href="searchbook/css/styles1.css" type="text/css" rel="stylesheet"/>
    <script src="jquery-1.7.1.min.js"></script>
    <script src="searchbook/js/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="searchbook/js/prototypePre.js"></script>
    <script src="searchbook/js/document.js"></script>
    <script src="searchbook/js/prototypePost.js"></script>
    <script src="searchbook/js/data.js"></script>
    <script type="text/javascript">


    $(function(){
        $('select').selectOrDie();
    });


    
    function setPage() {//设置跳到第几页
var pageNum = $('#jump').val().trim();//获取跳页输入框的值
var a=Number(pageNum);
var pageTotal = $('#total').val();
alert(pageNum);
alert(pageTotal);
if(a>0 && a<=pageTotal){//获取的值pageNum 不是数字或者小于0的时候跳到第一页
	location.href = 'searchbook?pageNow='+pageNum;
}
else{
	alert("输入有误，请重新输入");
}
}
    </script>
  </head>
   <body>
   <s:debug></s:debug>
    <div id="base" class="">

      <!-- Unnamed (图片) -->
      <div id="u0" class="ax_default image">
        <img id="u0_img" class="img " src="searchbook/images/search/u0.png"/>
        <!-- Unnamed () -->
        <div id="u1" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <!-- Unnamed (组合) -->
      <div id="u2" class="ax_default" data-width="632" data-height="246">

        <!-- Unnamed (组合) -->
        <div id="u3" class="ax_default" data-width="629" data-height="139">

          <!-- Unnamed (图片) -->
          <div id="u4" class="ax_default image">
            <img id="u4_img" class="img " src="searchbook/images/search/u4.png"/>
            <!-- Unnamed () -->
            <div id="u5" class="text" style="display:none; visibility: hidden">
              <p><span></span></p>
            </div>
          </div>

          <!-- Unnamed (垂直线) -->
          <div id="u6" class="ax_default line">
            <img id="u6_img" class="img " src="images/search/u6.png"/>
            <!-- Unnamed () -->
            <div id="u7" class="text" style="display:none; visibility: hidden">
              <p><span></span></p>
            </div>
          </div>

          <!-- Unnamed (矩形) -->
          <div id="u8" class="ax_default label">
            <div id="u8_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u9" class="text">
              <p><span>“三只”图书馆</span></p>
            </div>
          </div>
        </div>

        <!-- Unnamed (组合) -->
        <div id="u10" class="ax_default" data-width="632" data-height="29">
<form action="searchbook" method="post">
          <!-- Unnamed (下拉列表框) -->
          <div id="u11" class="ax_default droplist" >
            <select id="u11_input" class="form-control">
              <option selected value="书目检索">书目检索</option>
              <option value="跨库检索">跨库检索</option>
              <option value="站内检索">站内检索</option>
            </select>
          </div>

          <!-- Unnamed (组合) -->
          <div id="u12" class="ax_default" data-width="441" data-height="28">

            <!-- Unnamed (下拉列表框) -->
            <div id="u13" class="ax_default droplist" >
             <select id="u13_input" name="option" class="form-control">
                <option value="题名" >题名</option>
                <option value="任意词">任意词</option>
                <option value="出版社">出版社</option>
                <option value="作者">作者</option>
                <option value="ISBN">ISBN</option>
                <option value="分类">分类</option>
                <option value="索书号">索书号</option>
              </select>
            </div>

            <!-- Unnamed (文本框) -->
            <div id="u14" class="ax_default text_field">
              <input id="u14_input" type="text" name="search" class="form-control"/>
            </div>

            <!-- 检索 (矩形) -->
            <div id="u15" class="ax_default label" data-label="检索">
              <div id="u15_div" class=""></div>
              <!-- Unnamed () -->
              <div id="u16" class="text">
             <input type="submit" class="btn btn-default" value="检索" />
              
</form>          
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- Unnamed (组合) -->
      <div id="u17" class="ax_default" data-width="1366" data-height="78">

        <!-- Unnamed (组合) -->
        <div id="u18" class="ax_default" data-width="1366" data-height="44">

          <!-- Unnamed (矩形) -->
          <div id="u19" class="ax_default box_1">
            <div id="u19_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u20" class="text" style="display:none; visibility: hidden">
              <p><span></span></p>
            </div>
          </div>

          <!-- 服务 (矩形) -->
          <div id="u21" class="ax_default label" data-label="服务">
            <div id="u21_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u22" class="text">
              <p><span>服务</span></p>
            </div>
          </div>

          <!-- 活动 (矩形) -->
          <div id="u23" class="ax_default label" data-label="活动">
            <div id="u23_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u24" class="text">
              <p><span>活动</span></p>
            </div>
          </div>

          <!-- 专题 (矩形) -->
          <div id="u25" class="ax_default label" data-label="专题">
            <div id="u25_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u26" class="text">
              <p><span>专题</span></p>
            </div>
          </div>

          <!-- 资讯 (矩形) -->
          <div id="u27" class="ax_default label" data-label="资讯">
            <div id="u27_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u28" class="text">
              <p><span>资讯</span></p>
            </div>
          </div>

          <!-- 首页 (矩形) -->
          <div id="u29" class="ax_default label" data-label="首页">
            <div id="u29_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u30" class="text">
              <p><span>首页</span></p>
            </div>
          </div>

          <!-- 资源 (矩形) -->
          <div id="u31" class="ax_default label" data-label="资源">
            <div id="u31_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u32" class="text">
              <p><span>资源</span></p>
            </div>
          </div>
        </div>

        <!-- Unnamed (矩形) -->
        <div id="u33" class="ax_default label">
          <div id="u33_div" class=""></div>
          <!-- Unnamed () -->
          <div id="u34" class="text">
          <table border="0">
          <tr>
          <td>图书查询 </td>
           <s:set name="page" value="#request.page"></s:set>  
          <td colspan="9">  
        当前是第<s:property value="#page.pageNow"/>页，共<s:property value="#page.totalPage"/>页  
        <s:if test="#page.hasFirst">  
            <a href="searchbook?pageNow=1"  target="main">首页</a>  
        </s:if>  
        <s:if test="#page.hasPre">  
            <a href="searchbook?pageNow=<s:property value="#page.pageNow-1"/> "  target="main">&lt;上一页</a>  
        </s:if> 
<s:if test="#page.totalPage>0">
  <s:if test="#page.totalPage>10" >
        <s:if test="#page.pageNow>=1 && #page.pageNow<=6" >
            <s:bean name="org.apache.struts2.util.Counter" id="counter">
               <s:param name="first" value="1" />
               <s:param name="last" value="10" />
               <s:iterator>
                  <a href="searchbook?pageNow=<s:property/>"> <s:property/></a>
               </s:iterator>
            </s:bean>
        </s:if>
        <s:if test="#page.pageNow>6 && #page.pageNow<=#page.totalPage-4">
            <s:bean name="org.apache.struts2.util.Counter" id="counter">
               <s:param name="first" value="#page.pageNow-5" />
               <s:param name="last" value="#page.pageNow+4" />
               <s:iterator>
                  <a href="searchbook?pageNow=<s:property/>"> <s:property/></a>
               </s:iterator>
            </s:bean>
        </s:if>
        <s:if test="#page.pageNow>#page.totalPage-4 && #page.pageNow<=#page.totalPage">
               <s:bean name="org.apache.struts2.util.Counter" id="counter">
               <s:param name="first" value="#page.totalPage-9" />
               <s:param name="last" value="#page.totalPage" />
               <s:iterator>
                  <a href="searchbook?pageNow=<s:property/>"> <s:property/></a>
               </s:iterator>
               </s:bean>
        </s:if>
  </s:if> 
  <s:else> 
  <s:bean name="org.apache.struts2.util.Counter" id="counter">
               <s:param name="first" value="1" />
               <s:param name="last" value="#page.totalPage" />
               <s:iterator>
                  <a href="searchbook?pageNow=<s:property/>"> <s:property/></a>
               </s:iterator>
            </s:bean>
  </s:else>
  </s:if>
<s:if test="#page.hasNext">  
             <a  href="searchbook?pageNow=<s:property value="#page.pageNow+1" />" target="main">下一页&gt;</a>  
        </s:if>  
         <s:if test="#page.hasLast">  
            <a href="searchbook?pageNow=<s:property value="#page.totalPage"/>"  target="main">尾页&gt;&gt;</a>  
        </s:if>
        &nbsp;&nbsp;&nbsp;&nbsp;跳到第<input type="text" id="jump" size="3"/><input type="hidden" id="total" value="${page.totalPage}">页<input name="jumpButton" type="button" value="跳转 "  class="btn btn-default" size="20" onclick="setPage()"/>
     </td>  
     </tr>
           </table>
          </div>
        </div>
      </div>
  <!--           <p><span>图书查询</span></p> -->

      <!-- Unnamed (矩形) -->
      <div id="u35" class="ax_default box_1">
        <div id="u35_div" class="">
        <hr></hr>
               <c:forEach items="${bookInfos}" var="it" >
               <div class="boxa">
        <div class="div1"><img height="146" width="100" src='upload/${it.image}'/></div>
        <div class="div2">
  <table  border="0" align="center">
     <tr>
     <td>名称: </td>
     <td><a href="showbook?id=${it.id}" style="text-decoration:none;color:blue;">${it.name }</a></td>
     </tr>
     <tr>
         <td>索书号:</td>
         <td>${it.callNumber}</td>
     </tr>
       <tr>
         <td>作者:</td>
         <td>${it.anthor}</td>
     </tr>
       <tr>
         <td>可借复本:</td>
         <td>${it.num }</td>
     </tr>
        <tr>
         <td>出版社:</td>
         <td>${it.publishName}</td>
     </tr>
        <tr>
         <td>语言:</td>
         <td>${it.language }</td>
         <tr>
         <td>分类:</td>
         <td>${it.kindOf }</td>
         <tr>
         <td>出版日期:</td>
         <td><fmt:formatDate value="${it.publishDate}" pattern="yyyy-MM-dd"/> </td>
<!--     
      <th scope="col">出版社</th>
       <th scope="col">出版日期</th>
         <th scope="col">价格</th>
         <th scope="col">分类</th>
         
        -->
<%--   <c:forEach items="${bookInfos}" var="it" > --%>
<%--   <tr>
    <td><img height="180" width="150" src='upload/${it.image}'/></td>
    <td><a href="#" style="text-decoration:none;color:blue;">${it.name }</a></td>
    <td>${it.isbn}</td> --%>
<%--<td>${it.anthor }</td>
    <td>${it.publishName }</td>
    <td>${it.publishDate }</td>
    <td>${it.callNumber }</td>
    <td>${it.price }</td>
    <td>${it.kindOf}</td>
    <td>${it.language}</td>
    <td>${it.num }</td> --%>
<!--   </tr> -->  
</table>
</div>
<div class="clear"></div>
</div>
 <hr></hr>
</c:forEach>
        </div>
      </div>
  </body>
</html>
