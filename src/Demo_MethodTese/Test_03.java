package Demo_MethodTese;
/**
* @author:����

* @time:2019��7��24�� ����2:28:37
* 
*/
public class Test_03 {
	public static void main(String[] args) {
		System.out.println("main begin");// ��һ����ʼ
		m1();
		System.out.println("main over");// ���һ��������ջ��ԭ��
	}

	public static void m1() {
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 over");
	}

	public static void m2() {
		System.out.println("m2 begin");
		m3();
		System.out.println("m2 over");
	}

	public static void m3() {
		System.out.println("m3 begin");
		System.out.println("m3 over");

	}

}
