package noOfBinarySearchTrees;

import java.util.Scanner;

public class NoOfBinarySearchTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//Equation to find no of binary search trees is (2n)! / ((n + 1)! * n!) 
		  long delta = fact(2*n);
		  long beta = fact(n+1);
		  long gamma = fact(n);
		  long out ;
		  out = delta/(beta*gamma);
		  System.out.println(out);
	
		
	}
	
	public static long fact(int n) 
	{
		long fact = 1;
		for(int i=1;i<=n;i++) 
		{
		fact *= i; 
		}
		
		return fact;
	}

}
