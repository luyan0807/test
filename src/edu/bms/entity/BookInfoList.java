package edu.bms.entity;

public class BookInfoList {
private Integer id;//id
private String bookname;//书名
private String author;//作者
private String edition;//版次
private Integer num;//数量
private Integer bookList_id;//隶属那个书单

public Integer getBookList_id() {
	return bookList_id;
}
public void setBookList_id(Integer bookList_id) {
	this.bookList_id = bookList_id;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getEdition() {
	return edition;
}
public void setEdition(String edition) {
	this.edition = edition;
}
public Integer getNum() {
	return num;
}
public void setNum(Integer num) {
	this.num = num;
}

}

