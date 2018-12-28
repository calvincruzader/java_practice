import java.util.*;

class ArrayUtilities { 

	public static void main(String[] args) { 
		// useFill();
		// useArraysEquals();
		useToString();
	}

	public static void useFill() { 
		int[] myArr = new int[20];
		Arrays.fill(myArr, 30);
		for(int i : myArr) System.out.println(i);

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
}