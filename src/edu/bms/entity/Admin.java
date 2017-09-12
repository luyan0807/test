package edu.bms.entity;

import java.util.Date;

public class Admin {

@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", idno=" + idno
				+ ", password=" + password + ", phone=" + phone + ", email="
				+ email + ", address=" + address + ", nation=" + nation
				+ ", edurank=" + edurank + ", sex=" + sex + ", onworkDate="
				+ onworkDate + ", birthday=" + birthday + "]";
	}
   private int id;
   private String name;
   private String idno;
   private String password;
   private String phone;
   private String email;
   private String address;
   private String nation;
   private String edurank;
   private String sex;
   private Date onworkDate;
   private Date birthday;
   private String type;
   public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
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

public String getIdno() {
	return idno;
}
public void setIdno(String idno) {
	this.idno = idno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getNation() {
	return nation;
}
public void setNation(String nation) {
	this.nation = nation;
}
public String getEdurank() {
	return edurank;
}
public void setEdurank(String edurank) {
	this.edurank = edurank;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public Date getOnworkDate() {
	return onworkDate;
}
public void setOnworkDate(Date onworkDate) {
	this.onworkDate = onworkDate;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
}
