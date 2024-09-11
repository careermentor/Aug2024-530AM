package oopsConcept;

public class QA1 
{
	int x = 200;

	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of a&b&c: " + d);
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
		QA1 q1 = new QA1();
		q1.sum(30, 40);
		//q1.sum(20, 30.5f);
		//q1.sum(20, 30, 40);

	}

}
