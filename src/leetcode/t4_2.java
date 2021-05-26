package leetcode;
/*
 * 	题目:已知两个有序数组,找到两个数组合并后返回中位数.
 *	思路:1.将奇数和偶数情况合并一下,len:合并数组的长度,不论奇数偶数都要遍历到len/2+1 次;
 *		2.返回中位数,奇数要最后一次遍历的结果,偶数要最后一次和上一次遍历的结果.
 *		用两个变量left 和 right,right保存当前循环的结果 ,在每次循环前将right赋值给left
 *		aStart,bStart指向两个数组的位置.
 *	变量:	nums:合并后的数组;
 *		nums1,nums2:有序数组1,2;
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
