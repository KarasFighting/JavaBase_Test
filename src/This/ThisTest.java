package This;
/**
* @author:����

* @time:2019��8��1�� ����10:58:11
* 
*/
public class ThisTest {

	int num = 10;

	public static void main(String[] args) {
		// System.out.println(this.num);

		ThisTest tt = new ThisTest();
		System.out.println(tt.num);
	}

}
