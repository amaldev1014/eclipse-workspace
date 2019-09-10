package OrderedList;

public class LinkedList {

	Node head;
	public void add(int data) 
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
			Node prevNode = new Node();
			if(data< head.data) 
			{
				head = newNode;
				newNode.next = node;
			}else {
			
			while(node.next != null && node.data < data) 
			{
				prevNode = node;
				node = node.next;
			}
			if(node.data > data) 
			{
				prevNode.next = newNode;
				newNode.next = node;
			}
			else 
			{
				node.next = newNode;
			}
		}
			}
	}
	
	public void show() 
	{
		if(head == null) 
		{
			System.out.println("No data");
		}
		Node node = head;
		
		
		while(node.next != null) 
		{
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.print(node.data);
	}
	
	
	public void remove(int val) 
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
	
	public void search(int data) 
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
