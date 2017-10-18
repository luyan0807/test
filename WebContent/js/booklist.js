/**
 * 
 */
function showlist(booklist_id){
	$.ajax({  
	        url: "showBooklist",  
	        type: "POST",
	        async: false,
	        data:{"booklist_id":booklist_id},
	        success:function(data){
	        	
	        }
 });
	
}