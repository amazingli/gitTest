package day06;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		for (int x=0;x<=9;x++){
			int i =(int)(Math.random()*101);
			int j =(int)(Math.random()*101);
			System.out.print("��"+(x+1)+"��");
			System.out.println("����"+i+"+"+j+"=?");
			int k= i+j;
			int s = 0;
			do{
				Scanner input = new Scanner(System.in);
				s=input.nextInt();
				if (k==s)
					System.out.println("��ϲ�����.");
				else 
					System.out.println("������.");
			}while(k!=s);
			
		}
		System.out.println("������");
	}
}
