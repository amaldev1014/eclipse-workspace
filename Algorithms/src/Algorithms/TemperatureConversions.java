package tictactoe;

import java.util.Scanner;

public class TemperatureConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter fahrenheit : ");
		double f = scan.nextDouble();
		System.out.println("Enter celsius :");
		 double c = scan.nextDouble();

		System.out.println(f+" fahrenheit is "+fahrenheitToCelsius(f)+" degree celsius");
		System.out.println(c+" celsius is "+celsiusToFahrenheit(c)+" fahrenheit");
	}
	
	public static double fahrenheitToCelsius(double f) 
	{
	   double c = (f - 32) * 5/9;
	   return c;
	}
	
	
	
	
	public static double celsiusToFahrenheit(double c) 
	{
		double f = (c * 9/5) + 32; 
        return f;
	}

}
