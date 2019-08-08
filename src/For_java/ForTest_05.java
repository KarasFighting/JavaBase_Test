package For_java;
/**
* @author:汤哥

* @time:2019年7月23日 下午2:19:14
* 
*/
public class ForTest_05 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Begain");
			// 内层嵌套循环10次
			for (int j = 0; j < 1; j++) {
				System.out.println("j=" + j);

			}
			System.out.println("Over");

		}
	}

}
