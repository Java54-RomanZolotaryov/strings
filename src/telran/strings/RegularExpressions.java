package telran.strings;

public class RegularExpressions {
	
	public static String javaVariable() {
		String regex = "[A-Za-z$][\\w$]*|_[\\w$]+"; 
		return regex;
	}
	
	public static String zero_300() {
		String regex = "\\d|[1-9]\\d|[12]\\d{2}|300";
		return regex;
	}
	
	public static String ipOctet() {
		String regex = "[01]?\\d?\\d|2([5][0-5]|[0-4]\\d)";
		return regex;
	}
	
	public static String mobileIsraelPhone() {
		String regex = "(\\+?972-?|0)5\\d(-?\\d){7}";
		return regex;
	}
}
