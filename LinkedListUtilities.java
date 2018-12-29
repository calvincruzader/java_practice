import java.util.*;
import java.lang.*;
import java.lang.reflect.*;

class LinkedListUtilities {
	
	public static void main(String[] args) { 
		// commonListFunctions();
		// LinkedListVersusList	();
		LLIterators();
	}

	public static void LLIterators() { 
		ArrayList<String> alString = new ArrayList<String>();
		alString.add("hello world");
		alString.add("im at starbucks");
		alString.add("lol");
		for(String s : alString) System.out.print(s + " | ");
		System.out.println();
		System.out.println("=====");


		ListIterator<String> myIt = alString.listIterator();
		// for(String s : myIt) System.out.println(s + " | ");
		while(myIt.hasNext()) {
			myIt.next();
			if(myIt.nextIndex() == 1) myIt.add("Added Item");
			// add will increment cursor

			if(myIt.nextIndex() == 3) myIt.set("Set Item");
			// set will NOT increment cursor

		}
		System.out.println(alString.toString());
		// System.out.println()
	}

	public static void commonListFunctions() { 
		List<String> myLL1 = new LinkedList<String>();
		myLL1.add("LL1value1"); 		// 1
		myLL1.add(1, "LL1value2");		// 2

		List<String> myLL2 = new LinkedList<String>();
		myLL2.add("LL2value1");
		myLL2.add("LL2value2");

		myLL1.addAll(myLL2);			// 3

		List<String> myLL3 = new LinkedList<String>();
		myLL3.add("LL3value1");
		myLL3.add("LL3value2");

		myLL1.addAll(1, myLL3);			// 4

		System.out.println(myLL1.toString());
		// List<String> myLL1Dummy = myLL1.clone();
		// myLL1Dummy.clear();				// 5
		// System.out.println(myLL1Dummy.toString());
		System.out.println(myLL1.indexOf("LL1value2")); // 6
		System.out.println(myLL1.indexOf("INVALID VALUE"));
		System.out.println(myLL1.get(3)); // 7

	}

	// why can't I clone from List interface
	public static void LinkedListVersusList() {
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		List<Integer> list1 = new LinkedList<Integer>();
		ll1.add(1);
		ll1.add(4);

		// @SuppressWarnings("unchecked")
		// LinkedList<Integer> ll1Clone = (LinkedList)ll1.clone();
		// Integer[] ll1ToArr = ll1Clone.toArray(new Integer[ll1Clone.size()]);
		// System.out.println(Arrays.toString(ll1ToArr));
		// list1.clone();	

		// System.out.println("Linked list class superclasses: ");
		Class ll1Class = ll1.getClass();
		// while(ll1Class != null) {
		// 	System.out.println(ll1Class.getName());
		// 	ll1Class = ll1Class.getSuperclass();
		// }
		// System.out.println("-------");
		// System.out.println("List interface superclasses: ");
		// Class list1Class = list1.getClass();
		// while(list1Class != null) {
		// 	System.out.println(list1Class.getName());
		// 	list1Class = list1Class.getSuperclass();
		// }

		Method[] m1 = ll1Class.getMethods();
		for(int i = 0; i < m1.length; i++) { 
			System.out.print(m1[i].getName() + " ");
		}

		// Method[] m2 = list1Class.getDeclaredMethods();
		// for(int i =0; i < m2.length; i++) { 
		// 	System.out.println(m2[i].getName());
		// }
	}
}

class Node {
	int val;
	Node neighbor;

	public Node(int val) {
		this.val = val;
	}
}