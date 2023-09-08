package testPkg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario 
{
	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("this is first test case");
		
		//Assert.assertEquals("Hello", "Hello");  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello", "Hello1");  //execute but wont take decision
		
		System.out.println("this is failed");
		
		sa.assertAll(); //decision wthere it is pass or fail
	}

	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test(priority=3)
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}

	@Test(priority=-1)
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}

	@Test(priority=-2)
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}

	@Test
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}

}
