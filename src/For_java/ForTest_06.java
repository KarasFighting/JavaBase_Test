package For_java;
/**
* @author:����

* @time:2019��7��23�� ����2:55:26
* 
*/


public class ForTest_06 {

	public static void main(String[] args) {
		// �žų˷��ھ�
		System.out.println("�žų˷���");
		System.out.println("-----------------------------------------------------------------------");
		for (int z = 1; z <= 9; z++) {
			for (int y = 1; y <= z; y++) {
				System.out.print(z + "*" + y + "=" + z * y + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------");
	}
	}

