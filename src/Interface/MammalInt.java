package Interface;
/**
* @author:����

* @time:2019��8��6�� ����4:57:15
* 
*/

/*
 * һ���ӿڵ�ʵ�֣�
 * 
 * 1.����ʵ�ֽӿڵ�ʱ����Ҫʵ�ֽӿ������еķ������������������Ϊ������ࡣ
 * 
 * 2.��ʹ��implements�ؼ���ʵ�ֽӿڡ����������У�Implements�ؼ��ַ���class�������档
 * 
 * 3��ʽ��....implements �ӿ�����[, �����ӿ�����, �����ӿ�����..., ...] ...
 * 
 * ���������ӿڵĹ���
 * 
 * 1.����ʵ�ֽӿڵķ���ʱ�������׳�ǿ�����쳣��ֻ���ڽӿ��У����߼̳нӿڵĳ��������׳���ǿ�����쳣��
 * 
 * 2.������д����ʱҪ����һ�µķ�����������Ӧ�ñ�����ͬ��������ݵķ���ֵ���͡�
 * 
 * 3.���ʵ�ֽӿڵ����ǳ����࣬��ô��û��Ҫʵ�ָýӿڵķ�����
 * 
 * 
 * ����ʵ�ֽӿڵĹ���
 * 
 * 1.һ�������ͬʱʵ�ֶ���ӿڡ�
 * 
 * 2.һ����ֻ�ܼ̳�һ���࣬������ʵ�ֶ���ӿڡ�
 * 
 * 3.һ���ӿ��ܼ̳���һ���ӿڣ������֮��ļ̳бȽ����ơ�
 */
public class MammalInt implements Animal {

	public static void main(String[] args) {

		MammalInt mt = new MammalInt();
		mt.eat();
		mt.travel();

		// System.out.println(Math.sin(Math.PI / 2));

	}

	public boolean Offdemo() {
		// TODO Auto-generated method stub
		return false;

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat eat eat eat");

	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("travel travel travel");

	}

}
