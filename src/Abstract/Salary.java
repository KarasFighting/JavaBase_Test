package Abstract;
/**
* @author:汤哥

* @time:2019年8月6日 下午2:34:59
* 
*/
public class Salary extends Employee {// 抽象类不能实例化对象，所以抽象类必须被继承，才能被使用

	private double salary;


	// 抽象类中的非抽象方法不用重写，其他必须重写
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
		// TODO Auto-generated constructor stub
	}

	public void mailCheck() {
		System.out.println("在工资类别的邮件检查中 ");
		System.out.println("支票邮寄至 " + getName() + " 带薪 " + salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}

	public double computePay() {
		System.out.println("计算工资支付 " + getName());
		return salary / 52;
	}

}
