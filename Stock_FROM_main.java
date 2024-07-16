package todo_5;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Stock_FROM_main {

	public static void main(String[] args) {
		try(	
				SessionFactory hibernateFactory= utility_connection.getSessionFactory()	;
				Session hibernateSession=hibernateFactory.openSession();				
				){
			String HQLPATH="from Stock s";
			Class<Stock> entity= Stock.class;
			Query<Stock> queryref=hibernateSession.createQuery(HQLPATH,entity);
			List<Stock> listStock=queryref.getResultList();
			for (Stock curruntStock: listStock)
			{
				System.out.println(curruntStock.getStock_id());
				System.out.println("Data Fetch Successfull  !!");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
