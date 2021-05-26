package day03;

public class Test3_OperatorDemo {

	public static void main(String[] args) {
		//分别输出1234的个位十位百位千位
		int a = 1234;
//		System.out.println(a/1000);
//		System.out.println(a%1000/100);
//		System.out.println(a/10%10);
//		System.out.println(a%10);
		System.out.println("这个数的千位是:"+a/1000);
		System.out.println("这个数的百位是:"+(a/100-a/1000*10));
		System.out.println("这个数的十位是:"+(a/10-a/1000*100-(a/100-a/1000*10)));
		System.out.println("这个数的个位是:"+a%10);
	}

}
