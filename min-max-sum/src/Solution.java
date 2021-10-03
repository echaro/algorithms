import java.util.ArrayList;

public class Solution {
	public static void minMaxSum(ArrayList<Integer> arr) {
		//int stdinList[]= {1,2,3,4,5};
		ArrayList<Long> result = new ArrayList<Long>();
		Long tmpSum= 0l;
		for(int i=0;i<arr.size();i++) {
			tmpSum= 0l;
			for(int j=0;j<arr.size();j++) {
				if(i==j) {
					continue;
				}
				System.out.println(arr.get(j));
				System.out.println(tmpSum + "   tmp");
				tmpSum+=arr.get(j);
				System.out.println(tmpSum + "   tmp2");
			}
			System.out.println("--------------");
			result.add(tmpSum);
		}
		System.out.println(result);
	}
}
