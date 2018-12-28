import java.util.*;

class DutchFlag { 

	public static enum Color { RED, WHITE, BLUE; }

	public static void main(String[] args) {
		List<Color> flag = new ArrayList<Color>(); 

		flag.add(Color.RED);
		flag.add(Color.WHITE);
		flag.add(Color.RED);
		flag.add(Color.BLUE);
		flag.add(Color.RED);

		dutchFlagPartition(4, flag);
		for(Color c : flag) System.out.println(c);

		System.out.println(Color.RED.ordinal());
		System.out.println(Color.WHITE.ordinal());
		System.out.println(Color.BLUE.ordinal());
	}

	public static void dutchFlagPartition(int pivotIndex, List<Color> A) { 
		Color pivot = A.get(pivotIndex);

		int smaller = 0;
		for(int i = 0; i < A.size(); i++) { 
			if(A.get(i).ordinal() < pivot.ordinal()) {
				Collections.swap(A, smaller++, i);
			}
		}

		int larger = A.size() - 1;
		for(int i = A.size()-1; i >= 0 && A.get(i).ordinal() >= pivot.ordinal(); i--) { 
			if(A.get(i).ordinal() > pivot.ordinal()) {
				Collections.swap(A, larger--, i); 
			}
		}
	}

}