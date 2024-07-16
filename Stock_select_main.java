package Day1;

import java.util.Collection;

public class Stock_select_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			DaoInterface<Stock,Integer> idao=new DaoImplements ();
			Collection<Stock>allAvailableStocks=idao.retrieveAll();
			for(Stock sts:allAvailableStocks) {
				System.out.println(sts);
			}
		}

}
//		DaoInterface<Stock, Integer> idao = new DaoImplements();
//		Stock rst =idao.retrieveOne(102);
//		if(rst != null)
//			System.out.println(rst);		
//		else
//			System.out.println("Stock with given ID does not exist.");
//	}
//
//}