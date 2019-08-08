package Demo_MethodTese;
/**
* @author:汤哥

* @time:2019年7月24日 下午2:28:37
* 
*/
public class Test_03 {
	public static void main(String[] args) {
		System.out.println("main begin");// 第一个开始
		m1();
		System.out.println("main over");// 最后一个结束，栈的原理
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
