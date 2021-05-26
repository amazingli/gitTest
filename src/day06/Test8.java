package day06;

public class Test8 {
	public static void main(String[] args) {
		/*
		 *  一百块买一百鸡
		 *  公鸡 5
		 *  母鸡 3
		 *  小鸡 1 三只
		 *  有几种买法
		 */
		int s = 0;//买法
		
		for(int i=0;i<=20;i++){
			//公鸡 i 最多20只
			for(int j=0;j<=34;j++){
				//母鸡 j 最多34只
				int k =0;
				//k只小鸡
				k = 100-j-i;
				if (k%3==0&&(5*i+3*j+k/3.0==100)){
					s=s+1;
					System.out.println("第"+s+"种:");
					System.out.println("买公鸡"+i+"只,母鸡"+j+"只,小鸡"+k+"只");
				}
			}
		}
		
		//定价格,算个数
		System.out.println("共"+s+"种.");
	}
}
