package datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Dqueue array = new Dqueue();
		array.addFront('r');
		array.addFront('a');
		array.addFront('d');
		array.addFront('a');
		array.addFront('r');
		array.addRear('p');
		array.addFront('k');
		array.deleteFront();
		array.deleteRear();
		array.deleteRear();

		array.show();

		

		
//        Hashing code = new Hashing();
//        
//		
//		if(file.exists()) 
//		{
//		  for(int i=0;i<20;i++) {
//			  
//			  int val = (int)(Math.random()*100);
//	       writer.write(Integer.toString(val)+"  ");
//	      
//	       writer.flush();
//	      
//		  }
//		 
//		}
//		
//		for(int i=0;i<20;i++) 
//		{
//			int data = reader.read();
//			code.insertHashTable(data);
//			
//		}
//		
//		code.show();
	}

}
