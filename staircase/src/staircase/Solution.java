package staircase;

public class Solution {

	public static void getStairs(int n) {
		for(int i=0;i<n;i++) {
			System.out.println(new String(new char[n-i]).replace("\0", " ") + new String(new char[i]).replace("\0", "#"));
			
		}
	}
}
