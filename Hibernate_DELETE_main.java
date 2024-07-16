package Share.market.entity;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate_DELETE_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				SessionFactory hibernateFactory=utility_connection.getSessionFactory();
				Session hibernateSession=hibernateFactory.openSession();
				)
		{
			Class<Stock> entityStock= Stock.class;
			
			Serializable identity=4444;
			Stock foundStock=hibernateSession.find(entityStock, identity);
			Transaction hibernateTransaction=hibernateSession.beginTransaction();
		
			
			hibernateSession.remove(foundStock);
			
			hibernateTransaction.commit();
			System.out.println("Stock Deleted successfully");
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}

	}

	

}
