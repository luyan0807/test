<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
             <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
          <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>index</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
      <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="css/bootstrap.min.css">  
     <link rel="stylesheet" href="css/addbook.css">  
      <link rel="stylesheet" href="css/showbook.css">  
     <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
     <script src="js/bootstrap.min.js"></script>
     <link rel="stylesheet" href="css/showbook.css">  
    <link href="adminsuccess/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="adminsuccess/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="adminsuccess/css/styles.css" type="text/css" rel="stylesheet"/>
    <link href="adminsuccess/css/styles1.css" type="text/css" rel="stylesheet"/>
    <link href="adminsuccess/css/other.css" type="text/css" rel="stylesheet"/>
    <script src="jquery-1.7.1.min.js"></script>
    <script src="adminsuccess/js/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="adminsuccess/js/prototypePre.js"></script>
    <script src="adminsuccess/js/document.js"></script>
    <script src="adminsuccess/js/prototypePost.js"></script>
    <script src="adminsuccess/js/data.js"></script>
    <script src="adminsuccess/js/myjs.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
      $(document).ready(function(){
    	  $("#email")[0].value=$("#u84_input")[0].value;
    	  $("#address")[0].value=$("#u90_input")[0].value;
    	  $("#nation")[0].value=$("#u85_input")[0].value;
    	  $("#sex")[0].value=$("#u86_input")[0].value;
    	  $("#phone")[0].value=$("#u89_input")[0].value;
    	});
    </script>
  </head>
    <body>
     <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="modal fade" id="modal-container-535883" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel" style="color: blue">
								完善信息
							</h4>
						</div>
						<div class="modal-body">
								<form action="admin-input" method="post">
									<input type="hidden" name="id" id="id" value="${admin.id}" />
									<label>性别</label> <input name="sex" id="sex"class="form-control" />
									<label>邮箱</label><input name="email" id="email" class="form-control" />
									<label>手机</label><input name="phone" id="phone"class="form-control" />
									<label>民族</label><input name="nation" id="nation" class="form-control" />
									<label>地址</label><input name="address" id="address"class="form-control" />
							</div>
						<div class="modal-footer">
						<input type="submit" value="保存" class="btn btn-default"/>
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						</div>
							</form>
					</div>
					
				</div>
				
			</div>
			
		</div>
	</div>
</div>
    
    <div id="base" class="">
        <div id="light" class="white_content"> 
  <p align="right">  <a href="javascript:void(0)"  onclick="document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'"> 
    关闭</a></p>
<div align="center">
<p align="center">修改个人信息</p>
<br/>
<form action="admin-input" method="post">
<input type="hidden" name="id" id="id" value="${admin.id}"/>
<label>性别</label><input name="sex" id="sex"  /><br/><br/><br/>
<label>邮箱</label><input name="email" id="email"  /><br/><br/><br/>
<label>手机</label><input name="phone" id="phone"  /><br/><br/><br/>
<label>民族</label><input name="nation" id="nation"  /><br/><br/><br/>
<label>地址</label><input name="address" id="address" /><br/><br/><br/>
<input type="submit" value="保存"/>
</form>
</div>
</div> 
<div id="fade" class="black_overlay"> 
</div> 
          <div id="light1" class="white_content1"> 
          <p align="right"> <a href="javascript:void(0)"  onclick="document.getElementById('light1').style.display='none';document.getElementById('fade1').style.display='none'"> 
                                  关闭</a></p>
          <p align="center">借阅编号录入</p>
          <br/>
          <div class="modal-body">
          <form action="bookbarcode-save" method="post">
           <label>isbn:</label>
           <label id="laisbn"></label>
           <input id="isbnva" type="text" name="isbn" class="form-control" onblur="vaisbnblur()" />
           <label>编码:</label>
           <label id="labarcode1"></label>
           <input id="barcodeva" type="text" name="barcode" class="form-control" onblur="vabarcodeblur()" /><br/>
            <input id="buttonB" class="btn btn-default" type="submit" value="录入" onclick="return addbarcode()" /> 
            </form>       
          </div>
          </div> 
