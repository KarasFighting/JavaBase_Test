package if_else;

import java.util.Scanner;

/**
* @author:����

* @time:2019��7��19�� ����3:25:13
* 
*/

/*����
 * �жϵ�ǰ������
 * 	���꣺
 * 		����ɡ��
 * 			�ж��Ա�
 * 			�У�����ɡ
 * 			Ů������ɡ
 * ���죺
 * 	�ж��¶ȣ�
 * 		�¶�30�����ϣ�
 * 			�У���ī��
 * 			Ů��Ĩ��ɹ˪
 * */

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("˵��1��1��ʾ�´��꣬0��ʾ����");
		System.out.println("˵��2��1��ʾ�У�0��ʾŮ");
		System.out.println("˵��3���¶�Ϊ����");

		System.out.println("�������Ա�");
		int sex = sc.nextInt();

		System.out.println("����������״����");
		int weather = sc.nextInt();

		if (weather == 1) {

			// System.out.println("������");
			if (sex == 1) {
				System.out.println("����ɡ");
			} else if (sex == 0) {
				System.out.println("����ɡ");
			} else {
				System.out.println("��Ǹ����֪���Ա𣡣���");
			}

		} else if (weather == 0) {
			System.out.println("�����뵱ǰ�������¶ȣ�");
			int tem = sc.nextInt();
			if (tem > 30) {
				if (sex == 1) {
					System.out.println("��ī��");
				} else if (sex == 0) {
					System.out.println("Ĩ��ɹ˪");
				} else {
					System.out.println("��Ǹ����֪���Ա𣡣���");
				}

			} else {
				System.out.println("��Ǹ�������¶Ȳ����ڣ�����");
			}

		}

	}

}
