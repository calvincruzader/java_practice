import java.util.*;

class ArrayUtilities { 

	public static void main(String[] args) { 
		// useFill();
		useArraysEquals();
		// useToString();
		// sortWithComparator();
		// equalsMethodd();
		// useBinarySearch();
	}

	public static void useBinarySearch() { 
		int[] x = new int[]{2,3,4,7,10,12,25,33,46,58,78,123,300};
		System.out.println("x: " + Arrays.toString(x) + " has " + x.length + " elements.");
		System.out.println(Arrays.binarySearch(x, 123));
		System.out.println(Arrays.binarySearch(x,3));
		System.out.println(Arrays.binarySearch(x,2));
		System.out.println(Arrays.binarySearch(x, 500));
		System.out.println(Arrays.binarySearch(x, -202));
		System.out.println(Arrays.binarySearch(x, 5));
	}

	public static void equalsMethodd() { 
		int[] a = new int[]{1,2,3};
		int[] b = {1,2,3};
		System.out.println(Arrays.equals(a,b));
		System.out.println(a == b);
	}

	public static void useFill() { 
		int[] myArr = {1,2,3,4,5,6,7,8,9,90,3};
		Arrays.fill(myArr, 30);
		System.out.println(Arrays.toString(myArr));
		Arrays.fill(myArr, 2, 7, 555);
		System.out.println(Arrays.toString(myArr));

	}
	
	public static void useArraysEquals() { 
		int[] a1 = new int[]{1,2,3};
		int[] a2 = new int[]{2,2,3};

		System.out.println(Arrays.equals(a1,a2) ? " a1 equals a2" : " a1 does not equal a2");
		a2[0] = 1;
		System.out.println(Arrays.equals(a1,a2) ? " a1 equals a2" : " a1 does not equal a2");
	}

	public static void useToString() { 
		int[] a1 = new int[]{2,3,4,5,6};
		System.out.println(Arrays.toString(a1)); 
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
}