package day05;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Test3_IfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	if-----һ��·��ѡ��
		 * 	if else ����·
		 * 	if elseif elseif else
		 * 
		 * 
//		if (boolean���ʽΪ��){
//			System.out.println("1");
//		}else if(boolean���ʽΪ��){
//			//����һ��if������������²Ż���������
//			System.out.println("2");
//		}else if(boolean���ʽΪ��){
//			//����һ��if������������²Ż���������
//			System.out.println("3");	
//		}else if(boolean���ʽΪ��){
//			//����һ��if������������²Ż���������
//			System.out.println("4");	
//		}
		 * 	�ж�һ���������Ƿ����10,����ж��Ƿ����8С�ڵ���10,
		 * 	�ٴ��ж��Ƿ����5С�ڵ���8
		 * 	����Ƿ�С�ڵ���5
		 * 
		 */

		System.out.println("������һ������:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String str = num>10?"���������10.":
			(num>8?"���������8.":
				(num>5?"���������5.":"�����С�ڵ���5"));
		System.out.println(str);
		
		//		while (true){
//			int num = s.nextInt();
//			if(num >10){
//				System.out.println("���������10.");
//			}else if (num>8){
//				System.out.println("���������8.");
//			}else if (num>5){
//				System.out.println("���������5.");
//			}else{
//				System.out.println("�����С�ڵ���5");
//			}
//		}
		
	}

}
