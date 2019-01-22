import java.util.*;

class DailyCodingProblems { 

	public static void main(String[] args) { 
		DailyCodingProblem2 dcp2 = new DailyCodingProblem2();

		int[] inputDcp2 = new int[6];
		for(int i = 0; i < inputDcp2.length; i++) { 
			inputDcp2[i] = i+1;
		}

		int[] outputDcp2 = dcp2.products(inputDcp2);
		System.out.println(Arrays.toString(outputDcp2));
	}
}