package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * �Ľ�˼·:�Ľ�i��ٷ�ʽ,ʹ�������ظ��ַ�(jλ���ַ����Ӵ�����ͬ)ʱ��,iһ����λ,�ƶ���û���ظ��ַ���λ��
 * ʵ�ַ���:��set��Ϊmap,���ַ���Ϊkey,��Ӧ�±��Ϊvalue
 * Ч��:
 * 
 */
public class t3_3 {
	public int lengthOfLongestSubstring(String s){
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>();
		for(int j = 0, i = 0; j < n; j++){
			if(map.containsKey(s.charAt(i))){
				//map(i--j)�к��ظ��� 
				i = Math.max(map.get(s.charAt(j)), i);
				//iǰ��,����һ����λ��.
			}
			ans = Math.max(ans, j-i+1);
			map.put(s.charAt(j), j+1);//+1������һ�����,j��λ��.
		}
		return ans;
	}
}
