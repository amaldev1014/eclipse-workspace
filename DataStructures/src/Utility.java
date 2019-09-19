package datastructures;

import java.util.Arrays;

public class Utility {
	
	

	//bubble sort for integer
	
	public static int[] bubbleSort(int[] array) 
	{
		for(int i=0;i<array.length-1;i++) 
		{
			for(int j=0;j<array.length-i-1;j++) 
			{
				if(array[j]>array[j+1]) 
				{
					int temp = array[j];
					array[j]  = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	
	// bubble sort for string
	
	public static void bubbleSort(String[] array){
		for (int j = 0; j < array.length; j++) {
	   	   for (int i = j + 1; i < array.length; i++) {
			// comparing adjacent strings
			if (array[i].compareTo(array[j]) < 0) {
			   String temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		   }
		  
		}
	   
		}
	
	// binary search for integer
	
	public static int binarySearch(int array[], int search, int l, int r)
	{
		int m = (l+r)/2;
		
		if(array[m] == search) 
		{
			return m;
		}
		if(search>array[m]) 
		{
			return binarySearch(array,search, m+1, r);
		}
		else   
		{
			return binarySearch(array, search, l, m-1);
		}
		
	}
	
	// binary search for string
	

	public static int binarySearch(String[] a, String x) {
	    int low = 0;
	    int high = a.length - 1;
	    int mid;

	    while (low <= high) {
	        mid = (low + high) / 2;

	        if (a[mid].compareTo(x) < 0) {
	            low = mid + 1;
	        } else if (a[mid].compareTo(x) > 0) {
	            high = mid - 1;
	        } else {
	            return mid;
	        }
	    }

	    return -1;
	}
	
	//insertion sort for integer
	
	public static int[] insertionSort(int array[]) 
	{
		for(int i=1;i<array.length;i++) 
		{
			int val = array[i];
			
			int j = i - 1;
			
			while(j>=0 && array[j]>val) 
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = val;
			
		}
		
		return array;
	}
	
   // insertion sort for string
	

	public static void insertionSort(String[] array) 
	{
		for(int i=1;i<array.length;i++) 
		{
		String val = array[i];
			
			int j = i - 1;
			
			while(j>=0 && array[j].compareTo(val)>0) 
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = val;
			
		}
	}
	
	// day of week

	public static int dayOfWeek(int y, int m, int d) 
	{
		
		  
	       int y0 = y - ((14 - m) / 12);
		   int	x = y0 + (y0/4) - (y0/100) +(y0/400);
		   int m0 = m + (12 * ((14 - m) / 12)) - 2;
		   int d0 = (d + x + ((31*m0) / 12)) %  7;
		   
		   return d0;
	}
	
	// function for temperature conversions
	
    // fahrenheit to celsius
	public static double fahrenheitToCelsius(double f) 
	{
	   double c = (f - 32) * 5/9;
	   return c;
	}

	
	// celsius to fahrenheit
	

	public static double celsiusToFahrenheit(double c) 
	{
		double f = (c * 9/5) + 32; 
        return f;
	}
	
	// get prime numbers less than 1000
	
	public static int[] primeNumbers()
	{
		int count= 0;
		int p = 0;
		int array[] = new int[168];
	   
		for(int i=2;i<1000;i++) 
		{
			count = 0;
			
			for(int j=1;j<i;j++) 
			{
			
				if(i%j == 0) 
				{
					count++;
				}
			}
			if(count<2 ) 
			{
				array[p++] = i;
			
			}
		}
		return array;
	}
	
	
	// print prime numbers between 1 and 1000
	
		public static void printNumbers(int []array) 
		{
			for(int i=0;i<array.length;i++) 
			{
				System.out.println(array[i]+" ");
			}
		}
		
		
     // to check whether given value is pallindrome
		
		public static boolean pallindrome(int val) 
		{
			int sum = 0;
			int n = val;
			
			while(n>0) 
			{
				int rem = n%10;
				sum = sum * 10 + rem ;
				n = n/10;
				
			}
			
			if(sum == val) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		
	// to check whether two integers are anagram
		
		public static boolean anagram(int num1, int num2) 
		{
			
			String string1 = Integer.toString(num1);
			String string2 = Integer.toString(num2);
			
			boolean isAnagram = true;
			
			if(string1.length()!= string2.length()) 
			{
				isAnagram =false;
			}
			
			char[] str1array = string1.toLowerCase().toCharArray();
			char[] str2array = string2.toLowerCase().toCharArray();
			
			Arrays.sort(str1array);
			Arrays.sort(str2array);
			
			if(Arrays.equals(str1array, str2array)) 
			{
				isAnagram = true;
			}
			
			else 
			{
				isAnagram = false;
			}
			return isAnagram;
		}
		
	
		// find out anagram numbers which are prime and less than 1000
		public static int[] findAnagram() 
		{
			
			boolean printed[] = new boolean[1000];
			int n = 168;
			int array[] = new int[n];
			array = Utility.primeNumbers();
			int out[] = new int[107]; 		
			int k= 0;
			int t= 0;
			int p =0;
			for(int i=0;i<n;i++) 
			{
				for(int j=0;j<n-1;j++) 
				{
					if(array[i]!= array[j]) {
					boolean isAnagram = Utility.anagram(array[i], array[j]);
					
				    if(isAnagram) 
				    {
				    	if(!printed[array[i]]){
				    	printed[array[i]] = true;
				    	out[p++] = array[i];
				    	
				    	}
				    }
					}
				    	}
				    }
			return out;
		}
		// check whether an year is leap year
		
		
		public static boolean leapYear(int year) 
		{
			if(year>999 && year<10000) 
				
			{
				if((year % 4== 0 && year%100 != 0) || year % 400 == 0) 
				{
				   return true;
				}
				else 
				{
					return false;
				}
			}
			return false;
			
		}
   
}
