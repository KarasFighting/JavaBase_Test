package Construction;

/**
* @author:����

* @time:2019��7��31�� ����4:22:06
* 
*/
public class Test03 {
	public static void main(String[] args) {
		UserDex ud = new UserDex(20);
		add(ud);
		System.out.println(ud.age);

	}

	public static void add(UserDex ud) {
		ud.age++;
		System.out.println(ud.age);

	}

}


class UserDex {

	int age;

	public UserDex(int i) {
		age = i;

	}

}