package Object_oriented;
/**
* @author:汤哥

* @time:2019年7月28日 上午10:23:47
* 
*/
public class OOTest02 {
	public static void main(String[] args) {
		User user = new User();

		Address address = new Address();

		// 此处的addr是引用变量
		user.addr = address;
		System.out.println(address.city);

		address.city = "纽约";

		System.out.println(address.city);

	}

}
