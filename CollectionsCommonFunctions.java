import java.util.*;

class CollectionsCommonFunctions {
	
	public static void main(String[] args) { 
		// collectionsHashMaps();
		collectionsLL();
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
}