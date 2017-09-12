package edu.bms.entity;

public class Rank{

	private Integer id;//自动编号
	private int activeDate;//活跃天数
	private String rank;//用户等级
	private int borrowLimit;//借阅期限
	private int renewNum;//可续借次数
	private int borrowMaxNum;//最大可借数
	private Reader reader;//读者
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getActiveDate() {
		return activeDate;
	}
	public void setActiveDate(int activeDate) {
		this.activeDate = activeDate;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getBorrowLimit() {
		return borrowLimit;
	}
	public void setBorrowLimit(int borrowLimit) {
		this.borrowLimit = borrowLimit;
	}

	public int getRenewNum() {
		return renewNum;
	}
	public void setRenewNum(int renewNum) {
		this.renewNum = renewNum;
	}
	public int getBorrowMaxNum() {
		return borrowMaxNum;
	}
	public void setBorrowMaxNum(int borrowMaxNum) {
		this.borrowMaxNum = borrowMaxNum;
	}

}
