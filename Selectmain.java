package todo_5;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Selectmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(SessionFactory hf=utility_connection.getSessionFactory();
				Session hs=hf.openSession();
				){
			String hbmurl="Select stock_name,  stock_price from Stock s";
			Query<Object []> Qstock=hs.createQuery(hbmurl, Object[].class);
			List<Object[]> ListStock=Qstock.getResultList();
			for(Object[] show:ListStock) {
				System.out.println("Stock name is :"+ show[0]  +"  Stock price is :" + show[1]);
				
			}
			
			
		}

	}

}
