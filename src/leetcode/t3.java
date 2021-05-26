package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * 无重复字符的最大子串
 * 思路:找到一个最长的子串,用两个循环穷举所有子串,然后再用一个函数判断子串中是否有重复字符
 */
public class t3 {
	public int lengthOfLongestSubstring(String s){
		//穷举所有子串
		int n = s.length();
		int ans = 0;
		for (int i=0; i<n; i++){
			for (int j=i+1; j<=n; j++)
				if (allUnipue(s, i, j))
					ans=Math.max(ans, j-i);
		}
		return ans;
	}
	public boolean allUnipue(String s,int start,int end){
		//判断是否有重复字符,用set:无序,不允许有重复
		//hashset 与 set
		Set<Character> set = new HashSet<>();
		for (int i=start; i<end; i++){//遍历子串的每一个字符
			Character ch = s.charAt(i);//返回字符串第i个字符;
			if(set.contains(ch)) return false;
			set.add(ch);
		}
		return true;
	}
}
