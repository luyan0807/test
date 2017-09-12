package edu.bms.test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.bms.entity.Admin;
import edu.bms.entity.BookBarcode;
import edu.bms.entity.BorrowList;
import edu.bms.entity.Rank;
import edu.bms.entity.Reader;
import edu.bms.utils.ComDate;

public class HqlTest{
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
	public void testsave() {
/*		Reader reader=new Reader();
		reader.setIdCard("123");
		reader.setName("a");
		reader.setRank(2);
		session.save(reader);*/
		String hql2="From Reader where idCard=?";
		Reader reader=(Reader) session.createQuery(hql2).setString(0, "123").uniqueResult();
		System.out.println(reader.getRank());
		System.out.println(reader.getUserName());
	}
		@Test
		public void testquery(){
			Admin admin=new Admin();
			admin.setName("aa");
			admin.setPassword("123456789");
			session.save(admin);	
		}
		@Test
		public void test1(){
/*			Rank rank=new Rank();
			rank.setRank("1");
			rank.setBorrowLimit(30);
			rank.setBorrowMaxNum(10);
			rank.setRenewNum(1);
	        session.save(rank);*/
	        String hql="From Rank r where r.rank=:rank";
	        Rank rank=(Rank) session.createQuery(hql).setString("rank", "1").uniqueResult();
	        System.out.println(rank.getBorrowMaxNum());
		}
		@SuppressWarnings("unchecked")
		@Test
		public void test2() throws ParseException{
			String hql="From BorrowList where reader_id=? and state=?";
/*			String s = String.valueOf(id);*/
		    List<BorrowList> borrowLists=(List<BorrowList>) session.createQuery(hql).setString(0, "3")
					.setString(1, "1").list();
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
			Date sDate=b.getsReturnDate();
			String s;
			String n;
			Date nowDate=new Date();
			java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        s = format1.format(sDate);
		        n=format1.format(nowDate);
		        System.out.println(s);
		        System.out.println(n);

		    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        	Date dt1 = df.parse(s);//应还

		        	Date dt2 = df.parse(n);//现在
		        	if(dt1.getTime()>dt2.getTime()){   //现 应
		        		System.out.println("no");
		        	}
		        	if(dt1.getTime()<dt2.getTime()){   //应  现
		        		System.out.println("chaoqi");
		        	}
		}
		@Test
		public void tity(){
			String hql="From BookBarcode Where barcode=?";
		    BookBarcode bookBarcode=(BookBarcode) session.createQuery(hql).setString(0,"1211").uniqueResult();
		    boolean f=bookBarcode==null;
		    if(f){
		    	System.out.println("null");
		    }else{
			System.out.println(bookBarcode.isState());
		}
		}
		@Test
		public void test3(){
			String hql1="From Reader where idCard=?";
			Reader reader = (Reader) session.createQuery(hql1).setString(0, "456").uniqueResult();
		//读者用户是否合法
			if(reader!=null){
				System.out.println("hava");
			}else{
				System.out.println("empty");
			}
		}
		@SuppressWarnings("unchecked")
		@Test
		public void test4() throws ParseException{
			String hql="FROM BorrowList WHERE reader_id=? and state=?";
			Query query=session.createQuery(hql);
			query.setInteger(0,1).setString(1, "1");
			List<BorrowList> borrowLists=query.list();
			if(borrowLists.size()==0){
			   System.out.println("false");
			}else{
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
			Date sreturnDate=b.getsReturnDate();
		String s,n;
		Date nowDate=new Date();
		java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        s=format1.format(sreturnDate);
        n=format1.format(nowDate);
        ComDate comDate=new ComDate();
        boolean flag=comDate.comdate(s, n);
        System.out.println(flag);
			}
     }
		@Test
		public void test5(){
	        String hql="From Rank r where reader_id=:id";
		        Rank rankResult=(Rank)session.createQuery(hql).setString("id","3").uniqueResult();
		        rankResult.getBorrowLimit();
		        rankResult.getBorrowMaxNum();
				System.out.println(rankResult);
				System.out.println(rankResult.getBorrowMaxNum());
		}
		@SuppressWarnings("static-access")
		@Test
		public void test6(){
			String hqlString="from Reader where id=?";
		    Reader r=(Reader)session.createQuery(hqlString).setInteger(0, 3).uniqueResult();
			BorrowList borrowList=new BorrowList();
			borrowList.setState("1");
			Date now =new Date();
			Calendar   calendar   =   new   GregorianCalendar(); 
			calendar.setTime(now);
			calendar.add(calendar.DATE, 60);
			Date shDate=new Date();
			shDate=calendar.getTime();
			borrowList.setBorrowDate(now);
			borrowList.setsReturnDate(shDate);
			borrowList.setReader(r);
			session.saveOrUpdate(r);
			session.save(borrowList);
		}
		@SuppressWarnings("static-access")
		@Test
		public void test7(){
			Date now =new Date();
			Calendar   calendar   =   new   GregorianCalendar(); 
			calendar.setTime(now);
			calendar.add(calendar.DATE, 30);
			Date shDate=new Date();
			shDate=calendar.getTime();
			System.out.println(shDate);
			
			
		}
}
