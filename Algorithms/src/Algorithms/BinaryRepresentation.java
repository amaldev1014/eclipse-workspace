package Algorithms;

import java.util.Scanner;

public class BinaryRepresentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the decimal number :");
		int n = scan.nextInt();
		while(n>0) 
		{
			System.out.print(n%2);
			n = n / 2;
		}
	}

}
