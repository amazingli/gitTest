package day03;

public class AboutString_2 {

	public static void main(String[] args) {
		/* 1.���� intern
		 * �ڵ��á�ab��.intern()������ʱ��᷵�ء�ab��������������������ȼ���ַ��������Ƿ��С�ab������ַ�����
		 * ��������򷵻�����ַ��������ã�����ͽ�����ַ�����ӵ��ַ������У�Ȼ�᷵������ַ��������á�
		 * https://www.runoob.com/java/java-string-intern.html
		 * 2.�ַ����Ƚ�
		 *		��==�����������ڱȽ��������ã��ڴ��еĴ�ŵ�ַ���Ƿ���ȣ������Ƿ���ͬһ������
		 *		equals() ���ڱȽ���������������Ƿ���ȡ�
		 * 3.�ַ������ 
		 * ������ʽ
		 * https://github.com/cdoco/learn-regex-zh https://github.com/cdoco/common-regex
		 * ��ʹ�� split() ������ʱ�򣬾���Ҫʹ��������ʽ \\. ����������ַ�Ӣ�Ķ��㡰.���ˡ�
		 * Ϊʲô��������б���أ���Ϊ���������һ�������ַ�����Ҫ��ת�塣
		 * 4.�ַ�������С����(12��)
		 *		1)�ַ����л�ȡ��ͬ���ַ���������
		 *		2)��ת�ַ���
		 *		3)�ж��ַ�����ǰ��Գ�
		 *		4)ɾ�����г��ֵ��ƶ��ַ�
		 *		5)֤���ַ����ǲ��ɱ��
		 *
		 * 5.�ַ���ת����
		 */
		
		//----------------------------
		//2����ַ���
		/* �����������
		 * ��.Ϊ���ӿ�����
		 * \\. 
		 * [.]
		 * Pattern.quote(".")
		 */
		String cmower="��Ĭ������,һö��Ȥ�ĳ���Ա";
		if (cmower.contains(",")){
			String [] parts = cmower.split(",");
			System.out.println("��һ����:" + parts[0] + " �ڶ�����:" + parts[1]);
		} else {
			throw new IllegalArgumentException("��ǰ�ַ���û�а�������");
		}
		//------------------------------------------------
		//4�ַ���ת����
		//��һ�֣�ʹ�� Integer.valueOf(),���ذ�װ����Integer,����ͨ���Զ�����ķ�ʽ����תΪint����
		String a = "100";
		String a2 = "-100";
		String b = "50";
		int A = Integer.valueOf(a);
		int B = Integer.valueOf(b);
		int C = A + B;
		System.out.println(C);
		//�ڶ���,ʹ�� Integer.parseInt()����������һ�������������� int
		int A2 = Integer.parseInt(a);
		int B2 = Integer.parseInt(b);
		int C2 = A2 + B2;
		System.out.println(C2);
		
		int A3 = string2int2(a2);
		int B3 = string2int2(b);
		int C3 = A3+B3;
		System.out.println(C3);
		
	}
	//������,�������ַ�-'0',�õ����ַ��ľ���ֵ
	public static int string2int(String s){
		int num = 0;
		int pos = 1;
		for (int i = s.length()-1;i>=0;i--){
			num = num + (s.charAt(i) -'0') * pos;
			pos*=10;
		}
		
		return num;
	}
	//�Ľ� ʹ�����㸺�������
	public static int string2int2(String s){
		boolean negatice = false;
		char firstchar = s.charAt(0);
		if (firstchar =='-'){
			negatice = true;
			s = s.substring(1);
			//substring��������1��ʼ�����ַ���
		}
		int num = 0;
		int pos = 1;
		for (int i=s.length()-1;i>=0;i--){
			num = num +(s.charAt(i)-'0') *pos;
			pos = pos * 10;
		}
		return negatice? -num : num;
	}

}
