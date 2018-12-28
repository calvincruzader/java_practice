import java.util.*;

class DP { 

	public static void main(String[] args) {
		int value = 888;
		System.out.println("The number of ways to climb " + value + " steps is: " + climbStairs(value));
	}

	// How many ways can someone climb stairs if they can take 1 or 2 steps?
	public static int climbStairs(int n) { 
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 

		return climbStairsHelper(n, hm);
	}

	public static int climbStairsHelper(int n, HashMap<Integer,Integer> hm) { 
		if(n == 0) return 1;
		if(n < 0) return 0; 
		if(hm.keySet().contains(n)) return hm.get(n);

		hm.put(n, climbStairsHelper(n-1, hm) + climbStairsHelper(n-2, hm));
		return hm.get(n);
	}
}