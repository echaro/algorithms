package productOfArraySelf;

public class Solution {
	public static int[] productExceptSelf(int[] nums) {
		int[]result = new int[nums.length];
		int index=0;
		
		
		while(index<nums.length) {
			int tmpResult=1;
			for(int i=0;i<nums.length;i++) {
				if(index == i) {
					continue;
				}
				
				tmpResult *= nums[i];				
			}
			result[index] = tmpResult;
			index++;
			
		}
		
		return result;
	}
}
