package day06;

public class Test8 {
	public static void main(String[] args) {
		/*
		 *  һ�ٿ���һ�ټ�
		 *  ���� 5
		 *  ĸ�� 3
		 *  С�� 1 ��ֻ
		 *  �м�����
		 */
		int s = 0;//��
		
		for(int i=0;i<=20;i++){
			//���� i ���20ֻ
			for(int j=0;j<=34;j++){
				//ĸ�� j ���34ֻ
				int k =0;
				//kֻС��
				k = 100-j-i;
				if (k%3==0&&(5*i+3*j+k/3.0==100)){
					s=s+1;
					System.out.println("��"+s+"��:");
					System.out.println("�򹫼�"+i+"ֻ,ĸ��"+j+"ֻ,С��"+k+"ֻ");
				}
			}
		}
		
		//���۸�,�����
		System.out.println("��"+s+"��.");
	}
}
