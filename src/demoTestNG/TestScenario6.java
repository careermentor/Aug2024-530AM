package demoTestNG;

import org.testng.annotations.Test;

public class TestScenario6 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is my first test case");
	}
	
	@Test(groups="Regression")
	public void second_testcase()
	{
		System.out.println("this is my second test case");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is my third test case");
	}
	
	@Test(groups="Smoke")
	public void forth_testcase()
	{
		System.out.println("this is my forth test case");
	}
	
	@Test(groups="Sanity")
	public void fifth_testcase()
	{
		System.out.println("this is my fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is my sixth test case");
	}
	
	
	
}
