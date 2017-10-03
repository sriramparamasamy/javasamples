package boxes;

//Complete implementation of Boxweight
public class Box 
{
double width;
double height;
double depth;

//Construct Clone of an object
Box (Box ob)     // pass object to constructor
{
	width = ob.width;
	height = ob.height;
	depth = ob.depth;
}
Box (double w, double h, double d)
{
	width = w;
	height = h;
	depth = d;
}
//constructor used when no dimensons specified

Box() 
{
	width = -1;
	height = -1;
	depth = -1;
}

// constructor used when cube is created
Box (double len)
{
	width = height = depth = len;
}
 //compute and return volume
double volume ()
{
	return width * height * depth;
}

}


