package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public  class JunitAnnotation {
	@BeforeClass
	public static void before_class() {
		System.out.println("before class");
	}
	
	@Before
	public void before() {
		System.out.println("before ");
	}

	@Test
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test 2");
	}
	@After
	public void after() {
		System.out.println("after ");
	}
	@AfterClass
	public static void after_class() {
		System.out.println("after class");
	}
}
