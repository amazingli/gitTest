package day05;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Test3_IfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	if-----一条路有选择
		 * 	if else 两条路
		 * 	if elseif elseif else
		 * 
		 * 
//		if (boolean表达式为真){
//			System.out.println("1");
//		}else if(boolean表达式为真){
//			//在上一个if不成立的情况下才会往下面走
//			System.out.println("2");
//		}else if(boolean表达式为真){
//			//在上一个if不成立的情况下才会往下面走
//			System.out.println("3");	
//		}else if(boolean表达式为真){
//			//在上一个if不成立的情况下才会往下面走
//			System.out.println("4");	
//		}
		 * 	判断一个数首先是否大于10,其次判断是否大于8小于等于10,
		 * 	再次判断是否大于5小于等于8
		 * 	最后是否小于等于5
		 * 
		 */

		System.out.println("请输入一个整数:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String str = num>10?"这个数大于10.":
			(num>8?"这个数大于8.":
				(num>5?"这个数大于5.":"这个数小于等于5"));
		System.out.println(str);
		
		//		while (true){
//			int num = s.nextInt();
//			if(num >10){
//				System.out.println("这个数大于10.");
//			}else if (num>8){
//				System.out.println("这个数大于8.");
//			}else if (num>5){
//				System.out.println("这个数大于5.");
//			}else{
//				System.out.println("这个数小于等于5");
//			}
//		}
		
	}

}
