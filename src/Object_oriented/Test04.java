package Object_oriented;
/**
* @author:����

* @time:2019��7��29�� ����9:44:59
* 
*/
public class Test04 {
	public static void main(String[] args) {

		// ����һ���ɷ����
		Husband huangxiaoming = new Husband();
		huangxiaoming.name = "������";

		// ����һ�����Ӷ���
		Wife baby = new Wife();
		baby.name = "��ӱ";

		// ͨ�������ҵ��ɷ�,Ҳ����ͨ���ɷ��ҵ�����
		huangxiaoming.wife = baby;
		baby.husband = huangxiaoming;

		System.out.println(huangxiaoming.name + "�������ǣ�" + huangxiaoming.wife.name);

		System.out.println(baby.name + "���ɷ��ǣ�" + baby.husband.name);
	}

}
