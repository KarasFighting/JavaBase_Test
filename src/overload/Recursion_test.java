package overload;
/**
* @author:汤哥

* @time:2019年7月25日 下午2:27:50
* 
*/
public class Recursion_test {

	// 方法的递归调用
	public static void main(String[] args) {
		System.out.println("main begin");
		dosome();
		System.out.println("main over");

	}

	// 以下代码片段只有一份。可以重复调用，并且每调用一次dosome方法就会在栈内存中新分配一块内存空间

	// 递归算法必须要有结束条件，否则会发生栈内存溢出
	// 递归及时有了结束条件也有可能发生栈内存溢出，因为递归的太深了
	public static void dosome() {
		System.out.println("dosome begin");
		dosome();
		System.out.println("dosome over");

	}

}
