package day06;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		for (int x=0;x<=9;x++){
			int i =(int)(Math.random()*101);
			int j =(int)(Math.random()*101);
			System.out.print("第"+(x+1)+"题");
			System.out.println("请问"+i+"+"+j+"=?");
			int k= i+j;
			int s = 0;
			do{
				Scanner input = new Scanner(System.in);
				s=input.nextInt();
				if (k==s)
					System.out.println("恭喜答对了.");
				else 
					System.out.println("再想想.");
			}while(k!=s);
			
		}
		System.out.println("做完了");
	}
}
