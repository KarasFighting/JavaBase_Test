package if_else;
/**
* @author:汤哥

* @time:2019年7月22日 下午3:44:20
* 
*/
public class Switch_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double score = 100.0;
		int grade = (int) (score / 10);

		switch (grade) {
		case 10:
		case 9:
			System.out.println("A");
			break;

		case 8:
			System.out.println("B");
			break;

		case 7:
			System.out.println("C");
			break;

		case 6:
			System.out.println("D");
			break;

		default:
			System.out.println("E");
			break;
		}

	}

}
