package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * ���ظ��ַ�������Ӵ�
 * ˼·:�ҵ�һ������Ӵ�,������ѭ����������Ӵ�,Ȼ������һ�������ж��Ӵ����Ƿ����ظ��ַ�
 */
public class t3 {
	public int lengthOfLongestSubstring(String s){
		//��������Ӵ�
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
		//�ж��Ƿ����ظ��ַ�,��set:����,���������ظ�
		//hashset �� set
		Set<Character> set = new HashSet<>();
		for (int i=start; i<end; i++){//�����Ӵ���ÿһ���ַ�
			Character ch = s.charAt(i);//�����ַ�����i���ַ�;
			if(set.contains(ch)) return false;
			set.add(ch);
		}
		return true;
	}
}
