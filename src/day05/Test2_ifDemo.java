package day05;

import java.util.Scanner;

/**
 * ifDemo
 * @author tedu
 *
 */
public class Test2_ifDemo {
	public static void main(String[] args) {
		/*
		 *	1.����=�㷨+���ݽṹ
		 * 	2.ִ��˳��
		 * 		1)˳��ִ��
		 * 			�����main ������ʼ
		 * 		2)ѡ��ִ��
		 * 		ѡ��ṹ
		 * 			1)������� 
		 * 			�﷨�ṹ 
		 * 			��һ��:if(ѡ���Ƿ���)
		 * 			if(boolean ���ʽ){
		 * 				System.out.println();
		 *				//���boolean���ʽΪ��,��ô��ִ�д�������������
		 *				//���boolean���ʽΪ��,��ô�Ͳ�ִ�д�������������
		 * 				}
		 * 			�ڶ���:if(����ѡ��һ)
		 * 			if(boolean ���ʽ){
		 * 				System.out.println();
		 *				//���boolean���ʽΪ��,��ô��ִ�������������������
		 * 				}else{
		 *				//���boolean���ʽΪ��,��ô��ִ�������������������
		 * 				}
		 * 			2)�������
		 * 		3)ѭ��ִ��
		 */
		System.out.println("������һ������:");
		int num = new Scanner(System.in).nextInt();
		int a = num;
		System.out.println("1");
		if(a!=2){
			System.out.println("���������2");
		}else{
			System.out.println("�����2");
		}
		System.out.println("3");
		
	}
}
