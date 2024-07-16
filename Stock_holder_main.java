package Day2;

import java.util.Collection;



public class Stock_holder_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stock_holder_implement<stock_holder_master,Integer> idao=new stock_holder_connection ();
		Collection<stock_holder_master>allAvailableStocks=idao.retrieveAll();
		for(stock_holder_master sts:allAvailableStocks) {
			System.out.println(sts);
		}
	}
}	
		
		
//		stock_holder_implement<stock_holder_master, Integer> idao = new stock_holder_connection();
//		stock_holder_master rst =idao.retrieveOne(102);
//		if(rst != null)
//			System.out.println(rst);		
//		else
//			System.out.println("Stock with given ID does not exist.");
//	}
//	}


