package Inherit;
/**
* @author:����

* @time:2019��8��2�� ����9:50:30
* 
*/
public class ExtendsTest {

	/*
	 * ���ã�����ĸ���
	 * 
	 * ���˼̳в��з����ĸ��ǺͶ�̬����
	 * 
	 * java��ֻ֧�ֵ��̳У�һ����ֻ�ܼ̳�һ����
	 * 
	 * ���B��̳�A�ࣻA��:���࣬���࣬���࣬superclass��B��:���࣬�����࣬subclass
	 * 
	 * �̳����ݣ�
	 * 
	 * 1.˽�еĲ�֧�ּ̳�
	 * 
	 * 2.���췽����֧�ּ̳У��������ݶ����Լ̳�
	 * 
	 * 3.java����Ȼֻ֧�ֵ��̳У����ǿ��Լ�Ӽ̳�
	 * 
	 * 4.java��һ����û����ʾ�̳У�����Ĭ�ϼ̳�java.long.object��
	 * 
	 * 
	 **/

	public static void main(String[] args) {

		CreditAccount cat = new CreditAccount("��ۻ������", 9999.0, 666.0);


		System.out.println("�й��췽��---");
		System.out.println(cat.getActon() + " ; " + cat.getBalance() + " ; " + cat.getCredit());
	}

}
