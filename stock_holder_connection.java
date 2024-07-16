package Day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import Day1.JdbcUtils;
import Day1.Stock;


public class stock_holder_connection implements stock_holder_implement <stock_holder_master,Integer>{
	@Override
public Collection<stock_holder_master> retrieveAll() {
		
		Collection<stock_holder_master> allstocks= new ArrayList<stock_holder_master>();
		try(Connection conn =JdbcUtils.buildConnection();
			Statement stmt =conn.createStatement();
				) {
			String sqlQuery = "select * from stock_holder_master";
			ResultSet recordSet = stmt.executeQuery(sqlQuery);
			
			while(recordSet.next()) {
				int  holder_demat_acc_no = recordSet.getInt(1);
				String holder_name = recordSet.getString(2);
				String holder_email= recordSet.getString(3);
				
							
				stock_holder_master currentstock = new stock_holder_master( holder_demat_acc_no, holder_name ,holder_email);
				
				allstocks.add(currentstock);
			}
			
		}  catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		return allstocks;
	}

//@Override
//public stock_holder_master retrieveOne(Integer holder_demat_acc_no) {
//	stock_holder_master foundStock = null;
//	String sqlQuery = "select * from stock_holder_master where stock_id = ?";
//	try(
//			Connection conn = JdbcUtils.buildConnection();
//			PreparedStatement pstmt =  conn.prepareStatement(sqlQuery)
//			){
//		pstmt.setInt(1, holder_demat_acc_no );
//		ResultSet recordSet = pstmt.executeQuery();
//		if(recordSet.next()) {
//			int    holder_demat_acc_no1 = recordSet.getInt(1);
//			String holder_name = recordSet.getString(2);
//			String holder_email= recordSet.getString(3);
//			
//						
//			foundStock = new stock_holder_master( holder_demat_acc_no1, holder_name ,holder_email);
//			
//		}
//	}
//	catch(Exception ex) {
//		ex.printStackTrace();
//	}
//	return foundStock;
//}

@Override
public stock_holder_master retrieveOne(Integer holder_demat_acc_no) {
	// TODO Auto-generated method stub
	return null;
}




	

	
}
