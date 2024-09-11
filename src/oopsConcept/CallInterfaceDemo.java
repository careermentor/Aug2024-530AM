package oopsConcept;

public class CallInterfaceDemo implements InterfaceDemo
{

	
	public void m3() {
		
		System.out.println("this is M3 method");
	}

	
	public void m4() {
		
		System.out.println("this is M4 method");
		
	}

	
	public static void main(String[] args) {
		CallInterfaceDemo cd = new CallInterfaceDemo();
		cd.m3();
		cd.m4();
		System.out.println(cd.a);
	}
	
	
}
