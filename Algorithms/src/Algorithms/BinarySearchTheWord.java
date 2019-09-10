package Algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BinarySearchTheWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		UtilClass use = new UtilClass();
		
		File file = new File("binarysearch.txt");
		FileReader read = new FileReader(file);
		BufferedReader reader = new BufferedReader(read);
		file.createNewFile();
		if(file.exists()) 
		{
			System.out.println("file is created");
		}
		else 
		{
			System.out.println("file is not created");
		}
		
       
         String array[] = reader.readLine().split(",");
         System.out.println(Arrays.toString(array));
        Arrays.parallelSort(array);
        System.out.println(use.binarySearch(array,"amal"));
        System.out.println("sorted array: "+Arrays.toString(array));
        System.out.println(use.binarySearch(array,"kiran"));
        
	}
}
