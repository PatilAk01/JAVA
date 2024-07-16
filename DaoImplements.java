 package Day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class DaoImplements implements DaoInterface<Stock,Integer>  {


	@Override
	public Collection<Stock> retrieveAll() {
		
		Collection<Stock> allStocks= new ArrayList<Stock>();
		try(Connection conn =JdbcUtils.buildConnection();
			Statement stmt =conn.createStatement();
				) {
			String sqlQuery = "select * from stock_master";
			ResultSet recordSet = stmt.executeQuery(sqlQuery);
			
			while(recordSet.next()) {
				int stock_id = recordSet.getInt(1);
				String stock_name = recordSet.getString(2);
				float stock_price = recordSet.getFloat(3);
				int stock_est_year = recordSet.getInt(4);
				
				//Populating a Stock object based upon the above information				
				Stock currentStock = new Stock(stock_id, stock_name, stock_price, stock_est_year);
				//Adding that object into the collection
				allStocks.add(currentStock);
			}
			
		}  catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		return allStocks;
	}
	
	@Override
	public Stock retrieveOne(Integer StockId) {
		Stock foundStock = null;
		String sqlQuery = "select * from stock_master where stock_id = ?";
		try(
				Connection conn = JdbcUtils.buildConnection();
				PreparedStatement pstmt =  conn.prepareStatement(sqlQuery)
				){
			pstmt.setInt(1, StockId);
			ResultSet recordSet = pstmt.executeQuery();
			if(recordSet.next()) {
				int stock_id = recordSet.getInt(1);
				String stock_name = recordSet.getString(2);
				float stock_price = recordSet.getFloat(3);
				int stock_est_year = recordSet.getInt(4);
				foundStock = new Stock(stock_id, stock_name, stock_price, stock_est_year);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return foundStock;
	}

	
	
}
