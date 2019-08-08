package Demo_MethodTese;
/**
* @author:汤哥

* @time:2019年7月25日 上午10:18:22
* 
*/
public class MethodTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		method(i);// 栈内存，调用method，先出栈
		System.out.println("main_i=" + i);

	}

	public static void method(int i) {
		i++;
		System.out.println("method_i=" + i);

	}

}
