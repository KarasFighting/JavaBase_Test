package TestProject02;
/**
* @author:����

* @time:2019��7��30�� ����2:18:02
* 
*/

public class Test_06 {

	public static void main(String[] args) {

		Cumputer puter = new Cumputer();
		puter.brand = "��˶";
		puter.color = "red";
		puter.style = "A555L";

		Student st = new Student();
		st.name = "����";
		st.no = 2015;
		st.pad = puter;

		System.out.println("���ɵıʼǱ���Ʒ���ǣ�" + st.pad.brand);

		st.pad = new Cumputer();
		puter.brand = "����";
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
