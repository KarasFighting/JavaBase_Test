package Continue;
/**
* @author:汤哥

* @time:2019年7月24日 上午9:54:59
* 
*/
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("helloword");

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;// 当前本次循环停止，进入下一次循环执行
			}
			System.out.println(i);

		}
		System.out.println("helloword");

	}

}
