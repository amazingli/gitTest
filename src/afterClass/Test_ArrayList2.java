package afterClass;

import java.util.Scanner;

/**
 * ������ list
 * ˳���
 * @author tedu
 *
 */
public class Test_ArrayList2 {
	public static void main(String[] args) {
		InitList aList = new InitList(5);
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=5;i++){
			int j = input.nextInt();
			System.out.println(i);
			aList.listInsert(i, j);
		}
		String s = aList.traverseList();
		System.out.println(s);
	}
}

class InitList{
	private int length=0;
	
	private int [] list;
	//���캯��
	public InitList(int max){
		this.list = new int[max];
		this.length = 0;
	}


	//���
	public void clearList(){
		this.length = 0;
	}
	//����˳�����ָ��λ��Ԫ�ص�ֵ
	public int getElem(int site){
		int ret=0;//�½����ڴ洢
		ret = this.list[site-1];
		return ret;
	}
	//����Ԫ��
	public int listInsert(int site,int value){
		//��˳�������һ����ʼ,��������һλ,ֱ��Ҫ����Ԫ�ص�λ��,Ϊ����Ԫ���ڳ��ռ�
		if (site==5){
			//5�����  һ��,������󳤶�.
			this.list[site-1]=value;
			this.length++;
			return 1;
		}
		for (int i = this.length;i>=site-1;i--){
			this.list[i+1] = this.list[i];
		}
		this.list[site-1] = value;
		this.length++;
		return 1;
	}
	//����˳���
	public String traverseList(){
		String s="";
		for (int i = 0;i<=this.length-1;i++){
			s = s+this.list[i]+".";
		}
		return s;
	}
}


