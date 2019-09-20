package datastructures;

import java.util.Scanner;



public class CashCounter {


	static QueueArray queue = new QueueArray();
	static QueueArray queue2 = new QueueArray();
	
	
	public static void main(String args[]) {
	
	System.out.println("ENTER NUMBER OF PERSON ON QUEUE");

	Scanner scan = new Scanner(System.in);
	int number = scan.nextInt();
	while(number>0) {
	int count = 0;
	System.out.println("ENTER NAME AND BALANCE OF PERSON");
	String name = scan.next();
	double balance = scan.nextDouble();
	
	queue.enqueue(new Person(name,balance));
	number--;
	
	}
	queue.show();
	int count = queue.size();
	while(count >0) {
	
	System.out.println("do you want to withdraw or deposit");
	String what = scan.next();
	
	
	
	switch(what) 
	{
	
	case "deposit" : 
		System.out.println("Enter the amount to deposit");
		double amount = scan.nextDouble();
		queue.getFront().deposit(amount);
		queue2.enqueue(queue.dequeue());
		
		break;
	   
	    
	case "withdraw" :
		System.out.println("Enter the amount to withdraw");
		double mount = scan.nextDouble();
		queue.getFront().withdraw(mount);
		queue2.enqueue(queue.dequeue());
	    break;
	}
	
	count--;
	}
	
	queue2.show();
	}

}