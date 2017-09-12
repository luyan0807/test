package edu.bms.service;

import java.util.List;

import edu.bms.dao.LargessDao;
import edu.bms.entity.Largess;

public class LargessService {
private LargessDao largessDao;

	public LargessDao getLargessDao() {
	return largessDao;
}

public void setLargessDao(LargessDao largessDao) {
	this.largessDao = largessDao;
}

	public List<Largess> showLargess(int pageNow, int pageSize) {
		return largessDao.showLargess(pageNow,pageSize);
	}

	public void update(Largess largess) {
		// TODO Auto-generated method stub
		largessDao.update(largess);
	}

	public void agree(String id) {
		// TODO Auto-generated method stub
		largessDao.agree(id);
	}

	public int findAllLargess() {
		
		return largessDao.findAllLargess();
	}

	public List<Largess> showNotChecked(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return largessDao.showNotChecked(pageNow,pageSize);
	}

	public int findNotCheckedLargess() {
		// TODO Auto-generated method stub
		return largessDao.findNotCheckedLargess();
	}

	public boolean agreeAll(String[] ids) {
		return largessDao.agreeAll(ids);
		
	}


}
