package Object_oriented;
/**
* @author:����

* @time:2019��7��28�� ����10:23:47
* 
*/
public class OOTest02 {
	public static void main(String[] args) {
		User user = new User();

		Address address = new Address();

		// �˴���addr�����ñ���
		user.addr = address;
		System.out.println(address.city);

		address.city = "ŦԼ";

		System.out.println(address.city);

	}

}
