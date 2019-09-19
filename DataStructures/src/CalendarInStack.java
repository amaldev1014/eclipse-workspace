package datastructures;

import java.util.Scanner;

public class CalendarInStack {

	static Stack<Integer> stack1 = new Stack();
	static Stack<Integer> stack2 = new Stack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("PLEASE ENTER THE YEAR");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		System.out.println("PLEASE ENTER THE MONTH");
		int month = scan.nextInt();
		
		System.out.println(" sun"+"\t"+"mon"+"\t"+"tue"+"\t"+"wed"+"\t"+"thu"+"\t"+"fri"+"\t"+"sat  ");
		int r = 1 ;
		int c = getTheDay(year,month);
		

		int val = 1;
		for(int i = c;i<7;i++) 
		{
	
		
		}
		stack1.show();
		while(val <= getDaysInMonth(month,year) && r<5) {
		for(int i=0;i<7;i++) 
		{
			stack1.push(val++);
			if(val>getDaysInMonth(month,year)) 
			{
				break;
			}
		}
		r++;
		}
			
		
		while(!stack1.isEmpty()) 
		{
			stack2.push(stack1.pop());
		}
		stack2.show();
		print();
		
	}
	
	// get the first day of month
	public static int getTheDay(int y, int m) 
	{
		int d =1;
		int y0 = y - ((14 - m) / 12);
		   int	x = y0 + (y0/4) - (y0/100) +(y0/400);
		   int m0 = m + (12 * ((14 - m) / 12)) - 2;
		   int d0 = (d + x + ((31*m0) / 12)) %  7;
	   return d0;
	}
	
	//get number of days in that particular month
	public static int getDaysInMonth(int month, int year) 
	{
		if(Utility.leapYear(year) == true && month == 2) 
		{
			return 29;
		} 
		else
		{
			int days [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		return days[month-1];
		}
	}
	
	// print calendar
	
	public static void print() 
	{
		for(int i=0;i<5;i++) 
		{
			System.out.print(" ");
			for(int j=0;j<7;j++) 
			{
				System.out.print(stack2.pop()+"\t");
			}
			System.out.println();
		}
	}
	}


