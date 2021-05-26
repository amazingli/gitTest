package afterClass;

public class May19_1 {
	public static void main(String[] args) {
		int[] a={0 ,1 ,3 ,5};
		int[] b;
		int target=8;
		b = twoSum(a,target);
		for(int i:b){
			System.out.print(i+" ");
		}
	}
	public static int[] twoSum(int[] nums, int target){
		int []ans=new int[2];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				if(nums[i]+nums[j]==target){
					ans[0]=i;
					ans[1]=j;
					return ans;
				}
			}
		}
		return ans;
	}
}
