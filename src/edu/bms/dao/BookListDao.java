package edu.bms.dao;

import java.util.List;

import org.hibernate.Query;
import edu.bms.entity.BookList;

public class BookListDao extends BaseDao {

	@SuppressWarnings("unchecked")
	public List<BookList> getBookList(int i) {
		// TODO Auto-generated method stub
		String hql="FROM BookList b WHERE b.admin_id =?";
		Query query = getSession().createQuery(hql).setInteger(0, i); 
        List<BookList> bookLists = query.list();
        System.out.println("size="+bookLists.size());
        if (bookLists.size()>0) {  
        	System.out.println(">0");
            return bookLists;  
        }else{
        	 return null;
        }
            
	}
    
}
