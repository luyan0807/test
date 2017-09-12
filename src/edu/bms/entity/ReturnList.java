package edu.bms.entity;

import java.util.Date;




public class ReturnList {
	
	private Integer id;//自动编号
	private Reader idCard;//身份证号
	private Date returnDate;//还书日期
	private int limitDate;//超期天数
	private BorrowList borrowList;//借阅编号
	//private String barCode;//条形码


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Reader getIdCard() {
		return idCard;
	}

	public void setIdCard(Reader idCard) {
		this.idCard = idCard;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getLimitDate() {
		return limitDate;
	}

	public void setLimitDate(int limitDate) {
		this.limitDate = limitDate;
	}

	public BorrowList getBorrowList() {
		return borrowList;
	}

	public void setBorrowList(BorrowList borrowList) {
		this.borrowList = borrowList;
	}



}
