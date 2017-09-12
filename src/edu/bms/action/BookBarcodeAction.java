package edu.bms.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.bms.entity.BookBarcode;
import edu.bms.service.BookBarcodeService;

public class BookBarcodeAction extends ActionSupport  implements SessionAware,
ModelDriven<BookBarcode>,Preparable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BookBarcode model;
    private BookBarcodeService bookBarcodeService;
    private String isbn;
    private String barcode;
    private InputStream inputStream;
    
    
    
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public BookBarcodeService getBookBarcodeService() {
		return bookBarcodeService;
	}
	public void setBookBarcodeService(BookBarcodeService bookBarcodeService) {
		this.bookBarcodeService = bookBarcodeService;
	}
	public void setModel(BookBarcode model) {
		this.model = model;
	}
	public String vaisbn() throws UnsupportedEncodingException{
	boolean falg=bookBarcodeService.vaisbn(isbn);
	if(falg){
		inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
	}else{
		inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
	}
	return "ajax";
	}
	
	public String vaisbn2() throws UnsupportedEncodingException{
	boolean falg=bookBarcodeService.vaisbn2(isbn);
	if(falg){
		inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
	}else{
		inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
	}
	return "ajax";
	}
	
	public String vabarcode() throws UnsupportedEncodingException{
    boolean falg=bookBarcodeService.vabarcode(barcode);
		if(falg){
			inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
		}else{
			inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
		}
		return "ajax";
	}
	public String vabarcode2() throws UnsupportedEncodingException{
	    boolean falg=bookBarcodeService.vabarcode(barcode);
			if(falg){
				inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
			}else{
				inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
			}
			return "ajax";
		}
	public String save(){
		model.setState(true);
       bookBarcodeService.save(model);
		return SUCCESS;
	}
	public String delete() throws UnsupportedEncodingException{
	    BookBarcode barcode=bookBarcodeService.BeforeDelete(model);
	    if(barcode==null){
	    	inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
	    	return "ajax";
	    }else{
		bookBarcodeService.delete(model);
		return SUCCESS;
	    }
	}
	public void prepareDelete(){
		model=new BookBarcode();
	}
	public void prepareSave(){
		model=new BookBarcode();
	}
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public BookBarcode getModel() {
		// TODO Auto-generated method stub
		return model;
	}
     private Map<String, Object> session;
     
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;// TODO Auto-generated method stub
		
	}

}
