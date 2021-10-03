package ratios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Result {

	public static void main(String args[]) {
		int stdinList[]= {-4, 3, -9, 0, 4, 1};
		ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.stream(stdinList).boxed().collect(Collectors.toList());

		Solution.getRatios(arr);
	}
	
}
