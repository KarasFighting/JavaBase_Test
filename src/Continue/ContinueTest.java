package Continue;
/**
* @author:����

* @time:2019��7��24�� ����9:54:59
* 
*/
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("helloword");

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;// ��ǰ����ѭ��ֹͣ��������һ��ѭ��ִ��
			}
			System.out.println(i);

		}
		System.out.println("helloword");

	}

}
