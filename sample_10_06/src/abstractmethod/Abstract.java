package abstractmethod;

class Abstract {
	public static void main(String args[])
	{
		//Figure f = new Figure(10,10);
		//for abstract class we should not assign an object, if so compile error will occur 
		rectangle r = new rectangle(10,10);
		Triangle t = new Triangle(10,20);
		Figure figref;
		//This is okay because for abstract class Figure there will be no object is created.
		// figref is a reference of class Figure
		figref = r;
		//here what i understand that in abstract class figure only we initiate a,b so
		//figref refer to object r to call upon the abstract class variable
		System.out.println("Area is" + figref.area());
		figref = t;
		System.out.println("Area of trianlge:" +figref.area());
		
	}

}
/* one doubt is there for me, for calling method void statement will be used
 * but here double area(); is used and from that i presume that any method with ();
 * can be called within a package using .(); 
 */

