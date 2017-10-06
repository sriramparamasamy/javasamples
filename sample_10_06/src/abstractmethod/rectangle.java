package abstractmethod;

class rectangle extends Figure {
	rectangle (double a, double b){
	super(a,b);
	//super() is used because of using constructor in super class

}

//override area for rectangle 
double area()
{
	System.out.println("Inside area of rectangle");
	return dim1*dim2;
	
}
}


