package day06;

public class Test6 {
	/*
	 * �������Ӻϼ�180ֻ,�Ź�560,�󼦶���ֻ,���Ӷ���ֻ.
	 * 
	 */
	//int i = 0;//������
	public static void main(String[] args) {
		int j = 0;//����
		for (int i = 0; i<=180 ; i++){
			j = 180 -i;
			if ((i*4+j*2)==560){
				System.out.println("���м�:"+j+"ֻ");
				System.out.println("��������:"+i+"ֻ");
			}
		}
	}
	
}
