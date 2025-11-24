package com.junit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FirstDemo {

	@Test
	public void test() {
		System.out.println("This is test method");
	}
	
	@Test
	public void failTest() {
		System.out.println("This is Fail test");
		fail();
	}
}
