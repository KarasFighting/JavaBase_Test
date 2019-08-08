package For_java;
/**
* @author:汤哥

* @time:2019年7月23日 上午11:10:15
* 
*/
public class ForTest_03 {

	public static void main(String[] args) {

		// 1-100的奇数(i % 2 != 0)
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);

		}

		System.out.println("=========================");

		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);

			}

		}

		// 0-100奇数累加求和
		int sum = 0;
		for (int i = 0; i < 100; i += 2) {

			sum += i;

		}
		System.out.println("sum=" + sum);
		System.out.println("==================================");

		// 归0
		int sum2 = 0;
		for (int i = 0; i < 100; i++) {

			if (i % 2 != 0) {
				sum2 += i;

			}


		}
		System.out.println("sum2=" + sum2);

	}

}
