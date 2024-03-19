package telran.strings;

public class Validations {
	
	public static boolean isArithmeticExpression(String expression) {
		//TODO
		//1. checking against regular expression
		//2. checking brackets pair-ness for each '(' should be ')'
		//consider introducing counter that increased for '(' and decreased for ')'
		//if during passing over the string expression counter < 0 returning false
		//if after passing whole string counter != 0 returning false
		return false;
	}
	
	public static boolean isValidPassword(String password) {
		//TODO
		//Password valid if:
		//1. length minimum 8 symbols
		//2. must contain 1 upper case character
		//3. must contain 1 lower case character
		//4. must contain 1 digit
		//5. must contain 1 special character
		return false;
	}
}
