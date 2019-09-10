package BankingCashCounter;

public class Queue {

	int n = 10;
	int array[] = new int[n];
	int front = 0;
	int rear = 0;
	
	public void enqueue(int data) 
	{
		array[rear] = data;
		rear++;
	}
	
	public int dequeue() 
	{
		return array[front++];
	}
	
	public void show() 
	{
		for(int i = front;i<rear;i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public int size() 
	{
		return rear-front;
	}
	
	public boolean isEmpty() 
	{
		if(front == rear) 
		{
			return true;
		}
		
		else 
		{
			return false;
		}
	}
}
