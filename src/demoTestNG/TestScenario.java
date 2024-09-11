package demoTestNG;

import org.testng.annotations.Test;

public class TestScenario 
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("this is my first test case");
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("this is my second test case");
	}
	
	@Test(priority=0, groups="Smoke")
	public void third_testcase()
	{
		System.out.println("this is my third test case");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is my forth test case");
	}
	
	@Test(priority=-2)
	public void fifth_testcase()
	{
		System.out.println("this is my fifth test case");
	}
	
	@Test(priority=-1)
	public void sixth_testcase()
	{
		System.out.println("this is my sixth test case");
	}
	
	
	
}
