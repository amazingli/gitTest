package day02;
public class AboutString {

	public static void main(String[] args) {
		/*�����ַ���
		 *	1.˫�����ַ����� new �ַ�������
		 *		˫�����ַ���
		 *		String str1="abc";
		 *		�����Ȳ鿴�ַ��������Ƿ�����ַ���"abc"��
		 *		���������ֱ�ӽ�"abc"����str�������������������ַ��������½�һ���ַ���"abc"��
		 *		Ȼ���ٽ��丳��str�����ִ�д���
		 *		new �ַ�������
		 *		String str=new String("abc");
		 *		�����ַ���������û��"abc"�����ڶ����½�һ���ַ������� Ȼ���丳��str���á�
		 * 	2.Java�ַ����ǲ��ɱ��
		 *		 ��:���ڴ������洢 Java �еĶ��������ǳ�Ա�������ֲ����������������������ָ��Ķ��󶼴洢�ڶ��ڴ���	
		 *		 �ַ���������: Java ����������洢�ַ�����һ����������������ַ����ǲ��ɱ�ģ�
		 *		��� Java ������������ַ�����������ֻΪͬһ���ַ����洢һ���ַ�����������ʡ�ռ䡣
		 *		���Կ����������������.
		 *	3.String��StringBuilder �� StringBuffer ֮�������
		 *		String:���ɱ�Ķ���, �����ÿ�ζ� String ���ͽ��иı��ʱ����ʵ����ͬ��������һ���µ� String ����
		 *			Ȼ��ָ��ָ���µ� String ����.
		 *		StringBuilder:ÿ�ν������� StringBuffer ��������в���.
		 * 		StringBuffer:���� StringBuffer ��һ�������滻�������ַ����������������߳�ʹ�õ�ʱ������������ձ飩.
		 * 	4.�ַ���ƴ�ӵļ��ַ�ʽ
		 * 		1)ʹ��"+",
		 * 		��ʵ��ԭ����ʹ��StringBuilder.append.
		 * 		2)concat,��String�Դ�����
		 * 		��ԭ����δ������ȴ�����һ���ַ����飬�����������ַ����ʹ�ƴ���ַ����ĳ���֮�ͣ�
		 * 		�ٰ������ַ�����ֵ���Ƶ��µ��ַ������У���ʹ������ַ����鴴��һ���µ�String���󲢷��ء�
		 *		������C����
		 *		3)ʹ��StringBuilder��StringBuffer��append����ƴ��
		 *		append��ֱ�ӿ����ַ����ڲ����ַ������У�����ַ����鳤�Ȳ������������չ��
		 *		StringBuffer��StringBuilder���ƣ������������StringBuffer���̰߳�ȫ��
		 *		4)ʹ��join����ƴ��
		 * 		�ܽ�:StringBuilder<StringBuffer<concat<+<StringUtils.join
		 * 		ѭ�����ڣ��ַ��������ӷ�ʽ��ʹ�� StringBuilder �� append ����������չ������Ҫʹ��+��
		 * 	5.�ַ���������
		 * 		�����ڶ��ڴ���.��ϸ����1
		 * 		
		 */
		//4.1
		String s1 = "abc";
		s1 = s1 + "y";
		System.out.println(s1);
		//4.2
		String s2 = "abc";
		s2 = s2.concat("y");
		System.out.println(s2);
		//4.3
		StringBuilder s3 = new StringBuilder("abc");
		s3.append("def").append("y");
		System.out.println(s3.toString());
		//4.4
//		String s4 = "abc";
//		s4 = StringUtils.join(s4,'y');
//		System.out.println(s4.toString());
	}

}
