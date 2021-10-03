import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Result {
	public static void main(String args[]) {
		int stdinList[]= {256741038,623958417,467905213,714532089,938071625};
		ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.stream(stdinList).boxed().collect(Collectors.toList());
		Solution.minMaxSum(arr);
	}
}
