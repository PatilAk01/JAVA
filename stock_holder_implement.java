package Day2;

import java.util.Collection;



public interface stock_holder_implement <T, K> {
	
		Collection<T> retrieveAll();
		T retrieveOne(K holder_demat_acc_no);
		
		
}
