package Demo_MethodTese;

/**
 * @author:汤哥
 * 
 * @time:2019年7月24日 下午4:07:36
 * 
 * 
 *                  内存中的三块空间：栈内存，队内存，方法去内存
 * 
 * 
 *                  栈：1.stack，是一种数据结构；2.数据结构反应数据存储形态
 *                  常见的数据结构：数组，队列，栈，二叉树，链表，哈希表/散列表。。。 入栈：push；出栈：pop
 * 
 *                  4.方法代码片段存储在方法区中，属于.class文件字节码文件的一部分。字节码文件在类加载的时候将其放在方法区里面，因此JVM三块内存空间中方法区最优先
 *                  5.代码片段可以被重复调用
 *                  6.每一次调用该方法的时候需要给该方法分配独立的空间，在栈内存中分配【栈内存中分配方法运行所属的内存空间】
 *                  7.方法调用的时候会给该方法分配独立的内存空间，此时发生入栈动作，方法运行结束后给该方法分配的内存空间自动释放，此时发生出栈动作
 *                  入栈：给方法分配内存空间。 出栈：释放空间
 * 
 *                  局部变量在方法体中申明，运行阶段内存在栈中分配。
 */
public class JVM_base {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int value = sumInt(a, b);
		System.out.println("value=" + value);

	}

	public static int sumInt(int i, int j) {
		// main方法中a传给i，b传给j【方法调用的时候在参数传递的时候，实际上传递的是变量中的值】
		// TODO Auto-generated method stub
		int result = i + j;
		int num = 3;
		int value = divice(result, num);
		return value;
	}

	public static int divice(int x, int y) {
		// TODO Auto-generated method stub
		int z = x / y;
		return z;
	}


}
