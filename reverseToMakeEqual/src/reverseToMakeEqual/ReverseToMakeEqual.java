package reverseToMakeEqual;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;

public class ReverseToMakeEqual {

	
	public boolean areTheyEqual2(int[] array_a, int[] array_b) {
		Instant start_time = Instant.now();
		Arrays.sort(array_a);
		Arrays.sort(array_b);
		boolean result= Arrays.equals(array_a, array_b);
		Instant end_time = Instant.now();
		System.out.println(start_time + "  "  +end_time);
		return result;
		
	}
	/**
	 * this one is faster
	 * */
	public boolean areTheyEqual(int[] array_a, int[] array_b) {
		Instant start_time = Instant.now();
		HashMap<Integer, Integer> _map = new HashMap<Integer, Integer>();
		for(int i : array_a) {
			int count = _map.getOrDefault(i, 0);
			_map.put(i, count+1);
		}
		for(int j : array_b) {
			if(_map.containsKey(j) && _map.get(j)>0) {
				_map.put(j, _map.get(j)-1);
			}else {
				return false;
			}
			
		}
		Instant end_time = Instant.now();
		System.out.println(start_time + "  "  +end_time);
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a = {1, 2, 3, 4};
		int []b = {1, 4, 3, 2};
		ReverseToMakeEqual reverse = new ReverseToMakeEqual();
		reverse.areTheyEqual(a, b);
	}

}
