package com.testng;

import org.testng.annotations.Test;

public class TestNGGruop {
  @Test(groups = {"green"})
  public void test1() {
	  System.out.println("this is green group");
  }
  @Test(groups = {"green"})
  public void test2() {
	  System.out.println("this is green group");
  }
  @Test(groups = {"green"})
  public void test3() {
	  System.out.println("this is green group");
  }
  @Test(groups = {"red"})
  public void test4() {
	  System.out.println("this is red group");
  }
  @Test(groups = {"red"})
  public void test5() {
	  System.out.println("this is red group");
  }
  @Test(groups = {"red"})
  public void test6() {
	  System.out.println("this is red group");
  }
  
  @Test(groups = {"red","green"})
  public void test7() {
	  System.out.println("this is red and green group");
  }
}
