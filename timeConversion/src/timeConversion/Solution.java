package timeConversion;

public class Solution {

	public static void getTimeConversion(String time) {
		String tmpHour = time.substring(0, 2);
		String tmpMilitaryTime = time.substring(time.length()-2, time.length());
		
		String tmpNewHour = time.substring(2, time.length()-2);
		int tmpFinalHour = Integer.parseInt(tmpHour);
		if(tmpMilitaryTime.equalsIgnoreCase("PM")) {
			
			if(tmpFinalHour < 12) {
				tmpFinalHour+=12;
			}
			
			String finalTime = tmpFinalHour + "" + tmpNewHour;
			System.out.println(finalTime);
			return;
		}
		if(tmpFinalHour == 12) {
			String finalTime = "00" + "" + tmpNewHour;
			System.out.println(finalTime);
			return;
		}
		tmpNewHour = time.substring(0, time.length()-2);
		System.out.println(tmpNewHour);
				
	}
	
}
