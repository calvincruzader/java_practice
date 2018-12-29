import java.util.*;

class StringsCommonFunctions {
	
	public static void main(String[] args) { 
		// usingSubstring();
		// someSetOfMethods();
		// someMoreStringMethods();
		compareToVersusEquals();
	}

	public static void usingSubstring() { 
		String s1 = "hello world im here."; 
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(2,6));
	}

	public static void someSetOfMethods() {
		String s = "here ya go how many times can i say here get here in here ya here?";
		System.out.println(s);
		System.out.println(s.lastIndexOf("here"));
		System.out.println(s.substring(61));
		System.out.println(s.replace("a", "AA"));
		System.out.println(Arrays.toString(s.split(" ")));
		System.out.println(s.indexOf("here"));
		System.out.println(s.startsWith("here ya"));
		System.out.println(s.startsWith("how", "here ya go ".length()));
		System.out.println(s.startsWith("how", "here ya go how".length()));			
	}

	public static void someMoreStringMethods() { 
		String s = "im a small string";
		System.out.println(s);
		System.out.println(s.concat(" AND NOW IM LARGER WHAAAAT"));
		System.out.println(s.contains("small"));
		System.out.println(s);
	}

	public static void compareToVersusEquals() {
		String s1 = "axya";
		String s2 = "abc";
		String s3 = "axyz";
		String s4 = "dd";
		String s5 = "";
		String s6 = "1234";
		String s7 = "a xy";
		String s8 = "AXY"; 
		String s9 = "9";
		System.out.println(s9.compareTo(""));
		System.out.println(s1 + ".compareTo(" + s2 + "): " + s1.compareTo(s2));
		System.out.println(s1 + ".compareTo(" + s3 + "): " + s1.compareTo(s3));
		System.out.println(s1 + ".compareTo(" + s4 + "): " + s1.compareTo(s4));
		System.out.println(s1 + ".compareTo(" + s5 + "): " + s1.compareTo(s5));
		System.out.println(s1 + ".compareTo(" + s6 + "): " + s1.compareTo(s6));
		System.out.println(s1 + ".compareTo(" + s7 + "): " + s1.compareTo(s7));
		System.out.println(s1 + ".compareTo(" + s8 + "): " + s1.compareTo(s8));		
	}
}