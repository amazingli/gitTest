package day05;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		int i=50;
		int j=-1;
		Random r = new Random();
		i = r.nextInt(100);
		System.out.println("������һ��0��100������:");
		do{
			Scanner input = new Scanner(System.in);
			j = input.nextInt();
			if (i==j) {
				System.out.println("�ٺ�,�³�����.");
			}else if(i>j){
				System.out.println("�ٺ�,û�³���,Ҫ��һ��");
			}else{
				System.out.println("�ٺ�,û�³���,ҪСһ��");
			}
		}while(i!=j);
	}

}
