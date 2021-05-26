package leetcode;
/*
 * 用数组 ASCII码作为下标, 字符下标作为值, 数组大小与字符集等大, 适用于字符集小的场景
 */
public class t3_4 {
	public int lengthOfLongestSubstring(String s){
		int n = s.length(),ans = 0;
		int [] index = new int [n];
		for (int j = 0, i = 0; j < n; j++){
			i = Math.max(index[s.charAt(j)], i);
			//如果index[s.charAt(j)]不存在,返回0.
			ans = Math.max(ans, j-i+1);
			index[s.charAt(j)] = j + 1;
			//给数组添加字符
		}
		
		return ans;
	}
}
