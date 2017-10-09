package car;

public class Toyota implements Benz,Etios{
	
public void colour(String colour)
{
	System.out.println("The colour of car is :" + colour);
}
public void noofengines(int size)
{
	System.out.println("The noofengines are :" + size);
}
public void luxurytype(String type) {
	System.out.println("The luxury type of car is:" + type);
}
public void geartype(String lu)
{
	System.out.println("The gear type of car is:" + lu);
}


public void type(String model) {

	System.out.println("The model of car is :" + model);
}

public void mileage(int a) {
	
	System.out.println("The mileage of car is :" + a);
}

public void securitysystems(String security) {
	System.out.println("The security of car is :" + security);
	
}
public static void main(String args[])
{
	Benz a = new Toyota();
	Toyota b = new Toyota();
	a.colour("blue");
	a.noofengines(8);
	a.luxurytype("suv");
	a.geartype("automatic");
	b.type("Etios Liva");
	b.mileage(25);
	b.securitysystems("Fully ABS");
}
}
