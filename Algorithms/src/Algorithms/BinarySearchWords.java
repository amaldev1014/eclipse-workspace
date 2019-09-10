package Algorithms;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class BinarySearchWords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		
		try {
			FileReader reader = new FileReader("string.txt");
			BufferedReader buffer = new BufferedReader(reader);
			buffer.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	}

}
