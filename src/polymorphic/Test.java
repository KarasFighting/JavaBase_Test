package polymorphic;
/**
* @author:����

* @time:2019��8��5�� ����2:25:18
* 
*/
public class Test {
	// ����ת�ͣ�������--->�����͡��Զ�ת����
	// ����ת�ͣ�������--->�����͡�ǿ������ת����
	// �ص㣺���������ϻ�������ת������֮������Ǽ̳й�ϵ�ſ���

	/*
	 * ��̬��������Ҫ������
	 * 
	 * 1.�̳У�2.��д��3.��������ָ�������������ת�͡�
	 * 
	 * ��չ����������������д�ķ���ʱ�����õ�������ķ����������Ǹ����б���д�ķ�����
	 * 
	 * Ҫ����ø����б���д�ķ����������ʹ�ùؼ��� super
	 * 
	 */

	public static void main(String[] args) {
		Anmal am = new Anmal();
		am.move();

		// ����ת��[�Զ�����װ��]
		Cat ct = new Cat();
		ct.move();

		// ǿ��ת��[����ת��]
		Cat bd = (Cat) ct;
		bd.catchMouse();

		// ����������ָ�������͡���̬���ơ�
		Anmal anmal = new Bird();
		anmal.move();


		Anmal an = new Bird();

		if (an instanceof Cat) {
			Cat cat = (Cat) an;
			cat.catchMouse();
		} else if (an instanceof Bird) {
			Bird bird = (Bird) an;
			bird.fly();
		}

		// java.lang.ClassCastException,������ת�͵�ʱ��ᷢ��
		// ����java.lang.ClassCastException��ʹ��instanceof�������ִ�н����Boolean����
		// ���ڽ��true/false��

		/*
		 * ���裺 a instanceof Anmal
		 * 
		 * true:a����ָ��Ķ�����Anmal����
		 * 
		 * false��a����ָ��Ķ�����Anmal����
		 * 
		 * 
		 * 
		 **/




	}

}
