package Inherit;
/**
* @author:汤哥

* @time:2019年8月2日 上午9:50:30
* 
*/
public class ExtendsTest {

	/*
	 * 作用：代码的复用
	 * 
	 * 有了继承才有方法的覆盖和多态机制
	 * 
	 * java中只支持单继承，一个类只能继承一个类
	 * 
	 * 术语：B类继承A类；A类:父类，超类，基类，superclass；B类:子类，派生类，subclass
	 * 
	 * 继承数据：
	 * 
	 * 1.私有的不支持继承
	 * 
	 * 2.构造方法不支持继承，其他数据都可以继承
	 * 
	 * 3.java中虽然只支持单继承，但是可以间接继承
	 * 
	 * 4.java中一个类没有显示继承，但是默认继承java.long.object类
	 * 
	 * 
	 **/

	public static void main(String[] args) {

		CreditAccount cat = new CreditAccount("香港汇丰银行", 9999.0, 666.0);


		System.out.println("有构造方法---");
		System.out.println(cat.getActon() + " ; " + cat.getBalance() + " ; " + cat.getCredit());
	}

}
