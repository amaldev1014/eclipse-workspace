package factorypattern;

public class Desktop implements Computer{
	
	Desktop()
	{
		System.out.println("Desktop ic created");
	}

	@Override
	public void advantages() {
		// TODO Auto-generated method stub

		System.out.println("Commonly used in houses");
	}

	@Override
	public void disadvantages() {
		// TODO Auto-generated method stub
		
		System.out.println("Not suitable to carry");
	}

	
	
	

}
