package edu.bms.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import edu.bms.entity.WishBook;
import edu.bms.model.PageShow;
import edu.bms.service.WishBookService;

public class WishBookAction extends ActionSupport implements RequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private WishBookService wishBookService;
    private Map<String, Object> request;
 	private int pageNow = 1;// 动态改变 页面取得  
    private int pageSize = 10;// 固定不变 
    private int totalPage=0;

    public String showWishBook(){//显示所有读者心愿单
    	List<WishBook> wishBooks=wishBookService.showWishBook(pageNow,pageSize);
    	
    	request.put("wishBooks", wishBooks);
    	
        //分页
        PageShow page = new PageShow(pageNow, wishBookService.findAllWishBook(), pageSize);
        totalPage=wishBookService.findAllWishBook()/pageSize;
        request.put("page", page);
		return SUCCESS;
    }
    public String showNotcheckedWB(){//显示未查看的读者心愿单
    	List<WishBook> wishBooks=wishBookService.showNotcheckedWB(pageNow,pageSize);
    	
    	request.put("wishBooks", wishBooks);
    	//分页
        PageShow page = new PageShow(pageNow, wishBookService.findAllWishBook(), pageSize);
        totalPage=wishBookService.findAllNotCheckWishBook()/pageSize;
        request.put("page", page);
    	return SUCCESS;
    }
    
    
    public WishBookService getWishBookService() {
		return wishBookService;
	}
	public void setWishBookService(WishBookService wishBookService) {
		this.wishBookService = wishBookService;
	}
	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request=arg0;
		
	}
	public Map<String, Object> getRequest() {
		return request;
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
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
  
}
