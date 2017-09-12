package edu.bms.entity;
/**
 * 图书导购单
 * 实体类
 * 主要是为图书管理员导购新书，大部分是根据读者的心愿单生成，再通过管理员的审核，生成图书导购单。
 * */
import java.sql.Date;

public class BookList {
   private int id;//自增id
   private String name;//书名
   private String author;//作者
   private Date addDate;//添加日期
   private Integer edition;//版次
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Date getAddDate() {
	return addDate;
}
public void setAddDate(Date addDate) {
	this.addDate = addDate;
}
public Integer getEdition() {
	return edition;
}
public void setEdition(Integer edition) {
	this.edition = edition;
}
   
}
