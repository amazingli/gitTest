package day06;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 99�˷��ھ���
		 */
		for(int i = 1;i<=9;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(i +"*"+j+"="+(i*j));
				System.out.print("\t");
				//"\t"ת���ַ��ո� tab
			}
			System.out.println();
		}
	}

}
