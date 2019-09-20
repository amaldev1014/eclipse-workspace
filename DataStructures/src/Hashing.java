package datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;





public class Hashing {

	
static LinkedList<?> array[] = new LinkedList[11];

   
	  
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  for(int i=0;i<array.length;i++) 
		     {
			  array[i] = new LinkedList<>();
		     }
		readFromFile();
		
		show();

		
	}
	public static int hashFunction(int data) 
	{
		int index =0;
	    index = data%11;
	    return index;
	}
	public static void insertHashTable(int data) 
	{
		int index = hashFunction(data);
	 array[index].add(data);
		
	}
	
	public static void show() 
	{
		
		for(int i=0;i<10;i++) 
		{
			System.out.println("data in"+i+" th index");
			array[i].show();
			System.out.println();
		}
		
	}
	
	public static void readFromFile() throws IOException 
	{
		Scanner scan = null;
	
		try {
			scan = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(scan.hasNext()) 
		{
			insertHashTable(Integer.parseInt(scan.next()));
	
		
		}
	}
}
