package leetcode;
/*
 * ������ ASCII����Ϊ�±�, �ַ��±���Ϊֵ, �����С���ַ����ȴ�, �������ַ���С�ĳ���
 */
public class t3_4 {
	public int lengthOfLongestSubstring(String s){
		int n = s.length(),ans = 0;
		int [] index = new int [n];
		for (int j = 0, i = 0; j < n; j++){
			i = Math.max(index[s.charAt(j)], i);
			//���index[s.charAt(j)]������,����0.
			ans = Math.max(ans, j-i+1);
			index[s.charAt(j)] = j + 1;
			//����������ַ�
		}
		
		return ans;
	}
}
