package Abstract;
/**
* @author:����

* @time:2019��8��6�� ����2:40:24
* 
*/
public class SalaryTest {

	public static void main(String[] args) {
		// �����಻�ܱ�ʵ��
		/*
		 * Employee ee = new Employee("������", "��Դ��", 6000) {
		 * 
		 * };
		 */
		Salary sal = new Salary("tanggege", "������", 007, 6000);

		Employee ee = new Salary("tanggege2", "������2", 010, 6001);

		System.out.println("==================================");
		sal.mailCheck();

		System.out.println("==================================");
		ee.mailCheck();

	}

}
