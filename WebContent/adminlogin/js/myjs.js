/**
 * 
 */
function validate_required(form) {
					var	idno  = $.trim(form.idno.value);
					var password = $.trim(form.password.value);
					var code=$.trim(form.code.value);
					var type=$.trim(form.type.value);
						if (form.idno.value == null || form.idno.value == "") {
							alert("身份证号不能为空");
							return false;
						} 
						else if(type==null || type==""){
							alert("请选择管理员类型");
							return false;
						}
						else if(code==null || code==""){
							alert("验证码不能为空");
							return false;
						}
						else if (form.password.value == null
								|| form.password.value == "") {
							alert("密码不能为空");
							return false;
						} else if(idno.length!=18){
							alert("身份证号必须为18位");
							return false;
						}
						else if(password.length<6 || password.length>16 ){
							alert("密码必须6-16位");
							return false;
						}
						else {
							return true;
						}
					}
					function reloadCode() {
						var time = new Date().getTime();
						document.getElementById("imagecode").src = "BMS_ssh/SecurityCodeImageAction?d="
								+ time;
					}
					$(function(){
						$(":input[name=code]").change(function(){
							var val=$(this).val();
							val=$.trim(val);
							var $this = $(this);
							if(val !=""){
								 $.ajax({  
							  	        url: "checkCode",  
							  	        type: "POST",
							  	        async: false,
							  	        data:{"code":val},
							  	        success:function(data){  
							  	        	if(data == "1")
							  	        	{
											}
											else if(data == "0")
											{
												alert("验证码有误");
											}
											else{
												alert("服务器错误");
											}
												
							  	        }
								 });
							}else{
									alert("验证码不能为空");
									$(this).val("");
									$this.focus();
										}
							  	  });
						});