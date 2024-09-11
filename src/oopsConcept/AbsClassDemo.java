package oopsConcept;

public abstract class AbsClassDemo
{
	

	public void m1()
	{
		final int x=100;
		//x=200;
		System.out.println("this information going to be shown");
	}
	
	public AbsClassDemo()
	{
		System.out.println("this is constructor");
	}
	
	
	public abstract void m2();
	
	public static void main(String[] args)
	{
	
		//AbsClassDemo ab = new AbsClassDemo();
		
	}
}
