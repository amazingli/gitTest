package day05;
/**
 * 三目运算符
 * @author tedu
 *
 */
public class Test4_OperatorDemo {
	public static void main(String[] args) {
	/*	三目运算符,三项运算符
	 * 	语法:
	 * 		接受类型 变量名= boolean 表达式? 表达式1 : 表达式2;
	 * 		1)表达式1和表达式2必须统一.
	 * 		2)接受类型式两个表达式最大类型
	 * 		3)boolean表达式如果为真 接受到数据为表达式1 的数据
	 * 		  			   如果为假 接受到数据为表达式2 的数据
	 * 
	 */
		double a = 2>3?4:5.5;
		System.out.println(a);
		String str = 2>3?"2>3为对":"2>3为错";
		System.out.println(str);
		int num = 2;
		String str2 = num == 2 ? "这个数是2" :"这个数不是2";
		System.out.println(str2);
	}
}
