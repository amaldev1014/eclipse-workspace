package functional;

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
	
   
}
