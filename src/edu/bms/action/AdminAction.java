package edu.bms.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.bms.entity.Admin;
import edu.bms.service.AdminService;
import edu.bms.utils.MD5Utils;

public class AdminAction extends ActionSupport implements SessionAware,
ModelDriven<Admin>,Preparable,ServletResponseAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private AdminService adminService;
	private String code;
	private String time;
	private Admin admin;
	private String type;
	private InputStream inputStream;
	private HttpServletResponse response;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public String check(){
		String passwordMd5=MD5Utils.getHash(model.getPassword(), "MD5");
		System.out.println(passwordMd5);
		String idno=model.getIdno();
		Admin admin=adminService.checkAdmin(idno, passwordMd5,type);
		session.put("admin", admin);
		System.out.println(type);
		if (admin!=null && time!=null) {
			Cookie ck1=new Cookie("idno", admin.getIdno());
			Cookie ck2=new Cookie("password", model.getPassword());
			int t=Integer.parseInt(time);
			ck1.setMaxAge(t*24*60*60);
			ck2.setMaxAge(t*24*60*60);
			response.addCookie(ck1);
			response.addCookie(ck2);
			return SUCCESS;
		}else if(admin!=null && time==null){
			return SUCCESS;
		}
		else {			
			return ERROR;
		}
	}
	public String checkCode(){
		if (session.get("securityCode").equals(code)) {
			try {
				inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "ajax";
		
	}
	public String checkIdno(){
		System.out.println("checkIdno");
		String idno=model.getIdno();
		boolean flag=adminService.checkIdno(idno);
		if(flag){
			try {
				inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "ajax";
		
	}
	public String save(){
		System.out.println(model.getType());
        String passwordMD5=model.getPassword();
        passwordMD5=MD5Utils.getHash(passwordMD5, "MD5");
        model.setPassword(passwordMD5);
		adminService.saveOrUpdate(model);
		return INPUT;	
	}
	public String input(){
		adminService.update(model,id);
		System.out.println(model.toString());
		Admin admin=adminService.get(id);
		session.put("admin", admin);
		return SUCCESS;	
	}
	public void prepareCheckIdno(){
		System.out.println("hhi");
		model =new Admin();
	}
	public void prepareCheck(){
		System.out.println("hhi");
		model =new Admin();
	}
	public void prepareSave(){
		model =new Admin();
	}
	public void prepareInput(){
		model =new Admin();
	}
	private Map<String, Object> session;
	
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void prepare() throws Exception {
	}
	private Admin model;
	@Override
	public Admin getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;// TODO Auto-generated method stub
		
	}
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.response=arg0;
	}
}
