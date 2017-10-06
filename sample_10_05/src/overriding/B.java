package overriding;

 class B extends A{
int c,d;
int sub, multi, div;
B(int a, int b, int c, int d){
super (a,b);
}
void sub()
{
	super.sum();
	sub = c - d;
	System.out.println(" The subtraction of two numbers: " +sub);
	
}
void multi()
{
	multi = c * d;
	System.out.println(" The multiplication of two numbers: " +multi);
}
void div()
{
	div = c/d;
	System.out.println(" The division of two numbers:" + div);
}

}
// since we r using super() we cannot 