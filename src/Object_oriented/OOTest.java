package Object_oriented;
/**
* @author:汤哥

* @time:2019年7月26日 下午4:16:31
* 
*/
public class OOTest {
	public static void main(String[] args) {

		User user = new User();
		
		System.out.println(user.name);
		System.out.println(user.no);
		System.out.println(user.addr);
		
		user.no = 100;
		user.name = "jack";
		user.addr = new Address();

		System.out.println(user.name + "住在：" + user.addr.city);
		System.out.println(user.name + "住在：" + user.addr.street);
		System.out.println(user.name + "住所邮编：" + user.addr.zipcode);

		System.out.println("================================");

		user.addr.city = "合肥";
		user.addr.street = "南岗街道";
		user.addr.zipcode = "237000";

		System.out.println(user.name + "住在：" + user.addr.city);
		System.out.println(user.name + "住在：" + user.addr.street);
		System.out.println(user.name + "住所邮编：" + user.addr.zipcode);

	}

//	类变量：独立于方法之外的变量，用 static 修饰。

//	实例变量：独立于方法之外的变量，不过没有 static 修饰。

//	局部变量：类的方法中的变量。

}

