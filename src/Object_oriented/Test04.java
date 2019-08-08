package Object_oriented;
/**
* @author:汤哥

* @time:2019年7月29日 上午9:44:59
* 
*/
public class Test04 {
	public static void main(String[] args) {

		// 创建一个丈夫对象
		Husband huangxiaoming = new Husband();
		huangxiaoming.name = "黄晓明";

		// 创建一个妻子对象
		Wife baby = new Wife();
		baby.name = "杨颖";

		// 通过妻子找到丈夫,也可以通过丈夫找到妻子
		huangxiaoming.wife = baby;
		baby.husband = huangxiaoming;

		System.out.println(huangxiaoming.name + "的妻子是：" + huangxiaoming.wife.name);

		System.out.println(baby.name + "的丈夫是：" + baby.husband.name);
	}

}
