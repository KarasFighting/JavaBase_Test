package polymorphic;
/**
* @author:汤哥

* @time:2019年8月5日 下午2:25:18
* 
*/
public class Test {
	// 向上转型：子类型--->父类型【自动转换】
	// 向下转型：父类型--->子类型【强制类型转换】
	// 重点：无论是向上还是向下转型两者之间必须是继承关系才可以

	/*
	 * 多态的三个必要条件：
	 * 
	 * 1.继承，2.重写，3.父类引用指向子类对象【向上转型】
	 * 
	 * 拓展：当子类对象调用重写的方法时，调用的是子类的方法，而不是父类中被重写的方法。
	 * 
	 * 要想调用父类中被重写的方法，则必须使用关键字 super
	 * 
	 */

	public static void main(String[] args) {
		Anmal am = new Anmal();
		am.move();

		// 向上转型[自动类型装换]
		Cat ct = new Cat();
		ct.move();

		// 强制转换[向下转型]
		Cat bd = (Cat) ct;
		bd.catchMouse();

		// 父类型引用指向子类型【多态机制】
		Anmal anmal = new Bird();
		anmal.move();


		Anmal an = new Bird();

		if (an instanceof Cat) {
			Cat cat = (Cat) an;
			cat.catchMouse();
		} else if (an instanceof Bird) {
			Bird bird = (Bird) an;
			bird.fly();
		}

		// java.lang.ClassCastException,在向下转型的时候会发生
		// 避免java.lang.ClassCastException：使用instanceof运算符。执行结果是Boolean类型
		// 关于结果true/false：

		/*
		 * 假设： a instanceof Anmal
		 * 
		 * true:a引用指向的对象是Anmal类型
		 * 
		 * false：a引用指向的对象不是Anmal类型
		 * 
		 * 
		 * 
		 **/




	}

}
