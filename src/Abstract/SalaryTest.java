package Abstract;
/**
* @author:汤哥

* @time:2019年8月6日 下午2:40:24
* 
*/
public class SalaryTest {

	public static void main(String[] args) {
		// 抽象类不能被实例
		/*
		 * Employee ee = new Employee("汤军林", "祥源城", 6000) {
		 * 
		 * };
		 */
		Salary sal = new Salary("tanggege", "高新区", 007, 6000);

		Employee ee = new Salary("tanggege2", "高新区2", 010, 6001);

		System.out.println("==================================");
		sal.mailCheck();

		System.out.println("==================================");
		ee.mailCheck();

	}

}
