package Demo_MethodTese;

/**
 * @author:����
 * 
 * @time:2019��7��24�� ����4:07:36
 * 
 * 
 *                  �ڴ��е�����ռ䣺ջ�ڴ棬���ڴ棬����ȥ�ڴ�
 * 
 * 
 *                  ջ��1.stack����һ�����ݽṹ��2.���ݽṹ��Ӧ���ݴ洢��̬
 *                  ���������ݽṹ�����飬���У�ջ����������������ϣ��/ɢ�б����� ��ջ��push����ջ��pop
 * 
 *                  4.��������Ƭ�δ洢�ڷ������У�����.class�ļ��ֽ����ļ���һ���֡��ֽ����ļ�������ص�ʱ������ڷ��������棬���JVM�����ڴ�ռ��з�����������
 *                  5.����Ƭ�ο��Ա��ظ�����
 *                  6.ÿһ�ε��ø÷�����ʱ����Ҫ���÷�����������Ŀռ䣬��ջ�ڴ��з��䡾ջ�ڴ��з��䷽�������������ڴ�ռ䡿
 *                  7.�������õ�ʱ�����÷�������������ڴ�ռ䣬��ʱ������ջ�������������н�������÷���������ڴ�ռ��Զ��ͷţ���ʱ������ջ����
 *                  ��ջ�������������ڴ�ռ䡣 ��ջ���ͷſռ�
 * 
 *                  �ֲ������ڷ����������������н׶��ڴ���ջ�з��䡣
 */
public class JVM_base {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int value = sumInt(a, b);
		System.out.println("value=" + value);

	}

	public static int sumInt(int i, int j) {
		// main������a����i��b����j���������õ�ʱ���ڲ������ݵ�ʱ��ʵ���ϴ��ݵ��Ǳ����е�ֵ��
		// TODO Auto-generated method stub
		int result = i + j;
		int num = 3;
		int value = divice(result, num);
		return value;
	}

	public static int divice(int x, int y) {
		// TODO Auto-generated method stub
		int z = x / y;
		return z;
	}


}
