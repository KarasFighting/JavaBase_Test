package Abstract;

/**
 * @author:汤哥
 * 
 * @time:2019年8月6日 下午2:30:29
 * 
 * 
 * 
 */
public abstract class Employee {
	private String name;

	private String address;


	private int number;

	public Employee(String name, String address, int number) {
		System.out.println("构建员工");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public double computePay() {
		System.out.println("员工内部电脑支付");
		return 0.0;
	}

	// abstract void LoginContext();

	public void mailCheck() {
		System.out.println("将支票邮寄到 " + this.name + " " + this.address);
	}

	public String toString() {
		return name + " " + address + " " + number;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setAddress(String newAddress) {
		this.address = newAddress;
	}

	public int getNumber() {
		return number;
	}
}