package day05;
/**
 * ��Ŀ�����
 * @author tedu
 *
 */
public class Test4_OperatorDemo {
	public static void main(String[] args) {
	/*	��Ŀ�����,���������
	 * 	�﷨:
	 * 		�������� ������= boolean ���ʽ? ���ʽ1 : ���ʽ2;
	 * 		1)���ʽ1�ͱ��ʽ2����ͳһ.
	 * 		2)��������ʽ�������ʽ�������
	 * 		3)boolean���ʽ���Ϊ�� ���ܵ�����Ϊ���ʽ1 ������
	 * 		  			   ���Ϊ�� ���ܵ�����Ϊ���ʽ2 ������
	 * 
	 */
		double a = 2>3?4:5.5;
		System.out.println(a);
		String str = 2>3?"2>3Ϊ��":"2>3Ϊ��";
		System.out.println(str);
		int num = 2;
		String str2 = num == 2 ? "�������2" :"���������2";
		System.out.println(str2);
	}
}
