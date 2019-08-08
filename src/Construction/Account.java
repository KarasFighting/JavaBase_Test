package Construction;
/**
* @author:汤哥

* @time:2019年7月31日 上午11:22:21
* 
*/
public class Account {

	// 账户
	private String acount;

	// 余额
	private double balance;


	public Account(String acount, double balance) {
		
		/*
		 * this.acount = "您的账户没钱了！！！"; System.out.println(this.acount);
		 * 
		 * this.balance = 0.0; System.err.println(this.balance);
		 */

		this.acount = acount;
		System.out.println(this.acount);

		this.balance = balance;
		System.err.println(this.balance);
	}

	public String getAcount() {
		return acount;
	}

	public void setAcount(String acount) {
		this.acount = acount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
