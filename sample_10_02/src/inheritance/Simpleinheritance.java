package inheritance;

class Simpleinheritance {
	public static void main(String args[]) {
		A superOb = new A();
		B subOb = new B();
		
		//The superclass may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("contents of superOb:");
		superOb.showij();
		System.out.println();
		 /* Ths suclass has access to all public members of its superclass */
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Sum of i,j, and k in subOb:");
		subOb.sum();
	}
	}


