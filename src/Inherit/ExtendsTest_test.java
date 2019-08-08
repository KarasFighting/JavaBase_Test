package Inherit;
/**
* @author:汤哥

* @time:2019年8月5日 上午11:23:01
* 
*/
public class ExtendsTest_test {
	
	public static void main(String[] args) {

		Account_test ct = new Account_test();
		ct.setActon("香港汇丰银行");
		ct.setBalance(999.0);
		ct.setCredit(666.0);

		System.out.println("无构造方法---");
		System.out.println(ct.getActon() + " ; " + ct.getBalance() + " ; " + ct.getCredit());
	}

}
