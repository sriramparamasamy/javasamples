package localvariables;

public class Primitivevariables {
	int i;//i is an instance variable which is used only within the class
			//In case i is used with in the method it is called as local variables
	void series(int j)//j is a local variable which is used within this method only
{
		for (i=0; i<5; i++)//here i is an instance variable which can also be used in the method
		{
			System.out.println("The series of number" +i);
		}
	
	for (j=0; j<11; j++)
	{
		System.out.println("The series of number" +j);
	}
	System.out.println("The series of number is " +i);
	//While running the program the the series of number is 11 is also printed because it is run after the 
	//for loop
	
}
public static void main(String args[])
{
	Primitivevariables b = new Primitivevariables();
	// the variable b is primitive variable which is a object alloted to a pointer b
	b.series(0);
}
}
