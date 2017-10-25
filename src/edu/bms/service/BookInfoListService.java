package edu.bms.service;

import java.util.List;

import edu.bms.dao.BookInfoListDao;
import edu.bms.entity.BookInfoList;

public class BookInfoListService {
  private BookInfoListDao bookInfoListDao;

public BookInfoListDao getBookInfoListDao() {
	return bookInfoListDao;
}

public void setBookInfoListDao(BookInfoListDao bookInfoListDao) {
	this.bookInfoListDao = bookInfoListDao;
}

@SuppressWarnings("rawtypes")
public List<BookInfoList> getAll(List ids) {
	return bookInfoListDao.getAll(ids);
}

public boolean save(BookInfoList model) {
	return bookInfoListDao.save(model);
}

public boolean delete(int bookInfoList_id) {
	return bookInfoListDao.delete(bookInfoList_id);
}
}
