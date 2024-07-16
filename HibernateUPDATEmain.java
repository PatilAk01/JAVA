package Share.market.entity;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateUPDATEmain {
	public static void main(String[] args) {
		
	
	try(
			SessionFactory hibernateFactory=utility_connection.getSessionFactory();
			Session hibernateSession=hibernateFactory.openSession();
			)
	{
		Class<Stock> entityStock= Stock.class;
		
		Serializable identity=4444;
		Stock foundStock=hibernateSession.find(entityStock, identity);
		Transaction hibernateTransaction=hibernateSession.beginTransaction();
		foundStock.setStock_name("Kalpesh");
		foundStock.setStock_price(210.20);
		
		//foundStock.setStock_est_year(1899);
		hibernateTransaction.commit();
		System.out.println("record update successfully");
		
	}catch(Exception ex) {
		ex.printStackTrace();
		
	}

}
	}
