package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * 改进思路:改进i穷举方式,使得遇到重复字符(j位置字符在子串有相同)时候,i一步到位,移动到没有重复字符的位置
 * 实现方法:将set改为map,将字符存为key,对应下标存为value
 * 效果:
 * 
 */
public class t3_3 {
	public int lengthOfLongestSubstring(String s){
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>();
		for(int j = 0, i = 0; j < n; j++){
			if(map.containsKey(s.charAt(i))){
				//map(i--j)中含重复的 
				i = Math.max(map.get(s.charAt(j)), i);
				//i前移,且是一步到位的.
			}
			ans = Math.max(ans, j-i+1);
			map.put(s.charAt(j), j+1);//+1代表下一次穷举,j的位置.
		}
		return ans;
	}
}
