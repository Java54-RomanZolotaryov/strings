package telran.strings.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import telran.strings.RegularExpressions;

class RegularExpressionsTest {

	@Test
	void javaVariableTrueTest() {
		String regex = RegularExpressions.javaVariable();
		assertTrue("abs".matches(regex));
		assertTrue("a".matches(regex));
		assertTrue("$".matches(regex));
		assertTrue("$123".matches(regex));
		assertTrue("$1_23".matches(regex));
		assertTrue("abs_".matches(regex));
		assertTrue("__".matches(regex));
		assertTrue("Abs".matches(regex));
	}
	
	@Test
	void javaVariableFalseTest() {
		String regex = RegularExpressions.javaVariable();
		assertFalse("1abc".matches(regex));
		assertFalse("_".matches(regex));
		assertFalse("a-2".matches(regex));
		assertFalse("a 2".matches(regex));
		assertFalse("a?2".matches(regex));
		assertFalse("a!b".matches(regex));
		assertFalse("i*nt".matches(regex));
	}
	
	@Test
	void zero_300TrueTest() {
		String regex = RegularExpressions.zero_300();
		assertTrue("0".matches(regex));
		assertTrue("1".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("198".matches(regex));
		assertTrue("299".matches(regex));
		assertTrue("30".matches(regex));
		assertTrue("33".matches(regex));
		assertTrue("300".matches(regex));
	}
	
	@Test
	void zero_300FalseTest() {
		String regex = RegularExpressions.zero_300();
		assertFalse("00".matches(regex));
		assertFalse("01".matches(regex));
		assertFalse("19s".matches(regex));
		assertFalse("398".matches(regex));
		assertFalse("2990".matches(regex));
		assertFalse("-30 ".matches(regex));
		assertFalse("330".matches(regex));
		assertFalse("301".matches(regex));
	}
	
	@Test
	void ipOctetTrueTest() {
		String regex = RegularExpressions.ipOctet();
		assertTrue("0".matches(regex));
		assertTrue("00".matches(regex));
		assertTrue("000".matches(regex));
		assertTrue("99".matches(regex));
		assertTrue("10".matches(regex));
		assertTrue("019".matches(regex));
		assertTrue("199".matches(regex));
		assertTrue("009".matches(regex));
		assertTrue("255".matches(regex));
		assertTrue("250".matches(regex));
		assertTrue("249".matches(regex));
	}
	
	@Test
	void ipOctetFalseTest() {
		String regex = RegularExpressions.ipOctet();
		assertFalse("-0".matches(regex));
		assertFalse("00 ".matches(regex));
		assertFalse("0000".matches(regex));
		assertFalse("10?".matches(regex));
		assertFalse("1900".matches(regex));
		assertFalse("299".matches(regex));
		assertFalse("00a".matches(regex));
		assertFalse("256".matches(regex));
		assertFalse("260".matches(regex));
		assertFalse("300".matches(regex));
	}
	
	@Test
	void mobileIsraelPhoneTrueTest() {
		String regex = RegularExpressions.mobileIsraelPhone();
		assertTrue("+972-52-123-12-12".matches(regex));
		assertTrue("972571251113".matches(regex));
		assertTrue("+97254-1-2-3-1-2-1-2".matches(regex));
		assertTrue("972-54-1-2-3-1-2-1-2".matches(regex));
		assertTrue("057-123-12-12".matches(regex));
		assertTrue("0561231212".matches(regex));
		assertTrue("0511231212".matches(regex));
	}
	
	@Test
	void mobileIsraelPhoneFalseTest() {
		String regex = RegularExpressions.mobileIsraelPhone();
		assertFalse("+952-52-123-12-12".matches(regex));
		assertFalse("9325712511133".matches(regex));
		assertFalse("+97254-1-2-3-1".matches(regex));
		assertFalse("92-4-1-2-3-1-2-1-2".matches(regex));
		assertFalse("123-12-12".matches(regex));
		assertFalse("0000561231212".matches(regex));
		assertFalse("05112312120000".matches(regex));
	}
	
	@Test
	void ipV4AddressTrueTest() {
		String regex = RegularExpressions.ipV4Address();
		assertTrue("1.2.3.4".matches(regex));
	}
	
	@Test
	void ipV4AddressFalseTest() {
		String regex = RegularExpressions.ipV4Address();
		assertFalse("1.2.3".matches(regex));
		assertFalse("1 2.3.4".matches(regex));
		assertFalse("1. 2.3.4".matches(regex));
		assertFalse("1.2.3.4.5".matches(regex));
		assertFalse("1.2.3&4".matches(regex));
	}
	
	@Test
	void simpleArithmeticExpressionTrueTest() {
		String regex = RegularExpressions.simpleArithmeticExpression();
		assertTrue("20".matches(regex));
		assertTrue("20 + 3 /2 * 100".matches(regex));
		assertTrue("10000 - 1".matches(regex));
		assertTrue("10000 - 1 ".matches(regex));
	}
	
	@Test
	void simpleArithmeticExpressionFalseTest() {
		String regex = RegularExpressions.simpleArithmeticExpression();
		assertFalse("-20".matches(regex));
		assertFalse("20 ** 3".matches(regex));
		assertFalse("20 + 3 /2 * 100 +".matches(regex));
		assertFalse("20 + 3 //2 * 100 +".matches(regex));
	}
	
	@Test
	void arithmeticExpressionTrueTest() {
		String regex = RegularExpressions.arithmeticExpression();
		assertTrue("(20.5 + abc)*2".matches(regex));
		assertTrue("(20.5 + abc))*2".matches(regex));
		assertTrue("(20.5 + abc / 3)*(2".matches(regex));
		assertTrue("(__)".matches(regex));
		assertTrue("2 + __".matches(regex));
	}
	
	@Test
	void arithmeticExpressionFalseTest() {
		String regex = RegularExpressions.arithmeticExpression();
		assertFalse("2 + _".matches(regex));
		assertFalse("2 + a12 * ".matches(regex));
		assertFalse("(2 + )a12 * ".matches(regex));
	}
	
}
