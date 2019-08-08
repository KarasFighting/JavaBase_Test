package Demo_MethodTese;
/**
* @author:汤哥

* @time:2019年7月24日 下午3:00:24
* 
*/

/*
 * 需求：计算两个数值的商，并返回给调用者
 */
public class Test_04 {
	public static void main(String[] args) {
		int x = divice(10, 2);// 一个方法有返回值的时候对于调用者来说返回值可以接收也可以不接收
		System.out.println("a/b的结果：" + x);

	}

	/*
	 * public static int divice(int a,int b) { return a/b;
	 * 
	 * }
	 */

	public static int divice(int a, int b) {
		int c = a / b;
		return c;

	}

}
