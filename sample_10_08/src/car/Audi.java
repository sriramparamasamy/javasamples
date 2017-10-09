package car;

public class Audi implements Benz
{
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
public static void main(String args[])
{
	Audi a = new Audi();
	a.colour("blue");
	a.noofengines(8);
	a.luxurytype("suv");
	a.geartype("automatic");
}
}
