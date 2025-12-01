package com.testng;

import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FirstDemo {

	@Test
	public void testPass() {
		System.out.println("this test is pass");
	}
	
	@Test
	public void testFail() {
		System.out.println("this test is fail");
		fail();
	}
	
	@Test
	public void testSkip() {
		System.out.println("this test is skipped");
		throw new SkipException("self failed!!");
	}
}
