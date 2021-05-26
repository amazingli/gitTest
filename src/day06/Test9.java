package day06;

import java.util.Random;

public class Test9 {
	public static void main(String[] args) {
		Random r = new Random();
		int i=r.nextInt(60);
		System.out.println(i);
		int num =  (int)(Math.random()*101);
		System.out.println(num);
		int num2 = (int)((Math.random()*61)+20);
		//(Math.radom()*(x2-x1)+x1)
		//生成x1 到x2的数
	}
}
