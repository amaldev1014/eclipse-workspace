package factorypattern;

import java.util.Scanner;

public class ComputerFactory {

	public Computer getComputer() 
	{
		System.out.println("which commputer need to be created");
		Scanner scan = new Scanner(System.in);
		String obj = scan.next();
		if(obj.equals("desktop")) 
		{
			return new Desktop();
		}
		
		else if(obj.equals("server")) 
		{
			return new Server();
		}
		else if(obj.equals("laptop")) 
		
			
			{
			return new Laptop();
			}
		
		else {return null;}
		
	}
}
