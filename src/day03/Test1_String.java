package day03;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test1_String {

	public static void main(String[] args) {

		/*
		 *		1)字符串中获取不同的字符及其数量
		 *		2)反转字符串
		 *		3)判断字符串是前后对称
		 *		4)删除所有出现的制定字符
		 *		5)证明字符串是不可变的
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
