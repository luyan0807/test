package edu.bms.service;

import java.util.List;

import edu.bms.dao.WishBookDao;
import edu.bms.entity.WishBook;

public class WishBookService {
private WishBookDao wishBookDao;

public WishBookDao getWishBookDao() {
	return wishBookDao;
}

public void setWishBookDao(WishBookDao wishBookDao) {
	this.wishBookDao = wishBookDao;
}

public List<WishBook> showWishBook(int pageNow, int pageSize) {
	return wishBookDao.showWishBook(pageNow,pageSize);
}

public List<WishBook> showNotcheckedWB(int pageNow, int pageSize) {
	// TODO Auto-generated method stub
	return wishBookDao.showNotcheckedWB(pageNow,pageSize);
}

public int findAllWishBook() {
	// TODO Auto-generated method stub
	return wishBookDao.findAllWishBook();
}

public int findAllNotCheckWishBook() {
	// TODO Auto-generated method stub
	return wishBookDao.findAllNotCheckWishBook();
}
}
