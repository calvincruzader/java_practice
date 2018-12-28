class SwapBits {
	
	public static void main(String[] args) {
		int x = 12345;
		int i = 0;
		int j = 2;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(swapBits(x, i, j)));
	}

	public static int swapBits(int num, int i, int j) { 	
		// check if bits at i and j differ
		if(((num >>> i) & 1) != ((num >>> j) & 1)) { 
			// create a bitmask at indices i and j, then do some XOR
			num ^= (1 << i) | (1 << j);
		}
		return num;
	}
}