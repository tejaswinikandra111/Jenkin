package com.mindtree.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class DemoApplicationTests {

	@Test
	void contextLoads() {
		
		
	}
	
	@Test
	public void testAssertions(){
		
		String str1 = "abc";
      	String str2 = "abc";


		String str = null;
		
		int a = 5;
      	int b= 6;
		
      		
      	assertEquals(str1, str2);
      	assertSame(str1, str2);

		assertTrue(a<b);
		assertFalse(a>b);
		assertNull(str);

		
	}

}
