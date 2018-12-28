import java.util.*;

class StringProblemsEPI { 

	public static void main(String[] args) { 
		String num1 = "123";
		String num2 = "-888";
		String num3 = "+942143";
		System.out.println(strToInt(num1)+ " " + strToInt(num2) + " " + strToInt(num3));

		int num11 = 123; 
		int num22 = -888;
		int num33 = +942143;
		System.out.println(intToStr(num11) + " " + intToStr(num22) + " " + intToStr(num33));
		System.out.println(intToStr(num22).getClass());

	}

	public static int strToInt(String numS) {
		if(numS == null || numS.length() < 1) return 0;

		int output = 0;
		boolean isNegative = false; 
		if(numS.charAt(0) == '-' || numS.charAt(0) == '+') { 
			if(numS.charAt(0) == '-') isNegative = true; 
			numS = numS.substring(1);
		}

		int tenPower = numS.length()-1;
		for(int i = 0; i < numS.length(); i++) { 
			output += Character.getNumericValue(numS.charAt(i)) * Math.pow(10, tenPower-i);
		}
		return (isNegative) ? -1 * output : output;
	}

	public static String intToStr(int num) { 
		if(num == 0) return "0";
		boolean isNegative = false; 
		if(num < 0) { 
			isNegative = true;
			num *= -1;
		}

		StringBuilder numS = new StringBuilder(); 
		while(num != 0) { 
			numS.append(num % 10);
			num /= 10;
		}
		if(isNegative) numS.append('-');
		numS.reverse();

		return numS.toString();
	}
}