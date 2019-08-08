package if_else;

import java.util.Scanner;

/**
* @author:汤哥

* @time:2019年7月22日 下午1:52:14
* 
*/
public class Switch_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入星期几：");
		String dayweek = sc.next();

		switch (dayweek) {
		case "星期一":
			System.out.println(1);
			break;

		case "星期二":
			System.out.println(2);
			break;

		case "星期三":
			System.out.println(3);
			break;

		case "星期四":
			System.out.println(4);
			break;

		case "星期五":
			System.out.println(5);
			break;

		default:
			System.out.println("对不起，您输入的数字不合法！！！");
			break;
		}
	}

}
