package edu.bms.dao;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import edu.bms.entity.BookBarcode;
import edu.bms.entity.BookCatalog;
import edu.bms.entity.BookInfo;
import edu.bms.entity.BorrowList;
import edu.bms.entity.Rank;
import edu.bms.entity.Reader;
import edu.bms.utils.ComDate;
public class BorrowListDao extends BaseDao {
	public Reader getCertificate(String idno) {
		//检查读者ID是否合法
		String hql1="From Reader where idCard=?";
		Reader reader= (Reader) getSession().createQuery(hql1).setString(0, idno).uniqueResult();
		if(reader==null){
			return null;
		}
		else{
		return reader;
		}
	}
	public Rank getRank(Reader reader){//查询借阅等级
		String id = String.valueOf(reader.getId());
        String hql="From Rank where reader_id=?";
	        Rank rankResult=(Rank)getSession().createQuery(hql).setString(0,id).uniqueResult();
			return rankResult;
	}
	public boolean havaBook(Reader reader) throws ParseException {//检验读者是否有逾期未还书籍
		List<BorrowList> borrowLists;
		borrowLists=getBorrowLists(reader.getId());
		System.out.println(reader.getId());
		boolean f=borrowLists.size()==0;
	    if(f){
	    	return false;//不存在
	    }
	    else {
	    String s,n;
	    Date sreturnDate=getMinDate(reader.getId());
		Date nowDate=new Date();
		java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        s=format1.format(sreturnDate);
        n=format1.format(nowDate);
        ComDate comDate=new ComDate();
        boolean flag=comDate.comdate(s, n);
		return flag;//true 存在  false 不存在
	    }
	}
	public Date getMinDate(int id){//获取读者未还借书记录最小日期
		List<BorrowList> borrowLists=getBorrowLists(id);
		int i=0;
		BorrowList b=null;
		for(BorrowList item:borrowLists)
		{
			if(i==0){
				b=item;
			}
			else
			{
				if(item.getsReturnDate().before(b.getsReturnDate())){
					b=item;
				}
			}
			i++;
		}
		return b.getsReturnDate();
	}
	@SuppressWarnings("unchecked")
	public List<BorrowList> getBorrowLists(int id){//获取读者未还借书记录
		String hql="FROM BorrowList WHERE reader_id=? and state=?";
		Query query=getSession().createQuery(hql);
		query.setInteger(0, id).setString(1, "1");
		List<BorrowList> borrowLists=query.list();
		return borrowLists;
	}
	public boolean getBook(String barcode) {//验证借阅图书状态
		String hql="From BookBarcode Where barcode=? and state=?";
	    BookBarcode bookBarcode=(BookBarcode) getSession().createQuery(hql).setString(0, barcode)
	    		.setBoolean(1, true)
	    		.uniqueResult();
	    boolean f=bookBarcode==null;
	    if(!f){
	    	return bookBarcode.isState();
	    }else{
	       return false;
	}
	}
	public Reader getreader(String idno) {//获取读者
		String hql = "From Reader where idCard=?";
		Reader reader = (Reader) getSession().createQuery(hql)
				.setString(0, idno).uniqueResult();
		return reader;
	}
	public BookBarcode getBarcode(String barcode) {//获取借阅编号
		String hql = "From BookBarcode where barcode=?";
		BookBarcode bookBarcode = (BookBarcode) getSession().createQuery(hql)
				.setString(0, barcode).uniqueResult();
		return bookBarcode;
	}
	public BookInfo getbookinfo(String isbn) {//获取图书
		String hql = "From BookInfo where isbn=?";
		BookInfo bookInfo = (BookInfo) getSession().createQuery(hql)
				.setString(0, isbn).uniqueResult();
		return bookInfo;
	}
	public boolean save(BorrowList borrowList, Reader reader, BookBarcode barcode, BookInfo bookInfo, BookCatalog bookCatalog) {//进行借阅
	   getSession().saveOrUpdate(reader);
	   getSession().saveOrUpdate(barcode);
	   getSession().saveOrUpdate(bookCatalog);
	   getSession().saveOrUpdate(bookInfo);
	   getSession().save(borrowList);
	   System.out.println("finish");
	   return true;
	}
	public int getBorrowLimit(Integer id) {//获取借阅期限
		String hql = "SELECT borrowLimit FROM  Rank where reader_id=?";
		int b = (int) getSession().createQuery(hql)
				.setInteger(0, id).uniqueResult();
		return b;
	}
    
}
