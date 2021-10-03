package ratios;

import java.util.List;

public class Solution {

	public static void getRatios(List<Integer> arr){

		float size = arr.size();
		float positives=0;
		float negatives=0;
		float neutro=0;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>0) {
				positives++;
				continue;
			}
			if(arr.get(i)<0) {
				negatives++;
				continue;
			}
			neutro++;
		}
		System.out.println(positives/size);
		System.out.println(negatives/size);
		System.out.println(neutro/size);
	}
}
