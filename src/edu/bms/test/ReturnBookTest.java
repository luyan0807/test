package edu.bms.test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.bms.entity.BookBarcode;
import edu.bms.entity.BorrowList;
import edu.bms.entity.Reader;
import edu.bms.utils.GetlimitDate;


public class ReturnBookTest {
	private SessionFactory sessionFactory;
	 private Session session;
	 private Transaction transaction;
		@Before
		public void init(){
			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = 
					new ServiceRegistryBuilder().applySettings(configuration.getProperties())
					                            .buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
		}
		
		@After
		public void destroy(){
			transaction.commit();
			session.close();
			sessionFactory.close();
		}
     @Test
     public void test(){
    	 BookBarcode barcode=new BookBarcode();
    	 barcode.setId(4);
    	 String hql="From BorrowList where barcode=?";
         BorrowList  borrowList=(BorrowList) session.createQuery(hql).setEntity(0, barcode).uniqueResult();
    	 Reader reader=borrowList.getReader();
         System.out.println(reader.getIdCard());
         System.out.println(reader.getId());
     }
     @Test
     public void test2(){
    	 String hql="From BookBarcode where barcode=? and state=?";
    	 BookBarcode barcode=(BookBarcode) session.createQuery(hql).setString(0, "12113")
    			 .setBoolean(1, false)
    			 .uniqueResult();
    	 System.out.println(barcode);
/*    	 boolean f=barcode==null;
    	 System.out.println(f);*/
     }
     @SuppressWarnings("static-access")
	@Test
     public void test3() throws ParseException{
    	 Date a=new Date();
    	 Calendar calendar= new   GregorianCalendar();
    	 calendar.setTime(a);
    	 calendar.add(calendar.DATE, 18);
    	 Date b=calendar.getTime();
    	GetlimitDate g= new GetlimitDate();
    	int h= g.getlimit(b, a);
    	 System.out.println(h);
     }
}
