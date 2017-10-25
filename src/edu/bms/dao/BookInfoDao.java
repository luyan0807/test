package edu.bms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import edu.bms.entity.BookBarcode;
import edu.bms.entity.BookCatalog;
import edu.bms.entity.BookInfo;
import edu.bms.entity.BorrowList;

public class BookInfoDao extends BaseDao {


	public void save(BookInfo bookInfo, BookCatalog bookCatalog1) {
		getSession().save(bookCatalog1);
		getSession().save(bookInfo);
	}
    public void update(BookInfo bookInfo, BookCatalog bookCatalog2){
    	getSession().update(bookCatalog2);
    	getSession().update(bookInfo);
    }
	@SuppressWarnings("unchecked")
	public List<BookInfo> getByName(String search, int pageNow, int pageSize) {
		String hql="FROM BookInfo b WHERE b.name LIKE ?";
		Query query = getSession().createQuery(hql).setString(0, search);
		query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
        List<BookInfo> bookInfos = query.list();   
        if (bookInfos.size() > 0) {  
            return bookInfos;  
        }  
           return null;  
	}
    public int findSizeByName(String search){
    	String hql="FROM BookInfo b WHERE b.name LIKE ?";
    	int size=getSession().createQuery(hql).setString(0, search).list().size();
		return size;	
    }
	@SuppressWarnings("unchecked")
	public List<BookInfo> getByPublishName(String search, int pageNow, int pageSize) {
		String hql="FROM BookInfo b WHERE b.publishName LIKE ?";
		Query query = getSession().createQuery(hql).setString(0, search);
		query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
        List<BookInfo> bookInfos = query.list();   
        if (bookInfos.size() > 0) {  
            return bookInfos;  
        }  
           return null;  
	}
    public int findSizeByPublishName(String search){
		String hql="FROM BookInfo b WHERE b.publishName LIKE ?";
    	int size=getSession().createQuery(hql).setString(0, search).list().size();
		return size;	
    }

	@SuppressWarnings("unchecked")
	public List<BookInfo> getByAuthor(String search, int pageNow, int pageSize) {
		String hql="FROM BookInfo b WHERE b.anthor LIKE ?";
		Query query = getSession().createQuery(hql).setString(0, search);
		query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
        List<BookInfo> bookInfos = query.list();   
        if (bookInfos.size() > 0) {  
            return bookInfos;  
        }  
           return null;  
	}
    public int findSizeByAuthor(String search){
		String hql="FROM BookInfo b WHERE b.anthor LIKE ?";
    	int size=getSession().createQuery(hql).setString(0, search).list().size();
		return size;	
    }
	
