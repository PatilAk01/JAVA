package Day1;

import java.util.Collection;

public interface DaoInterface<T, K> {
	Collection<T> retrieveAll();
	T retrieveOne(K stock_id);
	//Stock retrieveOne(Integer StockId);
	
	
	

}
