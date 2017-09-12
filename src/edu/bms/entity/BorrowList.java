package edu.bms.entity;

import java.util.Date;

public class BorrowList {

	private Integer id;
	private BookInfo bookInfo;//借阅图书信息
	private BookBarcode barcode;//图书借阅编号
	private Reader reader;//读者身份证号
	private Date borrowDate;//借阅日期
	private Date renewDate;//续借日期
	private int renewTime;//续借次数
    private Date sReturnDate;//应还日期
    private String state;//状态
    
 
    
  

	public BookInfo getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

	public BookBarcode getBarcode() {
		return barcode;
	}

	public void setBarcode(BookBarcode barcode) {
		this.barcode = barcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getRenewDate() {
		return renewDate;
	}

	public void setRenewDate(Date renewDate) {
		this.renewDate = renewDate;
	}

	public int getRenewTime() {
		return renewTime;
	}

	public void setRenewTime(int renewTime) {
		this.renewTime = renewTime;
	}

	public Date getsReturnDate() {
		return sReturnDate;
	}

	public void setsReturnDate(Date sReturnDate) {
		this.sReturnDate = sReturnDate;
	}


}