	@SuppressWarnings("unchecked")
	public List<BookInfo> getByIsbn(String search, int pageNow, int pageSize) {
		String hql="FROM BookInfo b WHERE b.isbn LIKE ?";
		Query query = getSession().createQuery(hql).setString(0, search);
		query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
        List<BookInfo> bookInfos = query.list();   
        if (bookInfos.size() > 0) {  
            return bookInfos;  
        }  
           return null;  
	}
    public int findSizeByIsbn(String search){
		String hql="FROM BookInfo b WHERE b.isbn LIKE ?";
    	int size=getSession().createQuery(hql).setString(0, search).list().size();
		return size;	
    }
	@SuppressWarnings("unchecked")
	public List<BookInfo> getByKindof(String search, int pageNow, int pageSize) {
		String hql="FROM BookInfo b WHERE b.kindOf LIKE ?";
		Query query = getSession().createQuery(hql).setString(0, search);
		query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
        List<BookInfo> bookInfos = query.list();   
        if (bookInfos.size() > 0) {  
            return bookInfos;  
        }  
           return null;  
	}
    public int findSizeByKindOf(String search){
		String hql="FROM BookInfo b WHERE b.kindOf LIKE ?";
    	int size=getSession().createQuery(hql).setString(0, search).list().size();
		return size;	
    }
	@SuppressWarnings("unchecked")
	public List<BookInfo> getByCallnumber(String search, int pageNow, int pageSize) {
		String hql="FROM BookInfo b WHERE b.callNumber LIKE ?";
		Query query = getSession().createQuery(hql).setString(0, search);
		query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
        List<BookInfo> bookInfos = query.list();   
        if (bookInfos.size() > 0) {  
            return bookInfos;  
        }  
           return null;  
	}
    public int findSizeByCallNumber(String search){
		String hql="FROM BookInfo b WHERE b.callNumber LIKE ?";
    	int size=getSession().createQuery(hql).setString(0, search).list().size();
		return size;	
    }
	@SuppressWarnings("unchecked")
	public List<BookInfo> getByAnyword(String search, int pageNow, int pageSize) {
        Criteria criteria=getSession().createCriteria(BookInfo.class);
        criteria.add(Restrictions.or(Restrictions.like("name", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("isbn", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("anthor", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("publishName", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("kindOf", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("callNumber", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("language", search, MatchMode.ANYWHERE)))))))));
		criteria.setFetchSize((pageNow - 1) * pageSize);
		criteria.setMaxResults(pageSize);
		List<BookInfo> bookInfos=criteria.list(); 
        if (bookInfos.size() > 0) {  
            return bookInfos;  
        }  
           return null;  
	}
    public int findSizeByAnyword(String search){
        Criteria criteria=getSession().createCriteria(BookInfo.class);
        criteria.add(Restrictions.or(Restrictions.like("name", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("isbn", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("anthor", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("publishName", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("kindOf", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("callNumber", search, MatchMode.ANYWHERE),
        		     Restrictions.or(Restrictions.like("language", search, MatchMode.ANYWHERE)))))))));
    	int size=criteria.list().size(); 
		return size;	
    }
    @SuppressWarnings("unchecked")
	public List<BookInfo> getAllBookInfo(int pageNow, int pageSize){// 查询所有 分页页  
        String hql = "from BookInfo";  
        Query query = getSession().createQuery(hql);//执行查询操作  
        query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
        List<BookInfo> bookInfos = query.list();   
        if (bookInfos.size() > 0) {  
            return bookInfos;  
        }  
           return null;  
    } 
    public int findAllSize() {// 所有个数    
        String hql = "from BookInfo";  
        int size = getSession().createQuery(hql).list().size();   
        return size;  
    }
	public BookInfo getById(String id) {
		String hql="FROM BookInfo where id=?";
		BookInfo bookInfo=(BookInfo) getSession().createQuery(hql).setString(0, id).uniqueResult();
		return bookInfo;
		// TODO Auto-generated method stub
		
	}
	public void delete(String[] ids) {
		String hql = "";
		for(int i=0;i<ids.length;i++) {
			if(i==0) {
                hql = "id="+ids[i];
            } else {
                hql =hql + " or id="+ids[i];
            }
		}
        Query q= getSession().createQuery("delete from BookInfo where "+hql);
        
        q.executeUpdate();
			
	}
	public boolean checkIsbn(String isbn) {
	String hql="From BookInfo where isbn=?";
	BookInfo bookInfo=(BookInfo) getSession().createQuery(hql).setString(0, isbn).uniqueResult();
	if(bookInfo==null){
		return true;
	}
		return false;
	}
	public void updateNoImage(BookInfo b2, BookCatalog bookCatalog2) {
		// TODO Auto-generated method stub
		getSession().update(bookCatalog2);
		String hql="update BookInfo b set b.name=?,"
				+ "b.isbn=?,"
				+ "b.price=?,"
				+ "b.anthor=?,"
				+ "b.publishName=?,b.publishDate=?,kindOf=?,callNumber=?,language=?,num=?,"
				+ "pageNo=?,collection=?,plotSummary=?,edition=?,"
				+ "abstracts=?,bookCatalog=?"
				+ "where b.id=?";
		getSession().createQuery(hql).setString(0, b2.getName())
		.setString(1, b2.getIsbn())
		.setDouble(2, b2.getPrice())
		.setString(3, b2.getAnthor())
		.setString(4, b2.getPublishName())
		.setDate(5, b2.getPublishDate())
		.setString(6, b2.getKindOf())
		.setString(7, b2.getCallNumber())
		.setString(8, b2.getLanguage())
		.setInteger(9, b2.getNum())
		.setInteger(10, b2.getPageNo())
		.setString(11, b2.getCollection())
		.setString(12, b2.getPlotSummary())
		.setLong(13, b2.getEdition())
		.setString(14, b2.getAbstracts())
		.setEntity(15, b2.getBookCatalog())
		.setInteger(16, b2.getId())
		.executeUpdate();
	}
	@SuppressWarnings("unchecked")
	public List<BookBarcode> getBookbarcode(String isbn) {//图书借阅编号
		String hql="From BookBarcode where isbn=?";
	    List<BookBarcode> bookBarcodes=getSession().createQuery(hql).setString(0, isbn).list();		
	    return bookBarcodes;
	}
	@SuppressWarnings("unchecked")
	public List<BorrowList> getBorrowlist(int[] ids) {
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
		String hql = "";
		for(int i=0;i<ids.length;i++) {
			if(i==0) {
                hql = "barcode="+ids[i];
            } 
			else if(ids[i]!=0) {
                hql =hql + " or barcode="+ids[i];
            }
		}
        Query q= getSession().createQuery("from BorrowList where "+hql+"and state=1");
         List<BorrowList> borrowLists= q.list();
         System.out.println(hql);
		return borrowLists;
	}
	
}
