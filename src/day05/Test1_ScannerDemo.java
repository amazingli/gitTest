package day05;

import java.util.Scanner;

/**
 * 
 * Scanner ����
 * @author tedu
 *
 */
public class Test1_ScannerDemo {

	public static void main(String[] args) {
		/*	1.��Ʒ���ﰸ��
		 * 	��ʾ�û����뵥��	double
		 * 	��ʾ�û���������	double
		 * 	�����ܼ�
		 * 	��ʾ�û������Ǯ���Ҽ�������
		 */
		System.out.println("��������Ʒ����:");
//		double prize = new Scanner(System.in).nextDouble();
//		double numble = new Scanner(System.in).nextDouble();
//		double totalPrize = numble * prize;
//		System.out.println("��Ʒ�ܼ���"+totalPrize);
		// ֻ��һ������
		Scanner input = new Scanner(System.in);
		double prize = input.nextDouble();
		System.out.println("��������Ʒ����:");
		double number = input.nextDouble();
		//�ж���Ʒ���ۻ��������Ƿ�Ϊ����

		double totalPrize = number * prize;
		if(number<0||prize<0){ //����۸������������һ�����Ϸ�,��ʾ�û�
			System.out.println("������,��������Ч����");
			System.exit(0);
		}else{
			System.out.println("��Ʒ����Ϊ"+number);
			System.out.println("��Ʒ����Ϊ"+prize);
			System.out.println("��Ʒ�ܼ���"+totalPrize);
		}
		//��ʾ�û�����Ǯ

		System.out.println("�������㸶��Ǯ:");
		double money = new Scanner(System.in).nextDouble();
		//��������
		//�ж��û�����Ǯ,�������.
		double change = money - totalPrize;
		if(change>0){
			System.out.println("����:"+change+"Ԫ");
		}else
		{
			System.out.println("����Ǯ��,����"+(totalPrize - money) + "Ԫ");
		}
		
		
	}

}
