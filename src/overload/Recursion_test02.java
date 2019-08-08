package overload;
/**
* @author:汤哥

* @time:2019年7月25日 下午3:21:57
* 
*/

//不使用递归求和1-4
public class Recursion_test02 {
	public static void main(String[] args) {
		int n = 4;
		int result = sum(n);

		sum(n);
		System.out.println(result);

	}

	public static int sum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i;
		}
		return sum;

	}

}
