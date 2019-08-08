package if_else;

import java.util.Scanner;

/**
* @author:汤哥

* @time:2019年7月22日 下午2:46:02
* 
*/
public class Switch_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎使用简单计算器系统！！！");

		System.out.println("请输入第一个数字：");
		int num1 = scanner.nextInt();

		System.out.println("请输入运算符：");
		String operater = scanner.next();

		System.out.println("请输入第二个数字：");
		int num2 = scanner.nextInt();

		int result = 0;

		switch (operater) {
		case "+":
			result = num1 + num2;
			break;

		case "-":
			result = num1 - num2;
			break;

		case "*":
			result = num1 * num2;
			break;

		case "/":
			result = num1 / num2;
			break;

		case "%":
			result = num1 % num2;
			break;

		default:
			// System.out.println("对不起，该系统不支持此类运算！！！");
			break;
		}

		System.out.println("运算结果：" + num1 + operater + num2 + "=" + result);

	}

}
