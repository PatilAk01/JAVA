package Day2;


	

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class stockholding {
    private int stockId;
    private int dematAccNo;
    private int quantity;

    public stockholding(int stockId, int dematAccNo, int quantity) {
        this.stockId = stockId;
        this.dematAccNo = dematAccNo;
        this.quantity = quantity;
    }

    public int getStockId() {
        return stockId;
    }

    public int getDematAccNo() {
        return dematAccNo;
    }

    public int getQuantity() {
        return quantity;
    }
}



