package Construction;
/**
* @author:����

* @time:2019��7��31�� ����11:22:21
* 
*/
public class Account {

	// �˻�
	private String acount;

	// ���
	private double balance;


	public Account(String acount, double balance) {
		
		/*
		 * this.acount = "�����˻�ûǮ�ˣ�����"; System.out.println(this.acount);
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
