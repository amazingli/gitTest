package afterClass;
/**
 * �����ַ��������ô�������
 * Java ֻ��ֵ���ݣ�û�����ô��ݡ�
 * 
 * @author tedu
 *
 */
public class Test2 {
	public static void main(String[] args) {
		String s = new String("1");
		change(s);
		System.out.println(s);
	}

	public static void change(String s){
		s="2";
	}
}
