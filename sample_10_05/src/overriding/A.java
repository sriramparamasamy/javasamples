package overriding;

public class A {
	int a;
	double b;
	double sum;
	
	
	A (int i, double j){
		i=a;
		j=b;
	}
		void sum()
	{
		sum = a + b;
		System.out.println("The addition of two numbers:" +sum);
		
	}
	

}


