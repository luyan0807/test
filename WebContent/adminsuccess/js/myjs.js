/**
 * 
 */
function showAll(){
	$.ajax({  
        url: "showLargess",  
        type: "POST",
        async: false,
    });
	//window.open('largess.jsp');
}
function showNotChecked(){
	$.ajax({  
        url: "showNotchecked",  
        type: "POST",
        async: false,
    });
	//window.open('largess.jsp');
	
}

function vabarcode2blur(){
	var getid=$("#vabarcode2").val();
	var gettd=document.getElementById("labarcode2");
	val=$.trim(getid);
	var result=false;
	 if(getid==''){
		 gettd.innerHTML='借阅编号不能为空';
		   return false;
		 }
	 $.ajax({  
	        url: "vabarcode2",  
	        type: "POST",
	        async: false,
	        data:{"barcode":val},
	        success:function(data){  
	        	if(data == "1")
	        {
	        		gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	        		result=true;
				}
				else if(data == "0")
				{
					gettd.innerHTML="借阅编号不存在";
					result=false;
				}
	        }
	 });
	 return result;
}

 

function vaisbn2blur(){
	var getid=$("#vaisbn2").val();
	var gettd=document.getElementById("laisbn2");
	val=$.trim(getid);
	var result=false;
	if(getid==''){
		 gettd.innerHTML='isbn不能为空';
		   return false;
		 }
	 $.ajax({  
	        url: "vaisbn2",  
	        type: "POST",
	        async: false,
	        data:{"isbn":val},
	        success:function(data){  
	        	if(data == "1")
	        {
	        		gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	        		result=true;
				}
				else if(data == "0")
				{
					gettd.innerHTML="isbn不存在";
					result=false;
				}
	        }
	 });
	 return result; 
}


function vabarcodeblur(){
	var getid=$("#barcodeva").val();
	var gettd=document.getElementById("labarcode1");
	val=$.trim(getid);
	var result=false;
	 if(getid==''){
		 gettd.innerHTML='借阅编号不能为空';
		   return false;
		 }
	 $.ajax({  
	        url: "vabarcode",  
	        type: "POST",
	        async: false,
	        data:{"barcode":val},
	        success:function(data){  
	        	if(data == "1")
	        {
	        		gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	        		result=true;
				}
				else if(data == "0")
				{
					gettd.innerHTML="借阅编号已存在";
					result=false;
				}
	        }
	 });
	 return result; 
}

function vaisbnblur(){
	var getid=$("#isbnva").val();
	var gettd=document.getElementById("laisbn");
	val=$.trim(getid);
	var result=false;
	 if(getid==''){
		 gettd.innerHTML='isbn不能为空';
		   return false;
		 }
	 $.ajax({  
	        url: "vaisbn",  
	        type: "POST",
	        async: false,
	        data:{"isbn":val},
	        success:function(data){  
	        	if(data == "1")
	        {
	        		gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	        		result=true;
				}
				else if(data == "0")
				{
					gettd.innerHTML="图书不存在";
					result=false;
				}
	        }
	 });
	 return result; 
}




function validationBook(){
	var getid=$("#u121_input").val();
	var gettd=document.getElementById("labarcode");
	val=$.trim(getid);
	var result=false;
	 if(getid==''){
		 gettd.innerHTML='图书条形码不能为空';
		   return false;
		 }
	 else{
		 $.ajax({  
	  	        url: "validationBook",  
	  	        type: "POST",
	  	        async: false,
	  	        data:{"barcode":val},
	  	        success:function(data){  
	  	        	if(data == "1")
	  	        {
	  	        		gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	  	        		result=true;
					}
					else if(data == "0")
					{
						gettd.innerHTML="图书不存在";
						result=false;
					}
	  	        }
		 });
		 return result;
	 }
}


function vaBarcoed(){
	var getid=$("#u132_input").val();
	var gettd=document.getElementById("returnBarcode");
	val=$.trim(getid);
	var result=false;
	 if(getid==''){
		 gettd.innerHTML='图书条形码不能为空';
		   return false;
	 }
	 else{
		 $.ajax({  
	  	        url: "vaBarcoed",  
	  	        type: "POST",
	  	        async: false,
	  	        data:{"barcode":val},
	  	        success:function(data){  
	  	        	if(data == "1")
	  	        {
	  	        		gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	  	        		result=true;
					}
	  	        	if(data == "0")
		  	        {
	  	        		gettd.innerHTML='图书条形码错误';
		  	        		result=false;
						}	  	        	
	  	        }
		 });
		 return result;
	 }
} 



function validationReader(){
	var getid=$("#u124_input").val();
	var gettd=document.getElementById("laidno");
	val=$.trim(getid);
	var result=false;
	 if(getid==''){
		 gettd.innerHTML='读者证件不能为空';
		   return false;
		 }
		else{
				 $.ajax({  
			  	        url: "validationReader",  
			  	        type: "POST",
			  	        async: false,
			  	        data:{"idno":val},
			  	        success:function(data){  
			  	        	if(data == "1")
			  	            {
			  	        		gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
			  	        		result=true;
							}
							else if(data == "0")
							{
								gettd.innerHTML="读者不存在";
								result=false;
							}
							else if(data == "2")
							{
								gettd.innerHTML="读者欠费";
								result=false;
								
							}
							else if(data == "3")
							{
								gettd.innerHTML="读者借阅达到上限";
								result=false;
								
							}
							else if(data == "4")
							{
								gettd.innerHTML="读者存在逾期未还图书";
								result=false;
								
							}
							else{
								alert("服务器错误");
								result=false;
							}
								
			  	        }
				 });
		return result;	
		}
	 
}
function refuseReason(id){
	$("#Largessid")[0].value=id;
	//alert(id);
}

