package interfacemethod;

class TestIface {
public static void main(String args[])
{
	Callback c = new Client(10); //The object created for callback class will be same for Callback
	// little bit doubt
	Client ob = new Client(20);
	c.callback(42);
	c = ob; //now c refers to another client object
	c.callback(42);
	
	
	ParentCallBack pc = new Client(30);
	pc.parentCall();

}
}

