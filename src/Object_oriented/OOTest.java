package Object_oriented;
/**
* @author:����

* @time:2019��7��26�� ����4:16:31
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

		System.out.println(user.name + "ס�ڣ�" + user.addr.city);
		System.out.println(user.name + "ס�ڣ�" + user.addr.street);
		System.out.println(user.name + "ס���ʱࣺ" + user.addr.zipcode);

		System.out.println("================================");

		user.addr.city = "�Ϸ�";
		user.addr.street = "�ϸڽֵ�";
		user.addr.zipcode = "237000";

		System.out.println(user.name + "ס�ڣ�" + user.addr.city);
		System.out.println(user.name + "ס�ڣ�" + user.addr.street);
		System.out.println(user.name + "ס���ʱࣺ" + user.addr.zipcode);

	}

//	������������ڷ���֮��ı������� static ���Ρ�

//	ʵ�������������ڷ���֮��ı���������û�� static ���Ρ�

//	�ֲ���������ķ����еı�����

}

