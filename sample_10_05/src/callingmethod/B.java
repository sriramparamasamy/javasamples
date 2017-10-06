package callingmethod;

public class B {
int c;
int d;
int sub, multi;
double div;

void sub(int c, int d)
{
	sub = c - d;
	System.out.println(" The subtraction of two numbers: " +sub);
	
}
void multi(int c, int d)
{
	multi = c * d;
	System.out.println(" The multiplication of two numbers: " +multi);
}
void div(int c, int d)
{
	div = c/d;
	System.out.println(" The division of two numbers:" + div);
}
}
