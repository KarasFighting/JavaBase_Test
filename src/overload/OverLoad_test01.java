package overload;
/**
* @author:����

* @time:2019��7��25�� ����11:07:25
* 
*/
public class OverLoad_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sumInt(2, 2);
		System.out.println(result);

		double result2 = sumDouble(1.0, 2.0);
		System.out.println(result2);

		long result3 = sumLong(1L, 2L);
		System.out.println(result3);


	}

	public static int sumInt(int a, int b) {
		return a + b;

	}

	public static double sumDouble(double a, double b) {
		return a + b;

	}

	public static long sumLong(long a, long b) {
		return a + b;

	}

}

//�˳���ı׶ˣ���Ҫһ��һ��������������������������ҿ���
//�����������ܲ�ͬ���Ƕ������ 
//�������ֵ��Ƿ������ò�����
//���������ܲ�ͬ���ǹ������ơ���û��һ�ֻ����ó���Աʹ����Щ������ʱ�������ʹ��ͬһ������һ�����������������أ�overload����java֧�����ֻ��ơ�
