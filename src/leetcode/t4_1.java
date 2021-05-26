package leetcode;
/*
 * 	��Ŀ:��֪������������,�ҵ���������ϲ��󷵻���λ��.
 *	˼·:1.��������ϲ�,��������ϲ�Ҳ�ǹ鲢�����һ����
 *		2.��������,ż��������λ��.
 *	����:	nums:�ϲ��������;
 *		nums1,nums2:��������1,2;
 */
public class t4_1 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2){
		int[] nums;
		int m = nums1.length;
		int n = nums2.length;
		nums = new int[m + n];
		//m=0;
		//n=0;
		if (m==0){
			if(n % 2 == 0){
				return (nums2[ n / 2 -1] + nums2[n / 2])/2.0;
			} else {
				return nums2[n / 2];
			}
		}
		if (n==0){
			if(m % 2 ==0){
				return (nums1[n / 2 -1] + nums1[n / 2])/2.0;
			} else{
				return nums1[n / 2];
			}
		}
		
		int count = 0;
		int i = 0,j = 0;
		while(count != (m+n)){
			if ( i==m ){
				//����1������,����2�Ļ�û�б�����.
				while(j != n){
					nums[count++] = nums2[j++];
				}
				break;
			}
			if ( j==n ){
				while (i != m){
					nums[count++] = nums1[i++];
				}
				break;
			}
			if (nums[i] < nums2[j]){
				nums[count++] = nums1[i++];
			} else {
				nums[count++] = nums2[j++];
			}
		}
		if (count % 2 == 0){
			return (nums[count / 2 -1] + nums[count / 2]) /2.0;
		} else {
			return nums[count / 2];
		}
		
	}
	
}
