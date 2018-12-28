import java.util.*; 

class DataStructuresOps { 
	public static void main(String[] args){ 
		DataStructures ds = new DataStructures();
		Set<Integer> mySet = ds.turnPrimitiveArrayToSet();

		for(int i : mySet) System.out.println(i);
	}
}

class DataStructures { 

	public Set<Integer> turnPrimitiveArrayToSet() {
		int[] myNums = {1,2,4,5,6};
		List<Integer> myList = new ArrayList<Integer>();
		for(int i : myNums) myList.add(i);
		Set<Integer> mySet = new HashSet<Integer>(myList);
		return mySet;
	}
}