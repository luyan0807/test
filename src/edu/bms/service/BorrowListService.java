package edu.bms.service;

import java.text.ParseException;

import edu.bms.dao.BorrowListDao;
import edu.bms.entity.BookBarcode;
import edu.bms.entity.BookCatalog;
import edu.bms.entity.BookInfo;
import edu.bms.entity.BorrowList;
import edu.bms.entity.Rank;
import edu.bms.entity.Reader;
public class BorrowListService {
	private BorrowListDao borrowListDao;
    public BorrowListDao getBorrowListDao() {
		return borrowListDao;
	}
	public void setBorrowListDao(BorrowListDao borrowListDao) {
		this.borrowListDao = borrowListDao;
	}
	public Reader validationReader(String idno){//验证读者ID是否合法
          return borrowListDao.getCertificate(idno);
    }
    public boolean validationBook(String barcode){//验证图书
		return borrowListDao.getBook(barcode);
    }
    public void BorrowList(){//进行借阅
    	  
    }
	public Rank getRank(Reader reader) {   //获取借阅等级
        return borrowListDao.getRank(reader);
	}
	public boolean havaBook(Reader reader) throws ParseException {
		return borrowListDao.havaBook(reader);//检验读者是否有逾期未还书籍
        
	}
	public Reader getReader(String idno) {
		// TODO Auto-generated method stub
		return borrowListDao.getreader(idno);
	}
	public BookBarcode getBarcode(String barcode) {
		// TODO Auto-generated method stub
		return borrowListDao.getBarcode(barcode);
	}
	public BookInfo getbookinfo(String isbn) {
		// TODO Auto-generated method stub
		return borrowListDao.getbookinfo(isbn);
	}
	public Boolean save(BorrowList borrowList, Reader reader, BookCatalog bookCatalog, BookInfo bookInfo, BookBarcode barcode) {
		// TODO Auto-generated method stub
		return borrowListDao.save(borrowList,reader,barcode,bookInfo,bookCatalog);
	}
	public int getBorrowLimit(Integer id) {
		// TODO Auto-generated method stub
		return borrowListDao.getBorrowLimit(id);
	}

}
