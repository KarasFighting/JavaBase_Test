package TestProject02;
/**
* @author:汤哥

* @time:2019年7月30日 下午2:18:02
* 
*/

public class Test_06 {

	public static void main(String[] args) {

		Cumputer puter = new Cumputer();
		puter.brand = "华硕";
		puter.color = "red";
		puter.style = "A555L";

		Student st = new Student();
		st.name = "刘松";
		st.no = 2015;
		st.pad = puter;

		System.out.println("刘松的笔记本的品牌是：" + st.pad.brand);

		st.pad = new Cumputer();
		puter.brand = "联想";
		System.out.println(st.pad.brand);

	}

}

class Cumputer {
	String brand;

	String style;

	String color;

}


class Student {
	int no;

	String name;

	Cumputer pad;

}
