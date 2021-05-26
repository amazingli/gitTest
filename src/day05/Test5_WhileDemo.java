package day05;

public class Test5_WhileDemo {
	public static void main(String[] args) {
		/*	循环结构:在满足条件的情况下,不断重复做一件事
		 * 	循环三要素:初始化,循环变量改变,循环体
		 * 	while
		 * 		循环变量初始化;
		 * 		while(循环变量的条件为真){
		 * 			循环体
		 * 			循环变量改变
		 * 		}
		 * 	do while
		 * 	do{	//不论while的条件是否为真都会先执行一次
		 * 
		 * 	}while(boolean表达式为真)
		 * 	for
		 * 	for(初始化 1;条件 2;改变 3){
		 * 		循环体 4
		 * 	}
		 * 
		 */
		//输出1 3 5 7 9 11
		int i=1;
		int s=0;
		while(i<=100){
			s = s+i;
			i = i+1;
		}
		i = 1;
		s = 0;
		for(i = 0; i<=100 ;i ++){
			s = s+i;
		}
		System.out.println(s);
		
	}
}
