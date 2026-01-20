package config;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class premConfiguration {
  public static SessionFactory getSessionFactory()
  {
	Properties properties=new Properties();
	
	properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
	properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/hibernate");
	properties.put(Environment.JAKARTA_JDBC_USER, "root");
	properties.put(Environment.JAKARTA_JDBC_PASSWORD, "root");
	properties.put(Environment.JAKARTA_HBM2DDL_CONNECTION, "create");
	properties.put(Environment.SHOW_SQL, "true");
	properties.put(Environment.FORMAT_SQL, "true");
	
	
	StandardServiceRegistryBuilder ssr =new StandardServiceRegistryBuilder().applySetting( properties).build();
	MetadataSources metadataSources=new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory sessionFactory=metadataSources.buildSessionFactory();
	
	
	
	 return null;
	 
  }
}
