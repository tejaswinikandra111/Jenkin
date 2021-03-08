package com.mindtree.demo;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testAssertions(){
		String str1 = "abc";
      		String str2 = "abc";

		String str3 = new String ("abc");
		String str4 = new String ("abc");
		
		String str = null'
		
		int a = 5;
      		int b= 6;
		

		assertEquals(str3, str4);
		assertSame(str1, str2);
		assertNotSame(str3, str1);
		assertTrue(a<b);
		assertFalse(a>b);
		assertNull(str);
		assertNotNull(str3);
	}

}
