package Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StockHoldingDao {
	 public static void createStockHolding(stockholding StockHolding) {
	        String sql = "INSERT INTO Stock_Holding_Master (stock_id, demat_acc_no, quantity) VALUES (?, ?, ?)";

	        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, StockHolding.getStockId());
	            pstmt.setInt(2,StockHolding.getDematAccNo());
	            pstmt.setInt(3, StockHolding.getQuantity());
	            pstmt.executeUpdate();
	            System.out.println("Stock holding record inserted successfully.");
	        } catch (SQLException e) {
	            System.out.println("Error inserting stock holding record: " + e.getMessage());
	        }
	    }
	}

