package Encapsulation;
/**
* @author:����

* @time:2019��7��30�� ����4:11:16
* 
*/
public class CustomerTes {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setAddr("�Ϸ��и�����");
		customer.setAge(23);
		customer.setIdCard(123456);
		customer.setName("������");
		customer.setSex("��");

		System.out.println(customer.getAddr());
		System.out.println(customer.getAge());
		System.out.println(customer.getIdCard());
		System.out.println(customer.getName());
		System.out.println(customer.getSex());

	}

}
