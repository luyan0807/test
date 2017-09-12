package edu.bms.entity;

//对管理员的评价类
public class Assess {
	   private Integer id;//评价编号
	   private int scoreEva;//评价分数
	   private Admin admin;//管理员身份证号
	
	   public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getScoreEva() {
		return scoreEva;
	}
	public void setScoreEva(int scoreEva) {
		this.scoreEva = scoreEva;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	   
}
