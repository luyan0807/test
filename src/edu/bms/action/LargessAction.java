package edu.bms.action;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.bms.entity.Admin;
import edu.bms.entity.Largess;
import edu.bms.model.PageShow;
import edu.bms.service.LargessService;

public class LargessAction extends ActionSupport implements RequestAware,SessionAware{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private Map<String,Object> request;
	private LargessService largessService;
	private String refuseReason;
	private String id;
	private String[] ids;
	private InputStream inputStream;
 	private int pageNow = 1;// 动态改变 页面取得  
    private int pageSize = 10;// 固定不变 
    private int totalPage=0;

	public String agreeAll(){
    	System.out.println("agreeAll");
        largessService.agreeAll(ids);	
        return showLargess();
    }
	public String agree(){//审核同意
		largessService.agree(id);
		showLargess();
		return SUCCESS;
	}
	public String showNotChecked(){
		
		List<Largess> largesses=largessService.showNotChecked(pageNow,pageSize);
		request.put("largesses", largesses);
	    //分页
	    PageShow page = new PageShow(pageNow, largessService.findNotCheckedLargess(), pageSize);
	    totalPage=largessService.findNotCheckedLargess()/pageSize;
	    request.put("page", page);
		return SUCCESS;//显示未审核的增书记录
		
	}
	
	public String showLargess(){
    List<Largess> largesses=largessService.showLargess(pageNow,pageSize);
    request.put("largesses", largesses);
    //分页
    PageShow page = new PageShow(pageNow, largessService.findAllLargess(), pageSize);
    totalPage=largessService.findAllLargess()/pageSize;
    request.put("page", page);
	return "showall";
    }
    
	public String update() throws UnsupportedEncodingException{
		Admin admin=(Admin) ActionContext.getContext().getSession().get("admin");
		refuseReason = new String(refuseReason.getBytes("ISO-8859-1"), "UTF-8");  
		System.out.println(refuseReason);
		Largess largess=new Largess();
		int Id=Integer.valueOf(id);
		System.out.println(admin);
		largess.setId(Id);
		largess.setRefuseReason(refuseReason);
		String operator= String.valueOf(admin.getId());
		largess.setOperator(operator);
		largess.setState("2");
		largessService.update(largess);
		//显示修改后的赠书信息
		showLargess();
		return SUCCESS;

	}
	
    public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LargessService getLargessService() {
		return largessService;
	}


	public void setLargessService(LargessService largessService) {
		this.largessService = largessService;
	}
    

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request=arg0;
	}
	public Map<String, Object> getRequest() {
		return request;
	}
     
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
		
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
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}



	public InputStream getInputStream() {
		return inputStream;
	}



	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
    
}
