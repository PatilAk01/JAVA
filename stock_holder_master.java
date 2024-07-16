package Day2;

import java.util.Objects;

public class 	stock_holder_master {

	private int holder_demat_acc_no;
	private String holder_name;
	private String holder_email;
	public int getHolder_demat_acc_no() {
		return holder_demat_acc_no;
	}
	public void setHolder_demat_acc_no(int holder_demat_acc_no) {
		this.holder_demat_acc_no = holder_demat_acc_no;
	}
	public String getHolder_name() {
		return holder_name;
	}
	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}
	public String getHolder_email() {
		return holder_email;
	}
	public void setHolder_email(String holder_email) {
		this.holder_email = holder_email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(holder_demat_acc_no, holder_email, holder_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		stock_holder_master other = (stock_holder_master) obj;
		return holder_demat_acc_no == other.holder_demat_acc_no && Objects.equals(holder_email, other.holder_email)
				&& Objects.equals(holder_name, other.holder_name);
	}
	@Override
	public String toString() {
		return "stock_holder_master [holder_demat_acc_no=" + holder_demat_acc_no + ", holder_name=" + holder_name
				+ ", holder_email=" + holder_email + "]";
	}
	/**
	 * @param holder_demat_acc_no
	 * @param holder_name
	 * @param holder_email
	 */
	public stock_holder_master(int holder_demat_acc_no, String holder_name, String holder_email) {
		super();
		this.holder_demat_acc_no = holder_demat_acc_no;
		this.holder_name = holder_name;
		this.holder_email = holder_email;
	}
	
}