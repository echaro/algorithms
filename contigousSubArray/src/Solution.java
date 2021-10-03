import java.util.Arrays;
import java.util.Stack;

public class Solution {
	/**
	 * this solution uses stacks, but takes more time 
	 * */
	public static int[] countSubarrays2(int[] arr) {
	    // Write your code here
		//arr = [3, 4, 1, 6, 1,2]
		Stack<Integer> s = new Stack<>();
        int[] L = new int[arr.length];
        L[0] = 1;
        s.push(0);
        for(int i = 1; i < arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
            	s.pop();
            }
            if(s.isEmpty()) {
            	L[i] = i + 1;
            }
            else {
            	L[i] = i - s.peek();
            }
            s.push(i);
        }
        int[] R = new int[arr.length];
        R[arr.length - 1] = L[arr.length - 1];
        s.clear();
        s.push(arr.length - 1);
        for(int i = arr.length - 2; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
            	s.pop();
            }
            if(s.isEmpty()) {
            	R[i] = (arr.length - i) + L[i] - 1;
            }
            else {
            	R[i] = (s.peek() - i) + L[i] - 1;
            }
            s.push(i);
        }
        return R;
	  }
	
	/**
	 * this solution is simplier
	 * */
	public static int[] countSubarrays(int[] arr) {
	    if (arr == null || arr.length <= 0) {
	        return new int[0];
	    }
	    int[] res = new int[arr.length];
	    Arrays.fill(res, 1);
	    for (int i = 0; i < arr.length; i++) {
	        res[i] += countSubarrays(arr, i, 1);
	        res[i] += countSubarrays(arr, i, -1);
	    }
	    return res;
	}

	private static int countSubarrays(int[] a, int i, int step) {
	    int s = 0;
	    int m = a[i];
	    i += step;
	    while (i >= 0 && i < a.length) {
	        if (a[i] < m) {
	            s++;
	        } else {
	            break;
	        }
	        i += step;
	    }
	    return s;
	}
}
