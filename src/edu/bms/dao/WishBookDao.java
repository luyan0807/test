package edu.bms.dao;

import java.util.List;

import org.hibernate.Query;

import edu.bms.entity.Largess;
import edu.bms.entity.WishBook;

public class WishBookDao extends BaseDao{

	@SuppressWarnings("unchecked")
	public List<WishBook> showWishBook(int pageNow, int pageSize) {
		String hql="FROM WishBook";
		Query query = getSession().createQuery(hql);
		query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
        List<WishBook> wishBooks= query.list();  
        if (wishBooks.size() > 0) {  
            return wishBooks;  
        }  
           return null;
	}

	@SuppressWarnings("unchecked")
	public List<WishBook> showNotcheckedWB(int pageNow, int pageSize) {
		String hql="From WishBook where state=?";
		Query query = getSession().createQuery(hql).setString(0, "0");
		query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
        List<WishBook> wishBooks= query.list();  
        if (wishBooks.size() > 0) {  
            return wishBooks;  
        }  
           return null;
	}

	public int findAllWishBook() {
		String hql = "from WishBook ";  
        int size = getSession().createQuery(hql).list().size();   
        return size;  
	}

	public int findAllNotCheckWishBook() {
		String hql = "from WishBook where state=? ";  
        int size = getSession().createQuery(hql).setString(0, "0").list().size();   
        return size;  
	}

}
