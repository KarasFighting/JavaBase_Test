package Object_oriented;
/**
* @author:汤哥

* @time:2019年7月26日 上午9:50:28
* 
*/
public class Object_oriented {// 对象--->类，抽象；类--->对象，实例化

	// 自定义的实例变量。不能通过类访问，这种变量叫做实例变量
	String name;

	int age;

	boolean sex;

	String address;

	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
