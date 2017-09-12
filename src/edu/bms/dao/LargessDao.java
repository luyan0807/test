package edu.bms.dao;

import java.util.List;

import org.hibernate.Query;

import edu.bms.entity.Largess;

public class LargessDao extends BaseDao{

	@SuppressWarnings("unchecked")
	public List<Largess> showLargess(int pageNow, int pageSize) {
		String hql="FROM Largess";
		Query query = getSession().createQuery(hql);
		query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
        List<Largess> largesses= query.list();  
        if (largesses.size() > 0) {  
            return largesses;  
        }  
           return null;
	}

	public void update(Largess largess) {
		String hql="update Largess l set l.refuseReason=?,l.state=?,l.operator=? where l.id=? ";
		 getSession().createQuery(hql).setString(0, largess.getRefuseReason())
		.setString(1, largess.getState())
		.setString(2, largess.getOperator())
		.setInteger(3, largess.getId())
		.executeUpdate();
	}

	public void agree(String id) {
		// TODO Auto-generated method stub
		int Id=Integer.valueOf(id);
		System.out.println("dao");
		String hql="update Largess l set l.state=? where l.id=?";
		getSession().createQuery(hql).setString(0, "1")
		.setInteger(1, Id).executeUpdate();
	}

	public int findAllLargess() {
		 String hql = "from Largess ";  
	        int size = getSession().createQuery(hql).list().size();   
	        return size;  
	}

	@SuppressWarnings("unchecked")
	public List<Largess> showNotChecked(int pageNow, int pageSize) {
		String hql="FROM Largess where state=?";
		Query query = getSession().createQuery(hql).setString(0, "0");
		query.setFirstResult((pageNow - 1) * pageSize);  
        query.setMaxResults(pageSize);  
		List<Largess> largesses= query.list();  
        if (largesses.size() > 0) {  
            return largesses;  
        }  
           return null;
	}

	public int findNotCheckedLargess() {
		 String hql = "from Largess where state=?";  
	        int size = getSession().createQuery(hql).setString(0, "0").list().size();   
	        return size;  
	}

	public boolean agreeAll(String[] ids) {
		System.out.println("agreeAll");
		String hql = "";
		for(int i=0;i<ids.length;i++) {
			if(i==0) {
                hql = "id="+ids[i];
            } else {
                hql =hql + " or id="+ids[i];
            }
		}
        Query q= getSession().createQuery("update Largess l set l.state=? where "+hql);
        int agreeInt=q.setString(0, "1").executeUpdate();
        if(agreeInt>0){
        	return true;
        }
        else{
        	return false;
        }
		
	}

}
