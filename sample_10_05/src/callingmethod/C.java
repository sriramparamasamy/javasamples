package callingmethod;

public class C {
	public static void main(String args[])
	{
		
		A ob1 = new A();
		B ob2 = new B();
		
		ob1.sum(10,20.5);
		ob2.sub(30, 50);
		ob2.multi(10,10);
		ob2.div(30,15);
		// here we are using the same variable c,d for all sub, multi, div but on giving call method it
		// asks for various values.  
		
		
		
	}

}
