package Static;
/**
* @author:����

* @time:2019��8��1�� ����4:51:35
* 
*/
public class StaticTest {

	/*
	 * ��̬���������ִ�е�ʱ��ִֻ��һ�Σ�������main����ִ��
	 * 
	 * �����п��Ա�д�����������ѭ���϶��µ�˳��һ��ִ��
	 * 
	 * ���ã���Ŀ�����Ҫ��������ص�ʱ��ִ�д�����ɵ���־��¼���Ϳ���д�뾲̬�������
	 * 
	 **/

	public static void main(String[] args) {
		System.out.println("main����ִ��");

	}

	static {
		System.out.println("static---->1");
	}

	static {
		System.out.println("static---->2");

	}

	static {
		System.out.println("static---->3");

	}

}
