package telran.strings;

public class RegularExpressions {
	
	public static String javaVariable() {
		String regex = "([A-Za-z$][\\w$]*|_[\\w$]+)"; 
		return regex;
	}
	
	public static String zero_300() {
		String regex = "(\\d|[1-9]\\d|[12]\\d{2}|300)";
		return regex;
	}
	
	public static String ipOctet() {
		String regex = "([01]?\\d{1,2}|2([5][0-5]|[0-4]\\d))";
		return regex;
	}
	
	public static String mobileIsraelPhone() {
		String regex = "(\\+?972-?|0)5\\d(-?\\d){7}";
		return regex;
	}
	
	public static String ipV4Address() {
		String ipOctetExpression = ipOctet();
		return String.format("%1$s(\\.%1$s){3}", ipOctetExpression);
	}
	
	public static String simpleArithmeticExpression() {
		String operand = integerNumberExpression();
		String operation = operationExpression();
		return String.format("%1$s(%2$s%1$s)*", operand, operation);
	}
	
	public static String arithmeticExpression() {
		//TODO
		return null;
	}

	private static String integerNumberExpression() { 
		String regex = "(\\s*\\d+\\s*)";
		return regex;
	}

	private static String operationExpression() {
		String regex = "[-+/*]";
		return regex;
	}
}
