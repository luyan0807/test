package edu.bms.entity;

import java.util.Date;


public class Booking {

	private Integer id;//预约编号
	
	private Date bookingDate;//预约日期
	
	private Date limitDate;//预约期限
	private Date CancelDate;//取消日期
	
	private Reader reader;//读者身份证号
	private String isbn;//图书国际编号


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

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	

	public Date getLimitDate() {
		return limitDate;
	}

	public void setLimitDate(Date limitDate) {
		this.limitDate = limitDate;
	}

	public Date getCancelDate() {
		return CancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		CancelDate = cancelDate;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
   public Booking(){
	 
 }

}
