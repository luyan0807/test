package edu.bms.entity;

public class BookCatalog {
	private int id;//自动编号
	
	private int borrowTime;//借阅次数
	private int borrowNum;//可借阅数量
	private int renewTime;//续借次数

	private String isbn;//国际编号

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBorrowTime() {
		return borrowTime;
	}

	public void setBorrowTime(int borrowTime) {
		this.borrowTime = borrowTime;
	}

	public int getBorrowNum() {
		return borrowNum;
	}

	public void setBorrowNum(int borrowNum) {
		this.borrowNum = borrowNum;
	}

	public int getRenewTime() {
		return renewTime;
	}

	public void setRenewTime(int renewTime) {
		this.renewTime = renewTime;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
