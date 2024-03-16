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
		//TODO
		//string contains possible Israel mobile phone number
		//+972-<prefix two digits beginning from 5>-<7 digits of numbers>
		//<prefix 3 digits beginning from 0, second 5, third any number>-<7 digits of numbers>
		return null;
	}
}
