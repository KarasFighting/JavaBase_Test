package Abstract;
/**
* @author:����

* @time:2019��8��6�� ����2:34:59
* 
*/
public class Salary extends Employee {// �����಻��ʵ�����������Գ�������뱻�̳У����ܱ�ʹ��

	private double salary;


	// �������еķǳ��󷽷�������д������������д
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
		// TODO Auto-generated constructor stub
	}

	public void mailCheck() {
		System.out.println("�ڹ��������ʼ������ ");
		System.out.println("֧Ʊ�ʼ��� " + getName() + " ��н " + salary);
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
		System.out.println("���㹤��֧�� " + getName());
		return salary / 52;
	}

}
