package interfacemethod;

public class Client implements Callback, ParentCallBack{ //implements callback interface
	
	int clientVar ; 
	Client (int c){
		this.clientVar = c;
	}
	public void callback(int param)
	{
		System.out.println("p squared is : " +(clientVar*clientVar));
	}
	void nonIfaceMeth()
	{
		System.out.println("Vlaases that implement interfaces" + "may also define othr members, too.");
	}
	public void call() {
		
		System.out.println("Call");
		
	}
	
	public void parentCall() {
		
	}

	public void clientMethod() {}
}
// 