package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    primeNumber();
     //anagram();
    
		
		
	}
	
	// To check whether given strings are anagram
	public static boolean anagram(String string1, String string2) 
	{
		
		
		
		boolean anagram = true;
		
		if(string1.length()!= string2.length()) 
		{
			anagram =false;
		}
		
		char[] str1array = string1.toLowerCase().toCharArray();
		char[] str2array = string2.toLowerCase().toCharArray();
		
		Arrays.sort(str1array);
		Arrays.sort(str2array);
		
		if(Arrays.equals(str1array, str2array)) 
		{
			anagram = true;
		}
		
		else 
		{
			anagram = false;
		}
		
		
		/*if(anagram) 
		{
			System.out.println("The given strings are anagram");
		}
		else {System.out.println("The given strings are not anagram");}*/
		
		return anagram;
		
	}
	
	// print primenmbers less than 1000
	public static int[] primeNumber() 
	{
		int t= 0;
		int array[] = new int[168];
	int count =0;
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
				array[t++] = i;
			
			}
		}
		return array;
		
		
	}
	
	// check whether given integer pallindrome or not
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
	
	public static boolean anagram(int num1, int num2) 
	{
		
		String string1 = Integer.toString(num1);
		String string2 = Integer.toString(num2);
		
		boolean anagram = true;
		
		if(string1.length()!= string2.length()) 
		{
			anagram =false;
		}
		
		char[] str1array = string1.toLowerCase().toCharArray();
		char[] str2array = string2.toLowerCase().toCharArray();
		
		Arrays.sort(str1array);
		Arrays.sort(str2array);
		
		if(Arrays.equals(str1array, str2array)) 
		{
			anagram = true;
		}
		
		else 
		{
			anagram = false;
		}
		
		
		/*if(anagram) 
		{
			System.out.println("The given strings are anagram");
		}
		else {System.out.println("The given strings are not anagram");}*/
		
		return anagram;
		
	}

}
