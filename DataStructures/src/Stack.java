package datastructures;

public class Stack<T> {

	
	static Node head;
	
	// push to stack
	public void push(T data) 
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
	public  T pop()
	{
		if(isEmpty()) 
		{
			System.out.println("Empty");
			return null;
		}
		
		else 
		{
			Node n = head;
			
			while(n.next.next != null) 
			{
				n= n.next;
			}
			
			T p = (T) n.next.data;
			n.next = null;
			
			return p;
			
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
