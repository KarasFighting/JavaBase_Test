package Encapsulation;
/**
* @author:����

* @time:2019��7��30�� ����3:42:16
* 
*/

/**
 * ��װ�Ĳ��裺 1.��������˽�л�,��private�ؼ������Σ�ֻ���ڱ����з��ʡ�
 * 
 * 2.�����ṩ�򵥵Ĳ�����ڣ��ⲿ������ʵĻ�����Ҫͨ���򵥵���ڽ��в���--get/set���� �޸ģ�set��������ȡ��get����
 * 
 * 3.ע����� setter��getter����û��static�ؼ���
 * 
 * ��static���εķ������ã�����.������
 * 
 * û��static���εķ������ã�����.������
 * 
 */
public class User {

	public int getAge() {
		if (age < 0 || age > 150) {
			System.out.println("�Բ����������䲻�Ϸ�������");

		}
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ˽�л����ԣ��ⲿ�޷�����
	private int age;
	
	

}
