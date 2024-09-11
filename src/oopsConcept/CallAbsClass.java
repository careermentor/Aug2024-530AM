package oopsConcept;

public class CallAbsClass extends AbsClassDemo
{

	
	public void m2() {
		
		System.out.println("this is my abs method code");
		
	}

	public static void main(String[] args) 
	{
	
		CallAbsClass ab = new CallAbsClass();
		ab.m1();
		ab.m2();
		
	}
	
	
}
