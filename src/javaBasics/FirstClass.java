package javaBasics;

public class FirstClass 
{
	
	int a = 10;
	float b = 10.5f;
	char c = 'X';
	String d = "java";
	boolean e = false;
	
	public void printValues()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("a is number: "+a + "\nb is floating number: " + b);
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) 
	{
		FirstClass abc = new FirstClass();
		
		abc.printValues();
		System.out.println(abc.a);
		//SecondClass sc = new SecondClass();
		//sc.main(args);
	}
	
	
	
	
}
