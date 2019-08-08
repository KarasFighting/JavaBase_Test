package if_else;

import java.util.Scanner;

/**
* @author:汤哥

* @time:2019年7月19日 下午4:50:08
* 
* 关于switch：属于选择结构也是分支语句；
* 
*    语法结构：switch(int或者String类型的字面值或变量){
*    	caseint或者String类型的字面值或变量:
*    	  java语句
*    	  break;
*         ...
*    
	      caseint或者String类型的字面值或变量:
*    	  java语句
*    	  break;
*         ...
*         
*         caseint或者String类型的字面值或变量:
*    	  java语句
*    	  break;
	       ...
	   default:
	     java语句;
	     ...
*    }
*    
*    执行原理：switch后面的括号中的数据跟case后面的数据匹配，匹配成功的分支执行；分支后有break终止switch语句
*    case穿透：匹配成功的语句执行，分支中没有break语句的话直接进入下一个分支执行（不进行匹配）
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
		System.out.println("请输入数字：");
		int num = scanner.nextInt();
		switch (num) {
		case 1:
			System.out.println("星期一");

			break;

		case 2:
			System.out.println("星期二");

			break;

		case 3:
			System.out.println("星期三");

			break;

		case 4:
			System.out.println("星期四");

			break;

		case 5:
			System.out.println("星期五");

			break;

		default:
			System.out.println("对不起你输入的数字非法！！！");
			break;
		}

		System.out.println("---------------------------------------");

		// case穿透
		switch (num) {
		case 1:
			System.out.println("星期一");



		case 2:
			System.out.println("星期二");



		case 3:
			System.out.println("星期三");



		case 4:
			System.out.println("星期四");



		case 5:
			System.out.println("星期五");



		default:
			System.out.println("对不起你输入的数字非法！！！");

		}

		// case合并
		switch (num) {
		case 1:
		case 0:
			System.out.println("星期一");

			break;

		case 2:
			System.out.println("星期二");

			break;

		case 3:
			System.out.println("星期三");

			break;

		case 4:
			System.out.println("星期四");

			break;

		case 5:
			System.out.println("星期五");

			break;

		default:
			System.out.println("对不起你输入的数字非法！！！");
			break;
		}

	}

}
