package screwdriver;

public class Full {
public static void main(String args[])
{
	int area, area2;
	Head head1 = new Head();
	Tail tail1 = new Tail();
	
	head1.dia = 25;
	head1.height = 45;
	area = head1.dia*head1.height;
	System.out.println("Area of head" + area);
	head1.show();
	tail1.dial = 25;
	tail1.height1 = 45;
	area2 = tail1.dial * tail1.height1;
	System.out.println("Area of head" + area2);
	tail1.tail();
	
	
}
}
