package Abstract;

/**
 * @author:����
 * 
 * @time:2019��8��6�� ����2:30:29
 * 
 * 
 * 
 */
public abstract class Employee {
	private String name;

	private String address;


	private int number;

	public Employee(String name, String address, int number) {
		System.out.println("����Ա��");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public double computePay() {
		System.out.println("Ա���ڲ�����֧��");
		return 0.0;
	}

	// abstract void LoginContext();

	public void mailCheck() {
		System.out.println("��֧Ʊ�ʼĵ� " + this.name + " " + this.address);
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