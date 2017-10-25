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

	@SuppressWarnings("rawtypes")
	public List getAll(int id) {
		String hql1="select id FROM BookList b WHERE b.admin_id =?";
		Query query1 = getSession().createQuery(hql1).setInteger(0, id);
		List ids=query1.list();
		if(ids.size()>0){
		return ids;
		}
		else{
			return null;
		}
	}

	public boolean delete(int booklist_id) {
		String hql="delete BookList where id=?";
		System.err.println(booklist_id);
		try {
			getSession().createQuery(hql).setInteger(0, booklist_id).executeUpdate();
		} catch (Exception e) {
			System.out.println("书单删除错误");
			return false;
		}
		return true;
	}
    
}
