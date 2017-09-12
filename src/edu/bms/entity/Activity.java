package edu.bms.entity;

import java.util.Date;

public class Activity {

	private Integer id;
	private String topical;//主题
	private Date publishDate;//发布日期
	private Date enrollTime;//报名有效时间
	private String activityAddr;//活动地点
	private Date activityDate;//活动时间
	private String speaker;//主讲人
	private String actor;//参与者
	private int activityCum;//活动人数
	private String actContent;//活动内容
	private String image;//图片
	private String promptWarmth;//温馨提示
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTopical() {
		return topical;
	}
	public void setTopical(String topical) {
		this.topical = topical;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Date getEnrollTime() {
		return enrollTime;
	}
	public void setEnrollTime(Date enrollTime) {
		this.enrollTime = enrollTime;
	}
	public String getActivityAddr() {
		return activityAddr;
	}
	public void setActivityAddr(String activityAddr) {
		this.activityAddr = activityAddr;
	}
	public Date getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getActivityCum() {
		return activityCum;
	}
	public void setActivityCum(int activityCum) {
		this.activityCum = activityCum;
	}
	public String getActContent() {
		return actContent;
	}
	public void setActContent(String actContent) {
		this.actContent = actContent;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPromptWarmth() {
		return promptWarmth;
	}
	public void setPromptWarmth(String promptWarmth) {
		this.promptWarmth = promptWarmth;
	}
	
	
	
}
