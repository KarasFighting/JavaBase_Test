package Inherit;
/**
* @author:����

* @time:2019��8��5�� ����11:23:01
* 
*/
public class ExtendsTest_test {
	
	public static void main(String[] args) {

		Account_test ct = new Account_test();
		ct.setActon("��ۻ������");
		ct.setBalance(999.0);
		ct.setCredit(666.0);

		System.out.println("�޹��췽��---");
		System.out.println(ct.getActon() + " ; " + ct.getBalance() + " ; " + ct.getCredit());
	}

}
