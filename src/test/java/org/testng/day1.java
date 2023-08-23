package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

//	@BeforeTest
//	public void beforeTest()
//	{
//		System.out.println("i run befoer test");
//	}
//
//	@AfterTest
//	public void afterTest()
//	{
//		System.out.println("i run after test");
//	}
//
//	@BeforeMethod
//	public void beforeMethod()
//	{
//		System.out.println("i run before every method in day1 class");
//	}
//
//	@AfterMethod
//	public void afterMethod()
//	{
//		System.out.println("i run after every method in day1 class");
//	}
//
//	@BeforeSuite
//	public void befoerSuite()
//	{
//		System.out.println("i will run befoer suite");
//	}
//
//	@AfterSuite
//	public void afterSuite()
//	{
//		System.out.println("i will run after suite");
//	}
//
//	@BeforeClass
//	public void befoerClass()
//	{
//		System.out.println("i will run before class");
//	}
//
//	@AfterClass
//	public void afterClass()
//	{
//		System.out.println("i will run after class");
//	}

    @Test(enabled = false)
    public void test1() {
        System.out.println("day1 test 1");
    }

    @Test
    public void test2() {
        System.out.println("day 1 test 2");
    }


    @Test(groups = {"smoke"})
    public void test3() {
        System.out.println("day1 test 3");
    }

    @Test(groups = {"smoke"})
    public void test4() {
        System.out.println("day 1 test 4");
    }


    @Test(dependsOnMethods = {"test6"})
    public void test5() {
        System.out.println("day1 test 5");
    }

    @Parameters({"url"})
    @Test
    public void test6(String url) {
        System.out.println("day1 test 6, " + url);
    }

}
