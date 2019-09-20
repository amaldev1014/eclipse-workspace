package datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class OrderedList {


	static Scanner scan = new Scanner(System.in);
	 static int count =0;
	 static String file = "ordered.txt"; 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		String strings[] = list.readFromFile(file);
		
		int array[] = new int[strings.length];
	   
		
	     for( count=0;count<strings.length;count++) 
	     {
	    	 array[count] = Integer.parseInt((strings[count]));
	    	 list.add(array[count]);
	     }
	     
	     list.show();
		//list.writeOnFile(file, array);
	     
	     System.out.println("Enter the operation");
	     String opr = scan.next();
	     switch(opr) 
	     {
	     case "add" :
	    	 System.out.println("Enter the number");
	    	 int val = scan.nextInt();
	    	 add(val, array ,list);
	     }
		
		
				
	
	}
	public static void add(int val, int array[], LinkedList list) throws IOException 
	{
		list.add(val);array[++count] = val;
		list.writeOnFile(file,array,val);
		
	}
	
	  
	  
	 
	  
		
	}


