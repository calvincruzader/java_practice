import java.util.*;

class Test { 
	public static void main(String[] args) { 

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>(); 

		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);

		Set<Integer> s2 = s1;
		System.out.println(s2.toString());
		System.out.println(s1.toString());
	}
}