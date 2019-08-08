package Encapsulation;
/**
* @author:汤哥

* @time:2019年7月30日 下午4:11:16
* 
*/
public class CustomerTes {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setAddr("合肥市高新区");
		customer.setAge(23);
		customer.setIdCard(123456);
		customer.setName("汤军林");
		customer.setSex("男");

		System.out.println(customer.getAddr());
		System.out.println(customer.getAge());
		System.out.println(customer.getIdCard());
		System.out.println(customer.getName());
		System.out.println(customer.getSex());

	}

}
