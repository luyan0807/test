package edu.bms.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.opensymphony.xwork2.ActionSupport;

import edu.bms.entity.BookBarcode;
import edu.bms.entity.BookCatalog;
import edu.bms.entity.BookInfo;
import edu.bms.entity.BorrowList;
import edu.bms.entity.Reader;
import edu.bms.service.BorrowListService;

public class BorrowAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idno;
	private String barcode;
	private InputStream inputStream;
	private BorrowListService borrowListService;
	
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public BorrowListService getBorrowListService() {
		return borrowListService;
	}
	public void setBorrowListService(BorrowListService borrowListService) {
		this.borrowListService = borrowListService;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	@SuppressWarnings("static-access")
	public String  borrow(){
		/*借阅图书的业务逻辑
		      首先判断读者的正确性，以及借阅编号的正确性
		      关于读者的判断包括
		          读者是否存在
		          读者是否存在逾期未还图书
		          读者是否欠费
		          读者的借阅数量是否达到上限
		     关于图书的判断包括
		         图书是否存在
		         图书的状态是否为在馆
		若是信息都达到可借阅的要求，则开始借阅
		借阅成功时，需要完成如下动作
		借阅的图书的状态改为
		*
		*/
		System.out.println("begin borrow");
		BorrowList borrowList = new BorrowList();
		Reader reader=borrowListService.getReader(idno); //根据读者身份证号获取读者
		int borrowingNum=reader.getBorrowNum(); 
		reader.setBorrowNum(borrowingNum+1);//借阅成功时，读者的正在借阅数量+1
		BookBarcode Barcode=borrowListService.getBarcode(barcode);//根据借阅编号获取借阅编号类
		BookInfo bookInfo=borrowListService.getbookinfo(Barcode.getIsbn());//根据isbn获取图书类
	    BookCatalog bookCatalog=bookInfo.getBookCatalog();//获取图书目录
	    int borrowTime=bookCatalog.getBorrowTime();//
	    int nowBorrowTime=borrowTime+1;//借阅成功时，图书的借阅次数+1
	    int  borrowNum=bookCatalog.getBorrowNum();
	    int nowBorrowNum=borrowNum-1;//借阅成功时，图书的可借阅数量-1
	    bookCatalog.setBorrowNum(nowBorrowNum);
	    bookCatalog.setBorrowTime(nowBorrowTime);
	    bookInfo.setBookCatalog(bookCatalog);
		int borrowlimit=borrowListService.getBorrowLimit(reader.getId());
		Barcode.setState(false);
		borrowList.setState("1");
		borrowList.setReader(reader);
		borrowList.setBarcode(Barcode);
		borrowList.setBookInfo(bookInfo);
		Date borrowDate=new Date();
		Date sReturnDate=new Date();
		borrowList.setBorrowDate(borrowDate);
		borrowList.setsReturnDate(sReturnDate);
		Calendar   calendar   =   new   GregorianCalendar(); 
		calendar.setTime(borrowDate);
		calendar.add(calendar.DATE, borrowlimit);
		sReturnDate=calendar.getTime();
		borrowList.setsReturnDate(sReturnDate);
	    Boolean borrowflag=borrowListService.save(borrowList,reader,bookCatalog,bookInfo,Barcode);
	    System.out.println(borrowflag);
	    if(borrowflag){
	    	System.out.println("success");
	    	try {
				inputStream = new ByteArrayInputStream(
						"1".getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//读者不存在
	    }
		return SUCCESS;		
	}
	public String validationReader() throws UnsupportedEncodingException, ParseException{
		System.out.println("validation");
		Reader reader = borrowListService.validationReader(idno);// 验证读者ID合法性
		if(reader==null){
				inputStream = new ByteArrayInputStream(
						"0".getBytes("UTF-8"));//读者不存在
			}
	   else{
			double arrearage = reader.getArrearage();// 检查读者是否欠费
    		if(arrearage>0){
    			inputStream = new ByteArrayInputStream(
						"2".getBytes("UTF-8"));//读者欠费
    			return "ajax";
    		}
    		else{
    			int BorrowMaxNum = borrowListService.getRank(reader)
						.getBorrowMaxNum();// 最大借阅数量
				int BorrowNum = reader.getBorrowNum();// 正在借阅数量
				boolean flag1 = BorrowNum + 1 <= BorrowMaxNum;
				if(!flag1){
					inputStream = new ByteArrayInputStream(
							"3".getBytes("UTF-8"));//读者借阅达到上限
					return "ajax";
				}else{
					System.out.println("逾期未还");
					boolean flag = borrowListService.havaBook(reader);
			    	if (flag){// 存在逾期未还图书
			    		inputStream = new ByteArrayInputStream("4".getBytes("UTF-8"));
			    		return "ajax";
			    	}
			    	else{
				        inputStream = new ByteArrayInputStream(
						"1".getBytes("UTF-8"));
			    		}
				}
    		}
		}
		return "ajax";
		
	}
	public String validationBook() throws UnsupportedEncodingException{
		System.out.println("validationBook");
		boolean flag2 = borrowListService.validationBook(barcode);// 验证图书借阅编号的合法性
	    if(!flag2){
		inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));// 图书不存在	
		}
	    else{
	    	inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
	    }
		return "ajax";
		
	}
}
