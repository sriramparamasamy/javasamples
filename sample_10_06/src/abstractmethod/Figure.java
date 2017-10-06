package abstractmethod;

abstract class Figure {
double dim1;
double dim2;

// create a constructor for class figure
Figure(double a, double b)
{
	dim1 = a;
	dim2 = b;
	
}
abstract double area();

}
