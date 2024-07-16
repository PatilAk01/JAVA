package Share.market.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateInsertmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				SessionFactory hibernateFactory=utility_connection.getSessionFactory();
				Session hibernateSession=hibernateFactory.openSession();
				){
			//Stock s1=new Stock(1021,"jio",1562.52,2019);
			//Stock s2=new Stock(1111,"TATA",15521.02,2018);
			//Stock s3=new Stock(2222,"IRCTC",1851.32,1825);
			//Stock s4=new Stock(3333,"AMDOC",5622.26,1892);
			Stock s5=new Stock(5555,"tbo",6682.02,1982);
			
			Transaction hibernatetransaction=hibernateSession.beginTransaction();
			hibernateSession.persist(s5);
			hibernatetransaction.commit();
			System.out.println("stock update successfully!!");
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
	
		//----------------------------------------------------------------------------------------------
		
		
		//repeat 
//		
//		try( SessionFactory hf=utility_connection.getSessionFactory();
//				Session hs=hf.openSession()
//				
//				){
//			
//			Stock s1= new Stock(6666,"Ak",2356.02,2018);
//			Transaction ht=hs.beginTransaction();
//			hs.persist(s1);
//			ht.commit();
//			System.out.println("ADD STOCK SUCCESSFULLY !!");
//			
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

		
		
