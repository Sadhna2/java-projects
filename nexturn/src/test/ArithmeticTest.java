package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import day14.Airthmetic;

public class ArithmeticTest {
	Airthmetic arth=new Airthmetic();
	
	@Test
	void testAdd() {
		assertEquals(15,arth.add(10,5));
	}

}
