package For_java;
/**
* @author:汤哥

* @time:2019年7月23日 下午2:55:26
* 
*/


public class ForTest_06 {

	public static void main(String[] args) {
		// 九九乘法口诀
		System.out.println("九九乘法表");
		System.out.println("-----------------------------------------------------------------------");
		for (int z = 1; z <= 9; z++) {
			for (int y = 1; y <= z; y++) {
				System.out.print(z + "*" + y + "=" + z * y + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------");
	}
	}

