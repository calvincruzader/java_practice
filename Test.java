import java.util.*;

class Test { 
	public static void main(String[] args) { 
		Integer[][] hello = new Integer[3][];
		for(int i = 0; i < hello.length; i++) { 
			System.out.println(hello[i]);
		}
		System.out.println(Double.parseDouble("1.24"));
		System.out.println(Double.valueOf("1.24"));
		// Character[] c = new char[]{'a','b'};
		// Integer[] i = new int[]{1,2,3};
		int y = -16 >>> 2;
		System.out.println(y);
		System.out.println(-16 + ":       " + Integer.toBinaryString(-16));
		System.out.println("-16 >>> 2: " + Integer.toBinaryString(-16 >>> 2));
		// System.out.println(~0);
		System.out.println("~0: " + Integer.toBinaryString(~0));
		System.out.println("9 - 0 = " + ('9' - '0'));

		Integer myInt = new Integer(3);
		Integer myInt2 = new Integer(4);
		myInt = (int)3;
		System.out.println(myInt.getClass());

		Integer x = new Integer(2);
		Integer x2 = new Integer(2);
		System.out.println(x == x2);

		String s1 = "124";
		System.out.println(Integer.parseInt(s1, 5));
		System.out.println(Character.MIN_RADIX + " " + Character.MAX_RADIX);
	}
}