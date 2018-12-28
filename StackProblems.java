import java.util.*;

class StackProblems { 

	public static void main(String[] args) {
		String paren1 = "[{()}][]"; 
		if(validateParenthesis(paren1)) { 
			System.out.println(paren1 + " is valid.");
		} else { 
			System.out.println(paren1 + " is NOT valid.");
		}
	}

	public static boolean validateParenthesis(String parens) { 
		Stack<Character> myStack = new Stack<Character>(); 
		HashMap<Character, Character> matchParens = new HashMap<Character, Character>() {{
			put(']', '[');
			put('}', '{');
			put(')', '('); 
		}};

		for(char c : parens.toCharArray()) { 
			if(c == '(' || c == '{' || c == '[') myStack.push(c);

			if(c == ')' || c == '}' || c == ']') { 
				if(myStack.isEmpty()) return false;

				char stackC = myStack.pop(); 

				if(matchParens.get(c) != stackC) return false;
			}	
		}
		if(!myStack.isEmpty()) return false;
		return true;
	}
}