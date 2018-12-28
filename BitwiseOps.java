class BitwiseOps { 

	public static void main(String[] args) { 
		BWOps ops = new BWOps(12, 25);
		ops.performOR();
		ops.performAND();
		ops.performCOMPLEMENT(); 

	}

}

class BWOps { 
	int num1;
	int num2;

	public BWOps(int n1, int n2) { 
		this.num1 = n1;
		this.num2 = n2;
	}

	void performOR() { 
		System.out.println(num1 + ": " + Integer.toBinaryString(num1));
		System.out.println(num2 + ": " + Integer.toBinaryString(num2));
		System.out.println(num1 + " | " + num2 + ": " + Integer.toBinaryString(num1 | num2) + " or " + (num1 | num2));
	}

	void performAND() { 
		System.out.println(num1 + ": " + Integer.toBinaryString(num1));
		System.out.println(num2 + ": " + Integer.toBinaryString(num2));
		System.out.println(num1 + " & " + num2 + ": " + Integer.toBinaryString(num1 & num2) + " or " + (num1 & num2));
	}

	void performCOMPLEMENT() { 
		System.out.println(num1 + ": " + Integer.toBinaryString(num1));
		System.out.println("~"+num1 + ":  " + Integer.toBinaryString(~num1) + " or " + ~num1);
	}
}