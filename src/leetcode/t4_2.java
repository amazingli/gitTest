package leetcode;
/*
 * 	��Ŀ:��֪������������,�ҵ���������ϲ��󷵻���λ��.
 *	˼·:1.��������ż������ϲ�һ��,len:�ϲ�����ĳ���,��������ż����Ҫ������len/2+1 ��;
 *		2.������λ��,����Ҫ���һ�α����Ľ��,ż��Ҫ���һ�κ���һ�α����Ľ��.
 *		����������left �� right,right���浱ǰѭ���Ľ�� ,��ÿ��ѭ��ǰ��right��ֵ��left
 *		aStart,bStartָ�����������λ��.
 *	����:	nums:�ϲ��������;
 *		nums1,nums2:��������1,2;
 */
public class t4_2 {
	public double findMedianSortedArrays(int[] A, int[] B){
		int m = A.length;
		int n = B.length;
		int len = m + n;
		int left = -1, right = -1;
		int aStart = 0, bStart = 0; 
		
		for (int i = 0;i <= len / 2; i++){
			left = right;
			if (aStart < m && (bStart >= n || A[aStart] < B[bStart])){
				right = A[aStart++];
			} else {
				right = B[bStart++];
			}
		}
		if ((len & 1)==0)
			return (left + right) / 2.0;
		else
			return right;
	}

}
