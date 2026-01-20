package arpit.main;

import org.hibernate.Session;

import org.hibernate.Transaction;

import config.premConfiguration;

import prem.entity.prem;

public class premRunner{
	public static void main(String[] args) {
		prem pre=new prem("senu","Female",64548);
		
		//SessionFactory sessionFactory =premConfiguration.getSessionFactory();
		
		Session session =premConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.persist(pre);
		tx.commit();
		
		
		
	}
}