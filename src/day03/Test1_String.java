package day03;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test1_String {

	public static void main(String[] args) {

		/*
		 *		1)�ַ����л�ȡ��ͬ���ַ���������
		 *		2)��ת�ַ���
		 *		3)�ж��ַ�����ǰ��Գ�
		 *		4)ɾ�����г��ֵ��ƶ��ַ�
		 *		5)֤���ַ����ǲ��ɱ��
		 * 
		 */
		//1
		printDistinctCharsWithCount("itwanger");
		printDistinctCharsWithCount("chenmowanger");
	}
	private static void printDistinctCharsWithCount(String input){
		Map<Character, Integer> charsWithCountMap = new LinkedHashMap<>();
		
		for(char c:input.toCharArray()){
			Integer oldValue = charsWithCountMap.get(c);
			
			int newValue = (oldValue == null)?1:Integer.sum(oldValue, 1);
			charsWithCountMap.put(c, newValue);
			
		}
		System.out.println(charsWithCountMap);
	}

}
