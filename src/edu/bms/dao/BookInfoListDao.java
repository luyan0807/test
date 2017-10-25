package edu.bms.dao;

import java.util.List;

import org.hibernate.Query;

import edu.bms.entity.BookInfoList;

public class BookInfoListDao extends BaseDao{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<BookInfoList> getAll(List ids) {
		String hql2="FROM BookInfoList bb WHERE bb.bookList_id IN (:idss)";
		Query query2 = getSession().createQuery(hql2)
				.setParameterList("idss", ids);
			List<BookInfoList> bookInfoLists =query2.list(); 
			if (bookInfoLists.size()>0) {  
	            return bookInfoLists;  
	        }else{
	        	 return null;
	}    
}

	public  boolean save(BookInfoList model) {
		try {
		getSession().save(model);
		} catch (Exception e) {
			System.out.println("存入失败");
			return false;
		}
		return true;
	}

	public  boolean delete(int bookInfoList_id) {
		String hql="delete BookInfoList where id=?";
		try {
		getSession().createQuery(hql).setInteger(0, bookInfoList_id).executeUpdate();
		} catch (Exception e) {
        System.out.println("书单内容删除错误");
        return false;
		}
		return true;
	}
}