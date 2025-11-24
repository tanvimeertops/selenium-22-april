package com.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class JunitParameter {

	AdditionDemo ad;
	int f_no,s_no,e_no;
	@Before
	public void before() {
		ad=new AdditionDemo();
	}
	
	public JunitParameter(int f_no,int s_no,int e_no) {
		this.f_no=f_no;
		this.s_no=s_no;
		this.e_no=e_no;
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{1,2,3},{4,5,9},{10,11,22}});
	}
	
	@Test
	public void test() {
		Assert.assertEquals(e_no, ad.sum(f_no, s_no));
	}
}
