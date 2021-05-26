package day03;

public class AboutString_2 {

	public static void main(String[] args) {
		/* 1.关于 intern
		 * 在调用”ab”.intern()方法的时候会返回”ab”，但是这个方法会首先检查字符串池中是否有”ab”这个字符串，
		 * 如果存在则返回这个字符串的引用，否则就将这个字符串添加到字符串池中，然会返回这个字符串的引用。
		 * https://www.runoob.com/java/java-string-intern.html
		 * 2.字符串比较
		 *		“==”操作符用于比较两个引用（内存中的存放地址）是否相等，它们是否是同一个对象。
		 *		equals() 用于比较两个对象的内容是否相等。
		 * 3.字符串拆分 
		 * 正则表达式
		 * https://github.com/cdoco/learn-regex-zh https://github.com/cdoco/common-regex
		 * 在使用 split() 方法的时候，就需要使用正则表达式 \\. 来替代特殊字符英文逗点“.”了。
		 * 为什么用两个反斜杠呢？因为它本身就是一个特殊字符，需要先转义。
		 * 4.字符串操作小技巧(12个)
		 *		1)字符串中获取不同的字符及其数量
		 *		2)反转字符串
		 *		3)判断字符串是前后对称
		 *		4)删除所有出现的制定字符
		 *		5)证明字符串是不可变的
		 *
		 * 5.字符串转整形
		 */
		
		//----------------------------
		//2拆分字符串
		/* 对于特殊符号
		 * 以.为例子可以用
		 * \\. 
		 * [.]
		 * Pattern.quote(".")
		 */
		String cmower="沉默的王二,一枚有趣的程序员";
		if (cmower.contains(",")){
			String [] parts = cmower.split(",");
			System.out.println("第一部分:" + parts[0] + " 第二部分:" + parts[1]);
		} else {
			throw new IllegalArgumentException("当前字符串没有包含逗号");
		}
		//------------------------------------------------
		//4字符串转整形
		//第一种，使用 Integer.valueOf(),返回包装类型Integer,可以通过自动拆箱的方式将其转为int类型
		String a = "100";
		String a2 = "-100";
		String b = "50";
		int A = Integer.valueOf(a);
		int B = Integer.valueOf(b);
		int C = A + B;
		System.out.println(C);
		//第二种,使用 Integer.parseInt()，它将返回一个基本数据类型 int
		int A2 = Integer.parseInt(a);
		int B2 = Integer.parseInt(b);
		int C2 = A2 + B2;
		System.out.println(C2);
		
		int A3 = string2int2(a2);
		int B3 = string2int2(b);
		int C3 = A3+B3;
		System.out.println(C3);
		
	}
	//第三种,数字型字符-'0',得到该字符的绝对值
	public static int string2int(String s){
		int num = 0;
		int pos = 1;
		for (int i = s.length()-1;i>=0;i--){
			num = num + (s.charAt(i) -'0') * pos;
			pos*=10;
		}
		
		return num;
	}
	//改进 使其满足负数的情况
	public static int string2int2(String s){
		boolean negatice = false;
		char firstchar = s.charAt(0);
		if (firstchar =='-'){
			negatice = true;
			s = s.substring(1);
			//substring返回坐标1开始的子字符串
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
