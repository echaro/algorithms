

public class Solution {
	static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	static String digits = "0123456789";
	
	public static String rotationCipher2(String input, int shift) {
		int shiftResult = 0;
		String tmpResult = "";
		for(int i=0;i<input.length();i++) {
			
			char originalLetter = input.charAt(i);
			char replacedCharacter = originalLetter;
			if(Character.isLetter(originalLetter)) {
				int index = alphabet.indexOf(Character.toString(originalLetter).toLowerCase(), 0) + shift;
				shiftResult = checkShift(index, alphabet.length());
				replacedCharacter = alphabet.charAt(shiftResult);
				if(Character.isUpperCase(originalLetter)) {
					replacedCharacter = Character.toUpperCase(replacedCharacter);
				}	
			}
			if(Character.isDigit(originalLetter)) {
				int index = digits.indexOf(Character.toString(originalLetter).toLowerCase(), 0) + shift;
				shiftResult = checkShift(index, digits.length());
				replacedCharacter = digits.charAt(shiftResult);				
			}
			
			tmpResult += replacedCharacter;
		}
		return tmpResult;
	}
	public static String rotationalCipher(String input, int level) {
		String result = "";
		char[] chars = input.toCharArray();
		for(char c : chars) {
			
			if(Character.isLetter(c)) {
				
				int i = findPosition(c);
				i=checkShift(i+level, 26);
				c=(char)i;
				c+=-23;
				System.out.println((int)c);
			 	
			}
			if(Character.isDigit(c)) {
				c+=level;
			}
			
			result += c;
			
		}
		
		return result;
	}
	
	public static int checkShift(int shift, int length) {
		
		if(shift > length) {
			shift = shift % length;
		}
		return shift;
	}
	
	public static int findPosition(char letter) {
		char inputLetterToLowerCaser = Character.toLowerCase(letter);
		int ascciV = (int)inputLetterToLowerCaser;
		int position = ascciV-96;
		
		return position;
	}
}
