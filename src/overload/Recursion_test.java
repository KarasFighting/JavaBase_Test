package overload;
/**
* @author:����

* @time:2019��7��25�� ����2:27:50
* 
*/
public class Recursion_test {

	// �����ĵݹ����
	public static void main(String[] args) {
		System.out.println("main begin");
		dosome();
		System.out.println("main over");

	}

	// ���´���Ƭ��ֻ��һ�ݡ������ظ����ã�����ÿ����һ��dosome�����ͻ���ջ�ڴ����·���һ���ڴ�ռ�

	// �ݹ��㷨����Ҫ�н�������������ᷢ��ջ�ڴ����
	// �ݹ鼰ʱ���˽�������Ҳ�п��ܷ���ջ�ڴ��������Ϊ�ݹ��̫����
	public static void dosome() {
		System.out.println("dosome begin");
		dosome();
		System.out.println("dosome over");

	}

}
