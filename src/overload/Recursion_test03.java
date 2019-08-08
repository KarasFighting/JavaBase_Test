package overload;
/**
* @author:汤哥

* @time:2019年7月25日 下午3:54:04
* 
*/
public class Recursion_test03 {

	// 使用递归计算1-4的和
	public static void main(String[] args) {
		int n = 4;
		int result = sum(n);
		System.out.println(result);

	}

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1);



	}

}
//n+sum(n-1)
//4+sum(3)
//4+3+sum(2)
//4+3+2+sum(1)
//4+3+2+1