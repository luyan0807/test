package edu.bms.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;



import edu.bms.entity.Admin;
import edu.bms.entity.BookInfoList;
import edu.bms.entity.BookList;
import edu.bms.service.BookInfoListService;
import edu.bms.service.BookListService;

public class BookListAction extends ActionSupport implements SessionAware,RequestAware,
ModelDriven<BookList>,Preparable{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int id;
    private int booklist_id;
    private BookList model;
	private Map<String, Object> session;
	private Map<String, Object> request;
	private BookListService bookListService;
	private BookInfoListService bookInfoListService;
	@SuppressWarnings("rawtypes")
	public String getBookList(){
		Admin admin=(Admin) ActionContext.getContext().getSession().get("admin");
		List<BookList> bookLists=bookListService.getBookList(admin.getId());
		List ids=bookListService.getAll(admin.getId());
		List<BookInfoList> bookInfoLists=bookInfoListService.getAll(ids);
		request.put("bookLists", bookLists);
		request.put("bookInfoLists", bookInfoLists);
		return SUCCESS;
	}
	public String showlist(){
		System.out.println("showlist");
		List<BookInfoList> bookInfoLists=bookListService.showlist(booklist_id);
		request.put("bookInfoLists", bookInfoLists);
		System.out.println("before");
		return "show";
	}
	public String save(){
		Admin admin=(Admin) ActionContext.getContext().getSession().get("admin");
		java.util.Date utilDate=new java.util.Date();
		java.sql.Date createDate=new java.sql.Date(utilDate.getTime());
		model.setCreateDate(createDate);
		model.setAdmin_id(admin);
		bookListService.save(model);
		return "save";	
	}
	public String delete(){
		boolean flag=bookListService.delete(booklist_id);
		if(flag)
		return SUCCESS;
		else return ERROR;
	}
	public void prepareSave(){
		model =new BookList();
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
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public BookList getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	public int getBooklist_id() {
		return booklist_id;
	}
	public void setBooklist_id(int booklist_id) {
		this.booklist_id = booklist_id;
	}
	public BookInfoListService getBookInfoListService() {
		return bookInfoListService;
	}
	public void setBookInfoListService(BookInfoListService bookInfoListService) {
		this.bookInfoListService = bookInfoListService;
	}
	
	
}
