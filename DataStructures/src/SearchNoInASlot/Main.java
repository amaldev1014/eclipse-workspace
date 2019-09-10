package SearchNoInASlot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

	
		
		File file = new File("/home/admin1/eclipse-workspace/DataStructures/input.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
        HashCode code = new HashCode();
        
		
		if(file.exists()) 
		{
		  for(int i=0;i<20;i++) {
			  
			  int val = (int)(Math.random()*100);
	       writer.write(Integer.toString(val)+"  ");
	      
	       writer.flush();
	      
		  }
		 
		}
		
		for(int i=0;i<20;i++) 
		{
			int data = reader.read();
			code.insertHashTAble(data);
			
		}
		
		code.show();
		
		
	}

}
