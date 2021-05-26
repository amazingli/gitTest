package afterClass;
/**
 * 关于substring()如何工作
 * substring()完整写法:substring(int beginIndex, int endIndex)
 * 该方法返回一个字符串,介于原有字符串下标的 beginIndex 到 endIndex-1
 * @author tedu
 *
 */
public class SubString {
	public static void main(String[] args) {
		String s ="沉默小王,有趣程序员";
		s = s.substring(0, 4);
		/*
		 * string下标都是从0开始
		 * JDK6与7不一样
		 * JDK 7 会重新复制一份字符数组，
		 * 而 JDK 6 不会，因此 JDK 6 在执行比较长的字符串 substring() 时可能会引发内存泄露的问题。
		 * 为什么从6到7构造函数发生了改变?
		 *	内存泄露是指由于疏忽或错误造成程序未能释放已经不再使用的内存。
		 *	当用JDK6的substring 截取一小段字符串时候,这一小的字符串引用导致
		 *	整个字符串数组无法回收,一直在内存占用,容易发生内存泄漏.
		 *	6的解决方法:s = s.substring(0,4)+"";
		 *	加上空字符串后,会生成新的字符串数组,s会指向新的与之前不同的字符串数组.
		 */
		System.out.println(s);
	}
}
