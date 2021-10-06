package phoneNumberMatch;

import java.util.*;

public class PhoneNumberMatch {
	
	public List<String> matchPhone (String digits){
		   // Resultant list
        List<String> combinations = new ArrayList<>();
        // Base condition
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        // Mappings of letters and numbers
        HashMap<Integer, String> lettersAndNumbersMappings = new HashMap<>();
        
        lettersAndNumbersMappings.put(1,"abc");
        lettersAndNumbersMappings.put(2,"def");
        lettersAndNumbersMappings.put(3,"ghi");
        lettersAndNumbersMappings.put(4,"jkl");
        lettersAndNumbersMappings.put(5,"mno");
        lettersAndNumbersMappings.put(6,"pqrs");
        lettersAndNumbersMappings.put(7,"tuv");
        lettersAndNumbersMappings.put(8,"xyz");
        findCombinations(combinations, digits, new StringBuilder(), 0, lettersAndNumbersMappings);
        return combinations;
	}

	private static void findCombinations(List<String> combinations, String digits, StringBuilder previous, int index, HashMap<Integer, String> lettersAndNumbersMappings) {
        // Base condition for recursion to stop
        if (index == digits.length()) {
            combinations.add(previous.toString());
            return;
        }
        // Get the letters corresponding to the current index of digits string
        String letters = lettersAndNumbersMappings.get(digits.charAt(index) - '0');
        // Loop through all the characters in the current combination of letters
        for (char c : letters.toCharArray()) {
            findCombinations(combinations, digits, previous.append(c), index + 1, lettersAndNumbersMappings);
            previous.deleteCharAt(previous.length() - 1);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneNumberMatch numberMatch = new PhoneNumberMatch();
		numberMatch.matchPhone("12");

	}

}
