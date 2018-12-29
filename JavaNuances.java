import java.util.*;

class JavaNuances { 

	public static void main(String[] args) { 
		// parseIntRadix();
		// negativeBitShifting();
		// testingRandomParameters();
		// systemArrayCopyPractice(); 
		// copyOfRangePractice();
		// primArraysAsGeneric();
		sortWithComparator();
	}

	public static void sortWithComparator() { 
		Integer[] x = new Integer[]{1,2,3,4,5,6,7,8,9};
		Arrays.sort(x, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) { 
				if(o1 > o2) return -1;
				else if( o1 == o2) return 0;
				else return 1;
			}
		});
		System.out.println(Arrays.toString(x));
		Arrays.sort(x, 3, 7);
		System.out.println(Arrays.toString(x));
	}

	public static void parseIntRadix() { 
		String s1 = "431";
		System.out.println(Integer.parseInt(s1, 4));
	}

	public static void negativeBitShifting() {
		System.out.println("-8:       " + Integer.toBinaryString(-8));
		System.out.println(-8 >>> 1);
		System.out.println("-8 >>> 1: " + Integer.toBinaryString(-8 >>> 1));
		System.out.println(-8 >> 1);
		System.out.println("-8 >> 1:  " + Integer.toBinaryString(-8 >> 1));
	}

	public static void testingRandomParameters() {
		Random rand = new Random(); 
		int numFalse = 0;
		int numTrue = 0;
		for(int i = 0; i < 1000; i++) { 
			boolean b = rand.nextBoolean();
			if(b == false) numFalse++;
			if(b == true) numTrue++;
		}
		System.out.println("false: " + numFalse);
		System.out.println("true:  " + numTrue);
	}

	public static void systemArrayCopyPractice() {
		int[] x = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] y = new int[]{10,20,30,40,50,60,70,80,90,100};
		System.arraycopy(x, 3, y, 6, 3);
		System.out.println(Arrays.toString(y));
	}

	public static void copyOfRangePractice() { 
		int[] x = new int[]{1,2,3,4,5,6};
		int[] y = Arrays.copyOf(x, 10);
		System.out.println(Arrays.toString(y));
		int[] z = Arrays.copyOfRange(x, 2, 4);
		System.out.println(Arrays.toString(z));
	}

	public static void primArraysAsGeneric() { 
		Stack<int[]> intArrStack = new Stack<int[]>();
		int[] a = new int[]{1,3,5,7,9};
		int[] b = {0,2,4,6,8};
		int[] c = {1,4,9,16,25};
		intArrStack.push(a); intArrStack.push(b); intArrStack.push(c);
		while(!intArrStack.isEmpty()) 
			System.out.println(Arrays.toString(intArrStack.pop()));
	}
}