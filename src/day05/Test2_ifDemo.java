package day05;

import java.util.Scanner;

/**
 * ifDemo
 * @author tedu
 *
 */
public class Test2_ifDemo {
	public static void main(String[] args) {
		/*
		 *	1.程序=算法+数据结构
		 * 	2.执行顺序
		 * 		1)顺序执行
		 * 			代码从main 方法开始
		 * 		2)选择执行
		 * 		选择结构
		 * 			1)两种情况 
		 * 			语法结构 
		 * 			第一种:if(选择是否走)
		 * 			if(boolean 表达式){
		 * 				System.out.println();
		 *				//如果boolean表达式为真,那么就执行大括号里面的语句
		 *				//如果boolean表达式为假,那么就不执行大括号里面的语句
		 * 				}
		 * 			第二种:if(两种选其一)
		 * 			if(boolean 表达式){
		 * 				System.out.println();
		 *				//如果boolean表达式为真,那么就执行这个大括号里面的语句
		 * 				}else{
		 *				//如果boolean表达式为假,那么就执行这个大括号里面的语句
		 * 				}
		 * 			2)多种情况
		 * 		3)循环执行
		 */
		System.out.println("请输入一个整数:");
		int num = new Scanner(System.in).nextInt();
		int a = num;
		System.out.println("1");
		if(a!=2){
			System.out.println("这个数不是2");
		}else{
			System.out.println("这个是2");
		}
		System.out.println("3");
		
	}
}
