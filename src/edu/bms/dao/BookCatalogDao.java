package edu.bms.dao;

import edu.bms.entity.BookCatalog;

public class BookCatalogDao extends BaseDao {
	public void save(BookCatalog bookcatalog){
		getSession().save(bookcatalog);
	}

	public void delete(BookCatalog bookCatalog) {
		getSession().delete(bookCatalog);
		
	}

}
