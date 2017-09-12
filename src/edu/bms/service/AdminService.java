package edu.bms.service;

import edu.bms.dao.AdminDao;
import edu.bms.entity.Admin;

public class AdminService {
	private AdminDao adminDao;
	

public AdminDao getAdminDao() {
		return adminDao;
	}


	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}


public Admin checkAdmin(String idno,String password, String type){
	
	return adminDao.checkamdin(idno, password,type);
	  
   }


	public void saveOrUpdate(Admin admin) {
		adminDao.saveOrUpdate(admin);

	}


	public void update(Admin admin, String id) {
		adminDao.update(admin,id);
		
	}


	public Admin get(String id) {
		Admin admin=adminDao.get(id);
		return admin;
		// TODO Auto-generated method stub
		
	}


	public boolean checkIdno(String idno) {
		// TODO Auto-generated method stub
		return adminDao.checkIdno(idno);
	}
}
