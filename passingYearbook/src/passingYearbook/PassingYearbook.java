package passingYearbook;

import java.util.HashMap;
import java.util.HashSet;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassingYearbook passing = new PassingYearbook();
		int[] nums1 = {2, 1};
		int[] nums2 = {1, 2};
		passing.findSignatureCounts(nums1);

	}

}
