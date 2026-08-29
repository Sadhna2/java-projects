package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import day14.Calculator;
import day14.Palindrome;
@TestInstance(Lifecycle.PER_CLASS)
class CalculatorTest {
    Calculator calc;
	@BeforeAll
	void init() {
		calc=new Calculator();
	}
	
	@Test
	@DisplayName("to test addition of two values")
	void testAdd() {
		assertEquals(50,calc.add(10, 40),"expected not matching with actual");
	}
	
	@RepeatedTest(value=3)
	@DisplayName("to perform repeated test for multiplication ")
	void testMultiply() {
		assertEquals(50,calc.multiply(10, 5),"wrong output");
	}
	
	@Test
	void testDivisionWithException() {
		Throwable exp=assertThrows(ArithmeticException.class,
				()->calc.division(9,3));
		assertEquals("division cannot be done", exp.getMessage());
	}
	@Test
	void testPalindrome() {
		 Palindrome palindrome = new Palindrome();
		assertTrue(palindrome.isPalindrome("madam"));
		
	}

}
