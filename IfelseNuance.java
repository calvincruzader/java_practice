class IfelseNuance { 

	public static void main(String[] args) { 
		int x = 2;
		int output = ifelseNuance(x);
		System.out.println(output);
	}

	public static int ifelseNuance(int x) { 
		int val = 1;
		if(1 == 2) { 
			val = 10;
		} else if(2 == 3) { 
			val = 100;
		} else if(3 == 4); { 
			val = 1000;
		}
		return val; 
	}
}