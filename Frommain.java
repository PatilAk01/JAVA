package todo_5;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Frommain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				SessionFactory hibernatefactory= utility_connection.getSessionFactory();
				Session  hibernatesession=  hibernatefactory.openSession();
				){
			String hbmpath="from Stock s";
			Class<Stock> Values=Stock.class;
			Query<Stock> Queryvalues=hibernatesession.createQuery(hbmpath, Values);
            List<Stock> liststock=Queryvalues.getResultList();
            for(Stock allStock:liststock) {
            	System.out.println(allStock);
            	System.out.println("All Stock are fetch");
            }
            
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
