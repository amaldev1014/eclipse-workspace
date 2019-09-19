package datastructures;



public class LinkedList<T> {

     Node<T> head = null;
     
     // add elements into the list
	public  void add(T data) 
	{
		Node node = new Node();
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
	// print  elements inside list
	public void show() 
	{
		Node n = head;
		
		while(n.next != null) 
		{
			System.out.println(n.data);
			n= n.next;
		}
		System.out.println(n.data);
	}
	
	// remove elements from the list
	
	public void remove(T val) 
	{
		Node prevNode = new Node();
		Node node = head;
		
		if(head == null) 
		{
			System.out.println("No data");
		}
		else if(head.data == val) 
		{
			head = node.next;
		}
		
		else 
		{
			
			
			while(node.data != val) 
			{
				prevNode = node;
				node = node.next;
			}
			prevNode.next = node.next; 
			}
			
	}
	
	// search for an element and if found delete it else insert it
	public void search(T data) 
	{
		Node n = head;
		
		while(n.data != data && n.next != null) 
		{
			n = n.next; 
		}
		
		if(n.data == data) 
		{
			remove(data);
		}
		
		else 
		{
			add(data);
		}
	}
}
