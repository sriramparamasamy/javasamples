package localvariables;

public class Localvariables1 {
	
	void add(int a, int b)
	{
	int add;
	add = a+b;
	if(add==5)
	{

		System.out.println("The addition is correct");
	}
	
	
	else {
		
		System.out.println("The addition is not correct");
	}}
		
	
	public static void main(String args[])
	{
		Localvariables1 ab = new Localvariables1();
		ab.add(7, 1);

}
}
