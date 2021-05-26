package day06;

public class Test3 {
	public static void main(String[] args) {
		/*
		 * 1+1/2+1/3...+1/100
		 */
		double s = 0;
		for(int i =1;i<=100;i++){
			s = s+1.0/i;
		}
		System.out.println(s);
	}
}
