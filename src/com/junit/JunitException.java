package com.junit;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitException {
	
	DivisionDemo dd;
	@Before
	public void before() {
		dd=new DivisionDemo();
	}
	
	@Test(expected = Exception.class)
	public void test() {
		dd.div(25, 0);
	}
	
	
}
