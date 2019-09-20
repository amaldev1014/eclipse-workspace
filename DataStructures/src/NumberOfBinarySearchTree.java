package datastructures;

import java.util.Scanner;

public class NumberOfBinarySearchTree {

	public static void main(String args[]) 
	{
		
		System.out.println("Enter the value of n");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		//(2n)! / ((n + 1)! * n!)
		
		int numberOfTrees = twoNfact(n)/(nPlusONeFact(n) * fact(n)); 
		System.out.println(numberOfTrees);
	
	}
	
	//  find 2n!
	public static int twoNfact(int n) 
	{
		int val = fact(2*n);
		
		return val;
				
	}
	
	// find n!
	public static int fact(int val) 
	{
		int fact = 1;
	
		 for(int i=1;i<=val;i++){    
		      fact=fact*i; 
		      
		 }		
		 
		 return fact;
	}
	
	// find (n+1)!
	public static int nPlusONeFact(int n) 
	{
		int val = fact(n+1);
		return val;
	}
	
}
