package edu.bms.dao;



import java.util.List;

import org.hibernate.Query;

import edu.bms.entity.BookBarcode;
import edu.bms.entity.BookInfo;

public class BookBarcodeDao extends BaseDao {

	public void save(BookBarcode bookBarcode) {
	     getSession().save(bookBarcode);
		// TODO Auto-generated method stub
		
	}

	public void delete(BookBarcode bookBarcode) {
		// TODO Auto-generated method stub
		String hql="DELETE FROM BookBarcode b where b.isbn=? and b.barcode=?";
		Query query=getSession().createQuery(hql);
		query.setString(0, bookBarcode.getIsbn())
		.setString(1, bookBarcode.getBarcode())
		.executeUpdate();
	}

	public boolean vaisbn(String isbn) {
	String hql="From BookInfo where isbn=?";
	BookInfo bookInfo=(BookInfo) getSession().createQuery(hql).setString(0, isbn).uniqueResult();
	if(bookInfo==null){
		return false;
	}
		return true;
	}

	public boolean vabarcode(String barcode) {
		String hql="From BookBarcode where barcode=?";
	    BookBarcode bookBarcode=(BookBarcode) getSession().createQuery(hql).setString(0, barcode).uniqueResult();
		if(bookBarcode==null){
			return true;
		}
	    return false;
	}

	@SuppressWarnings("unchecked")
	public boolean vaisbn2(String isbn) {
		System.out.println("vaisbn2");
		String hql="From BookBarcode where isbn=?";
		List<BookBarcode> bookBarcodes=getSession().createQuery(hql).setString(0, isbn).list();
		if(bookBarcodes.size()==0){
			return false;
		}
		else{
			return true;	
		}
	}

	public BookBarcode BeforeDelete(BookBarcode model) {
		String hql="From BookBarcode where isbn=? and barcode=?";
        BookBarcode barcode	=(BookBarcode) getSession().createQuery(hql).setString(0, model.getIsbn())
		.setString(1, model.getBarcode()).uniqueResult();
		return barcode;
	}

}
