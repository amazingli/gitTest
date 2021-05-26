package day02;
public class AboutString {

	public static void main(String[] args) {
		/*关于字符串
		 *	1.双引号字符串和 new 字符串对象
		 *		双引号字符串
		 *		String str1="abc";
		 *		会首先查看字符串池中是否存在字符串"abc"，
		 *		如果存在则直接将"abc"赋给str，如果不存在则会先在字符串池中新建一个字符串"abc"，
		 *		然后再将其赋给str。如果执行代码
		 *		new 字符串对象
		 *		String str=new String("abc");
		 *		不管字符串池中有没有"abc"都会在堆中新建一个字符串对象 然后将其赋给str引用。
		 * 	2.Java字符串是不可变的
		 *		 堆:堆内存用来存储 Java 中的对象，无论是成员变量、局部变量，还是类变量，它们指向的对象都存储在堆内存中	
		 *		 字符串常量池: Java 虚拟机用来存储字符串的一个特殊的区域，由于字符串是不可变的，
		 *		因此 Java 虚拟机可以在字符串常量池中只为同一个字符串存储一个字符串副本来节省空间。
		 *		可以看作特殊的数据类型.
		 *	3.String、StringBuilder 和 StringBuffer 之间的区别
		 *		String:不可变的对象, 因此在每次对 String 类型进行改变的时候其实都等同于生成了一个新的 String 对象，
		 *			然后将指针指向新的 String 对象.
		 *		StringBuilder:每次结果都会对 StringBuffer 对象本身进行操作.
		 * 		StringBuffer:用作 StringBuffer 的一个简易替换，用在字符串缓冲区被单个线程使用的时候（这种情况很普遍）.
		 * 	4.字符串拼接的几种方式
		 * 		1)使用"+",
		 * 		其实现原理是使用StringBuilder.append.
		 * 		2)concat,是String自带方法
		 * 		其原理这段代码首先创建了一个字符数组，长度是已有字符串和待拼接字符串的长度之和，
		 * 		再把两个字符串的值复制到新的字符数组中，并使用这个字符数组创建一个新的String对象并返回。
		 *		类似于C语言
		 *		3)使用StringBuilder或StringBuffer的append方法拼接
		 *		append会直接拷贝字符到内部的字符数组中，如果字符数组长度不够，会进行扩展。
		 *		StringBuffer和StringBuilder类似，最大的区别就是StringBuffer是线程安全的
		 *		4)使用join方法拼接
		 * 		总结:StringBuilder<StringBuffer<concat<+<StringUtils.join
		 * 		循环体内，字符串的连接方式，使用 StringBuilder 的 append 方法进行扩展。而不要使用+。
		 * 	5.字符串常量池
		 * 		存在于堆内存里.详细见于1
		 * 		
		 */
		//4.1
		String s1 = "abc";
		s1 = s1 + "y";
		System.out.println(s1);
		//4.2
		String s2 = "abc";
		s2 = s2.concat("y");
		System.out.println(s2);
		//4.3
		StringBuilder s3 = new StringBuilder("abc");
		s3.append("def").append("y");
		System.out.println(s3.toString());
		//4.4
//		String s4 = "abc";
//		s4 = StringUtils.join(s4,'y');
//		System.out.println(s4.toString());
	}

}
