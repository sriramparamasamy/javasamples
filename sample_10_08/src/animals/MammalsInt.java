
package animals;

public class MammalsInt implements Animal
{
	public void eat()
	{
		System.out.println("Eating habits are: ");
		
	}
	public void travel() {
		System.out.println(" traveling habits are: ");
		
	}
	public void livingplace()
	{
		System.out.println("The living place of animals are:");
	}


public static void main(String args[])
{
	MammalsInt m = new MammalsInt();
	m.eat();
	m.travel();
	m.livingplace();
	
}
}

