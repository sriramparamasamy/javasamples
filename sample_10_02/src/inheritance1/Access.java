package inheritance1;

public class Access {
public static void main(String args[]) 
{
	B subOb = new B();
	
	subOb.setij(10, 20);
	subOb.sum();
	System.out.println("Total is " + subOb.total);
	
	
}
}
