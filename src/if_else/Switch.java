package if_else;

import java.util.Scanner;

/**
* @author:����

* @time:2019��7��19�� ����4:50:08
* 
* ����switch������ѡ��ṹҲ�Ƿ�֧��䣻
* 
*    �﷨�ṹ��switch(int����String���͵�����ֵ�����){
*    	caseint����String���͵�����ֵ�����:
*    	  java���
*    	  break;
*         ...
*    
	      caseint����String���͵�����ֵ�����:
*    	  java���
*    	  break;
*         ...
*         
*         caseint����String���͵�����ֵ�����:
*    	  java���
*    	  break;
	       ...
	   default:
	     java���;
	     ...
*    }
*    
*    ִ��ԭ��switch����������е����ݸ�case���������ƥ�䣬ƥ��ɹ��ķ�ִ֧�У���֧����break��ֹswitch���
*    case��͸��ƥ��ɹ������ִ�У���֧��û��break���Ļ�ֱ�ӽ�����һ����ִ֧�У�������ƥ�䣩
* 
*/

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 100L;
		switch ((int) x) {
//		case value:
//
//			break;
//
//		default:
//			break;
		}

		String username = "zhangsan";
		switch (username) {
//		case value:
//			
//			break;
//
//		default:
//			break;
		}

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������֣�");
		int num = scanner.nextInt();
		switch (num) {
		case 1:
			System.out.println("����һ");

			break;

		case 2:
			System.out.println("���ڶ�");

			break;

		case 3:
			System.out.println("������");

			break;

		case 4:
			System.out.println("������");

			break;

		case 5:
			System.out.println("������");

			break;

		default:
			System.out.println("�Բ�������������ַǷ�������");
			break;
		}

		System.out.println("---------------------------------------");

		// case��͸
		switch (num) {
		case 1:
			System.out.println("����һ");



		case 2:
			System.out.println("���ڶ�");



		case 3:
			System.out.println("������");



		case 4:
			System.out.println("������");



		case 5:
			System.out.println("������");



		default:
			System.out.println("�Բ�������������ַǷ�������");

		}

		// case�ϲ�
		switch (num) {
		case 1:
		case 0:
			System.out.println("����һ");

			break;

		case 2:
			System.out.println("���ڶ�");

			break;

		case 3:
			System.out.println("������");

			break;

		case 4:
			System.out.println("������");

			break;

		case 5:
			System.out.println("������");

			break;

		default:
			System.out.println("�Բ�������������ַǷ�������");
			break;
		}

	}

}
