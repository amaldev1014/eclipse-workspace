package datastructures;

import java.util.Scanner;



public class CashCounter {


	static QueueArray queue = new QueueArray();
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
	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());
	}

}