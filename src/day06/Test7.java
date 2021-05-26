package day06;

public class Test7 {
	public static void main(String[] args) {
		/*
		 * 嵌套for循环
		 * 
		 */
		for(int i = 0; i<=9; i++){
			System.out.print(0);
			for(int j = 0;j<=i;j++){
				System.out.print(1);
			}
			System.out.println(2);
		}
		/*
		 * 	i=0 0<=9 out:0 
		 * 		j=0 0<=0 out:1
		 * 		j=1 1<=0  跳出
		 * 		out:2
		 *	i=1 1<=9 out:0
		 *		j=0 0<=1 out:1
		 *		j=1 1<=1 out:1
		 *		j=2 2<=1 跳出
		 *		out:2
		 *	i=2	2<=9 out:0
		 *		j=0	0<=2 out:1
		 *		j=1 1<=2 out:1
		 *		j=2 2<=2 out:1
		 *		j=3 3<=2 跳出
		 *		out:2
		 *	i=3 out:0
		 *		j=0...3 out:1*4
		 *		j=4 4<=3 跳出
		 * 		out:2
		 * 	i=4 out:0
		 * 		j=0...4 out:1*5
		 * 		j=5 5<=4 跳出
		 * 		out:2
		 * 	...
		 * 	i=9 out:0
		 * 		j=0...9 out:1*10
		 * 		j=10 10<=9 跳出
		 * 		out:2
		 * 	i=10 跳出
		 */
	}
}
