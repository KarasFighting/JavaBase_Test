package Static;
/**
* @author:汤哥

* @time:2019年8月1日 下午4:51:35
* 
*/
public class StaticTest {

	/*
	 * 静态代码块在类执行的时候只执行一次；优先于main方法执行
	 * 
	 * 在类中可以编写多个，并且遵循自上而下的顺序一次执行
	 * 
	 * 作用：项目中如果要求在类加载的时候执行代码完成的日志记录，就可以写入静态代码块中
	 * 
	 **/

	public static void main(String[] args) {
		System.out.println("main方法执行");

	}

	static {
		System.out.println("static---->1");
	}

	static {
		System.out.println("static---->2");

	}

	static {
		System.out.println("static---->3");

	}

}
