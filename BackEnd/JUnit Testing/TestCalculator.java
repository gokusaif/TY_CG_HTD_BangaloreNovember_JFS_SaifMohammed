package com.cap.junit.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {
	
	Calculator c=null;
	
 @BeforeEach
	void createObject() {
		c=new Calculator();
	}
	
	@Test
	public void testAdd() {
		
		int i=c.add(10, 5);
		assertEquals(15, i);
	}
	@Test
	public void testNeg() {
		
		int i=c.add(-5, 9);
		assertEquals(4, i);
	}
	
	@Test
	public void testMul() {
		
		int i=c.mul(2, 10);
		assertEquals(20, i);

	}
	
    @Test
	public void testDivForAE() {
		
		assertThrows(ArithmeticException.class,()->c.div(10,0));
	}
    
    @Test
    public void testNullString() {
    
//    	int res=c.findLength("saif");
//    	assertEquals(4,res);
    	assertThrows(NullPointerException.class,()->c.findLength(null));

    }

}
