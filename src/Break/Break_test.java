package Break;
/**
* @author:����

* @time:2019��7��23�� ����4:20:24
* 
*/
public class Break_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);

		}
		System.out.println("Helloword!!!");

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 10; i++) {
				if (i == 5) {
					break;// Ĭ����ֹ���������forѭ��
				}
				System.out.println(i);

			}

		}
		System.out.println("------------------------------");

		// ָ����ֹ�ĸ�forѭ��
		for1: for (int i = 0; i < 3; i++) {
			for2: for (int j = 0; j < 10; j++) {
				if (j == 5) {
					break for1;

				}
				System.out.println(j);

			}

		}

	}

}
