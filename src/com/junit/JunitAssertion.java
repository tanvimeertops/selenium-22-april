package com.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAssertion {

	@Test
	@Ignore
	public void test1() {
		int a=12,b=7;
//		Assert.assertTrue(a<b);
		Assert.assertFalse(a<b);
	}
	
	@Test
	public void test2() {
		String str1="tops",str2="top";
		Assert.assertEquals(str1, str2);
	}
}
