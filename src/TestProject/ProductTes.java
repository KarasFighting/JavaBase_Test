package TestProject;
/**
* @author:汤哥

* @time:2019年7月30日 下午1:43:24
* 
*/
public class ProductTes {

	public static void main(String[] args) {
		Product pd = new Product();

		pd.price = 85;
		pd.productNo = 114;

		System.out.println("商品的编号是：" + pd.productNo);
		System.out.println("商品的价格是：" + pd.price);

	}

}
