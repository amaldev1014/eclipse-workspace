package datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class OrderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

      
		   String[] names = readFromFile();
		     int array[] = new int[names.length];
		   
	       LinkedList list = new LinkedList();
			for(int i = 0;i<names.length;i++) 
			{
				array[i] = Integer.parseInt(names[i]);
			
			}
			Arrays.sort(array);
			
			for(int i=0;i<array.length;i++) 
			{
				list.add(array[i]);
			}
			
			list.add(10);
		
			
			list.add(28);
			list.add(15);					
			/*list.search(28);
			list.search(12);					
			list.search(96);*/
         list.show();	
	}
	  
	  
	  
	  public static String[] readFromFile() throws IOException 
		{
		  File file = new File("ordered.txt");
		  file.createNewFile();
		  if(file.exists()) 
		  {
			  System.out.println("file found");
		  }
		  
			Scanner scan = null;
			try {
				scan = new Scanner(new File("ordered.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    String numbers[] = null;
			while(scan.hasNext()) 
			{
				numbers = scan.nextLine().split(" ");
			}
		   return numbers;
		}
	  
		
	}


