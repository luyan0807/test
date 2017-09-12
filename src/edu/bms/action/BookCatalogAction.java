package edu.bms.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.bms.entity.BookCatalog;
import edu.bms.service.BookCatalogService;

public class BookCatalogAction extends ActionSupport implements 
ModelDriven<BookCatalog>,Preparable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private BookCatalogService bookCatalogService;
	public BookCatalogService getBookCatalogService() {
	return bookCatalogService;
}

public void setBookCatalogService(BookCatalogService bookCatalogService) {
	this.bookCatalogService = bookCatalogService;
}

	@Override
	public BookCatalog getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
