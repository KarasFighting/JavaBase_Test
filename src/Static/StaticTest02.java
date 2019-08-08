package Static;
/**
* @author:汤哥

* @time:2019年8月1日 下午5:16:25
* 
*/
public class StaticTest02 {

	// 实例代码块
	{
		System.out.println(1);
	}

	// 实例代码块
	{
		System.out.println(2);
	}

	// 实例代码块
	{
		System.out.println(3);
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		new StaticTest02();
	}

	/**
	 * 实例代码块在类创建的时候执行
	 * 
	 * 在构造方法执行前执行
	 * 
	 * 
	 * 
	 */

}