function showReason(refuseReason){
	    $("#span_content").text(refuseReason);
	}
function showLargess(){
    	  $.ajax({  
  	        url: "showLargess",  
  	        type: "POST",
  	        async: false,
  	        success:function(data){  
  	        }
  	  });
      }
      function slide(){
    	  $("#l1").animate({left:'-190px'});
    	  $("#l1").animate({top:'-70px'});
    	  $("#l2").animate({left:'85px'});
    	  $("#l2").animate({top:'-70px'});
    	  $("#l3").animate({left:'-190px'});
    	  $("#l3").animate({top:'280px'});
    	  $("#l4").animate({left:'85px'});
    	  $("#l4").animate({top:'40px'});
      }
      function slide2(){
    	  $("#l11").animate({left:'-190px'});
    	  $("#l11").animate({top:'-70px'});
    	  $("#l22").animate({left:'85px'});
    	  $("#l22").animate({top:'-70px'});
    	  $("#l5").animate({left:'85px'});
    	  $("#l5").animate({top:'40px'});
      }
      function returnbook(){
    	  if(vaBarcoed()){
    	  var barcode=$("#u132_input")[0].value;
    	  $.ajax({  
    	        url: "returnbook",  
    	        type: "POST",
    	        async: false,
    	        data:{"barcode":barcode}, 
    	        success:function(data){  
    	        	firm1();
    	        	}
    	  });
    	  }
    	  else{
    		  var gettd=document.getElementById("laerrorR"); 
    		  gettd.innerHTML='存在错误，不能进归还';
              return false;
    	  }     
}
     function borrow(){
     var gettd=document.getElementById("laerror");
    	 if(!validationBook()){
    		gettd.innerHTML='存在错误，不能进行借阅';
            return false;
    	 }
    	 else if(!validationReader()){
    		 alert("reader");
     		gettd.innerHTML='存在错误，不能进行借阅';
            return false;
    	 }
    	 else
        {
    	  var idno=$("#u124_input")[0].value;
    	  var barcode=$("#u121_input")[0].value;
    	   $.ajax({  
  	        url: "borrow-validation",  
  	        type: "POST",
  	        async: false,
  	        data:{ "idno": idno,"barcode":barcode},
 	        success:function(data){  
  	        	if(data == "1")
  	            {
  	        		firm();
				}
 	        }
  	        		});
    	  
        }   
      
    } 	 
      
      $(function(){
    	  //当鼠标滑入时将div的class换成divOver
    	  	$('#l1').hover(function(){
      	    $(this).addClass('divOver1'); 
      	   },function(){
      	    //鼠标离开时移除divOver样式
      	    $(this).removeClass('divOver1');
      	   });
    	  
    	  $('#l2').hover(function(){
      	    $(this).addClass('divOver2'); 
      	   },function(){
      	    //鼠标离开时移除divOver样式
      	    $(this).removeClass('divOver2');
      	   });
    	  
    	  $('#l3').hover(function(){
      	    $(this).addClass('divOver3'); 
      	   },function(){
      	    //鼠标离开时移除divOver样式
      	    $(this).removeClass('divOver3');
      	   });
    	  
    	  $('#l4').hover(function(){
      	    $(this).addClass('divOver4'); 
      	   },function(){
      	    //鼠标离开时移除divOver样式
      	    $(this).removeClass('divOver4');
      	   });
    	 });
      function firm()
    {//利用对话框返回的值 （true 或者 false）
      if(confirm("借阅成功，是否继续？"))
         {//如果是true ，那么就把页面转向thcjp.cnblogs.com
    	  $("#u124_input")[0].value=null;
    	  $("#u121_input")[0].value=null;
    	  /* window.location.reload(); */
          }
        else
         {//
              alert("你按了取消，那就是返回false");
         }
     }
      function firm1()
      {//利用对话框返回的值 （true 或者 false）
        if(confirm("归还成功，是否继续？"))
           {//如果是true ，那么就把页面转向thcjp.cnblogs.com
        	$("#u132_input")[0].value=null;
            }
          else
           {//
                alert("你按了取消，那就是返回false");
           }
       }
      function addbarcode(){
      if(!vabarcodeblur()){
    	  alert("借阅编号框输入错误");
    	  return false;
      }
      if(!vaisbnblur()){
    	  alert("isbn输入框错误");
    	  return false;
      }      
      if(confirm("录入成功，是否继续？"))
           {
/*    	  $("#isbnva")[0].value=null;
    	  $("#ubarcodeva")[0].value=null;*/
            }
          else
           {//
                alert("你按了取消，那就是返回false");
           }
       }
      
      function delbarcode(){
      var getid1=$("#vabarcode2").val();
      var getid2=$("#vaisbn2").val();
      var barcode=$.trim(getid1);
      var isbn=$.trim(getid2);
      if(!vabarcode2blur()){
    	  alert("借阅编号框输入错误");
    	  return false;
      }
      if(!vaisbn2blur()){
    	  alert("isbn输入框错误");
    	  return false;
      }
      /*$.ajax({  
	        url: "beforedelete",  
	        type: "POST",
	        async: false,
	        data:{"barcode":barcode,"isbn":isbn},
	        success:function(data){  
	        	if(data == "1")
	        {
	        		gettd.innerHTML="<img src='images/addbook/right-green.png' height='18px'/>";
	        		result=true;
				}
				else if(data == "0")
				{
					gettd.innerHTML="借阅编号不存在";
					result=false;
				}
	        }
	 });
      */
      
      if(confirm("注销成功，是否继续？"))
           {
            }
          else
           {
            alert("你按了取消，那就是返回false");
           }
       }