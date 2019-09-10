package UnOrderedList;

public class LinkedList {

	Node head;
	public void add(String data) 
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null) 
		{
			head = newNode;
		}
		
		else 
		{
			Node node = head;
			while(node.next != null) 
			{
				node = node.next;
			}
			node.next = newNode;
		}
	}
	
	public void show() 
	{
		Node node = head;
		
		while(node.next != null) 
		{
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.print(node.data);
	}
	
	
	public void remove(String val) 
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
	
	public void search(String data) 
	{
		Node node = head;
	    boolean found = false;
	    
		while(node.data != data && node.next != null) 
		{
			node = node.next;
			
		}
		
		if(node.data == data) 
		{
			remove(data);
		}
		else 
		{
			add(data);
		}
		
		
	}
}
