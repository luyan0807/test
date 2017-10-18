package edu.bms.dao;

import java.util.List;

import org.hibernate.Query;

import edu.bms.entity.BookInfoList;
import edu.bms.entity.BookList;

public class BookListDao extends BaseDao {

	@SuppressWarnings("unchecked")
	public List<BookList> getBookList(int i) {
		String hql="FROM BookList b WHERE b.admin_id =?";
		Query query = getSession().createQuery(hql).setInteger(0, i); 
        List<BookList> bookLists = query.list();
        if (bookLists.size()>0) {  
            return bookLists;  
        }else{
        	 return null;
        }
            
	}

	public void save(BookList model) {
		getSession().save(model);
	}

	@SuppressWarnings("unchecked")
	public List<BookInfoList> showlist(int booklist_id) {
		String hql="FROM BookInfoList b WHERE b.bookList_id =?";
		Query query = getSession().createQuery(hql).setInteger(0, booklist_id); 
        List<BookInfoList> bookLists = query.list();
        if (bookLists.size()>0) {  
            return bookLists;  
        }else{
        	 return null;
        }
	}
    
}
