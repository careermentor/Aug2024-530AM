package oopsConcept;

public class QA4 extends QA2 implements QA3I
{

	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("division of a&b: " + c);
		
		
	}
	
	public void qa3im() {
		System.out.println("method of QA3I Interface");
		
	}
	
	public static void main(String[] args) 
	{
		QA4 q4 = new QA4();
		q4.div(40, 20);
		//q4.mul(30, 40);
		q4.sub(30, 40);
		q4.sum(30, 40);
		q4.qa3im();
		q4.qa1im();

	}

	
	

}
