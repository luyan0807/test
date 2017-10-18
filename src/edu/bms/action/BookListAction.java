package edu.bms.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.bms.entity.Admin;
import edu.bms.entity.BookList;
import edu.bms.service.BookListService;

public class BookListAction extends ActionSupport implements SessionAware,RequestAware{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int id;
	private Map<String, Object> session;
	private Map<String, Object> request;
	private BookListService bookListService;
	public String getBookList(){
		Admin admin=(Admin) ActionContext.getContext().getSession().get("admin");
		List<BookList> bookLists=bookListService.getBookList(admin.getId());
		//System.out.println(id);
		System.out.println(admin.getId());
		System.out.println(bookLists==null);
		request.put("bookLists", bookLists);
		return SUCCESS;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BookListService getBookListService() {
		return bookListService;
	}

	public void setBookListService(BookListService bookListService) {
		this.bookListService = bookListService;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public Map<String, Object> getRequest() {
		return request;
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

}
