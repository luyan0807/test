package edu.bms.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import edu.bms.entity.BookBarcode;
import edu.bms.entity.BookCatalog;
import edu.bms.entity.BookInfo;
import edu.bms.entity.BorrowList;
import edu.bms.entity.Reader;
import edu.bms.entity.ReturnList;
import edu.bms.service.ReturnListService;
import edu.bms.utils.GetlimitDate;

public class ReturnListAction extends ActionSupport {
       /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String barcode;
       private ReturnListService returnListService;
       private InputStream inputStream;
       
       public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public ReturnListService getReturnListService() {
		return returnListService;
	}

	public void setReturnListService(ReturnListService returnListService) {
		this.returnListService = returnListService;
	}
    public String vaBarcoed(){
		   BookBarcode bookBarcode=returnListService.getbarcode(barcode);
		   boolean f=bookBarcode==null;
		   if(f){
			   try {
				inputStream = new ByteArrayInputStream(
							"0".getBytes("UTF-8"));//借阅编号错误
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
		   else{
			   try {
				inputStream = new ByteArrayInputStream(
							"1".getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//借阅编号错误
		   }
		return "ajax";
    	
    }
	public String returnBook() throws ParseException{
		   ReturnList returnList=new ReturnList();
		   Date returnDate=new Date();
		   BookBarcode bookBarcode=returnListService.getbarcode(barcode);
		   String isbn=bookBarcode.getIsbn();
		   BookInfo bookInfo=returnListService.getBookInfo(isbn);
		   BookCatalog bookCatalog=bookInfo.getBookCatalog();
           int id=bookInfo.getBookCatalog().getId();
		   int borrowNum=bookCatalog.getBorrowNum();
		   int nowborrowNum=borrowNum+1;
		   bookCatalog.setId(id);
		   bookCatalog.setBorrowNum(nowborrowNum);
		   BorrowList borrowList= returnListService.getborrowlist(bookBarcode);
		   GetlimitDate g=new GetlimitDate();
		   Date sReturnDate=borrowList.getsReturnDate();
		   borrowList.setState("0");
		   bookBarcode.setState(true);
		   Reader reader=borrowList.getReader();
		   int borrowingNum=reader.getBorrowNum();
		   reader.setBorrowNum(borrowingNum-1);
		   int limitDate = g.getlimit(sReturnDate, returnDate);
		   if(limitDate<0){
			   limitDate=0;
		   }
		   returnList.setBorrowList(borrowList);
		   returnList.setIdCard(reader);
		   returnList.setReturnDate(returnDate);
		   returnList.setLimitDate(limitDate);
		   returnListService.save(borrowList,reader,returnList,bookBarcode,bookInfo,bookCatalog);
		   System.out.println("success");
		   return "ajax";
       }
}
