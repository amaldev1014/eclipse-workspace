package datastructures;

import java.util.Scanner;

public class PallindromChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner scan = new Scanner(System.in);

		
		  System.out.println("enter the string to check ");
		  
		  String str= scan.next();
		  
		  char[] ch= str.toCharArray();
		 
		
		  Dqueue d= new Dqueue();
		  
		  for(int i=0;i<ch.length;i++)
		  {
			  d.addRear(ch[i]);
		  }
		 
		  
		  char c[] = new char[ch.length];
		  
		  String s= " ";
		  
		  for(int j=0;j<ch.length;j++)
		  {
			  c[j]=d.deleteRear();
			   
		  }
		  
		  int i=0;
		  int flag=0;
		  
		  while(i<ch.length)
		  {
			  if(ch[i]==c[i])
			  {
				  i++;
				  flag=1;
			  }
			  else
			  {
				  flag=0;
				  break;
			  }
		  }
		 
		 if(flag==1)
		 {
			 System.out.println("String is palindrome");
		 }
		 else
		 {
			 System.out.println("String is not palindrome");
		 }
		
	
	}

	}


