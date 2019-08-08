package if_else;
/**
* @author:汤哥

* @time:2019年7月22日 下午2:27:18
* 
*/
public class Switch_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		switch (c) {
		case 'A':
			System.out.println("高级");
			break;

		case 'B':
			System.out.println("中级");
			break;

		case 'C':
			System.out.println("初级");
			break;

		case 'D':
			System.out.println("低级");
			break;

		default:
			System.out.println("出错了！！！");
			break;
		}

	}

}
