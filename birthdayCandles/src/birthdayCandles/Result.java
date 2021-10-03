package birthdayCandles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Result {

	public static void main(String args[]) {
		int stdinList[]= {3,2,1,3,4,4,4,3,5,4};
		ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.stream(stdinList).boxed().collect(Collectors.toList());
		Solution.getBirthdayCandles(arr);
	}
}
