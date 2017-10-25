package edu.bms.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.bms.entity.BookInfoList;
import edu.bms.service.BookInfoListService;

public class BookInfoListAction extends ActionSupport implements 
SessionAware,RequestAware,ModelDriven<BookInfoList>,Preparable {
   /**
	 * 
	 */
   private static final long serialVersionUID = 1L;
   private BookInfoListService bookInfoListService;
   private Map<String, Object> session;
   private Map<String, Object> request;
   private BookInfoList model;
   private int bookInfoList_id;
   public String save(){
	   boolean flag=bookInfoListService.save(model);
	   if(flag)
	   return SUCCESS;
	   else
		   return ERROR;
   }
   public String delete(){
	   boolean flag=bookInfoListService.delete(bookInfoList_id);
	   if(flag)
	   return SUCCESS;
	   else return ERROR;
   }
   public void prepareSave(){
		model =new BookInfoList();
	}
public Map<String, Object> getSession() {
	return session;
}

public Map<String, Object> getRequest() {
	return request;
}

public void setModel(BookInfoList model) {
	this.model = model;
}

public BookInfoListService getBookInfoListService() {
	return bookInfoListService;
}

public void setBookInfoListService(BookInfoListService bookInfoListService) {
	this.bookInfoListService = bookInfoListService;
}

@Override
public void prepare() throws Exception {
	// TODO Auto-generated method stub
	
}

@Override
public BookInfoList getModel() {
	// TODO Auto-generated method stub
	return model;
}

@Override
public void setRequest(Map<String, Object> request) {
	this.request=request;
	
}

@Override
public void setSession(Map<String, Object> session) {
	// TODO Auto-generated method stub
	this.session=session;
}
public int getBookInfoList_id() {
	return bookInfoList_id;
}
public void setBookInfoList_id(int bookInfoList_id) {
	this.bookInfoList_id = bookInfoList_id;
}


}
