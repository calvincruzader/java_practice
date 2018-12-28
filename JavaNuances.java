import java.util.*;

class JavaNuances { 

	public static void main(String[] args) { 
		// parseIntRadix();
		// negativeBitShifting();
		testingRandomParameters();
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
}