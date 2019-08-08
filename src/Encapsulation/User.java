package Encapsulation;
/**
* @author:汤哥

* @time:2019年7月30日 下午3:42:16
* 
*/

/**
 * 封装的步骤： 1.所有属性私有化,用private关键字修饰，只能在本类中访问。
 * 
 * 2.对外提供简单的操作入口，外部程序访问的话必须要通过简单的入口进行操作--get/set方法 修改：set方法；读取：get方法
 * 
 * 3.注意事项： setter和getter方法没有static关键字
 * 
 * 有static修饰的方法调用：类名.方法名
 * 
 * 没有static修饰的方法调用：引用.方法名
 * 
 */
public class User {

	public int getAge() {
		if (age < 0 || age > 150) {
			System.out.println("对不起，您的年龄不合法！！！");

		}
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 私有化属性，外部无法访问
	private int age;
	
	

}
