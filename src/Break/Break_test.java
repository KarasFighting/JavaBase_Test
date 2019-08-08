package Break;
/**
* @author:汤哥

* @time:2019年7月23日 下午4:20:24
* 
*/
public class Break_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);

		}
		System.out.println("Helloword!!!");

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 10; i++) {
				if (i == 5) {
					break;// 默认终止离他最近的for循环
				}
				System.out.println(i);

			}

		}
		System.out.println("------------------------------");

		// 指定终止哪个for循环
		for1: for (int i = 0; i < 3; i++) {
			for2: for (int j = 0; j < 10; j++) {
				if (j == 5) {
					break for1;

				}
				System.out.println(j);

			}

		}

	}

}
