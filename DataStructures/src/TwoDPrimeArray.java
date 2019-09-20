package datastructures;

import java.util.Arrays;

import datastructures.utility.Utility;

public class TwoDPrimeArray {

	static int TwoDArray[][] = new int[200][107];
	public static void main(String args[]) {
	
	
	
	
	int array[] = Utility.findAnagram(true);
	int notArray[] = Utility.findAnagram(false);

	System.out.println("ANAGRAM\t NOT ANAGRAM");
    for(int i=0;i<array.length;i++) 
    {
    	
    	
    		TwoDArray[i][0] = array[i];
    	
    }
    for(int i=0;i<notArray.length;i++) 
    {
    	
    	
    		TwoDArray[i][1] = notArray[i];
    	
    }
    printTwoDArray();
	
	
	}
	
	
	public static void printTwoDArray() 
	{
		for(int i=0;i<100;i++) 
		{
			for(int j=0;j<2;j++) 
			{
				
				System.out.print(TwoDArray[i][j]+"\t");
				
				}
			System.out.println();
		}
	}
	
	
}
