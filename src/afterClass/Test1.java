package afterClass;

import java.util.UUID;

/**
 * ����UUID
 * ʹ�ó���:������ɵ��ļ�����
 * Java Web Ӧ�ó���� sessionID��
 * ���ݿ���������
 * ���� ID��UUID �����㷨�ǳ���Ч��ÿ̨�����ÿ��ߴ� 1000 ��Σ���
 * 
 * @author tedu
 *
 */
public class Test1 {
	public static void main(String[] args) {
		//�������UUID�ķ�ʽ
		UUID uuid4 = UUID.randomUUID();
		int version4 = uuid4.version();
		System.out.println("UUID:"+uuid4+"  �汾:"+version4);
	}
}
