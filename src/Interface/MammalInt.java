package Interface;
/**
* @author:汤哥

* @time:2019年8月6日 下午4:57:15
* 
*/

/*
 * 一，接口的实现：
 * 
 * 1.当类实现接口的时候，类要实现接口中所有的方法。否则，类必须声明为抽象的类。
 * 
 * 2.类使用implements关键字实现接口。在类声明中，Implements关键字放在class声明后面。
 * 
 * 3公式：....implements 接口名称[, 其他接口名称, 其他接口名称..., ...] ...
 * 
 * 二，申明接口的规则：
 * 
 * 1.类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常。
 * 
 * 2.类在重写方法时要保持一致的方法名，并且应该保持相同或者相兼容的返回值类型。
 * 
 * 3.如果实现接口的类是抽象类，那么就没必要实现该接口的方法。
 * 
 * 
 * 三，实现接口的规则：
 * 
 * 1.一个类可以同时实现多个接口。
 * 
 * 2.一个类只能继承一个类，但是能实现多个接口。
 * 
 * 3.一个接口能继承另一个接口，这和类之间的继承比较相似。
 */
public class MammalInt implements Animal {

	public static void main(String[] args) {

		MammalInt mt = new MammalInt();
		mt.eat();
		mt.travel();

		// System.out.println(Math.sin(Math.PI / 2));

	}

	public boolean Offdemo() {
		// TODO Auto-generated method stub
		return false;

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat eat eat eat");

	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("travel travel travel");

	}

}
