package Construction;

/**
* @author:汤哥

* @time:2019年7月31日 下午4:22:06
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