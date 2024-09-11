package javaBasics;

public class Calculations 
{
	public Calculations()
	{
		int a = 40;
		int b = 50;
		int c = a+b;
		System.out.println("sum of a&b by using constructor: "+ c);
		
	}
	
	
	 public int sum()
	{
		int a = 20;  //local variable
		int b = 30;
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
	}
	
	 
	 public int addition(int x, int y)
	 {
		 int z = x+y;
		 System.out.println("addition of x&y: " + z);
		return z;
	 }
	 

		public Calculations(int a, int b)
		{
			int c = a+b;
			System.out.println("sum of a&b by using constructor: "+ c);
			
		}
	
	public static void main(String[] args) {
		
		Calculations cal = new Calculations(100,200);
		Calculations cal1 = new Calculations();
		
		cal.sum();   //30 
		int z = cal1.addition(cal.sum(), 30);
		cal.addition(z,cal.sum());
		
	}
	
}
