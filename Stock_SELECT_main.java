package todo_5;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;



public class Stock_SELECT_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try(
				SessionFactory hibernateFactory=utility_connection.getSessionFactory();
				Session HibernateSession=hibernateFactory.openSession();
				
			){	
			
			String hqlpath="select stock_name ,stock_price from Stock s";
			//String hqlpath="select stock_est_year from Stock s";
			
			Query<Object[]>  refquery=HibernateSession.createQuery(hqlpath, Object[].class);
			List<Object[]> liststock=refquery.getResultList();
			for(Object [] cvalues:liststock) {
				System.out.println("name :"+cvalues[0] + ",price :"+cvalues[1]);
				System.out.println(cvalues[0]);
				
			}
			
			
			
		}catch(Exception ex) {
					ex.printStackTrace();
				
		}
		}

}
