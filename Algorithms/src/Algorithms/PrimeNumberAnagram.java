package Algorithms;

import java.util.Arrays;

public class PrimeNumberAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnagramDetection anagram = new AnagramDetection();
		int n = 168;
		int array[] = new int[n];
		array = anagram.primeNumber();
		
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n-1;j++) 
			{
				boolean isAnagram = anagram.anagram(array[i], array[j]);
			    if(isAnagram) 
			    {
			    	System.out.print(array[i]+" ");
			    }
			}
		}
		
		
	}

}
