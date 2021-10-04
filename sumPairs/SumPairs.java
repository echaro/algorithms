import java.util.HashMap;

public class SumPairs{

    public int numberOfWays(int[] arr, int k) {
    // Write your code here
    	if(arr == null || arr.length <= 0) {
    		return 0;
    	}
    	HashMap<String, Integer> pairs = new HashMap<String, Integer>();
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0; j<arr.length;j++) {
    			if(i==j) {
    				continue;
    			}
    			int sum=arr[i]+arr[j];
    			if(sum == k) {
    				if(pairs.containsKey(i+""+j) || pairs.containsKey(j+""+i)) {
    					continue;
    				}
    				pairs.put(i+""+j, j);
    			}
    		}
    		
    	}
	return pairs.size();
    
  }
}