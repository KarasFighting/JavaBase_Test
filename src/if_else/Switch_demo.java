package if_else;

import java.util.Scanner;

/**
* @author:����

* @time:2019��7��22�� ����2:46:02
* 
*/
public class Switch_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ӭʹ�ü򵥼�����ϵͳ������");

		System.out.println("�������һ�����֣�");
		int num1 = scanner.nextInt();

		System.out.println("�������������");
		String operater = scanner.next();

		System.out.println("������ڶ������֣�");
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
			// System.out.println("�Բ��𣬸�ϵͳ��֧�ִ������㣡����");
			break;
		}

		System.out.println("��������" + num1 + operater + num2 + "=" + result);

	}

}
