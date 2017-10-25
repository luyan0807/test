package edu.bms.service;

import java.util.List;

import edu.bms.dao.BookListDao;
import edu.bms.entity.BookInfoList;
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

public void save(BookList model) {
	// TODO Auto-generated method stub
	bookListDao.save(model);
}

public List<BookInfoList> showlist(int booklist_id) {
	// TODO Auto-generated method stub
	return bookListDao.showlist(booklist_id);
}

@SuppressWarnings("rawtypes")
public List getAll(int id) {
	// TODO Auto-generated method stub
	return bookListDao.getAll(id);
}

public boolean delete(int booklist_id) {
	// TODO Auto-generated method stub
	return bookListDao.delete(booklist_id);
}
  
}
