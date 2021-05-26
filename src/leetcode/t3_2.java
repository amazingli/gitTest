package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * �Ľ�˼·:�ж��Ӵ�û���ظ��ַ�,����Ҫ�ж������ַ�����û���ظ��ַ�,ֻ���ж϶�һ�����ַ���û�д����ھɵ��ַ���.
 * 	������ظ�,���˳�ѭ����i++;
 *	jͬ��,ֻҪ�¼�����ַ����ظ�,���˳�ѭ����j++;
 * ����:
 */
public class t3_2 {
	public int lengthOfLongestSubstring(String s){
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans=0, i=0, j=0;
		while (i < n && j < n){
			//ʱ�临�Ӷ� O(2n);
			if (!set.contains(s.charAt(j))){
				//���ַ������� ,ȷ���±겻��iǰ��
				set.add(s.charAt(j));
				j++;
				ans = Math.max(ans, j-i);
			}
			set.remove(s.charAt(i));
			i++;
		}
		return ans;
	}
}	
