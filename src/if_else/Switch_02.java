package if_else;

import java.util.Scanner;

/**
* @author:����

* @time:2019��7��22�� ����1:52:14
* 
*/
public class Switch_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ڼ���");
		String dayweek = sc.next();

		switch (dayweek) {
		case "����һ":
			System.out.println(1);
			break;

		case "���ڶ�":
			System.out.println(2);
			break;

		case "������":
			System.out.println(3);
			break;

		case "������":
			System.out.println(4);
			break;

		case "������":
			System.out.println(5);
			break;

		default:
			System.out.println("�Բ�������������ֲ��Ϸ�������");
			break;
		}
	}

}
