<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
          <%@taglib uri="/struts-tags" prefix="s" %>  
   <%@taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
  <head>
    <title>index</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="adminlogin/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="adminlogin/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="adminlogin/css/styles.css" type="text/css" rel="stylesheet"/>
    <link href="adminlogin/css/styles1.css" type="text/css" rel="stylesheet"/>
    <script src="jquery-1.7.1.min.js"></script>
    <script src="adminlogin/js/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="adminlogin/js/prototypePre.js"></script>
    <script src="adminlogin/js/document.js"></script>
    <script src="adminlogin/js/prototypePost.js"></script>
    <script src="adminlogin/js/data.js"></script>
    <script src="adminlogin/js/myjs.js"></script>
    <script type="text/javascript">
    </script>
  </head>
   <body>
   
    <div id="base" class="">

      <div id="u0" class="ax_default image">
        <img id="u0_img" class="img " src="adminlogin/images/u0.png"/>
        <!-- Unnamed () -->
        <div id="u1" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>

      <div id="u2" class="ax_default _一级标题">
        <div id="u2_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u3" class="text">
          <p><span>Admin&nbsp; Login</span></p>
        </div>
      </div>
      <div id="uu3" class="text">
<p><s:fielderror fieldName="idno"></s:fielderror></p>
</div>
      <div id="uu4" class="text">
<p><s:fielderror fieldName="password"></s:fielderror></p>
</div>
      <!-- Unnamed (组合) -->
      <div id="u4" class="ax_default" data-width="300" data-height="198">

        <!-- Unnamed (矩形) -->
        <div id="u5" class="ax_default box_1">
          <div id="u5_div" class=""></div>
          <!-- Unnamed () -->
          <div id="u6" class="text" style="display:none; visibility: hidden">
            <p><span></span></p>
          </div>
        </div>

        <!-- Unnamed (矩形) -->
        <div id="u7" class="ax_default label">
          <div id="u7_div" class=""></div>
          <!-- Unnamed () -->
          <div id="u8" class="text">
            <p><span>证件号
            </span></p>
          </div>
        </div>

        <!-- Unnamed (矩形) -->
        <div id="u9" class="ax_default label">
          <div id="u9_div" class=""></div>
          <!-- Unnamed () -->
          <div id="u10" class="text">
            <p><span>密码</span></p>
          </div>
        </div>
        
                <!-- Unnamed (矩形) -->
        <div id="u99" class="ax_default label">
          <div id="u99_div" class=""></div>
          <!-- Unnamed () -->
          <div id="u100" class="text">
            <p><span>验证码</span></p>
          </div>
        </div>
        
                
        <!-- Unnamed (矩形) -->
        <div id="u999" class="ax_default label">
          <div id="u999_div" class=""></div>
          <!-- Unnamed () -->
          <div id="u1000" class="text">
            <p><span>记住密码(两周内有效)</span></p>
          </div>
        </div>
       
        
<form action="admin-check" method="post"> 
      <div id="uu13" class="ax_default radio_button">
        <s:radio name="type" list="%{#{'b':'图书管理员','s':'系统管理员'}}"  id="uu13_input"></s:radio>
      </div>
        <!-- name (文本框) -->
        <div id="u11" class="ax_default text_field" data-label="name">
          <input id="u11_input" type="text" name="idno" value='${cookie["idno"].value}'/>
        </div>

        <!-- password (文本框) -->
        <div id="u12" class="ax_default text_field" data-label="password">
          <input id="u12_input" type="password" name="password" value='${cookie["password"].value}'/>
        </div>

        <!-- Unnamed (矩形) -->
        <div id="u13" class="ax_default label">
          <div id="u13_div" class=""></div>
          <!-- Unnamed () -->
          <div id="u14" class="text">
            <p><span><a href="adminreg.jsp">注册</a></span></p>
          </div>
        </div>

        <!-- Unnamed (矩形) -->
        <div id="u15" class="ax_default label">
          <div id="u15_div" class=""></div>
          <!-- Unnamed () -->
          <div id="u16" class="text">
            <p><span>忘记密码？</span></p>
          </div>
        </div>
         
         
         <div id="u20" class="ax_default text_field">
         <div id="uu20" class="message">
           <img alt="验证码" id="imagecode" src="BMS_ssh/SecurityCodeImageAction"/>
	      <span class="sp"><a href="javascript:reloadCode();">换一张</a></span>
	      </div>
          <input id="u20_input" type="text" name="code"/>
        </div>
         
         <div id="u200" class="ax_default text_field">
         <input type="checkbox" name="time" id="u200_input" value="14"/>
         </div>
        
        
        <!-- Unnamed (提交按钮) -->
        <div id="u17" class="ax_default html_button">
          <input id="u17_input" type="submit" value="登录" onclick="return validate_required(this.form)"/>
        </div>
</form>
   
      </div>
    </div>
  </body>
</html>
