package day03;

public class Test2_OperatorDemo {

	public static void main(String[] args) {
		/*	�����Լ������
		 *	++ --
		 *	1)����ʹ��:
		 *		һ������,��һ�����Ŷ�������
		 *		a++ ++a a-- --a
		 *		a=a+1   a=a-1
		 *	2)��ʹ��:
		 *		int b = ++a;
		 *		++��ǰ,�Ƚ���һ��a��ֵ+1�������ʽ
		 *		a�Լ���˵��������1
		 *		++�ں�,����һ��a��ֵ�������ʽ
		 *		a�Լ���˵������1
		 */
		int a = 1;
		++a;
		System.out.println(a);//2
		int b = ++a;
		/* 1.��������ʹ�û��Ǳ�ʹ��:��ʹ��
		 * 2.����++��ǰ�����ں�,��ǰ
		 * 
		 */
		System.out.println(a);//3
		System.out.println(b);//3
		b = a++;
		System.out.println(a);//4
		System.out.println(b);//3
	}

}
