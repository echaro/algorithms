package stickersFacebook;

import java.util.*;

public class FacebookStickers {

	public int minStickers(String target) {
		String sticker = "facebook";
		float counter=1;
		HashMap<Character, Integer>lettersAvailable = new HashMap<Character, Integer>();
		for(int i=0;i<sticker.length();i++) {
			if(!lettersAvailable.containsKey(sticker.charAt(i))){
				lettersAvailable.put(sticker.charAt(i), 1);
			}else {
				lettersAvailable.put(sticker.charAt(i), lettersAvailable.get(sticker.charAt(i)).intValue()+1);	
			}
		}
		
		HashMap<Character, Integer>lettersToUse = new HashMap<Character, Integer>();
		for(int i=0;i<target.length();i++) {
			if(!lettersToUse.containsKey(target.charAt(i))){
				lettersToUse.put(target.charAt(i), 1);
			}else {
				lettersToUse.put(target.charAt(i), lettersToUse.get(target.charAt(i)).intValue()+1);	
			}
			
		}
		
	   Iterator<Character> hashMapKey = lettersToUse.keySet().iterator();
       while(hashMapKey.hasNext()){
           Character key = hashMapKey.next();
           
           if(lettersToUse.get(key).intValue()<=lettersAvailable.get(key).intValue()) {
        	   continue;
           }
           if(counter >  lettersToUse.get(key).intValue() - lettersAvailable.get(key).intValue()) {
        	   continue;
           }
           counter = lettersToUse.get(key).floatValue() / lettersAvailable.get(key).floatValue();
       }
	    
		return Math.round(counter);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FacebookStickers stickers = new FacebookStickers();
		stickers.minStickers("feeboooook");
	}

}
