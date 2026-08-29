package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import day14.Airthmetic;

class LifecycleTest {
    static Airthmetic arth;
    
    @BeforeAll
    static void beforeAllTest() {
    	   arth=new Airthmetic();
    	   System.out.println("** executed before all test case**");
    }
    @AfterAll
    static void afterAllTest() {
    	    System.out.println("** executed after all test cases**");
    }
    // @Disabled
    @Test
    void sampleTest() {
    	System.out.println("** this is sample test case**");
    }
    
    @Test
    void testAdd() {
    	System.out.println("** to test add**");
    	assertEquals(30,arth.add(10, 20),"Returned value not matching..");
    }
    @Test
    void testAddNegative() {
    	System.out.println("** to test add**");
    	assertNotEquals(30,arth.add(10, 20),"Returned value not matching..");
    }
    @BeforeEach
    void BeforeEachTest() {
    	System.out.println("** this is before each test case**");
    }
    @AfterEach
    void afterEachTest() {
    	System.out.println("** this is after each test case**");
    }
}
