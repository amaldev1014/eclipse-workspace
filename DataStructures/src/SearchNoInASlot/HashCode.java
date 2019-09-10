package SearchNoInASlot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import OrderedList.LinkedList;

public class HashCode {

	LinkedList array[] = new LinkedList[11];
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	}
	public int hashFunction(int data) 
	{
		int index =0;
	    index = data%11;
	    return index;
	}
	public void insertHashTAble(int data) 
	{
		int index = hashFunction(data);
		array[index].add(data);
		
	}
	
	public void show() 
	{
		
		for(int i=0;i<10;i++) 
		{
			array[i].show();
			System.out.println();
		}
		
	}
 }
