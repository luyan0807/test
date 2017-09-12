package edu.bms.service;

import edu.bms.dao.ReturnListDao;
import edu.bms.entity.BookBarcode;
import edu.bms.entity.BookCatalog;
import edu.bms.entity.BookInfo;
import edu.bms.entity.BorrowList;
import edu.bms.entity.Reader;
import edu.bms.entity.ReturnList;

public class ReturnListService {
private ReturnListDao returnListDao;

	public ReturnListDao getReturnListDao() {
	return returnListDao;
}

public void setReturnListDao(ReturnListDao returnListDao) {
	this.returnListDao = returnListDao;
}

	public BorrowList getborrowlist(BookBarcode bookBarcode) {
		// TODO Auto-generated method stub
		return returnListDao.getborrowlist(bookBarcode);
	}

	public BookBarcode getbarcode(String barcode) {
		// TODO Auto-generated method stub
		return returnListDao.getbarcode(barcode);
	}

	public void save(BorrowList borrowList, Reader reader, ReturnList returnList, BookBarcode bookBarcode, BookInfo bookInfo, BookCatalog bookCatalog) {
		// TODO Auto-generated method stub
		returnListDao.save(borrowList,reader,returnList,bookBarcode,bookInfo,bookCatalog);
	}

	public BookInfo getBookInfo(String isbn) {
		return returnListDao.getBookInfo(isbn);
	}
}
