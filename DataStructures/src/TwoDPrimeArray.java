package datastructures;

import java.util.Arrays;

public class TwoDPrimeArray {

	static int TwoDArray[][] = new int[50][11];
	public static void main(String args[]) {
	
	
	System.out.println("0-100"+"\t"+"100-200"+"\t"+"200-300"+"\t"+"300-400"+"\t"+"400-500"+"\t"+"500-600"+"\t"+"600-700"+"\t"+"700-800"+"\t"+"800-900"+"\t"+"900-1000"+"\t");
	
	int array[] = Utility.findAnagram();
	
    int end =100;
    int row = 0;
    int col =0;
    int i=0;
    while(end<1000 && i<167 && row<50 && col<11) {
	while(array[i]<end) 
	{
		if(array[i]<end) 
		{
			TwoDArray[row][col] = array[i++];
			row++;
		}
		
	}
	col++;
	end+=100;
    }
	
	
	}
	
	
	public static void printTwoDArray() 
	{
		for(int i=0;i<50;i++) 
		{
			for(int j=0;j<11;j++) 
			{
				System.out.print(TwoDArray[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
}
