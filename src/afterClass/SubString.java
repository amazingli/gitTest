package afterClass;
/**
 * ����substring()��ι���
 * substring()����д��:substring(int beginIndex, int endIndex)
 * �÷�������һ���ַ���,����ԭ���ַ����±�� beginIndex �� endIndex-1
 * @author tedu
 *
 */
public class SubString {
	public static void main(String[] args) {
		String s ="��ĬС��,��Ȥ����Ա";
		s = s.substring(0, 4);
		/*
		 * string�±궼�Ǵ�0��ʼ
		 * JDK6��7��һ��
		 * JDK 7 �����¸���һ���ַ����飬
		 * �� JDK 6 ���ᣬ��� JDK 6 ��ִ�бȽϳ����ַ��� substring() ʱ���ܻ������ڴ�й¶�����⡣
		 * Ϊʲô��6��7���캯�������˸ı�?
		 *	�ڴ�й¶��ָ��������������ɳ���δ���ͷ��Ѿ�����ʹ�õ��ڴ档
		 *	����JDK6��substring ��ȡһС���ַ���ʱ��,��һС���ַ������õ���
		 *	�����ַ��������޷�����,һֱ���ڴ�ռ��,���׷����ڴ�й©.
		 *	6�Ľ������:s = s.substring(0,4)+"";
		 *	���Ͽ��ַ�����,�������µ��ַ�������,s��ָ���µ���֮ǰ��ͬ���ַ�������.
		 */
		System.out.println(s);
	}
}
