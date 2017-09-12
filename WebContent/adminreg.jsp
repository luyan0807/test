<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>管理员注册</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="adminreg/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="adminreg/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="adminreg/css/styles.css" type="text/css" rel="stylesheet"/>
    <link href="adminreg/css/styles1.css" type="text/css" rel="stylesheet"/>
    <script src="jquery-1.7.1.min.js"></script>
    <script src="adminreg/js/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="adminreg/js/prototypePre.js"></script>
    <script src="adminreg/js/document.js"></script>
    <script src="adminreg/js/prototypePost.js"></script>
    <script src="adminreg/js/data.js"></script>
    <script src="adminreg/js/myjs.js"></script>
  </head>
    <body>
    <div id="base" class="">

      <!-- Unnamed (矩形) -->
      <div id="u0" class="ax_default box_1">
        <img id="u0_img" class="img " src="adminreg/images/index/u0.png"/>
        <!-- Unnamed () -->
        <div id="u1" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>   
<s:form action="admin-save" theme="simple">

     <div id="u222" class="ax_default label">
        <img id="u2_img" class="img " src="adminreg/images/index/u2.png"/>
        <div id="u333" class="text">
          <p><span>注册类型</span></p>
        </div>
      </div>

      <div id="u2" class="ax_default label">
        <img id="u2_img" class="img " src="adminreg/images/index/u2.png"/>
        <div id="u3" class="text">
          <p><span>姓名</span></p>
        </div>
      </div>

      <div id="u4" class="ax_default text_field">
        <img id="u4_image_sketch" class="img " src="adminreg/images/index/name_u4_image_sketch.png" alt="u4_image_sketch"/>
        <s:textfield name="name" label="name" id="u4_input" placeholder="姓名" onblur="nameblur()"></s:textfield>
        <label id="laName" class="trip"></label>
      </div>


      <div id="u5" class="ax_default label">
        <img id="u5_img" class="img " src="adminreg/images/index/u5.png"/>
        <div id="u6" class="text">
          <p><span>证件号</span></p>
        </div>
      </div>

      <div id="u7" class="ax_default text_field">
        <img id="u7_image_sketch" class="img " src="adminreg/images/index/name_u4_image_sketch.png" alt="u7_image_sketch"/>
        <s:textfield name="idno" label="idno" id="u7_input"  placeholder="身份证号" onblur="id_numblur()"></s:textfield>
        <label id="laIdno" class="trip"></label>
      </div>

      <div id="u8" class="ax_default label">
        <img id="u8_img" class="img " src="adminreg/images/index/u2.png"/>
        <div id="u9" class="text">
          <p><span>密码</span></p>
        </div>
      </div>

      <div id="u10" class="ax_default text_field">
        <img id="u10_image_sketch" class="img " src="adminreg/images/index/name_u4_image_sketch.png" alt="u10_image_sketch"/>
        <s:password name="password" label="password" id="u10_input" placeholder="密码" onmouseup="pwdup()" onmousemove="pwdout()" onblur="pwdblur()"/>
      <label id="laPassword" class="trip"></label>
      </div>

      <div id="u11" class="ax_default label">
        <img id="u11_img" class="img " src="adminreg/images/index/u2.png"/>
        <div id="u12" class="text">
          <p><span>性别</span></p>
        </div>
      </div>


      <div id="u13" class="ax_default radio_button">
        <s:radio name="sex" list="%{#{'男':'男','女':'女'}}"  id="u13_input"></s:radio>
      </div>

      <div id="u17" class="ax_default label">
        <img id="u17_img" class="img " src="adminreg/images/index/u2.png"/>
        <div id="u18" class="text">
          <p><span>手机</span></p>
        </div>
      </div>

      <div id="u19" class="ax_default text_field">
        <img id="u19_image_sketch" class="img " src="adminreg/images/index/name_u4_image_sketch.png" alt="u19_image_sketch"/>
         <s:textfield name="phone" label="phone" id="u19_input"  placeholder="手机" onblur="phoneblur()" ></s:textfield>
      <label id="laPhone" class="trip"></label>
      </div>

      <div id="u20" class="ax_default label">
        <img id="u20_img" class="img " src="adminreg/images/index/u2.png"/>
        <div id="u21" class="text">
          <p><span>邮箱</span></p>
        </div>
      </div>

      <div id="u22" class="ax_default text_field">
        <img id="u22_image_sketch" class="img " src="adminreg/images/index/name_u4_image_sketch.png" alt="u22_image_sketch"/>
         <s:textfield name="email" label="email" id="u22_input"  placeholder="邮箱" onblur="emailblur()"></s:textfield>
      <label id="laEmail" class="trip"></label>
      </div>

      <div id="u23" class="ax_default label">
        <img id="u23_img" class="img " src="adminreg/images/index/u2.png"/>
        <div id="u24" class="text">
          <p><span>地址</span></p>
        </div>
      </div>

      <div id="u25" class="ax_default text_field">
        <img id="u25_image_sketch" class="img " src="adminreg/images/index/name_u4_image_sketch.png" alt="u25_image_sketch"/>
         <s:textfield name="address" label="address" id="u25_input"  placeholder="地址" onblur="addrblur()"></s:textfield>
      <label id="laAddress" class="trip"></label>
      </div>

      <div id="u26" class="ax_default html_button">
        <img id="u26_image_sketch" class="img " src="adminreg/images/index/u26_image_sketch.png" alt="u26_image_sketch"/>
        <s:submit id="u26_input" value="注册" onclick="return validate_required(this.form)"></s:submit>
      </div>
      
      <div id="uu13" class="ax_default radio_button">
        <s:radio name="type" list="%{#{'b':'图书管理员','s':'系统管理员'}}"  id="uu13_input"></s:radio>
      </div>
      
      <div id="u88" class="ax_default label">
        <img id="u88_img" class="img " src="adminreg/images/index/u2.png"/>
        <div id="u99" class="text">
          <p><span>确认密码</span></p>
        </div>
      </div>

      <div id="u10a" class="ax_default text_field" >
        <img id="u10_image_sketcha" class="img " src="adminreg/images/index/name_u4_image_sketch.png" alt="u10_image_sketch"/>
        <s:password name="checkpassword" label="checkpassword" id="u10_inputa"  placeholder="确认密码" onblur="repblur()"></s:password>
      <label id="laCheckpassword" class="trip"></label>
      </div>

      <div id="u888" class="ax_default label">
        <img id="u888_img" class="img " src="adminreg/images/index/u2.png"/>
        <div id="u999" class="text">
          <p><span>验证码</span></p>
        </div>
      </div>
      
      <div id="u10aa" class="ax_default text_field" >
        <img id="u10_image_sketchaa" class="img " src="adminreg/images/index/name_u4_image_sketch.png" alt="u10_image_sketch"/>
        <s:textfield name="code" label="code" id="u10_inputaa"  placeholder="验证码"></s:textfield><br/>
        <div id="code">
        <s:submit name="getcode" label="getcode" value="获取验证码" ></s:submit>
        </div>
      </div>

      <div id="u27" class="ax_default image">
        <img id="u27_img" class="img " src="adminreg/images/index/u27.png"/>
        <div id="u28" class="text" style="display:none; visibility: hidden">
          <p><span></span></p>
        </div>
      </div>
</s:form>
<s:token></s:token>
      <div id="u29" class="ax_default label">
        <img id="u29_img" class="img " src="adminreg/images/index/u29.png"/>
        <div id="u30" class="text">
          <p><span>管理员注册</span></p>
        </div>
      </div>
    </div>
  </body>
</html>
