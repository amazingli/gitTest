package day03;

public class Test1_OperatorDemo {

	public static void main(String[] args) {

		/*
		 * 1.运算符
		 * 	1)赋值运算符
		 *  = ; 赋值,给变量赋值(第一次赋值是初始化)
		 * 	2)算术运算符
		 *  + - * / %
		 *  +:正常加法,拼接
		 *  /:除法中整数相除无条件舍弃小数部分
		 *  %:取余
		 *  3)扩展运算符
		 *  += -= *= /=
		 *  4)自增自减运算符 !!
		 *   a++ b--
		 *  5)关系运算符
		 *   最后的运算结果都是Boolean类型 true false
		 *  > < >= <= == !=
		 *  6)逻辑运算符 
		 *  连接两个或者以上的关系运算符
		 *  &(单于) &&(双与):见false为false
		 *  最后结果都一样,单与没有短路逻辑,双与由短路逻辑
		 *  |(单或) ||(双或):见true为true
		 *  最后结果都一样,单或没有短路逻辑,双或有短路逻辑
		 * 	! 非: !false=true !true = false
		 * 
		 */
		int a = 1;//赋值
		System.out.println(1+1);//输出1+1的结果2 
		System.out.println(1+"1"+1);//输出字符串111,任何数据类型和字符号串相加只能做拼接作用.
		int b=4/5;
		System.out.println(b);
		double c = 4.0/5;//小数数据类型
		System.out.println(c);
		int d=9%8;
		System.out.println(d);
		d+=2;//d=d+2;
		System.out.println(d);
		d*=2;
		System.out.println(d);
		d/=2;
		System.out.println(d);
	}

}
