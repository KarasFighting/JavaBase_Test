package This;
/**
* @author:����

* @time:2019��8��1�� ����2:37:29
* 
*/
public class Date {
	private int year;

	private int month;

	private int day;

	// �вι���
	public Date(int year, int month, int day) {

		this.year = year;
		
		this.month = month;
		
		this.day = day;
	}

	public Date() {
		/*
		 * this.year = 1970; this.month = 1; this.day = 1;
		 * 
		 * this����ʹ���ڹ��췽���У�ͨ����ǰ���췽�������������췽��
		 * 
		 */

		// new Date(1970,1,1);

		// ����Date���췽�������ᴴ���µĶ���this()ֻ�ܳ����ڹ��췽���ĵ�һ�С�
		this(1970, 1, 1);

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void print() {
		System.out.println(this.year + "��" + this.month + "��" + this.day + "��");
	}

}

