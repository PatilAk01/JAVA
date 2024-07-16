package Share.market.entity;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate_Retrive_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
			SessionFactory hibernateFactory=utility_connection.getSessionFactory();
			Session hibernateSession=hibernateFactory.openSession();
	
			Class<Stock> entityStock= Stock.class;
			
			Serializable identity=4444;
			
			Stock foundStock=hibernateSession.find(entityStock, identity);
			
			System.out.println(foundStock);
			
			
			System.out.println("record update successfully");
	}	
		
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		try(
//		
//		SessionFactory hbmfact=utility_connection.getSessionFactory();
//				Session hbmS=hbmfact.openSession();
//				
//				){
//			Class<Stock> godlike=Stock.class;
//			Serializable Stock=6666;
//			
//			Stock Found=hbmS.find(godlike, Stock);
//		System.out.println(Found);
//			
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
//	}
//	
//}
