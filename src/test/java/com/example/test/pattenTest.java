package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class pattenTest {

	static StringCalculator cal;

	@BeforeAll
	public static void setup(){
		cal = new StringCalculator();
	}

	@Test
	public void newTest() {
		String testPattern = "//]\nh";
		System.out.println(cal.devider(testPattern));
	}

	
}
