package afterClass;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList:
 * 	1.���Զ�̬�޸�,û�й̶���С����,�������ӻ���ɾ��Ԫ��.
 * 	2.ArrayList �̳���AbstractList ��ʵ����List�ӿ�.
 * @author tedu
 *
 */
public class May18_2 {
	public static void main(String[] args) {
		//��ʼ��
		ArrayList<String> sites = new ArrayList<String>();
		//ArrayList <E> objectName = new ArrayList<>();
		//E:������������,����objectName����������,ֻ��Ϊ������������
		//objectName:������
		//��ɾ�Ĳ�
		//1.����
		sites.add("baidu");
		sites.add("alibaba");
		sites.add("netease");
		System.out.println(sites);
		//2.����
		System.out.println(sites.get(2));//���ʵ�����Ԫ��
		//3.�޸�
		sites.set(2, "bytedance");
		System.out.println(sites.get(2));
		//4.����
		Collections.sort(sites);
		for(String i:sites){
			System.out.println(i);
		}
	}
}
