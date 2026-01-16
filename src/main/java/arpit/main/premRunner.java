package arpit.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



//import jakarta.transaction.Transaction;
import prem.entity.prem;

public class premRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //  prem p =new prem("prem kumar","b.tech",7000);
		prem p =new prem("Ashutosh sharma","b.tech",7000);
      
		   // CHANING METHOD
		//// CHAINGING METHOD USE KIYA HAI ESME cONFIGURATION FILE KO BAR BAR RUN NHI KARNA PADTA HAI ESME
		//  SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// CHAINING METHOD KA USE KARENGE TO HAME YE LINE LIKHNE KI KOI JARURAT NHI HAI    	
		 // Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		
		
		
		
		
		
		//OLD METHOD OF CONNECTION 
		// NORMAL METHOD
		
//		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory=cfg.buildSessionFactory();
//        Session session=sessionFactory.openSession();
      
		
	/////NEW METHOD OF CONNECTION
		// NORAML METHOD(1)
//		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata metadata=new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sessionFactory = metadata.buildSessionFactory();
//		
		//METHOD 2 CHAINING METHOD
		
		SessionFactory sessionFactory=new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
		
	  Session session=sessionFactory.openSession();	
      Transaction tx= session.beginTransaction();
      
//      session.persist(p);
//      tx.commit();
//      
      
     // prem dev= session.get(prem.class, 5);
      session.load(prem.class, 7);
      System.out.println();
      
     
		
		
      }

}
