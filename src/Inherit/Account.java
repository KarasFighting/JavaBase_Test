package Inherit;
/**
* @author:����

* @time:2019��8��2�� ����9:49:34
* 
*/
public class Account {

	private String acton;

	private double balance;

	private double credit;

	public Account(String acton, double balance, double credit) {

		this.acton = acton;
		this.balance = balance;
		this.credit = credit;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public String getActon() {
		return acton;
	}



	public void setActon(String acton) {
		this.acton = acton;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


}
