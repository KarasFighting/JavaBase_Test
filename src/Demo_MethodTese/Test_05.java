package Demo_MethodTese;
/**
* @author:汤哥
* @time:2019年7月24日 下午3:29:37
* 
*/
public class Test_05 {
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			if (i == 2) {
				return;// 终止main方法
			}
			System.out.println(i);

		}
		System.out.println("helloword");
	}

}
