import java.util.Arrays;

public class Solution {

	public static void sortedSquaredArray(int [] arr){
		int[]result = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			result[i]=arr[i] * arr[i];
		}
Arrays.sort(result);
		
		  for(int re : result) { System.out.println(re); }
		 
	}
}
