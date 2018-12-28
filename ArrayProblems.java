import java.util.*;	

class ArrayProblems {
	
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>(); 
		num.add(9); num.add(9); num.add(6);

		System.out.println(num.toString());
		incrementArrayInteger(num);
		System.out.println(num.toString());
	}

	public static void incrementArrayInteger(List<Integer> num) { 
		int newNum = num.get(num.size()-1) + 1;
		if(newNum > 9) { 
			num.set(num.size()-1, 0);
			int rollingIdx = num.size()-2;
			while(rollingIdx >= 0 && num.get(rollingIdx) + 1 > 9) {  	
				num.set(rollingIdx, 0); // as you keep running into 9s, set them all to 0s
				rollingIdx--;
			}
			if(rollingIdx < 0) { num.add(0, 1); }  // add to the left of the arrayList
			else { num.set(rollingIdx, num.get(rollingIdx)+1); } // set new num at that idx 
		} else { 
			num.set(num.size()-1, newNum); // easy case
		}
	}
}