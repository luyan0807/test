package edu.bms.entity;

import java.util.Date;

//赠书类
public class Largess {

	private Integer id;//自动编号
	private Reader reader;//身份证号
	private Date largessDate;//赠书日期
	private String operator;//操作员编号
	private String isbn;//国际编码

	private String refuseReason;//拒绝理由
	private Date applicationDate;//申请日期
	private String image;//封面图
	private String bookName;//书名
	private String anthor;//作者
	private String state;//状态  1:已同意     0：申请中       2：已拒绝
	
	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAnthor() {
		return anthor;
	}

	public void setAnthor(String anthor) {
		this.anthor = anthor;
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

	public Date getLargessDate() {
		return largessDate;
	}
	
	public void setLargessDate(Date largessDate) {
		this.largessDate = largessDate;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

	
}
