import java.util.*; 

class MyEnums { 

	public static enum Days {SUN, MON, TUES, WED, THURS, FRI, SAT;}

	public static void main(String[] args) { 
		Days[] days = Days.values(); // enums have .values() method to get all of them
		List<String> daysString = new ArrayList<String>();
		for(Days day : days) daysString.add(day.toString()); // turn each to a String
		for(String day : daysString) System.out.println(day);
	}
}