package birthdayCandles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
 public static int getBirthdayCandles(ArrayList<Integer> arr) {
	 Map<Integer, Integer>result = new HashMap<Integer, Integer>();
	 int count=1;
	 for(int i=0;i<arr.size();i++) {
		 if(result.containsKey(arr.get(i))) {
			 int tmpCount = result.get(arr.get(i).intValue());
			 tmpCount++;
			 result.put(arr.get(i), tmpCount);
			 continue;
		 }
		 count=1;
		 result.put(arr.get(i), count);
	 }
	 return Collections.max(result.values());
 }
}
