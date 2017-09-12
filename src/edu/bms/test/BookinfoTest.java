package edu.bms.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.bms.entity.BookCatalog;
import edu.bms.entity.BookInfo;

public class BookinfoTest {
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
	public void test() {
		BookInfo bookInfo=new BookInfo();
		BookCatalog bookCatalog =new BookCatalog();
		bookInfo.setIsbn("23132");
		bookInfo.setName("aaa");
		bookCatalog.setIsbn(bookInfo.getIsbn());
		bookInfo.setBookCatalog(bookCatalog);
		session.save(bookCatalog);
		session.save(bookInfo);
	}

}
