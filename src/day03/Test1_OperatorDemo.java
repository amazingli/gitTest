package day03;

public class Test1_OperatorDemo {

	public static void main(String[] args) {

		/*
		 * 1.�����
		 * 	1)��ֵ�����
		 *  = ; ��ֵ,��������ֵ(��һ�θ�ֵ�ǳ�ʼ��)
		 * 	2)���������
		 *  + - * / %
		 *  +:�����ӷ�,ƴ��
		 *  /:�����������������������С������
		 *  %:ȡ��
		 *  3)��չ�����
		 *  += -= *= /=
		 *  4)�����Լ������ !!
		 *   a++ b--
		 *  5)��ϵ�����
		 *   ��������������Boolean���� true false
		 *  > < >= <= == !=
		 *  6)�߼������ 
		 *  ���������������ϵĹ�ϵ�����
		 *  &(����) &&(˫��):��falseΪfalse
		 *  �������һ��,����û�ж�·�߼�,˫���ɶ�·�߼�
		 *  |(����) ||(˫��):��trueΪtrue
		 *  �������һ��,����û�ж�·�߼�,˫���ж�·�߼�
		 * 	! ��: !false=true !true = false
		 * 
		 */
		int a = 1;//��ֵ
		System.out.println(1+1);//���1+1�Ľ��2 
		System.out.println(1+"1"+1);//����ַ���111,�κ��������ͺ��ַ��Ŵ����ֻ����ƴ������.
		int b=4/5;
		System.out.println(b);
		double c = 4.0/5;//С����������
		System.out.println(c);
		int d=9%8;
		System.out.println(d);
		d+=2;//d=d+2;
		System.out.println(d);
		d*=2;
		System.out.println(d);
		d/=2;
		System.out.println(d);
	}

}
