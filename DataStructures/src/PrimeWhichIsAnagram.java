package datastructures;

public class PrimeWhichIsAnagram {

	static int anagram2DArray[][] = new int[84][2];
	public static void main(String args[]) {
	int n = 168;
	int array[] = new int[n];
	array = Utility.primeNumbers();
	
	int k= 0;
	int t= 0;
	for(int i=0;i<n;i++) 
	{
		for(int j=i+1;j<n-1;j++) 
		{
			
			boolean isAnagram = Utility.anagram(array[i], array[j]);
		    if(isAnagram) 
		    {
		    	anagram2DArray[k++][0] = array[i];
		    }
		    else 
		    {
		    	anagram2DArray[t++][1] = array[i];
		    }
		}
	}
     print();
	}
	
	public static void print() 
	{
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<84;j++) 
			{
			System.out.println(anagram2DArray[j][i]+"  ");	
			}
		}
	}
}
