package Object_oriented;
/**
* @author:����

* @time:2019��7��26�� ����2:24:30
* 
*/
public class Object_oriented02 {

	public static void main(String[] args) {
		// ���ڴ棺new�Ķ�����ڶ��ڴ��д洢��new Object_oriented()��һ��ѧ������student��һ���ֲ��������洢��ջ�ڴ���
		// new�����ڶ��ڴ��п��ٵ��ڴ�ռ��Ϊ����---����
		// ������һ���������������������java������ڴ��ַ---����
		// java�����в���ֱ�Ӳ������ڴ棬java��û��ָ�룬��C���Բ�ͬ��ֻ��ͨ������ȥ���ʶ��ڴ��е�ʵ������

		Object_oriented student = new Object_oriented();
		// ����ʵ���������﷨��ʽ��
		// ��ȡ���ݣ�����.������
		// �޸����ݣ�����.������ = ֵ

		// ����
		int new_no = student.num;

		String new_name = student.name;

		boolean new_sex = student.sex;

		String new_address = student.address;

		int new_age = student.age;

		System.out.println(new_no);
		System.out.println(new_sex);
		System.out.println(new_name);
		System.out.println(new_address);
		System.out.println(new_age);

		// ��ֵ
		student.name = "����";
		student.age = 18;
		student.num = 10;
		student.sex = true;
		student.address = "����";

		System.out.println(student.num = 10);
		System.out.println(student.sex = true);
		System.out.println(student.name = "����");
		System.out.println(student.address = "����");
		System.out.println(student.age = 18);



	}

	/**
	 * �ֲ�������ջ�ڴ��д洢
	 * 
	 * ��Ա�����е�ʵ�������ڶ��ڴ��java�����ڲ��洢
	 * 
	 * һ�������Ӧһ��ʵ������
	 */

}
