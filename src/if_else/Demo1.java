package if_else;

import java.util.Scanner;

/**
* @author:汤哥

* @time:2019年7月19日 下午3:25:13
* 
*/

/*需求：
 * 判断当前天气：
 * 	下雨：
 * 		带雨伞：
 * 			判断性别：
 * 			男，带黑伞
 * 			女，带花伞
 * 晴天：
 * 	判断温度：
 * 		温度30°以上：
 * 			男，戴墨镜
 * 			女，抹防晒霜
 * */

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("说明1：1表示下大雨，0表示晴天");
		System.out.println("说明2：1表示男，0表示女");
		System.out.println("说明3：温度为数字");

		System.out.println("请输入性别：");
		int sex = sc.nextInt();

		System.out.println("请输入天气状况：");
		int weather = sc.nextInt();

		if (weather == 1) {

			// System.out.println("下雨天");
			if (sex == 1) {
				System.out.println("带黑伞");
			} else if (sex == 0) {
				System.out.println("带花伞");
			} else {
				System.out.println("抱歉，不知道性别！！！");
			}

		} else if (weather == 0) {
			System.out.println("请输入当前天气的温度：");
			int tem = sc.nextInt();
			if (tem > 30) {
				if (sex == 1) {
					System.out.println("戴墨镜");
				} else if (sex == 0) {
					System.out.println("抹防晒霜");
				} else {
					System.out.println("抱歉，不知道性别！！！");
				}

			} else {
				System.out.println("抱歉，输入温度不存在！！！");
			}

		}

	}

}
