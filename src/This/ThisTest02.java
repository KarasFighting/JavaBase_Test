package This;
/**
* @author:����

* @time:2019��8��1�� ����11:26:21
* 
*/
public class ThisTest02 {

	public static void main(String[] args) {

		// ThisTest02.doSome();

		doSome();


	}

	public static void doSome() {
		System.out.println("do some thing!!!");
	}

	public void doOther() {
		System.out.println("do other thing!!!");


	}


	public void run() {
		System.out.println("run run run...");
		doSome();
	}

}
