package edu.bms.entity;

import java.util.HashSet;
import java.util.Set;


public class Ticket {

	private Integer id;//自动编号
	private Reader idCard;//身份证号
	private int fineDate;//缴纳日期
	private double arrearage;//罚金
	private ReturnList returnList;//借阅编号
	
	private Set<ReturnList> returnLists=new HashSet<>();

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

	public int getFineDate() {
		return fineDate;
	}

	public void setFineDate(int fineDate) {
		this.fineDate = fineDate;
	}

	public double getArrearage() {
		return arrearage;
	}

	public void setArrearage(double arrearage) {
		this.arrearage = arrearage;
	}




	public ReturnList getReturnList() {
		return returnList;
	}

	public void setReturnList(ReturnList returnList) {
		this.returnList = returnList;
	}

	public Set<ReturnList> getReturnLists() {
		return returnLists;
	}

	public void setReturnLists(Set<ReturnList> returnLists) {
		this.returnLists = returnLists;
	}




}
