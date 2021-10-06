package minimunLength;

import java.util.*;

public class MinumunLength {
	
	public int minLengthSubstring(String s, String t) {
		int lenLong=s.length();
		int lenShort = t.length();
		HashMap<Character, Stack<Integer>> matches = new HashMap<>();
		int minIndex = s.length();
		int maxIndex = 0;
		for(int i=0; i<lenShort;i++) {
			Stack<Integer> matcher = new Stack<>();
			for(int j=0;j < lenLong;j++){
				if(t.charAt(i) != s.charAt(j)) {
					continue;
				}
				if(i<minIndex) {
					minIndex=i;
				}
				matcher.add(j);				
			}
			matches.put(t.charAt(i), matcher);
		}
		
		for(int i=0; i<lenShort;i++) {
			if(!matches.containsKey(t.charAt(i))) {
				return -1;
			}
			Stack<Integer> totalIndexes = matches.get(t.charAt(i));
			if(totalIndexes.size() < 1) {
				return -1;
			}
			if(maxIndex<totalIndexes.get(totalIndexes.size()-1)){
				maxIndex = totalIndexes.get(totalIndexes.size()-1);	
			}
			totalIndexes.pop();
			
		}
		return s.substring(minIndex, maxIndex).length()+1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinumunLength minim = new MinumunLength();
		String s = "bfbeadbcbcbfeaaeefcddcccbbbfaaafdbebedddf";
		String t= "cbccfafebccdccebdd";
		minim.minLengthSubstring(s, t);
	}

}
