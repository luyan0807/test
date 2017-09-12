package edu.bms.dao;
import edu.bms.entity.BookBarcode;
import edu.bms.entity.BookCatalog;
import edu.bms.entity.BookInfo;
import edu.bms.entity.BorrowList;
import edu.bms.entity.Reader;
import edu.bms.entity.ReturnList;

public class ReturnListDao extends BaseDao{

	public BorrowList getborrowlist(BookBarcode bookBarcode) {//获取借阅记录
		String hql = "From BorrowList where barcode=? and state=?";
		BorrowList borrowList = (BorrowList) getSession().createQuery(hql)
				.setEntity(0, bookBarcode)
				.setString(1, "1")
				.uniqueResult();
		return borrowList;
	}

	public BookBarcode getbarcode(String barcode) {//获取借阅编号对应的记录
		String hqlString = "From BookBarcode where barcode=? and state=?";
		BookBarcode barcode2 = (BookBarcode) getSession()
				.createQuery(hqlString).setString(0, barcode)
				.setBoolean(1, false)
				.uniqueResult();
		return barcode2;
	}

	public void save(BorrowList borrowList, Reader reader, ReturnList returnList, BookBarcode bookBarcode, BookInfo bookInfo, BookCatalog bookCatalog) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(bookBarcode);
		getSession().saveOrUpdate(borrowList);
		getSession().saveOrUpdate(bookInfo);
		getSession().saveOrUpdate(bookCatalog);
		getSession().saveOrUpdate(reader);
		getSession().save(returnList);
	}

	public BookInfo getBookInfo(String isbn) {
		String hql="FROM BookInfo b WHERE b.isbn=?";
		BookInfo bookInfo=(BookInfo) getSession().createQuery(hql).setString(0, isbn).uniqueResult(); 
		return bookInfo;
	}

}
