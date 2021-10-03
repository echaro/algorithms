package gradingStudents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Result {

	public static void main(String args[]) {
		int stdinList[]= {73,67,38,33};
		List<Integer> arr = (ArrayList<Integer>) Arrays.stream(stdinList).boxed().collect(Collectors.toList());
		Solution.getResult(arr);
	}
}
