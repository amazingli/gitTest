package afterClass;

import java.util.ArrayList;

/**
 * ArrayListԴ������
 * @author tedu
 *
 */
public class May18_3 {
	public static void main(String[] args) {
		//����ArrayList
		ArrayList<String> alist =new ArrayList<>();
		//����д��:
		//List<String> alist = new ArrayList<>();
		//ArrayList ʵ����List�Ľӿ�,����alist�ı������Ϳ�����List����.
		//new �ؼ���������ļ����ſ��Բ�ָ��Ԫ������,�����������ǰ���Ԫ�������ƶ�
		//���Ԫ��add()
		alist.add("yi");
		//Դ��ؼ�:�ռ䲻�������Ԫ��ʱ�����grow()����������
		alist.add(0, "er");
		//���Ԫ�ص��ض�λ��
		//Դ��ؼ�:����system.arraycopy������������һ��
		//����Ԫ��set()
		
	}
}
