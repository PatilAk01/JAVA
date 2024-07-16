package Share.market.entity;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class utility_connection {
	
	public static SessionFactory getSessionFactory() {
		
		Configuration hibernateconfig= new Configuration();
		Properties configProperties = new Properties();
		
		configProperties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/webcdac");
		configProperties.put("hibernate.connection.username", "root");
		configProperties.put("hibernate.connection.password", "Patil@01");
		configProperties.put("hibernate.show_sql", "true");
		configProperties.put("hibernate.hbm2ddl.auto", "update");
		
		hibernateconfig.setProperties(configProperties);
		
		hibernateconfig.addAnnotatedClass(Stock.class);
		
		SessionFactory hibernateFactory = hibernateconfig.buildSessionFactory();
		
		return hibernateFactory;
	}
		

}
