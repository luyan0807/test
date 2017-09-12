package edu.bms.service;

import edu.bms.dao.BookCatalogDao;
import edu.bms.entity.BookCatalog;

public class BookCatalogService {
    private BookCatalogDao bookCatalogDao;
    
	public BookCatalogDao getBookCatalogDao() {
		return bookCatalogDao;
	}

	public void setBookCatalogDao(BookCatalogDao bookCatalogDao) {
		this.bookCatalogDao = bookCatalogDao;
	}

	public void save(BookCatalog bookCatalog) {
		bookCatalogDao.save(bookCatalog);// TODO Auto-generated method stub
		
	}

	public void delete(BookCatalog bookCatalog) {
		// TODO Auto-generated method stub
		bookCatalogDao.delete(bookCatalog);
	}

    
}
