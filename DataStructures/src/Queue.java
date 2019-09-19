package datastructures;

public class Queue<T> {
	
	static Node head;
	
	public void enqueue(T data) 
	{
		Node<T> node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) 
		{
			head = node;
		}
		
		else 
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node; 
		}
	}
	
	// pop from stack
	public  T dequeue()
	{
		if(isEmpty()) 
		{
			System.out.println("Empty");
			return null;
		}
		
		else 
		{
			Node n = head;
			
			head = head.next;
			return (T)n.data;
			
		}
	
	}
	
	// check whether the stack is empty
	public static boolean isEmpty() 
	{
		if(head == null) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	// print elements in the stack
	
	public static void show() 
	{
		Node n;
		n = head;
		
		while(n.next != null) 
		{
			System.out.println(n.data);
			n= n.next;
		}
		System.out.println(n.data);
		
	}

}
