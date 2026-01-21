package arpit.main;

import org.hibernate.Session;

import org.hibernate.Transaction;

import org.hibernate.query.Query;

import config.premConfiguration;

import prem.entity.prem;

public class premRunner{
	public static void main(String[] args) {
	//	prem pre=new prem("harsh","male",74548,"IND");
		
		
		
		Session session =premConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		// exaple for the hql to get all the records
		Query query =session.createQuery("from pree",prem.class);
		
		query.setFirstResult(2);
		query.setMaxResults(7);
		
		System.out.println(query.list());
		
		
		
		
//		session.persist(pre);
		tx.commit();
		session.close();

		
    
		
	}
}