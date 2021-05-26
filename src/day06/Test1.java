package day06;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 输出9的乘法口诀表.
		 */
		for(int i=0;i<9;i++){
			System.out.println((i+1)+"*9="+(i+1)*9);
		}
//		i=0		0<9		1*9=9 
//		i=0+1	1<9		2*9=18
//		i=1+1	2<9		3*9=27 
//		i=2+1	3<9		4*9=36
//		i=3+1	4<9		5*9=45
//		i=4+1	5<9		6*9=54
//		...
//		i=7+1	8<9		9*9=81
//		i=8+1=9 9=9		退出循环
		int c = 0;
		while(c<9){
			c++;
			System.out.println((c)+"*9="+(c)*9);
		}
		int d = 0;
		do{
			d++;
			System.out.println(d+"*9="+d*9);
		}while(d<9);
	}
}
