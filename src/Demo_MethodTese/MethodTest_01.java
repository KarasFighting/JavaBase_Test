package Demo_MethodTese;
/**
* @author:����

* @time:2019��7��25�� ����10:18:22
* 
*/
public class MethodTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		method(i);// ջ�ڴ棬����method���ȳ�ջ
		System.out.println("main_i=" + i);

	}

	public static void method(int i) {
		i++;
		System.out.println("method_i=" + i);

	}

}
