package This;
/**
* @author:����

* @time:2019��7��31�� ����5:21:26
* 
*/
public class Customn {

	String name;// ʵ�����������ʱ���Ҫ�ж���

	public Customn() {

	}

	public void Shopping() {
		System.out.println(name + "�ڹ������");
	}

	public String getName() {
		return name;
	}

	/*
	 * this��һ�����ã�һ��������this�����б�����ڴ��ַָ�������洢��JVM���ڴ�java�����ڲ�
	 * 
	 * this����ʹ���ڴ���static�ؼ��ֵķ�����
	 */
	public void setName(String name) {
		this.name = name;// this.name��ʵ��������name���Ⱥź����name�Ǿֲ�����
	}

}

