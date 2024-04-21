package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class assertEquals {
	
	Calculator cal = new Calculator();

	@Test
	public void add() {
		Calculator cal = new Calculator();
		System.out.println(cal.sum(6,3));	
	}

	@Test
	public void substract() {
		Calculator cal = new Calculator();
		//System.out.println(cal.substract(6,4));	
		//assertEquals(2, cal.substract(6,4));
		assertEquals(2, cal.sub(6,1));
	}

	
}
