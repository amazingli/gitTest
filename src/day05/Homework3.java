package day05;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		int i=50;
		int j=-1;
		Random r = new Random();
		i = r.nextInt(100);
		System.out.println("请输入一个0到100的整数:");
		do{
			Scanner input = new Scanner(System.in);
			j = input.nextInt();
			if (i==j) {
				System.out.println("嘿嘿,猜出来了.");
			}else if(i>j){
				System.out.println("嘿嘿,没猜出来,要大一点");
			}else{
				System.out.println("嘿嘿,没猜出来,要小一点");
			}
		}while(i!=j);
	}

}
