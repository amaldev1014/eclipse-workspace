package datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class UnOrderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String[] names = readFromFile();
		LinkedList list = new LinkedList();
		for(int i = 0;i<names.length;i++) 
		{
		list.add(names[i]);
		}
		
		list.add("vignesh");
		
		list.add("manchesh");
		
		list.search("amal");
		
	
		list.search("antony");
		list.show();
	}
	
	public static String[] readFromFile() throws IOException 
	{
		
		Scanner scan = null;
		try {
			scan = new Scanner(new File("unordered.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			String names[] = null;;
		while(scan.hasNext()) 
		{
			names = scan.nextLine().split(" ");
		}
	   return names;
	}
	}


