var currentPage=${pageModel.getPageNo()};
var totalPage=${pageModel.getTotalPages()};
function submitForm(actionUrl){
	
	var formElement=document.getElementById("form1");
	formElement.action=actionUrl;
	formElement.submit();
}
//首页
	function firstPage(){
		if(currentPage==1){
			alert("已经是第一页数据");
			return false;
		}else {
			submitForm("/../../SearchItemServlet?pageNo=1");
	return true;
		}
	}	
	
	//下一页
		function nextPage(){
			if(currentPage==totalPage){
				alert("已经是最后一页数据");
				return flase;
			}else {
				submitForm("/../../SearchItemServlet?pageNo="+(currentPage+1));
			return true;
			}
}
	
		//上一页
		function previousPage(){
			if(currentPage==1){
				alert("已经是第一页数据");
				return flase;
			}else {
				submitForm("/../../SearchItemServlet?pageNo="+(currentPage-1));
			   return true;
			}
}
        //尾页
		function lastPage(){
			if(currentPage==totalPage){
				alert("已经是最后数据");
				return flase;
			}else {
				submitForm("/../../SearchItemServlet?pageNo="+"${pageModel.getTotalPages()}");
			    return true;
			}
}

function change(){
	var str=document.getElementById("select2");
	
	submitForm("/../../SearchItemServlet?pageNo="+str.value);
}

function change1(){
	var str=document.getElementById("select3");
	
	submitForm("/../../SearchItemServlet?pageNo="+str.value);
}
