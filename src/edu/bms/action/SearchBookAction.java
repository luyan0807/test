package edu.bms.action;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import edu.bms.entity.BookBarcode;
import edu.bms.entity.BookInfo;
import edu.bms.entity.BorrowList;
import edu.bms.model.PageShow;
import edu.bms.service.BookInfoService;

public class SearchBookAction extends ActionSupport implements SessionAware,RequestAware{
	/**
	 * 
	 */
	private BookInfoService bookInfoService;
	private static final long serialVersionUID = 1L;
	private String option;
	private String search;
	private int pageNow = 1;// 动态改变 页面取得  
    private int pageSize = 4;// 固定不变 
    private int totalPage=0;
    private int id;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public BookInfoService getBookInfoService() {
		return bookInfoService;
	}
	public void setBookInfoService(BookInfoService bookInfoService) {
		this.bookInfoService = bookInfoService;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public String execute() throws Exception {
		List<BookInfo> bookInfos = null;
		if(option.equals("题名")){
			search="%"+search+"%";
			bookInfos=bookInfoService.getByName(search,pageNow,pageSize);
		if(bookInfos!=null){
		if (bookInfos.size()>0) {// 结果列表   
            request.put("bookInfos", bookInfos);// 保存在session  
            PageShow page = new PageShow(pageNow, bookInfoService.fingAllBookInfo(), pageSize);// 实例化分页对象  
            request.put("page", page);//保存到request
            totalPage=bookInfoService.findSizeByName(search)/pageSize;
            return SUCCESS;  
        }
			}
        return INPUT;  
		    }
		if(option.equals("出版社")){
			search="%"+search+"%";
			bookInfos=bookInfoService.getByPublishName(search,pageNow,pageSize);
			if(bookInfos!=null){
				if (bookInfos.size()>0) {// 结果列表   
		            request.put("bookInfos", bookInfos);// 保存在session  
		            PageShow page = new PageShow(pageNow, bookInfoService.fingAllBookInfo(), pageSize);// 实例化分页对象  
		            request.put("page", page);//保存到request
		            totalPage=bookInfoService.findSizeByPublishName(search)/pageSize;
		            return SUCCESS;  
		        }
					}
		        return INPUT;  
		    }
		if(option.equals("作者")){
			search="%"+search+"%";
			bookInfos=bookInfoService.getByAuthor(search,pageNow,pageSize);
			if(bookInfos!=null){
				if (bookInfos.size()>0) {// 结果列表   
		            request.put("bookInfos", bookInfos);// 保存在session  
		            PageShow page = new PageShow(pageNow, bookInfoService.fingAllBookInfo(), pageSize);// 实例化分页对象  
		            request.put("page", page);//保存到request
		            totalPage=bookInfoService.findSizeByAuthor(search)/pageSize;
		            return SUCCESS;  
		        }
					}
		        return INPUT;  
		    }
		if(option.equals("ISBN")){
			search="%"+search+"%";
			bookInfos=bookInfoService.getByIsbn(search,pageNow,pageSize);
			if(bookInfos!=null){
				if (bookInfos.size()>0) {// 结果列表   
		            request.put("bookInfos", bookInfos);// 保存在session  
		            PageShow page = new PageShow(pageNow, bookInfoService.fingAllBookInfo(), pageSize);// 实例化分页对象  
		            request.put("page", page);//保存到request
		            totalPage=bookInfoService.findSizeByIsbn(search)/pageSize;
		            return SUCCESS;  
		        }
					}
		        return INPUT;  
		    }
		if(option.equals("分类")){
			search="%"+search+"%";
			bookInfos=bookInfoService.getByKindof(search,pageNow,pageSize);
			if(bookInfos!=null){
				if (bookInfos.size()>0) {// 结果列表   
		            request.put("bookInfos", bookInfos);// 保存在session  
		            PageShow page = new PageShow(pageNow, bookInfoService.fingAllBookInfo(), pageSize);// 实例化分页对象  
		            request.put("page", page);//保存到request
		            totalPage=bookInfoService.findSizeByKindOf(search)/pageSize;
		            return SUCCESS;  
		        }
					}
		        return INPUT;  
		    }
		if(option.equals("索书号")){
			search="%"+search+"%";
			bookInfos=bookInfoService.getByCallnumber(search,pageNow,pageSize);
			if(bookInfos!=null){
				if (bookInfos.size()>0) {// 结果列表   
		            request.put("bookInfos", bookInfos);// 保存在session  
		            PageShow page = new PageShow(pageNow, bookInfoService.fingAllBookInfo(), pageSize);// 实例化分页对象  
		            request.put("page", page);//保存到request
		            totalPage=bookInfoService.findSizeByCallNumber(search)/pageSize;
		            return SUCCESS;  
		        }
					}
		        return INPUT;
		    }
		if(option.equals("任意词")){
			search="%"+search+"%";
			bookInfos=bookInfoService.getByAnyword(search,pageNow,pageSize);
			if(bookInfos!=null){
				if (bookInfos.size()>0) {// 结果列表   
		            request.put("bookInfos", bookInfos);// 保存在session  
		            PageShow page = new PageShow(pageNow, bookInfoService.fingAllBookInfo(), pageSize);// 实例化分页对象  
		            request.put("page", page);//保存到request
		            totalPage=bookInfoService.findSizeByAnyword(search)/pageSize;
		            return SUCCESS;  
		        }
					}
		        return INPUT;
		    }
		
		return INPUT;
	}
	public String showbook(){
    	System.out.println("showbook");
    	String s=String.valueOf(id);
        BookInfo bookInfo= bookInfoService.getById(s);
        String isbn=bookInfo.getIsbn();
        List<BookBarcode> bookBarcodes=null;
        bookBarcodes=bookInfoService.getBookbarcode(isbn);
        int size=bookBarcodes.size();
        int  ids[]=new int[size];
        char c = 0;
        for (int i = 0; i <size; i++) {
        	if(!bookBarcodes.get(i).isState())
        	{
        	ids[i]=bookBarcodes.get(i).getId();
            c=1;
        	System.out.println(ids[i]);
        	}
		}

        if(c==1){
        	System.out.println("borrowlist");
        List<BorrowList> borrowLists=bookInfoService.getBorrowlist(ids);
        session.put("borrowLists", borrowLists);
        for (BorrowList borrowList : borrowLists) {
        	System.out.println("lianhe");
			System.out.println(borrowList.getBarcode().getBarcode());
		}
        }
        System.out.println(bookInfo.getBookCatalog().getBorrowNum());
        session.put("bookInfo", bookInfo);
        session.put("bookBarcodes", bookBarcodes);
		return "showbook";
    }
	private Map<String, Object> session;
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
	}
	private Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request=arg0;// TODO Auto-generated method stub
		
	}

}
