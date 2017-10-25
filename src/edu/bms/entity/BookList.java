package edu.bms.entity;
/**
 * 图书导购单
 * 实体类
 * 主要是为图书管理员导购新书，大部分是根据读者的心愿单生成，再通过管理员的审核，生成图书导购单。
 * */
import java.sql.Date;
public class BookList {
	
   private String name;//书单名称
   private String reason;//创建原因
   private int id;//自增id
   private Date createDate;//创建日期
   private Admin admin_id;//创建者
public Admin getAdmin_id() {
	return admin_id;
}
public void setAdmin_id(Admin admin_id) {
	this.admin_id = admin_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getCreateDate() {
	return createDate;
}
public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}  
}
