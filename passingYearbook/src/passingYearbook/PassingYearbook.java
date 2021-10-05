package passingYearbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PassingYearbook {

	public int[] findSignatureCounts(int[] arr) {
		int[] res = new int[arr.length];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i+1);
		}
		Set<Integer> visited = new HashSet<>();
		for(int k : map.keySet()) {
			if(!visited.contains(k)) {
				Set<Integer> round = new HashSet<>();
				while(!visited.contains(k)) {
					round.add(k);
					visited.add(k);
					k = map.get(k);
				}
				for(int i : round) {
					res[i-1] = round.size();
				}
			}
		}
		return res;
	}
	
	public int[] findSignatureCounts2(int[] arr) {
	    int[] result = new int[arr.length];
	    List<LinkedHashSet<Integer>> loops = new ArrayList<LinkedHashSet<Integer>>();

	    Arrays.fill(result, 0);
	    for (int i = 0; i < arr.length; i++) {
	        for(LinkedHashSet<Integer> loop : loops) {
	            if(loop.contains(arr[i])) {
	                result[i]=loop.size();
	                break;
	            }
	        }
	    
	        if(result[i]==0) {
	            LinkedHashSet<Integer> loop = new LinkedHashSet<Integer>();
	            loop.add(arr[i]);
	            int index = arr[i] - 1;
	            while (index != i) {
	                loop.add(arr[index]);
	                index = arr[index] - 1;
	            }
	            result[i] = loop.size();
	        }
	    }
	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassingYearbook passing = new PassingYearbook();
		int[] nums1 = {5,3,9,4,1,8,6,2,7};
		passing.findSignatureCounts2(nums1);

	}

}
