package day04;

import java.util.Scanner;
//����java���Ѿ����ڵ���Scanner ɨ����
public class Test1 {
	//����� main  alt+/
	public static void main(String[] args) {
		/*	����:
		 *	Ҫ���û���Console�ܹ�д�����ݵ����ǳ�������
		 *	Ȼ���ٴӳ������������ȡ���Ľ��
		 * 
		 */
		System.out.println("�������������:");
		System.out.println("����������:");
		System.out.println("����������:");
		//��ʾ�û���������:�ַ�������
		
		//��ȡ�ܹ��ڿ���̨�����Ȩ
		String str2 = new Scanner(System.in).next();
		int age = new Scanner(System.in).nextInt();
		float weight = new Scanner(System.in).nextFloat();
		// �ַ��� ������      ϵͳ�����ȥ��ȡһ�� next ��ͨ���ո���� nextLine ��ȡһ�� 
		System.out.println("���������:"+str2);
		System.out.println("���������:"+age);
		System.out.println("���������:"+weight);
		System.out.println(weight==2.1);
	}
}
