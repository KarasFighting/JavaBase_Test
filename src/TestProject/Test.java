package TestProject;
/**
* @author:����

* @time:2019��7��30�� ����2:10:40
* 
*/
public class Test {

	public static void main(String[] args) {
		Human man = new Human();
		man.age = 18;
		man.id = "man9527";
		man.name = "����";
		man.sex = true;

		Villa vall = new Villa();
		vall.area = 500.0;
		// ���ӵ�����
		vall.human = man;

		// �������˵�����
		System.out.println("�������˵������ǣ�" + vall.human.name);

		Human lisiHuman = new Human();
		lisiHuman.name = "����";
		vall.human = lisiHuman;
		System.out.println("�������˵������ǣ�" + vall.human.name);
	}

}
