package day05;

public class Test5_WhileDemo {
	public static void main(String[] args) {
		/*	ѭ���ṹ:�����������������,�����ظ���һ����
		 * 	ѭ����Ҫ��:��ʼ��,ѭ�������ı�,ѭ����
		 * 	while
		 * 		ѭ��������ʼ��;
		 * 		while(ѭ������������Ϊ��){
		 * 			ѭ����
		 * 			ѭ�������ı�
		 * 		}
		 * 	do while
		 * 	do{	//����while�������Ƿ�Ϊ�涼����ִ��һ��
		 * 
		 * 	}while(boolean���ʽΪ��)
		 * 	for
		 * 	for(��ʼ�� 1;���� 2;�ı� 3){
		 * 		ѭ���� 4
		 * 	}
		 * 
		 */
		//���1 3 5 7 9 11
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
