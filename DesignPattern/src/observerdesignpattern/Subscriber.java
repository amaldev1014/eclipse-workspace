package observerdesignpattern;

public class Subscriber {

	String name;
	
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void update(String message) 
	{
		System.out.println(name+"\n"+ message);
		System.out.println();
	}
}
