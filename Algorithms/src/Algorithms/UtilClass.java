package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class UtilClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//search();
		System.out.println("Enter the string to be searched: ");
		Scanner scan = new Scanner(System.in);
		String search = scan.next();
		String array[] = {"amal","sabu","asish","kiran","sebastin", "babu"};
		insertionSort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(binarySearch(array, search));
		
	}
	
	public static void sort() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in the array: ");
		int n= scan.nextInt();
		System.out.println("Enter elements in the array: ");
		int array[] = new int[n];
 		for(int i=0;i<n;i++) 
		{
			array[i] = scan.nextInt();
		}
 		
 		int array2[] = bubbleSort(array);
	    for(int i=0;i<n;i++) 
	    {
	    	System.out.print(array2[i]+" ");
	    }
 		
	}
	public static void search() 
	{
		System.out.println("No of elements in the array: ");
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter the elements in the array: ");
		int array[] = new int[n];
		for(int i=0;i<n;i++) 
		{
			array[i] = scan.nextInt();
		}
		System.out.println("Enter the number to search: ");
		int s = scan.nextInt();
		int l = array[0];
		int r = array[array.length-1];
		int out = binarySearch(array, s, l, r);
		System.out.println(out);
	}
	
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

}
