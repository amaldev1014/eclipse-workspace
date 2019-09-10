package factorypattern;

public class Server implements Computer{
   
	public Server() {
	System.out.println("Server created");
}

	@Override
	public void advantages() {
		// TODO Auto-generated method stub
		
		System.out.println("More storage and capabilities");
		
		
		
	}

	

	@Override
	public void disadvantages() {
		// TODO Auto-generated method stub
		
		System.out.println("Expensive and need maintanance");
		
	}

	
		


}
