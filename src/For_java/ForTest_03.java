package For_java;
/**
* @author:����

* @time:2019��7��23�� ����11:10:15
* 
*/
public class ForTest_03 {

	public static void main(String[] args) {

		// 1-100������(i % 2 != 0)
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);

		}

		System.out.println("=========================");

		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);

			}

		}

		// 0-100�����ۼ����
		int sum = 0;
		for (int i = 0; i < 100; i += 2) {

			sum += i;

		}
		System.out.println("sum=" + sum);
		System.out.println("==================================");

		// ��0
		int sum2 = 0;
		for (int i = 0; i < 100; i++) {

			if (i % 2 != 0) {
				sum2 += i;

			}


		}
		System.out.println("sum2=" + sum2);

	}

}
