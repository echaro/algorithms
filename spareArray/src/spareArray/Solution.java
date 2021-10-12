package spareArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    List<Integer>result = new ArrayList<Integer>();
    
    
    HashMap<String, Integer>tmpR = new HashMap<String, Integer>();
    for(int i=0;i<strings.size();i++){
    	int tmpV=0;
    	if(tmpR.containsKey(strings.get(i))) {
    		tmpV=tmpR.get(strings.get(i));
    	}
    			
    	tmpR.put(strings.get(i), tmpV+1);
    }
    for(int j=0;j<queries.size();j++){
    	if(!tmpR.containsKey(queries.get(j))) {
    		 result.add(0);
    		continue;
    	}
    	int count = tmpR.get(queries.get(j));
        result.add(count);
    }
        
    return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        /*
         * 4
aba
baba
aba
xzxb
3
aba
xzxb
ab*/
    	
    	List<String> strings = new ArrayList<String>();
    	strings.add("aba");
    	strings.add("baba");
    	strings.add("aba");
    	strings.add("xzxb");
    	
    	
    	List<String> queries = new ArrayList<String>();
    	queries.add("aba");
    	queries.add("xzxb");
    	queries.add("ab");
    	
        List<Integer> res = Result.matchingStrings(strings, queries);

       
    }
}
