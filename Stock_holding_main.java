package Day2;

import java.util.Scanner;

public class Stock_holding_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Stock ID: ");
	        int stockId = scanner.nextInt();

	        System.out.print("Enter Demat Account Number: ");
	        int dematAccNo = scanner.nextInt();

	        System.out.print("Enter Quantity: ");
	        int quantity = scanner.nextInt();

	        // Create a StockHolding object
	        stockholding stockHolding = new stockholding(stockId, dematAccNo, quantity);

	        // Pass the StockHolding object to createStockHolding method
	        StockHoldingDao.createStockHolding(stockHolding);

	        scanner.close();
	    

	}

}
