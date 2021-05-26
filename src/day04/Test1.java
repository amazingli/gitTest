package day04;

import java.util.Scanner;
//导入java中已经存在的类Scanner 扫描类
public class Test1 {
	//快键键 main  alt+/
	public static void main(String[] args) {
		/*	需求:
		 *	要求用户在Console能够写入数据到我们程序里面
		 *	然后再从程序里面输出获取到的结果
		 * 
		 */
		System.out.println("请输入你的名字:");
		System.out.println("请输入年龄:");
		System.out.println("请输入体重:");
		//提示用户输入名字:字符串类型
		
		//获取能够在控制台输入的权
		String str2 = new Scanner(System.in).next();
		int age = new Scanner(System.in).nextInt();
		float weight = new Scanner(System.in).nextFloat();
		// 字符串 变量名      系统输入进去获取一行 next 可通过空格隔开 nextLine 读取一行 
		System.out.println("你的名字是:"+str2);
		System.out.println("你的年龄是:"+age);
		System.out.println("你的体重是:"+weight);
		System.out.println(weight==2.1);
	}
}
