package day03;

public class Test2_OperatorDemo {

	public static void main(String[] args) {
		/*	自增自减运算符
		 *	++ --
		 *	1)单独使用:
		 *		一共四种,少一个符号都不允许
		 *		a++ ++a a-- --a
		 *		a=a+1   a=a-1
		 *	2)被使用:
		 *		int b = ++a;
		 *		++在前,先将上一步a的值+1给到表达式
		 *		a自己来说还会自增1
		 *		++在后,将上一步a赋值给到表达式
		 *		a自己来说再自增1
		 */
		int a = 1;
		++a;
		System.out.println(a);//2
		int b = ++a;
		/* 1.分析单独使用还是被使用:被使用
		 * 2.分析++在前还是在后,在前
		 * 
		 */
		System.out.println(a);//3
		System.out.println(b);//3
		b = a++;
		System.out.println(a);//4
		System.out.println(b);//3
	}

}
