package gradingStudents;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void getResult(List<Integer> grades){
		
		List<Integer> gradedGrades = new ArrayList<Integer>();
		for(int i = 0; i<grades.size();i++) {
			Integer grade = grades.get(i);
			System.out.println(grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5)));
			gradedGrades.add(grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5)));
		}
			
		
	}
}
