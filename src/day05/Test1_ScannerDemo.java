package day05;

import java.util.Scanner;

/**
 * 
 * Scanner 案例
 * @author tedu
 *
 */
public class Test1_ScannerDemo {

	public static void main(String[] args) {
		/*	1.商品购物案例
		 * 	提示用户输入单价	double
		 * 	提示用户输入数量	double
		 * 	计算总价
		 * 	提示用户输入的钱并且计算找零
		 */
		System.out.println("请输入商品单价:");
//		double prize = new Scanner(System.in).nextDouble();
//		double numble = new Scanner(System.in).nextDouble();
//		double totalPrize = numble * prize;
//		System.out.println("商品总价是"+totalPrize);
		// 只用一个对象
		Scanner input = new Scanner(System.in);
		double prize = input.nextDouble();
		System.out.println("请输入商品数量:");
		double number = input.nextDouble();
		//判断商品单价或者数量是否为负数

		double totalPrize = number * prize;
		if(number<0||prize<0){ //如果价格或者数量中有一个不合法,提示用户
			System.out.println("别玩我,请输入有效数字");
			System.exit(0);
		}else{
			System.out.println("商品数量为"+number);
			System.out.println("商品单价为"+prize);
			System.out.println("商品总价是"+totalPrize);
		}
		//提示用户付的钱

		System.out.println("请输入你付的钱:");
		double money = new Scanner(System.in).nextDouble();
		//计算找零
		//判断用户给的钱,如果不够.
		double change = money - totalPrize;
		if(change>0){
			System.out.println("找零:"+change+"元");
		}else
		{
			System.out.println("不够钱呐,还差"+(totalPrize - money) + "元");
		}
		
		
	}

}