<div id="fade1" class="black_overlay1"> </div>
          <div id="light2" class="white_content1"> 
          <p align="right"> <a href="javascript:void(0)"  onclick="document.getElementById('light2').style.display='none';document.getElementById('fade2').style.display='none'"> 
                                  关闭</a></p>
          <p align="center">借阅编号注销</p>
          <br/>
          <div class="modal-body">
          <form action="bookbarcode-delete" method="post">
           <label>isbn:</label>
           <label id="laisbn2"></label>
           <input id="vaisbn2" type="text" name="isbn" class="form-control" onblur="vaisbn2blur()"/>
           <label>编码:</label>
           <label id="labarcode2"></label>
           <input id="vabarcode2" type="text" name="barcode" class="form-control" onblur="vabarcode2blur()"/>
            <input id="buttonB" class="btn btn-default" type="submit" value="注销" onclick="return delbarcode()"/>   
            </form>     
          </div>
          </div>
		<div id="fade2" class="black_overlay1"> </div>
      <!-- Unnamed (组合) -->
      <div id="u0" class="ax_default" data-width="1096" data-height="957">

        <!-- Unnamed (组合) -->
        <div id="u1" class="ax_default" data-width="1096"  data-height="957">

          <!-- Unnamed (矩形) -->
          <div id="u2" class="ax_default box_1">
            <div id="u2_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u3" class="text" style="display:none; visibility: hidden">
              <p><span></span></p>
            </div>
          </div>

          <!-- Unnamed (图片) -->
          <div id="u4" class="ax_default image">
            <img id="u4_img" class="img " src="images/index/u4.jpg"/>
            <!-- Unnamed () -->
            <div id="u5" class="text" style="display:none; visibility: hidden">
              <p><span></span></p>
            </div>
          </div>

          <!-- Unnamed (矩形) -->
          <div id="u6" class="ax_default label">
            <div id="u6_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u7" class="text">
              <p><span>退出</span></p>
            </div>
          </div>

          <!-- Unnamed (组合) -->
          <div id="u8" class="ax_default" data-width="1096" data-height="661">

            <!-- Unnamed (矩形) -->
            <div id="u9" class="ax_default box_1">
              <div id="u9_div" class=""></div>
              <!-- Unnamed () -->
              <div id="u10" class="text" style="display:none; visibility: hidden">
                <p><span></span></p>
              </div>
            </div>

            <!-- Unnamed (组合) -->
            <div id="u11" class="ax_default" data-width="224" data-height="661">

              <!-- Unnamed (图片) -->
              <div id="u12" class="ax_default image">
                <img id="u12_img" class="img " src="images/index/u12.png"/>
                <!-- Unnamed () -->
                <div id="u13" class="text" style="display:none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>

              <!-- Unnamed (矩形) -->
              <div id="u14" class="ax_default label">
                <div id="u14_div" class=""></div>
                <!-- Unnamed () -->
                <div id="u15" class="text">
                  <p><span><a href="test.jsp" style='text-decoration:none;'>我的评分</a></span></p>
                </div>
              </div>

              <!-- Unnamed (图片) -->
              <div id="u16" class="ax_default image">
                <img id="u16_img" class="img " src="images/index/u16.png"/>
                <!-- Unnamed () -->
                <div id="u17" class="text" style="display:none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>

              <!-- Unnamed (矩形) -->
              <div id="u18" class="ax_default label">
                <div id="u18_div" class=""></div>
                <!-- Unnamed () -->
                <div id="u19" class="text">
                  <p><span>个人信息</span></p>
                </div>
              </div>

              <!-- Unnamed (图片) -->
              <div id="u20" class="ax_default image">
                <img id="u20_img" class="img " src="images/index/u20.png"/>
                <!-- Unnamed () -->
                <div id="u21" class="text" style="display:none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>

              <!-- Unnamed (矩形) -->
              <div id="u22" class="ax_default label">
                <div id="u22_div" class=""></div>
                <!-- Unnamed () -->
                <div id="u23" class="text">
                  <p><span onclick="slide()">图书管理</span></p>
                </div>
              </div>

              <!-- Unnamed (图片) -->
              <div id="u24" class="ax_default image">
                <img id="u24_img" class="img " src="images/index/u24.png"/>
                <!-- Unnamed () -->
                <div id="u25" class="text" style="display:none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>

              <!-- Unnamed (矩形) -->
              <div id="u26" class="ax_default label">
                <div id="u26_div" class=""></div>
                <!-- Unnamed () -->
                <div id="u27" class="text">
                  <p><span><a href="searchbook.jsp" style='text-decoration:none;'>查找图书</a></span></p>
                </div>
              </div>

              <!-- Unnamed (图片) -->
              <div id="u28" class="ax_default image">
                <img id="u28_img" class="img " src="images/index/u28.png"/>
                <!-- Unnamed () -->
                <div id="u29" class="text" style="display:none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>

              <!-- Unnamed (矩形) -->
              <div id="u30" class="ax_default label">
                <div id="u30_div" class=""></div>
                <!-- Unnamed () -->
                <div id="u31" class="text">
                  <p><span><a href="wishbook.jsp" style='text-decoration:none;'>读者心愿单</a></span></p>
                </div>
              </div>

              <!-- Unnamed (图片) -->
              <div id="u32" class="ax_default image">
                <img id="u32_img" class="img " src="images/index/u32.png"/>
                <!-- Unnamed () -->
                <div id="u33" class="text" style="display:none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>

              <!-- Unnamed (矩形) -->
              <div id="u34" class="ax_default label">
                <div id="u34_div" class=""></div>
                <!-- Unnamed () -->
                <div id="u35" class="text">
                <s:iterator value="#session.admin" var="a"></s:iterator>
                  <p><span><a href="booklist.jsp?id=${a.id}" style='text-decoration:none;'>图书导购单</a></span></p>
                </div>
              </div>

              <!-- Unnamed (图片) -->
              <div id="u36" class="ax_default image">
                <img id="u36_img" class="img " src="images/index/u36.png"/>
                <!-- Unnamed () -->
                <div id="u37" class="text" style="display:none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>

              <!-- Unnamed (矩形) -->
              <div id="u38" class="ax_default label">
                <div id="u38_div" class=""></div>
                <!-- Unnamed () -->
                <div id="u39" class="text">
                  <p><span onclick="slide2()">读者赠书单</span></p>
                </div>
              </div>

              <!-- Unnamed (图片) -->
              <div id="u40" class="ax_default image">
                <img id="u40_img" class="img " src="images/index/u40.png"/>
                <!-- Unnamed () -->
                <div id="u41" class="text" style="display:none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>

              <!-- Unnamed (矩形) -->
              <div id="u42" class="ax_default label">
                <div id="u42_div" class=""></div>
                <!-- Unnamed () -->
                <div id="u43" class="text">
                  <p><span>借阅处理</span></p>
                </div>
              </div>

              <!-- Unnamed (图片) -->
              <div id="u44" class="ax_default image">
                <img id="u44_img" class="img " src="images/index/u44.png"/>
                <!-- Unnamed () -->
                <div id="u45" class="text" style="display:none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>

              <!-- Unnamed (矩形) -->
              <div id="u46" class="ax_default label">
                <div id="u46_div" class=""></div>
                <!-- Unnamed () -->
                <div id="u47" class="text">
                  <p><span>归还处理</span></p>
                </div>
              </div>

              <!-- Unnamed (垂直线) -->
              <div id="u48" class="ax_default line">
                <img id="u48_img" class="img " src="images/index/u48.png"/>
                <!-- Unnamed () -->
                <div id="u49" class="text" style="display:none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>
            </div>

            <!-- 公告 (动态面板) -->
            <div id="u50" class="ax_default" data-label="公告">
              <div id="u50_state0" class="panel_state" data-label="State1" style="">
                <div id="u50_state0_content" class="panel_state_content">

                  <!-- Unnamed (文本段落) -->
                  <div id="u51" class="ax_default _文本段落">
                    <img id="u51_img" class="img " src="images/index/u51.png"/>
                    <!-- Unnamed () -->
                    <div id="u52" class="text">
                      <p><span>今日公告</span></p>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <!-- 功能 (动态面板) -->
            <div id="u53" class="ax_default" data-label="功能">
              <div id="u53_state0" class="panel_state" data-label="first" style="">
                <div id="u53_state0_content" class="panel_state_content">

                  <!-- Unnamed (矩形) -->
                  <div id="u54" class="ax_default label">
                    <div id="u54_div" class=""></div>
                    <!-- Unnamed () -->
                    <div id="u55" class="text">
                      <p><span>图书馆管理系统欢迎您</span></p>
                      </br>
                      <a href="adminlogin.jsp">退出</a>
                    </div>
                  </div>
                </div>
              </div>
              <div id="u53_state1" class="panel_state" data-label="个人信息" style="visibility: hidden;">
                <div id="u53_state1_content" class="panel_state_content">

                  <!-- Unnamed (组合) -->
                  <div id="u56" class="ax_default" data-width="556" data-height="453">

                    <!-- Unnamed (图片) -->
                    <div id="u57" class="ax_default image">
                      <img id="u57_img" class="img " src="images/index/u16.png"/>
                      <!-- Unnamed () -->
                      <div id="u58" class="text" style="display:none; visibility: hidden">
                        <p><span></span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u59" class="ax_default label">
                      <div id="u59_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u60" class="text">
                        <p><span>个人信息</span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u61" class="ax_default box_1">
                      <div id="u61_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u62" class="text" style="display:none; visibility: hidden">
                        <p><span></span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u63" class="ax_default label">
                      <div id="u63_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u64" class="text">
                        <p><span>姓名：</span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u65" class="ax_default label">
                      <div id="u65_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u66" class="text">
                        <p><span>证件号：</span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u67" class="ax_default label">
                      <div id="u67_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u68" class="text">
                        <p><span>手机：</span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u69" class="ax_default label">
                      <div id="u69_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u70" class="text">
                        <p><span>邮箱：</span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u71" class="ax_default label">
                      <div id="u71_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u72" class="text">
                        <p><span>民族：</span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u73" class="ax_default label">
                      <div id="u73_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u74" class="text">
                        <p><span>出生日期：</span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u75" class="ax_default label">
                      <div id="u75_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u76" class="text">
                        <p><span>性别：</span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u77" class="ax_default label">
                      <div id="u77_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u78" class="text">
                        <p><span>入职日期：</span></p>
                      </div>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u79" class="ax_default label">
                      <div id="u79_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u80" class="text">
                        <p><span>文化程度：</span></p>
                      </div>
                    </div>
                    <!-- Unnamed (文本框) -->
                    <div id="u81" class="ax_default text_field">
                      <input id="u81_input" type="text"  value="${admin.birthday}"/> 
                    </div>

                    <!-- Unnamed (文本框) -->
                    <div id="u82" class="ax_default text_field">
                    <input id="u82_input" type="text"  value="${admin.onworkDate}"/> 
                    </div>

                    <!-- Unnamed (文本框) -->
                    <div id="u83" class="ax_default text_field">
                      <input id="u83_input" type="text" value="${admin.edurank}"/>
                    </div>

                    <!-- Unnamed (文本框) -->
                    <div id="u84" class="ax_default text_field">
                     <input id="u84_input" type="text" value="${admin.email}"/>
                    </div>

                    <!-- nation (文本框) -->
                    <div id="u85" class="ax_default text_field" data-label="nation">
                      <input id="u85_input" type="text"  value="${admin.nation}"/>
                    </div>

                    <!-- sex (文本框) -->
                    <div id="u86" class="ax_default text_field" data-label="sex">
                      <input id="u86_input" type="text" value="${admin.sex}"/>
                    </div>

                    <!-- Unnamed (矩形) -->
                    <div id="u87" class="ax_default label">
                      <div id="u87_div" class=""></div>
                      <!-- Unnamed () -->
                      <div id="u88" class="text">
                        <p><span>地址:</span></p>
                      </div>
                    </div>

                    <!-- Unnamed (文本框) -->
                    <div id="u89" class="ax_default text_field">
                      <input id="u89_input" type="text"  value="${admin.phone}"/>
                    </div>

                    <!-- Unnamed (文本框) -->
                    <div id="u90" class="ax_default text_field">
                      <input id="u90_input" type="text" value="${admin.address}"/>
                    </div>

                    <!-- IDno (文本框) -->
                    <div id="u91" class="ax_default text_field" data-label="IDno">
                      <input id="u91_input" type="text"  value="${admin.idno}"/>
                    </div>

                    <!-- name (文本框) -->
                    <div id="u92" class="ax_default text_field" data-label="name">
                      <input id="u92_input" type="text"value="${admin.name}"/>
                    </div>
                    <!-- Unnamed (提交按钮) -->
                    <div id="u93" class="ax_default html_button">
                    <!--  <p><a href="javascript:void(0)" onclick="document.getElementById('light').style.display='block';document.getElementById('fade').style.display='block'">修改</a></p>  -->
                    <a href="#modal-container-535883" style="color: blue;" id="modal-535883"  role="button" class="btn" data-toggle="modal">完善信息</a>
                    </div>

                    <!-- Unnamed (提交按钮) -->
                    <div id="u94" class="ax_default html_button">
                      <input id="u94_input" type="submit" value="修改密码"/>
                    </div>
                  </div>
                </div>
              </div>
              <div id="u53_state2" class="panel_state" data-label="图书管理" style="visibility: hidden;">
                <div id="u53_state2_content" class="panel_state_content">

                   <div id="l1" onclick="document.getElementById('light1').style.display='block';document.getElementById('fade1').style.display='block'"><div id="ll1"><p>借阅编号录入</p></div></div>
                   <div id="l2" onclick="document.getElementById('light2').style.display='block';document.getElementById('fade2').style.display='block'"><div id="ll2"><p>借阅编号注销</p></div></div>
                   <div id="l3" onclick="window.open('updatebook.jsp')"><div id="ll3"><p>编辑图书</p></div></div>
                   <div id="l4" onclick="window.open('addbook.jsp')"><div id="ll4"><p>录入图书</p></div></div>
                </div>
              </div>
              <div id="u53_state3" class="panel_state" data-label="查找图书" style="visibility: hidden;">
                <div id="u53_state3_content" class="panel_state_content">
                
                </div>
              </div>
              <div id="u53_state4" class="panel_state" data-label="借阅处理" style="visibility: hidden;">
                <div id="u53_state4_content" class="panel_state_content">

                   <!-- Unnamed (图片) -->
                  <div id="u115" class="ax_default image">
                    <img id="u115_img" class="img " src="images/index/u40.png"/>
                    <!-- Unnamed () -->
                    <div id="u116" class="text" style="display:none; visibility: hidden">
                      <p><span></span></p>
                    </div>
                  </div>

                  <!-- Unnamed (矩形) -->
                  <div id="u117" class="ax_default label">
                    <div id="u117_div" class=""></div>
                    <!-- Unnamed () -->
                    <div id="u118" class="text">
                      <p><span>借阅处理</span></p>
                    </div>
                  </div>
     <input type="hidden" name="no1"/>
     <input type="hidden" name="no2"/>
     <input type="hidden" name="no3"/>
     <input type="hidden" name="no4"/>
                  <!-- Unnamed (矩形) -->
                  <div id="u119" class="ax_default label">
                    <div id="u119_div" class=""></div>
                    <!-- Unnamed () -->
                    <div id="u120" class="text">
                    <label id="labarcode" class="tip"></label>
                      <p><span>借阅条形码</span></p>
                    </div>
                  </div>

                  <!-- barcode (文本框) -->
                  <div id="u121" class="ax_default text_field" data-label="barcode">
                    <input class="form-control" id="u121_input" type="text" name="barcode"onblur="validationBook()"/>
                  </div>

                  <!-- Unnamed (矩形) -->
                  <div id="u122" class="ax_default label">
                    <div id="u122_div" class=""></div>
                    <!-- Unnamed () -->
                    <div id="u123" class="text">
                      <label id="laidno" class="tip"></label>
                      <p><span>读者证件号</span></p>
                    </div>
                  </div>

                  <!-- readeridno (文本框) -->
                  <div id="u124" class="ax_default text_field" data-label="readeridno">
                    <input class="form-control" id="u124_input" type="text" name="idno" onblur="validationReader()"/>
                  </div>

                  <!-- Unnamed (提交按钮) -->
                  <div id="u125" class="ax_default html_button">
                    <label class="laerror" id="laerror"></label>
                    <input onclick="return borrow()" class="btn btn-default" id="u125_input" type="button" value="借阅"/>
                  </div>
                  
                </div>
              </div>
              <div id="u53_state5" class="panel_state" data-label="归还处理" style="visibility: hidden;">
                <div id="u53_state5_content" class="panel_state_content">

                  <!-- Unnamed (图片) -->
                  <div id="u126" class="ax_default image">
                    <img id="u126_img" class="img " src="images/index/u44.png"/>
                    <!-- Unnamed () -->
                    <div id="u127" class="text" style="display:none; visibility: hidden">
                      <p><span></span></p>
                    </div>
                  </div>

                  <!-- Unnamed (矩形) -->
                  <div id="u128" class="ax_default label">
                    <div id="u128_div" class=""></div>
                    <!-- Unnamed () -->
                    <div id="u129" class="text">
                      <p><span>归还处理</span></p>
                    </div>
                  </div>
                  
                  <!-- Unnamed (矩形) -->
                  <div id="u130" class="ax_default label">
                    <div id="u130_div" class=""></div>
                    <!-- Unnamed () -->
                    <div id="u131" class="text">
                      <p><span>借阅条形码</span></p>
                       <label class="tip" id="returnBarcode"></label>
                    </div>
                  </div>

                  <!-- barcode (文本框) -->
                  <div id="u132" class="ax_default text_field" data-label="barcode">
                    <input class="form-control" id="u132_input" type="text" name="barcode" onblur="vaBarcoed()"/>
                  </div>
                  <!-- Unnamed (提交按钮) -->
                  <div id="u136" class="ax_default html_button">
                  <label class="laerror" id="laerrorR"></label>
                    <input class="btn btn-default" id="u136_input" type="button" value="归还" onclick="return returnbook()"/>
                  
                  </div>
                </div>
              </div>
                    
              <div id="u53_state6" class="panel_state" data-label="读者赠书单" style="visibility: hidden;">
               <div id="u53_state2_content" class="panel_state_content">
                   <div id="l11" >
                   <div id="lll1">
                   <form action="showLargess"><input id="showbutton1" type="submit" value="显示全部" /></form>
                   </div>
                   </div>
                   <div id="l22">
                   <div id="lll2">
                     <form action="showNotchecked"><input id="showbutton2" type="submit" value="未审核" /></form>
                   </div>
                   </div>
                   <div id="l5" onclick="window.open('addbook.jsp')"><div id="lll4"><p>已拒绝</p></div></div>
                </div>
              </div>
              
               
              <div id="u53_state7" class="panel_state" data-label="读者心愿单" style="visibility: hidden;">
                <div id="u53_state7_content" class="panel_state_content">
                </div>
              </div>
              
            
    
              <div id="u53_state10" class="panel_state" data-label="我的评分" style="visibility: hidden;">
                <div id="u53_state10_content" class="panel_state_content">
                </div>
              </div>
              
            </div>

            <!-- Unnamed (水平线) -->
            <div id="u175" class="ax_default line">
              <img id="u175_img" class="img " src="images/index/u175.png"/>
              <!-- Unnamed () -->
              <div id="u176" class="text" style="display:none; visibility: hidden">
                <p><span></span></p>
              </div>
            </div>
          </div>

          <!-- Unnamed (组合) -->
          <div id="u177" class="ax_default" data-width="1095" data-height="64">

            <!-- Unnamed (菜单) -->
            <div id="u178" class="ax_default">
              <img id="u178_menu" class="img " src="images/index/u178_menu.png" alt="u178_menu"/>

              <!-- Unnamed (表格) -->
              <div id="u179" class="ax_default">

                <!-- Unnamed (Menu Item) -->
                <div id="u180" class="ax_default menu_item">
                  <img id="u180_img" class="img " src="images/index/u180.png"/>
                  <!-- Unnamed () -->
                  <div id="u181" class="text">
                    <p><span>&nbsp;&nbsp;&nbsp;<a href="tets.jsp" style='text-decoration:none;'>最新资讯</a></span></p>
                  </div>
                </div>

                <!-- Unnamed (Menu Item) -->
                <div id="u182" class="ax_default menu_item">
                  <img id="u182_img" class="img " src="images/index/u182.png"/>
                  <!-- Unnamed () -->
                  <div id="u183" class="text">
                    <p><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="test.jsp" style='text-decoration:none;'>作者讲座</a></span></p>
                  </div>
                </div>

                <!-- Unnamed (Menu Item) -->
                <div id="u186" class="ax_default menu_item">
                  <img id="u186_img" class="img " src="images/index/u186.png"/>
                  <!-- Unnamed () -->
                  <div id="u185" class="text">
                    <p><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<a href="borrowSort.jsp" style='text-decoration:none;'>图书借阅排行</a></span></p>
                  </div>
                </div>

                <!-- Unnamed (Menu Item) -->
                <div id="u184" class="ax_default menu_item">
                  <img id="u184_img" class="img " src="images/index/u184.png"/>
                  <!-- Unnamed () -->
                  <div id="u187" class="text">
                    <p><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; <a href="test.jsp" style='text-decoration:none;'>最新活动</a></span></p>
                  </div>
                </div>

                <!-- Unnamed (Menu Item) -->
                <div id="u188" class="ax_default menu_item">
                  <img id="u188_img" class="img " src="images/index/u188.png"/>
                  <!-- Unnamed () -->
                  <div id="u189" class="text">
                    <p><span>&nbsp;&nbsp; &nbsp; &nbsp; <a href="WEB-INF/views/adminsuccess.jsp" >Home</a></span></p>
                  </div>
                </div>
              </div>
            </div>

            <!-- Unnamed (图片) -->
            <div id="u190" class="ax_default image">
              <img id="u190_img" class="img " src="images/index/u190.png"/>
              <!-- Unnamed () -->
              <div id="u191" class="text" style="display:none; visibility: hidden">
                <p><span></span></p>
              </div>
            </div>

            <!-- Unnamed (图片) -->
            <div id="u192" class="ax_default image">
              <img id="u192_img" class="img " src="images/index/u192.png"/>
              <!-- Unnamed () -->
              <div id="u193" class="text" style="display:none; visibility: hidden">
                <p><span></span></p>
              </div>
            </div>

            <!-- Unnamed (图片) -->
            <div id="u194" class="ax_default image">
              <img id="u194_img" class="img " src="images/index/u194.png"/>
              <!-- Unnamed () -->
              <div id="u195" class="text" style="display:none; visibility: hidden">
                <p><span></span></p>
              </div>
            </div>

            <!-- Unnamed (图片) -->
            <div id="u196" class="ax_default image">
              <img id="u196_img" class="img " src="images/index/u196.png"/>
              <!-- Unnamed () -->
              <div id="u197" class="text" style="display:none; visibility: hidden">
                <p><span></span></p>
              </div>
            </div>

            <!-- Unnamed (图片) -->
            <div id="u198" class="ax_default image">
              <img id="u198_img" class="img " src="images/index/u198.png"/>
              <!-- Unnamed () -->
              <div id="u199" class="text" style="display:none; visibility: hidden">
                <p><span></span></p>
              </div>
            </div>
          </div>

          <!-- top (动态面板) -->
          <div id="u200" class="ax_default" data-label="top">
            <div id="u200_state0" class="panel_state" data-label="State1" style="">
              <div id="u200_state0_content" class="panel_state_content">

                <!-- Unnamed (图片) -->
                <div id="u201" class="ax_default image">
                  <img id="u201_img" class="img " src="images/index/u201.jpg"/>
                  <!-- Unnamed () -->
                  <div id="u202" class="text" style="display:none; visibility: hidden">
                    <p><span></span></p>
                  </div>
                </div>
              </div>
            </div>
            <div id="u200_state1" class="panel_state" data-label="State3" style="visibility: hidden;">
              <div id="u200_state1_content" class="panel_state_content">

                <!-- Unnamed (图片) -->
                <div id="u203" class="ax_default image">
                  <img id="u203_img" class="img " src="images/index/u203.jpg"/>
                  <!-- Unnamed () -->
                  <div id="u204" class="text" style="display:none; visibility: hidden">
                    <p><span></span></p>
                  </div>
                </div>
              </div>
            </div>
            <div id="u200_state2" class="panel_state" data-label="State2" style="visibility: hidden;">
              <div id="u200_state2_content" class="panel_state_content">

                <!-- Unnamed (图片) -->
                <div id="u205" class="ax_default image">
                  <img id="u205_img" class="img " src="images/index/u205.png"/>
                  <!-- Unnamed () -->
                  <div id="u206" class="text" style="display:none; visibility: hidden">
                    <p><span></span></p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
