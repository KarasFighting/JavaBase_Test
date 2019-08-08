package While;
/**
* @author:汤哥

* @time:2019年7月23日 下午4:13:40
* 
*/
public class DoWhile {
	/*
	 * 语法结构： do{ 循环体; }while(bool表达式);
	 * 
	 *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		do {
			System.out.println(i);// 先执行一次在看条件是否满足，不满足后面不执行；满足再继续执行
		} while (i > 100);

		System.out.println("====================");

		while (i > 100) {
			System.out.println(i);
		}

	}

}
