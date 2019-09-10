package Algorithms;


import java.util.Scanner;

public class VendingMachine {

	static int index = 1;
	static int count = 0;
	static int change[] = {1000,500,100,50,10,5,2,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the rupees for change: ");
		int amount = scan.nextInt();
		giveMeChange(amount, 1000);
		
	}
	
	public static void giveMeChange(int rs, int note) 
	{
		
		int no_of_notes = rs/note;
	
		if(no_of_notes > 0) 
		{
			count = count + no_of_notes; 
		}
		int dec = note * no_of_notes;
		int balance = rs - dec;
		if(no_of_notes > 0) {
		
		System.out.println(no_of_notes+ " notes of "+ note);
		}
		if(index < 8) 
		{
			giveMeChange(balance, change[index++]);
		}
		
	}
	

}
