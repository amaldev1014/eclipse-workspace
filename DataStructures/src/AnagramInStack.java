package datastructures;

import java.util.Arrays;

import datastructures.utility.Utility;

public class AnagramInStack {
	static StackArray stack = new StackArray();
	static int array[] = Utility.findAnagram(true);
	

	public static void main(String args[]) 
	
	{

		
		
	
	
		for(int i=0;i<array.length;i++) 
		{
			stack.push(array[i]);
		}
		//stack.show();
		printReverse();
		
	}
	
	// print the prime numbers in reverse order
	
	public static void printReverse() 
	{
		while(!stack.isEmpty()){
			System.out.println(stack.pop()+" ");
		}
	}
}

