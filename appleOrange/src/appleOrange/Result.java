package appleOrange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Result {

	public static void main(String[] args) {
		/**
		 * 7 11
5 15
3 2
-2 2 1
5 -6
	
	
	-3
-2
10
20
-30
		 * 
		 * */
		int apples[]= {-3,-2,10,20,-30};
		ArrayList<Integer> arrApples = (ArrayList<Integer>) Arrays.stream(apples).boxed().collect(Collectors.toList());
		Solution.countApplesAndOranges(arrApples);
		/*int oranges[]= {1};
		ArrayList<Integer> arrApples = (ArrayList<Integer>) Arrays.stream(apples).boxed().collect(Collectors.toList());
		ArrayList<Integer> arrOranges = (ArrayList<Integer>) Arrays.stream(oranges).boxed().collect(Collectors.toList());
		Solution.countApplesAndOranges(2, 3, 1, 5, arrApples, arrOranges);*/
		// TODO Auto-generated method stub

	}

}
