package edu.bms.service;

import java.util.List;

import edu.bms.dao.BookListDao;
import edu.bms.entity.BookList;

public class BookListService {
  private BookListDao bookListDao;

public BookListDao getBookListDao() {
	return bookListDao;
}

public void setBookListDao(BookListDao bookListDao) {
	this.bookListDao = bookListDao;
}

public List<BookList> getBookList(int i) {
	// TODO Auto-generated method stub
	return bookListDao.getBookList(i);
}
  
}
