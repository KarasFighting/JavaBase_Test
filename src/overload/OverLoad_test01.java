package overload;
/**
* @author:汤哥

* @time:2019年7月25日 上午11:07:25
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

//此程序的弊端：需要一个一个调用下面的三个方法，繁琐且枯燥
//三个方法功能不同但是都是求和 
//三个名字但是方法调用不方便
//改良：功能不同但是功能相似。有没有一种机制让程序员使用这些方法的时候就像在使用同一个方法一样————方法重载（overload）【java支持这种机制】
