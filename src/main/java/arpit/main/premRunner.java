package arpit.main;



import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import config.premConfiguration;

import prem.entity.prem;

public class premRunner{
	public static void main(String[] args) {
		prem pre=new prem("zone","male",74548,"IND");
		
		
		
		Session session =premConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		
		
//		session.persist(pre);
//		tx.commit();
		
/// IT IS USED TO PRINT COMPLETE LIST.....		
//		Query<prem> query=session.createQuery("from pree",prem.class);
//		System.out.println(query.list());
		
	////IT IS USED TO PRINT THE LIST ACCORDG TO THE USE
	
//		Query<prem> query1=session.createQuery("from pree",prem.class);
//		query1.setFirstResult(2);
//		query1.setMaxResults(5);
//		System.out.println(query1.list());
		
		
  ///////IT IS USED TO FIND MAX NAME FROM THE LIST
//      Query q=session.createQuery("select max(name) from pree");
//      List list1=q.list() ;
//      System.out.println(list1);
		
	/////HQL UPDATE QUERY USING NAMED PARAMETERS
//     MutationQuery mutationQuery=session.createMutationQuery("update pree set name=:n where id=:i");
//     mutationQuery.setParameter("n", "munendar");
//     mutationQuery.setParameter("i",4 );
//     System.out.println("status: "+mutationQuery.executeUpdate());
		
	//////HQL DELETE QUERY......
       
		MutationQuery query=session.createMutationQuery("delete from pree where id= 4");
		query.executeUpdate();
		session.close();
	}
}