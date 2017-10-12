package instancevariables;

public class Primitivevariables1 {
void method(int a, int b)//a,b are local variables
{
	int add = a+b;
	System.out.println("The addition of two number is:" + add);
	this.method1();//here we call an method inside an another object method
}
void method1()
{
	int a;//anything inside a method is an local variable // here a is a primitive variable?
	//little bit doubt
	
	for (a=0; a<8; a++) {
		System.out.println("The variable required is" +a);
		if (a==7)//here a is a local variable for for loop
		{
			System.out.println("The value is not correct");
		}
		else
		{
			System.out.println("The value is correct");
		}
	}
	
	
}
public static void main(String args[])
{
	Primitivevariables1 abs = new Primitivevariables1();
	abs.method(10, 30);
}
}
