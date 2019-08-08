package TestProject;
/**
* @author:汤哥

* @time:2019年7月30日 下午2:10:40
* 
*/
public class Test {

	public static void main(String[] args) {
		Human man = new Human();
		man.age = 18;
		man.id = "man9527";
		man.name = "本金";
		man.sex = true;

		Villa vall = new Villa();
		vall.area = 500.0;
		// 房子的主人
		vall.human = man;

		// 房子主人的名字
		System.out.println("房子主人的名字是：" + vall.human.name);

		Human lisiHuman = new Human();
		lisiHuman.name = "李四";
		vall.human = lisiHuman;
		System.out.println("房子主人的名字是：" + vall.human.name);
	}

}
