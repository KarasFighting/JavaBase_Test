package This;
/**
* @author:汤哥

* @time:2019年7月31日 下午5:21:26
* 
*/
public class Customn {

	String name;// 实例变量：访问必须要有对象

	public Customn() {

	}

	public void Shopping() {
		System.out.println(name + "在购物！！！");
	}

	public String getName() {
		return name;
	}

	/*
	 * this是一个引用，一个变量，this变量中保存的内存地址指向自身，存储在JVM堆内存java对象内部
	 * 
	 * this不能使用在带有static关键字的方法中
	 */
	public void setName(String name) {
		this.name = name;// this.name是实例变量的name，等号后面的name是局部变量
	}

}

