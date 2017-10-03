package boxes;

class Boxweight extends Box {
	double weight; //weight of box
	
	//construct clone of an object
	
	Boxweight(Boxweight ob)
	{
		super(ob);
		weight=ob.weight;
	}
	
	//construct when all parameters are specified
	Boxweight(double w, double h, double d, double m)
	{
		super(w, h, d); //call superclass constructor
		weight = m;
	}
	// default constructor
	Boxweight( ){
		super();
		weight = -1;
	}
	// constructor used when cube is created
	Boxweight (double len, double m)
	{
		super (len);
		weight = m;
		
	}
}


