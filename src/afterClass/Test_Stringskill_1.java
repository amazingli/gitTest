package afterClass;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 	�κ��ַ�������С����֮1--�ַ����л�ȡ��ͬ���ַ���������
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
		//����һ�� LinkedHashMap��Ҳ������ HashMap��
		//����ǰ�߿��Ա����ַ�����ֺ��˳�򣬽����������һĿ��Ȼ��
		//ΪʲôҪ�� Map �أ���Ϊ Map �� key �ǲ������ظ��ģ��պÿ��Զ��ظ����ַ������������ۼӡ�
		for(char c:input.toCharArray()){
			Integer oldValue = charsWithCountMap.get(c);
			
			int newValue = (oldValue == null)?1:Integer.sum(oldValue, 1);
			charsWithCountMap.put(c, newValue);
			
		}
		System.out.println(charsWithCountMap);
	}
}
