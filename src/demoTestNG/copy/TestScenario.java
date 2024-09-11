package demoTestNG.copy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is my first test case");
		
		Assert.assertEquals("Hello world", "Hello");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("this is my second test case");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is my third test case");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is my forth test case");
	}
	
	@Test
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
