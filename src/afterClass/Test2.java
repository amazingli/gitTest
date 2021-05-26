package afterClass;
/**
 * 关于字符串的引用传递问题
 * Java 只有值传递，没有引用传递。
 * 
 * @author tedu
 *
 */
public class Test2 {
	public static void main(String[] args) {
		String s = new String("1");
		change(s);
		System.out.println(s);
	}

	public static void change(String s){
		s="2";
	}
}
