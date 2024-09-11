package oopsConcept;

public class QA2 extends QA1
{

	int x = 20;
	
	
	public void varval()
	{
		final int x =30;
		//x=40;
		System.out.println(x);//30
		System.out.println(this.x); //20
		System.out.println(super.x);//200
		
		super.sum(30, 40);
	}
	
	
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("substraction of a&b: " + c);
		
		System.out.println(a); //30
	}
	
	public static void main(String[] args) 
	{
		QA2 q2 = new QA2();
		q2.sub(30, 40);
		q2.sum(30, 40);
		
	//	QA1 q1 = new QA1();
		//q1.sum(30, 40);

		q2.varval();
		
		StaticDemo.printval();
		
		
	}

	
	public void qa1im() {
		System.out.println("this is method of QA1I interface");
		
	}

}
