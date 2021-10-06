package matchingPairs;

import java.util.HashMap;
import java.util.Map;

public class MatchingPairs {

	public int matchingPairs(String s, String t) {
		int len = t.length();
	    int same = 0;
	    Map<Integer,Character> sno = new HashMap();
	    Map<Character,Integer> tno = new HashMap();
	    for(int i=0;i < len;i++){
	      if(s.charAt(i)==t.charAt(i)){
	        same++;
	      }else {
	        sno.put(i,s.charAt(i));
	        tno.put(t.charAt(i),i);
	      }
	    }  
	    boolean common = false;
	    for(int index : sno.keySet()){
	      char c = sno.get(index);      
	      if(tno.containsKey(c)){
	          common = true;
	          int swapindex = tno.get(c);
	          if(s.charAt(swapindex) == t.charAt(index)){
	            return same + 4;    
	          }
	      }
	    }
	    int result = common ? same +1 : Math.max(0,same -2); 
	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefghijk";
				String t = "kbciefghdja";
		MatchingPairs match = new MatchingPairs();
		match.matchingPairs(s, t);
		
	}

}
