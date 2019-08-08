package Construction;
/**
* @author:汤哥

* @time:2019年7月31日 上午8:50:20
* 
*/
public class Test {
	// 构造方法返回值类型不用指定，且不能写void写了void就是普通方法了
	// 构造方法的方法名必须跟类名相同
	// 构造方法调用结束后都有返回值，但是不需要return。构造方法结束后java自动返回值，返回值类型是构造方法所在类的类型
	// 构造方法返回值类型就是类本身，所以返回值类型不用编写
	// 当一个类中没有定义任何构造方法的时候，系统默认给该方法提供一个无参构造方法，称之为缺省构造器
	// 当一个类显示的吧构造方法定义出来了，系统不再为类提供缺省构造器；建议手动开启无参构造方法
	// 构造方法可以实现重载机制【方法名相同，参数列表不同】

	public static void main(String[] args) {

		// 调用User类的构造方法完成对象的创建
		// User user = new User("zhangsan", 20);
		new User("zhangsan", 20);

		new User();

		new User("zhangsan");

		new User(20);

	}

	/*
	 * 构造方法语法:
	 * [修饰符列表] 构造方法名(参数列表) {
	 * 			方法体;
 		}
	 * **/
	


}
