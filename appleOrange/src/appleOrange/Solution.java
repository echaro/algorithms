package appleOrange;

import java.util.List;

public class Solution {

	public static int countApplesAndOranges(List<Integer> arr) {
		    // Write your code here
/**
 * s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree.
 * */  if(arr.size() == 1){
     return 0;
 }
 
int totalSum = 0;
int sum = 0;
int result = 0;
int arrSize = arr.size();
for(int i=0; i<arrSize;i++){
 totalSum += arr.get(i);
 
}

for(int i=0;i<arrSize -1; i++){
 sum += arr.get(i);
 if(sum == totalSum /2) 
 result++;
}
System.out.println(result);
 return result;
		
		
	}
}
