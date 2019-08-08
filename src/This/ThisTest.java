package This;
/**
* @author:汤哥

* @time:2019年8月1日 上午10:58:11
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
