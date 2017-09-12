/**
 * 
 */
//验证姓名合法性
function nameblur()
  {
  var getname=document.getElementById('name');
  var getdiv1=document.getElementById('laName');
   if(getname.value=='')
   {
     getdiv1.innerHTML='书名不能为空';
     return false;
   }
	 else  
	 {
		 getdiv1.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	 return true;
	 }
}
function  anthorblur(){
	 var getname=document.getElementById('anthor');
	  var getdiv1=document.getElementById('laAnthor');
	   if(getname.value=='')
	   {
	     getdiv1.innerHTML='作者不能为空';
	     return false;
	   }
		 else  
		 {
			 getdiv1.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
		 return true;
		 }
}
function isbnblur(){
	var getid=document.getElementById("isbn");
	var gettd=document.getElementById("laIsbn");
	var str=/^\d{3}-\d-\d{3}-\d{5}-\d$/;
	 if(getid.value==''){
	   gettd.innerHTML='ISBN不能为空';
	   return false;
	 }
	 else if(str.test(getid.value)){
	 gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	 return true;
	}
	else{
	 gettd.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
	 return false;
	}
}
function priceblur(){
	var getid=document.getElementById("price");
	var gettd=document.getElementById("laPrice");
	var str=/^(0|[1-9][0-9]{0,9})(\.[0-9]{1,2})?$/;
	 if(getid.value==''){
	   gettd.innerHTML='价格不能为空';
	   return false;
	 }
	 else if(str.test(getid.value)){
	 gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	 return true;
	}
	else{
	 gettd.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
	 return false;
	}
}
function plotSummaryblur(){
	var getid=$("#plots").val();
	var gettd=document.getElementById("laplotSummary");
	 if(getid==''){
		 gettd.innerHTML='内容简介不能为空';
		   return false;
		 }
		else{
			gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
			return true;
		}
}
function publishnameblur(){
	var getid=$("#publishname").val();
	var gettd=document.getElementById("lapublishname");
	 if(getid==''){
	   gettd.innerHTML='出版社名称不能为空';
	   return false;
	 }
	else{
		gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
		 return true;
	}
}
function publishdateup(){
	var gettd=document.getElementById("lapublishdate");
	gettd.innerHTML='例如1996-07-09';
}
function publishdateblur(){
	var getid=$("#publishdate").val();
	var gettd=document.getElementById("lapublishdate");
	var str=/(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)/;
	 if(getid==''){
	   gettd.innerHTML='出版社日期不能为空';
	   return false;
	 }
	 else if(str.test(getid)){
		 gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
		 return true;
	 }
	else{
		gettd.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
		 return false;
	}
}
function numblur(type){
	var str=/^[1-9]\d*$/;
	if(type=="pageNo"){
		var getid=$("#pageNo").val();
		var gettd=document.getElementById("lapageNo");
		 if(getid==''){
			   gettd.innerHTML='页数不能为空';
			   return false;
			 }
			 else if(str.test(getid)){
				 gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
				 return true;
			 }
			else{
				gettd.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
				 return false;
			}
	}
	else if(type="edition"){
		var getid=$("#edition").val();
		var gettd=document.getElementById("laedition");
		 if(getid==''){
			   gettd.innerHTML='版次不能为空';
			   return false;
			 }
			 else if(str.test(getid)){
				 gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
				 return true;
			 }
			else{
				gettd.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
				 return false;
			}
	}
}
function  Numblur(){
	var str=/^[1-9]\d*$/;
	var getid=$("#Num").val();
	var gettd=document.getElementById("lanum");
	 if(getid==''){
		   gettd.innerHTML='数量不能为空';
		   return false;
		 }
		 else if(str.test(getid)){
			 gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
			 return true;
		 }
		else{
			gettd.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
			 return false;
		}
}

function validate_required(form) {
	if(document.getElementById("imageUrl").value==null||document.getElementById("imageUrl").value==""){
		alert("请选择图书封面");
		return false;
		}
	if(!nameblur()){
		alert("书名框错误");
		return false;
	}
	if(!anthorblur()){
		alert("作者框错误");
		return false;
	}
	if(!isbnblur()){
		alert("isbn框错误");
		return false;
	}
	if(!priceblur()){
		alert("价格框错误");
		return false;
	}
	if(!plotSummaryblur()){
		alert("内容简介框错误");
		return false;
	}
	if(!publishnameblur()){
		alert("出版社框错误");
		return false;
	}
	if(!publishdateblur()){
		alert("出版日期框错误");
		return false;
	}
	if(!numblur()){
		alert("版次或页数框错误");
		return false;
	}
	if(!Numblur()){
		alert("数量框错误");
		return false;
	}
	if(!abstractsblur()){
		alert("摘要框错误");
		return false;
	}
	if(!callnumberblur()){
		alert("索书号框错误");
		return false;
	}
}

function abstractsblur(){
	var getid=$("#abstracts").val();
	var gettd=document.getElementById("laabstracts");
	 if(getid==''){
		 gettd.innerHTML='摘要不能为空';
		   return false;
		 }
		else{
			gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
			return true;
		}
}
function callnumberblur(){
	var getid=$("#callnumber").val();
	var gettd=document.getElementById("lacallnumber");
	 if(getid==''){
		 gettd.innerHTML='索书号不能为空';
		   return false;
		 }
		else{
			gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
			return true;
		}
}

$(function(){
	$(":input[name=isbn]").change(function(){
		                    var laIsbn=document.getElementById('laIsbn');
							var val=$(this).val();
							val=$.trim(val);
							var $this = $(this);
							if(val !=""){
								 $.ajax({  
							  	        url: "check-isbn",  
							  	        type: "POST",
							  	        async: false,
							  	        data:{"isbn":val},
							  	        success:function(data){  
							  	        	if(data == "1")
							  	        {
							  	        		laIsbn.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
											}
											else if(data == "0")
											{
										/*		laIsbn.innerHTML='已存在';
							  	        		laIsbn.style.background="#FFF";*/
												laIsbn.innerHTML="<img src='images/addbook/error.png' height='18px'/>";
												$("#isbn")[0].value="";
												$("#isbn").focus();
											}
											else{
												alert("服务器错误");
											}
												
							  	        }
								 });
							}else{
									alert("isbn不能为空");
									$(this).val("");
									$this.focus();
										}
							  	  });
						});