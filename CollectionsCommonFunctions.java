import java.util.*;

class CollectionsCommonFunctions {
	
	public static void main(String[] args) { 
		// collectionsHashMaps();
		collectionsLists();
		// collectionsLL();
	}

	public static void collectionsHashMaps() { 
		HashMap<String, String> hm = new HashMap<String, String>();
		// hm.fill("testing");

		Class c = hm.getClass();
		while(c != null) {
			System.out.println(c.getName());
			c = c.getSuperclass();
		}

		// there is no bare bones hash iterator
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) System.out.println(hm.get(it));
	}

	public static void collectionsLL() { 
		LinkedList<String> ll = new LinkedList<String>();
		Class c = ll.getClass();
		while(c != null) {
			System.out.println(c.getName());
			c = c.getSuperclass();
		}
	}

	public static void collectionsLists() { 
		LinkedList<Integer> llInt = new LinkedList<Integer>();
		List<Integer> alInt = new ArrayList<Integer>();
		List<Integer> dummyLL = new LinkedList<Integer>();

		for(int i = 0; i < 10; i++) { 
			llInt.add(i);
			alInt.add(i*2);
			dummyLL.add(i*3);
		}
		Collections.swap(llInt, 2, 5);	// !!!
		Collections.fill(dummyLL, -1);
		Collections.rotate(alInt, 3);	// !!!
		Collections.addAll(dummyLL, 999, 999, 999);
		System.out.println(Collections.max(dummyLL));
		Collections.sort(dummyLL);
		System.out.println(dummyLL);
		System.out.println(Collections.binarySearch(dummyLL, 999));	
	}
}