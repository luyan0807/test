package edu.bms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
//添加了正在借阅数量
public class Certificate {
	private Integer id;//有户编号
	private String company;//工作单位
	private String work;//职业
	private Date birthDay;//出生年月
	private Date term;//有效期
	private double arrearage;//欠费金额
	private String postalCode;//邮政编码
	private String userName;//真实姓名
	private int rank;//借阅等级
	private String image;//头像
	private int booking;//累计预约
	private int renew;//累计续借
	private int cum_load;//累计借阅
	private double cum_penalty;//累计罚金
	private Boolean peccancy;//违章状态
	private String qualification;//学历
	private int borrowNum;//正在借阅数量
	private Set<Booking> bookings=new HashSet<Booking>();
	
	private Set<Largess> largesses=new HashSet<Largess>();
	
	private Set<ReturnList> returnLists=new HashSet<ReturnList>();
	
	private Set<Ticket> tickets=new HashSet<Ticket>();
	
	private Set<WishBook> wishBooks=new HashSet<WishBook>();

	
	public int getBorrowNum() {
		return borrowNum;
	}

	public void setBorrowNum(int borrowNum) {
		this.borrowNum = borrowNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Date getTerm() {
		return term;
	}

	public void setTerm(Date term) {
		this.term = term;
	}

	public double getArrearage() {
		return arrearage;
	}

	public void setArrearage(double arrearage) {
		this.arrearage = arrearage;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getBooking() {
		return booking;
	}

	public void setBooking(int booking) {
		this.booking = booking;
	}

	public int getRenew() {
		return renew;
	}

	public void setRenew(int renew) {
		this.renew = renew;
	}

	public int getCum_load() {
		return cum_load;
	}

	public void setCum_load(int cum_load) {
		this.cum_load = cum_load;
	}

	public double getCum_penalty() {
		return cum_penalty;
	}

	public void setCum_penalty(double cum_penalty) {
		this.cum_penalty = cum_penalty;
	}

	public Boolean getPeccancy() {
		return peccancy;
	}

	public void setPeccancy(Boolean peccancy) {
		this.peccancy = peccancy;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	public Set<Largess> getLargesses() {
		return largesses;
	}

	public void setLargesses(Set<Largess> largesses) {
		this.largesses = largesses;
	}

	public Set<ReturnList> getReturnLists() {
		return returnLists;
	}

	public void setReturnLists(Set<ReturnList> returnLists) {
		this.returnLists = returnLists;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Set<WishBook> getWishBooks() {
		return wishBooks;
	}

	public void setWishBooks(Set<WishBook> wishBooks) {
		this.wishBooks = wishBooks;
	}
    
}
