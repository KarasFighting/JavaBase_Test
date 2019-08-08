package This;
/**
* @author:汤哥

* @time:2019年8月1日 下午2:37:29
* 
*/
public class Date {
	private int year;

	private int month;

	private int day;

	// 有参构造
	public Date(int year, int month, int day) {

		this.year = year;
		
		this.month = month;
		
		this.day = day;
	}

	public Date() {
		/*
		 * this.year = 1970; this.month = 1; this.day = 1;
		 * 
		 * this可以使用在构造方法中，通过当前构造方法调用其他构造方法
		 * 
		 */

		// new Date(1970,1,1);

		// 调用Date构造方法，不会创建新的对象【this()只能出现在构造方法的第一行】
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
		System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
	}

}

