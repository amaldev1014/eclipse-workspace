package datastructures;



public class QueueArray {


	int n = 10;
	 
      Person[] array = new Person[n];
	int front = 0;
	int rear = 0;
	
	
	
	public void enqueue(Person data) 
	{
		array[rear] = (Person) data;
		rear++;
	}
	
	public Person dequeue() 
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
