package Algorithms;

import java.util.Scanner;

public class FindYourNumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		System.out.println("Enter a number between 0 and "+(n-1));
		System.out.println("Give me "+(((int)Math.log(n))+1)+" chances ...answer should be either greater or lesser.... wait and see");
		int low = 0;
		int high = n-1;
	    
	    findNumber(low, high);
		
		
		
		

	}
	
	public static void findNumber(int low, int high) 
	
	{
		int middle = (low + high)/2;
		
		System.out.println("value is greater than or less than "+middle+"?");
		
		Scanner scan = new Scanner(System.in);
		String reply = scan.next();
		if(reply.contentEquals("greater")) 
		{
			findNumber(middle+1,high);
		}
		
		else if(reply.equals("lesser")) 
		{
			findNumber(low,middle-1);
		}
		
		else if(reply.contentEquals("no"))
		{System.out.println(middle+" is the number. is n't it?");
		System.out.println("Thank u so much");}
					
	}

}
