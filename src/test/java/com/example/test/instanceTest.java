package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class instanceTest {
	
	static Calculator cal;
	
	@BeforeAll
	public static void setup(){
		cal = new Calculator();
		System.out.println("Before");
	}

	@AfterAll
	public static void finish(){
		System.out.println("After");
	}

	@Test
	public void add() {
		//Calculator cal = new Calculator();
		//assertEquals(10, cal.sum(6,4));
		System.out.println(cal.sum(6,4));
	}

	@Test
	public void substract() {
		//Calculator cal = new Calculator();
		//System.out.println(cal.substract(6,4));	
		//assertEquals(2, cal.substract(6,4));
		System.out.println(cal.sub(6,4));
		//assertEquals(2, cal.sub(6,4));
	}

	
}
