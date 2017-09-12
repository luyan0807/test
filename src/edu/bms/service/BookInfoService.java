package edu.bms.service;

import java.util.List;

import edu.bms.dao.BookInfoDao;
import edu.bms.dao.BorrowListDao;
import edu.bms.entity.BookBarcode;
import edu.bms.entity.BookCatalog;
import edu.bms.entity.BookInfo;
import edu.bms.entity.BorrowList;

public class BookInfoService {
    private BookInfoDao bookInfoDao;

	public BookInfoDao getBookInfoDao() {
		return bookInfoDao;
	}

	public void setBookInfoDao(BookInfoDao bookInfoDao) {
		this.bookInfoDao = bookInfoDao;
	}

	public void save(BookInfo bookInfo, BookCatalog bookCatalog1) {
		// TODO Auto-generated method stub
		bookInfoDao.save(bookInfo,bookCatalog1);
	}
	public List<BookInfo> getByName(String search, int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return bookInfoDao.getByName(search,pageNow,pageSize);
	}

	public List<BookInfo> getByPublishName(String search, int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return bookInfoDao.getByPublishName(search,pageNow,pageSize);
	}

	public List<BookInfo> getByAuthor(String search, int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return bookInfoDao.getByAuthor(search,pageNow,pageSize);
	}

	public List<BookInfo> getByIsbn(String search, int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return bookInfoDao.getByIsbn(search,pageNow,pageSize);
	}

	public List<BookInfo> getByKindof(String search, int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return bookInfoDao.getByKindof(search,pageNow,pageSize);
	}

	public List<BookInfo> getByCallnumber(String search, int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return bookInfoDao.getByCallnumber(search,pageNow,pageSize);
	}

	public List<BookInfo> getByAnyword(String search, int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return bookInfoDao.getByAnyword(search,pageNow,pageSize);
	}
	public List<BookInfo> getAllBookInfo(int pageNow, int pageSize){
		return bookInfoDao.getAllBookInfo(pageNow, pageSize);
		
	}
	public int fingAllBookInfo(){
		return bookInfoDao.findAllSize();
		
	}

	public void update(BookInfo b1, BookCatalog bookCatalog2) {
		bookInfoDao.update(b1,bookCatalog2);// TODO Auto-generated method stub
		
	}

	public BookInfo getById(String id) {
		return bookInfoDao.getById(id);
		
	}

	public void delete(String[] ids) {
		bookInfoDao.delete(ids);
	}

	public int findSizeByName(String search) {
		return bookInfoDao.findSizeByName(search);
	}

	public int findSizeByPublishName(String search) {
		return bookInfoDao.findSizeByPublishName(search);
	}

	public int findSizeByAuthor(String search) {
		// TODO Auto-generated method stub
		return bookInfoDao.findSizeByAuthor(search);
	}

	public int findSizeByIsbn(String search) {
		// TODO Auto-generated method stub
		return bookInfoDao.findSizeByIsbn(search);
	}

	public int findSizeByKindOf(String search) {
		// TODO Auto-generated method stub
		return bookInfoDao.findSizeByKindOf(search);
	}

	public int findSizeByCallNumber(String search) {
		// TODO Auto-generated method stub
		return bookInfoDao.findSizeByCallNumber(search);
	}

	public int findSizeByAnyword(String search) {
		// TODO Auto-generated method stub
		return bookInfoDao.findSizeByAnyword(search);
	}

	public boolean checkIsbn(String isbn) {
		// TODO Auto-generated method stub
		return bookInfoDao.checkIsbn(isbn);
	}

	public void updateNOimage(BookInfo b2, BookCatalog bookCatalog2) {
		// TODO Auto-generated method stub
		bookInfoDao.updateNoImage(b2,bookCatalog2);
	}

	public List<BookBarcode> getBookbarcode(String isbn) {
		// TODO Auto-generated method stub
		return bookInfoDao.getBookbarcode(isbn);
	}

	public List<BorrowList> getBorrowlist(int[] ids) {
		
		return bookInfoDao.getBorrowlist(ids);
	}

}
