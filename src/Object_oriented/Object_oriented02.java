package Object_oriented;
/**
* @author:汤哥

* @time:2019年7月26日 下午2:24:30
* 
*/
public class Object_oriented02 {

	public static void main(String[] args) {
		// 堆内存：new的对象放在堆内存中存储。new Object_oriented()是一个学生对象；student是一个局部变量，存储在栈内存中
		// new运算在堆内存中开辟的内存空间称为对象---对象
		// 引用是一个变量，这个变量保存了java对象的内存地址---引用
		// java语言中不能直接操作堆内存，java中没有指针，跟C语言不同。只能通过引用去访问堆内存中的实例变量

		Object_oriented student = new Object_oriented();
		// 访问实例变量的语法格式：
		// 读取数据：引用.变量名
		// 修改数据：引用.变量名 = 值

		// 引用
		int new_no = student.num;

		String new_name = student.name;

		boolean new_sex = student.sex;

		String new_address = student.address;

		int new_age = student.age;

		System.out.println(new_no);
		System.out.println(new_sex);
		System.out.println(new_name);
		System.out.println(new_address);
		System.out.println(new_age);

		// 赋值
		student.name = "张三";
		student.age = 18;
		student.num = 10;
		student.sex = true;
		student.address = "北京";

		System.out.println(student.num = 10);
		System.out.println(student.sex = true);
		System.out.println(student.name = "张三");
		System.out.println(student.address = "北京");
		System.out.println(student.age = 18);



	}

	/**
	 * 局部变量在栈内存中存储
	 * 
	 * 成员变量中的实例变量在堆内存的java对象内部存储
	 * 
	 * 一个对象对应一个实例变量
	 */

}
