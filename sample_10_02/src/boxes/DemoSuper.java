package boxes;

public class DemoSuper {
	public static void main(String args[])
	{
		Boxweight mybox1 = new Boxweight(10,20,15,34.1);
		Boxweight mybox2 = new Boxweight(2,3,4,0.075);
		Boxweight mybox3 = new Boxweight();
		Boxweight mycube = new Boxweight(3,2);
		Boxweight myclone = new Boxweight(mybox1);
		double vol;
		
	vol = mybox1.volume();
	System.out.println(" Volume of mybox1" + vol);
	System.out.println(" Weight of mybox1" + mybox1.weight);
	System.out.println();
	
	vol = mybox2.volume();
	System.out.println(" Volume of mybox1" + vol);
	System.out.println(" Weight of mybox1" + mybox2.weight);
	System.out.println();
	
	vol = mybox3.volume();
	System.out.println(" Volume of mybox1" + vol);
	System.out.println(" Weight of mybox1" + mybox3.weight);
	System.out.println();
	
	vol = mycube.volume();
	System.out.println(" Volume of mycube" + vol);
	System.out.println(" Weight of mycube" + mycube.weight);
	System.out.println();
	
	vol = myclone.volume();
	System.out.println(" Volume of myclone" + vol);
	System.out.println(" Weight of myclone" + myclone.weight);
	System.out.println();
}

	
}
