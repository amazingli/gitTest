package afterClass;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 	课后字符串操作小技巧之1--字符串中获取不同的字符及其数量
 * @author tedu
 *
 */
public class Test_Stringskill_1 {
	public static void main(String[] args) {
		printDistinctCharsWithCount("itwanger");
		printDistinctCharsWithCount("chenmowanger");
	}
	private static void printDistinctCharsWithCount(String input){
		Map<Character, Integer> charsWithCountMap = new LinkedHashMap<>();
		//声明一个 LinkedHashMap，也可以用 HashMap，
		//不过前者可以保持字符串拆分后的顺序，结果看起来更一目了然。
		//为什么要用 Map 呢？因为 Map 的 key 是不允许重复的，刚好可以对重复的字符进行数量的累加。
		for(char c:input.toCharArray()){
			Integer oldValue = charsWithCountMap.get(c);
			
			int newValue = (oldValue == null)?1:Integer.sum(oldValue, 1);
			charsWithCountMap.put(c, newValue);
			
		}
		System.out.println(charsWithCountMap);
	}
}
