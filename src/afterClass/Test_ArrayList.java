package afterClass;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Test_ArrayList {
	public static void main(String[] args) {
		/*	���Ա�	���Ϸ�����õ���
		 * 	
		 */
		ArrayList<String> alist = new ArrayList<String>();
		//����һ�� ArratList �������޶�ArrayList��Ԫ�ص���������
		//����ʹ��
		//List<String> alist = new ArrayList<String>();
		//���� ArrayList ʵ���� List �ӿڣ����� alist ���������Ϳ����� List ���ͣ�
		//new �ؼ���������ļ������п��Բ���ָ��Ԫ�ص����ͣ���Ϊ����������ͨ��ǰ��������е����ͽ��������ƶϡ�
		
		//1.��ArrayList���һ��Ԫ��
		alist.add("С�����");
		//2.��ӵ�ָ��λ��
		alist.add(1,"�������");
		//3.����ArrayList��Ԫ��
		alist.set(1,"С�����");
		//4.ɾ��ArrayList��Ԫ��
		//remove(int index) ��������ɾ��ָ���±�λ���ϵ�Ԫ�أ�
		//remove(Object o) ��������ɾ��ָ��ֵ��Ԫ�ء�
		alist.remove(1);
		alist.remove("С�����");
		//final �ؼ��� �����̳� ���ɸı�
		//5.����ArrayList��
		//���Ҫ�������һ��Ԫ�أ�����ʹ�� indexOf() ������
		//���Ҫ�������һ��Ԫ�أ�����ʹ�� lastIndexOf() ������
		alist.indexOf("С�����");
	}
}
