package edu.bms.action;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import edu.bms.entity.BookCatalog;
import edu.bms.entity.BookInfo;
import edu.bms.service.BookCatalogService;
import edu.bms.service.BookInfoService;

public class BookInfoAction extends ActionSupport implements RequestAware,SessionAware{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private Map<String, Object> request;
	private Map<String, Object> session;
	private	BookInfoService bookInfoService;
	private BookCatalogService bookCatalogService;
	private String ids[];
	private String cid;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}
	public BookCatalogService getBookCatalogService() {
		return bookCatalogService;
	}
	public void setBookCatalogService(BookCatalogService bookCatalogService) {
		this.bookCatalogService = bookCatalogService;
	}
	public BookInfoService getBookInfoService() {
		return bookInfoService;
	}
	public void setBookInfoService(BookInfoService bookInfoService) {
		this.bookInfoService = bookInfoService;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAnthor() {
		return anthor;
	}
	public void setAnthor(String anthor) {
		this.anthor = anthor;
	}
	public String getPublishname() {
		return publishname;
	}
	public void setPublishname(String publishname) {
		this.publishname = publishname;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public String getKindof() {
		return kindof;
	}
	public void setKindof(String kindof) {
		this.kindof = kindof;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCallnumber() {
		return callnumber;
	}
	public void setCallnumber(String callnumber) {
		this.callnumber = callnumber;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	public String getPhotoContentType() {
		return photoContentType;
	}
	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	public String getPlotSummary() {
		return plotSummary;
	}
	public void setPlotSummary(String plotSummary) {
		this.plotSummary = plotSummary;
	}
	public Integer getEdition() {
		return edition;
	}
	public void setEdition(Integer edition) {
		this.edition = edition;
	}
	public String getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String id;
	private String name;
	private String isbn;
	private String price;
	private String anthor;
	private String publishname;
	private String publishdate;
	private String kindof;
	private String language;
	private String num;
	private String callnumber;
    private File image;
    private String photoFileName;
    private String photoContentType;
	private Integer pageNo;//页数
	private String collection;//藏馆地 
	private String plotSummary;//内容简介
	private Integer edition;//版次 
	private String abstracts;//摘要 
	@Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
		System.out.println("execute");
		BookInfo b1=new BookInfo();
		if(image!=null){
		DiskFileItemFactory disk=new DiskFileItemFactory();
		disk.setRepository(new File("d:/a"));
		disk.setSizeThreshold(1024*8);
		ServletFileUpload upload=new ServletFileUpload(disk);
		upload.setSizeMax(1024*1024*5);
	    InputStream in=new FileInputStream(image);
		String fname=UUID.randomUUID().toString().replaceAll("-", "")+".jpg";
		 String path = ServletActionContext.getServletContext().getRealPath("/upload");
		FileOutputStream os=new FileOutputStream(path+"/"+fname);
		 byte b[] = new byte[1024]; 
		int len = -1; 
		 while((len=in.read(b))!=-1){ 
		 os.write(b, 0, len); 
		 } 
		 os.close(); 
		 in.close();
		b1.setImage(fname);
	}
		float p=Float.valueOf(price).floatValue();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");// 
		java.util.Date date=sdf.parse(publishdate); 
		Calendar   calendar   =   new   GregorianCalendar(); 
	    calendar.setTime(date); 
		@SuppressWarnings("deprecation")
		java.sql.Date date1=new Date(date.getYear(), date.getMonth(), date.getDate());
		int n=Integer.valueOf(num).intValue();
		b1.setName(name);
	    b1.setAnthor(anthor);
	    b1.setCallNumber(callnumber);
	    b1.setIsbn(isbn);
	    b1.setKindOf(kindof);
	    b1.setLanguage(language);
	    b1.setPrice(p);
	    b1.setPublishName(publishname);
	    b1.setPublishDate(date1);
	    b1.setNum(n);
	    b1.setCallNumber(callnumber);
	    b1.setCollection(collection);
	    b1.setEdition(edition);
	    b1.setPageNo(pageNo);
	    b1.setPlotSummary(plotSummary);
	    b1.setAbstracts(abstracts);
		if(id==null){
			   BookCatalog bookCatalog1=new BookCatalog();
			   bookCatalog1.setBorrowNum(n);
			   bookCatalog1.setIsbn(isbn);
		       bookCatalog1.setRenewTime(0);
		       b1.setBookCatalog(bookCatalog1);
			   bookInfoService.save(b1,bookCatalog1);
		       return SUCCESS;
	       }
	else{
		   if(image==null){
			   System.out.println("noimage");
			    int idd=Integer.valueOf(id).intValue();//类型装换
				int cidd=Integer.valueOf(cid).intValue();
			  	BookCatalog bookCatalog2=new BookCatalog();
		    	bookCatalog2.setIsbn(isbn);
		        bookCatalog2.setRenewTime(0);
		        System.out.println(cid);
		        bookCatalog2.setId(cidd);
			    b1.setId(idd);
			    b1.setBookCatalog(bookCatalog2);
			    bookInfoService.updateNOimage(b1,bookCatalog2);
			    return "update";
		   }
		   else
		   {
	       int idd=Integer.valueOf(id).intValue();//类型装换
		   int cidd=Integer.valueOf(cid).intValue();
	  	   BookCatalog bookCatalog2=new BookCatalog();
	  	   bookCatalog2.setBorrowNum(n);
    	   bookCatalog2.setIsbn(isbn);
           bookCatalog2.setRenewTime(0);
           System.out.println(cid);
           bookCatalog2.setId(cidd);
	       b1.setId(idd);
	       b1.setBookCatalog(bookCatalog2);
		   bookInfoService.update(b1, bookCatalog2);
		   id=null;
           return "update";
		   }
       }

}
	public String update(){
 	   BookInfo bookInfo=bookInfoService.getById(id);
       session.put("book", bookInfo);
 	  return "update";
		
	}
	private InputStream inputStream;
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public String delete(){
		System.out.println("DELETE");
		try {
			bookInfoService.delete(ids);
			inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		try {
			inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return "ajax-success";
	}
	public String checkIsbn(){
		System.out.println("checkIsbn");
	boolean flag=bookInfoService.checkIsbn(isbn);
	if(flag){
		try {
			inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else{
		try {
			inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return "ajax-success";
		
	}
	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request=arg0;	
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;// TODO Auto-generated method stub
		
	}
	
}
