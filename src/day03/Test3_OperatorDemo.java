package day03;

public class Test3_OperatorDemo {

	public static void main(String[] args) {
		//�ֱ����1234�ĸ�λʮλ��λǧλ
		int a = 1234;
//		System.out.println(a/1000);
//		System.out.println(a%1000/100);
//		System.out.println(a/10%10);
//		System.out.println(a%10);
		System.out.println("�������ǧλ��:"+a/1000);
		System.out.println("������İ�λ��:"+(a/100-a/1000*10));
		System.out.println("�������ʮλ��:"+(a/10-a/1000*100-(a/100-a/1000*10)));
		System.out.println("������ĸ�λ��:"+a%10);
	}

}
