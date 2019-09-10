package factorypattern;

public class Laptop implements Computer{

	
	Laptop()
	{
		System.out.println("Laptop created");
	}
	@Override
	public void advantages() {
		// TODO Auto-generated method stub
		
		System.out.println("Convenient to carry");
		
		
		
	}

	@Override
	public void disadvantages() {
		// TODO Auto-generated method stub
		
		System.out.println("Limit to scalability");
		
	}

	
	

}
