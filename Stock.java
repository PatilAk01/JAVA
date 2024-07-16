package Share.market.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Stock_Main")

public class Stock {
	@Id
	@Column (name="stock_id")
	private int stock_id ;
	@Column (name="stock_name")
	  private String  stock_name;
	@Column (name="stock_price")

	  private double  stock_price; 
	@Column (name="stock_est_year")
	  private int stock_est_year;
	public int getStock_id() {
		return stock_id;
	}
	public Stock()
	{
		
	}
	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public double getStock_price() {
		return stock_price;
	}
	public void setStock_price(double stock_price) {
		this.stock_price = stock_price;
	}
	public int getStock_est_year() {
		return stock_est_year;
	}
	public void setStock_est_year(int stock_est_year) {
		this.stock_est_year = stock_est_year;
	}
	/**
	 * @param stock_id
	 * @param stock_name
	 * @param stock_price
	 * @param stock_est_year
	 */
	public Stock(int stock_id, String stock_name, double stock_price, int stock_est_year) {
		super();
		this.stock_id = stock_id;
		this.stock_name = stock_name;
		this.stock_price = stock_price;
		this.stock_est_year = stock_est_year;
	}
	public Stock(String stockid, String stockname, String stockprice, String stockyear) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stock [stock_id=" + stock_id + ", stock_name=" + stock_name + ", stock_price=" + stock_price
				+ ", stock_est_year=" + stock_est_year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(stock_est_year, stock_id, stock_name, stock_price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		return stock_est_year == other.stock_est_year && stock_id == other.stock_id
				&& Objects.equals(stock_name, other.stock_name)
				&& Double.doubleToLongBits(stock_price) == Double.doubleToLongBits(other.stock_price);
	}



}
