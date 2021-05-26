package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * 改进思路:判断子串没有重复字符,不需要判断整个字符串有没有重复字符,只需判断多一个的字符有没有存在于旧的字符串.
 * 	如果有重复,就退出循环并i++;
 *	j同理,只要新加入的字符有重复,就退出循环并j++;
 * 结论:
 */
public class t3_2 {
	public int lengthOfLongestSubstring(String s){
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans=0, i=0, j=0;
		while (i < n && j < n){
			//时间复杂度 O(2n);
			if (!set.contains(s.charAt(j))){
				//新字符不包含 ,确认下标不是i前面
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
