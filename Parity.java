class Parity { 

	public static void main(String[] args) { 
		if((1 & 1) == 1) {
			System.out.println("matching");
		} else { 
			System.out.println("not matching"); 
		}

		long x = 88;
		// System.out.println(Integer.toString(x,2));

		// System.out.println(getParity(x) ? "Parity of " + x + " is odd." : "Parity of " +  x + " is even.");
		// System.out.println("final: " + getParity2(x));
		// System.out.println(~~26);
		// System.out.println(getParity2(x));
		// System.out.println(getParity3(x));
		// System.out.println(getParity4(x));

		int idx = getRightMostSetBitIdx(x);
		System.out.println(x + ": " + Long.toBinaryString(x));
		System.out.println(idx + "  is the index of the first set bit.");
	}

	public static int getRightMostSetBitIdx(long x) { 
		int idx = 1;
		while(x != 0) { 
			if((x & 1) == 1) break;
			System.out.println(x + ": " + Long.toBinaryString(x));
			x >>>= 1;
			idx++;
		}
		return idx;
	}

    public static boolean getParity(int n) { 
        boolean parity = false; 
        while(n != 0) 
        { 
            parity = !parity; 
            n = n & (n-1); // turn the rightmost 1 bit to 0 bit
        } 
        return parity; 
    } 

    public static int getParity2(long x) { 
    	int result = 0;
    	while(x != 0) { 
    		result ^= (x & 1); // toggles result iff rightmost bit is 1 
    		x >>>= 1; // shift bits to the right by 1, keeping the same binary word size and setting new bits on the left to zero.
    	}
    	return result;
    }

    public static int getParity3(long x) { 
    	int result = 0;
    	while(x != 0) { 
    		result ^= 1;
    		x &= x - 1;
    	}
    	return result;
    }

    public static short getParity4(long x) { 
    	x ^= x >>> 32;
    	x ^= x >>> 16;
    	x ^= x >>> 8;
    	x ^= x >>> 4; 
    	x ^= x >>> 2;
    	x ^= x >>> 1;
    	return (short)(x & 0x1);
    }
}