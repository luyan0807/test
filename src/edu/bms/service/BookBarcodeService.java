package edu.bms.service;

import edu.bms.dao.BookBarcodeDao;
import edu.bms.entity.BookBarcode;

public class BookBarcodeService {
private BookBarcodeDao bookBarcodeDao;




	public BookBarcodeDao getBookBarcodeDao() {
	return bookBarcodeDao;
}




public void setBookBarcodeDao(BookBarcodeDao bookBarcodeDao) {
	this.bookBarcodeDao = bookBarcodeDao;
}




	public void save(BookBarcode bookBarcode) {
		bookBarcodeDao.save(bookBarcode);;// TODO Auto-generated method stub
		
	}




	public void delete(BookBarcode bookBarcode) {
		bookBarcodeDao.delete(bookBarcode);// TODO Auto-generated method stub
		
	}

	public boolean vaisbn(String isbn) {
		// TODO Auto-generated method stub
		return bookBarcodeDao.vaisbn(isbn);
	}




	public boolean vabarcode(String barcode) {
		// TODO Auto-generated method stub
		return bookBarcodeDao.vabarcode(barcode);
	}




	public boolean vaisbn2(String isbn) {
		// TODO Auto-generated method stub
		return bookBarcodeDao.vaisbn2(isbn);
	}




	public BookBarcode BeforeDelete(BookBarcode model) {
		// TODO Auto-generated method stub
		return bookBarcodeDao.BeforeDelete(model);
	}

}
