package Algorithms;

public class PrimeNumberPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AnagramDetection anagram = new AnagramDetection();
		int n = 168;
		int array[] = new int[n];
		array = anagram.primeNumber();
		
		for(int i=0;i<168;i++) 
		{
			if(anagram.pallindrome(array[i])) 
			{
				System.out.print(array[i]+" ");
			}
			
		}
	}

}
