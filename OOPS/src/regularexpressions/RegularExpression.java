package regularexpressions;

import java.io.BufferedReader;
import java.util.Date;
import java.util.Scanner;


public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  System.out.println("Enter the details need to be modified: ");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
	    StringBuilder builder = new StringBuilder();
	    
		 
		String str1 = str.replaceAll("<<name>>" , "AMALDEV");
		String str2 = str1.replaceAll("<<full name>>", "AMALDEV C");
		String str3 = str2.replaceAll("xxxxxxxxxx", "9562959785");
		String str4 = str3.replaceAll("01/01/2016","29/08/2019");
		System.out.println(str4);
	}

}
