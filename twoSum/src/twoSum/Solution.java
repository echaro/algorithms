package twoSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
public int[] twoSum(int[] nums, int target) {
        
        List<Integer>result = new ArrayList<Integer>();
        int[]result2 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
         for(int j=0;j<nums.length;j++){
             if(i==j){
                 continue;
             }
            if((nums[i]+nums[j]) != target){
                continue;
            }
            if(result.contains(i)) {
            	continue;
            }
            result.add(i);
            result.add(j);
         }   
        }
        return result2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[]data = {2,7,11,15};
		sol.twoSum(data, 9);

	}

}
