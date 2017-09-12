package edu.bms.entity;

import java.util.Date;
public class BookInfo {
	private Integer id;//自增
	private String name;//书名
	private String isbn;//图书国际编号
	private String image;//图片路径
	private double price;//价格
	private String anthor;//作者
	private String publishName;//出版社名称
	private Date   publishDate;//出版日期
	private String kindOf;//类型
	private String callNumber;//索书号
	private String language;//语种
	private Integer num;//图书数量
	private Integer pageNo;//页数
	private String collection;//藏馆地 
	private String plotSummary;//内容简介
	private Integer edition;//版次 
	private String abstracts;//摘要 
	private BookCatalog bookCatalog;//目录  一对一
	
	public String getPlotSummary() {
		return plotSummary;
	}
	public void setPlotSummary(String plotSummary) {
		this.plotSummary = plotSummary;
	}
	public String getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}

	public Integer getEdition() {
		return edition;
	}
	public void setEdition(Integer edition) {
		this.edition = edition;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAnthor() {
		return anthor;
	}
	public void setAnthor(String anthor) {
		this.anthor = anthor;
	}
	public String getPublishName() {
		return publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getKindOf() {
		return kindOf;
	}
	public void setKindOf(String kindOf) {
		this.kindOf = kindOf;
	}
	public String getCallNumber() {
		return callNumber;
	}
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public BookCatalog getBookCatalog() {
		return bookCatalog;
	}
	public void setBookCatalog(BookCatalog bookCatalog) {
		this.bookCatalog = bookCatalog;
	}
	
}
