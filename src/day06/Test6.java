package day06;

public class Test6 {
	/*
	 * 鸡和兔子合计180只,脚共560,求鸡多少只,兔子多少只.
	 * 
	 */
	//int i = 0;//兔子数
	public static void main(String[] args) {
		int j = 0;//鸡数
		for (int i = 0; i<=180 ; i++){
			j = 180 -i;
			if ((i*4+j*2)==560){
				System.out.println("共有鸡:"+j+"只");
				System.out.println("共有兔子:"+i+"只");
			}
		}
	}
	
}
