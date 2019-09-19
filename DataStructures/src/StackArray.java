package datastructures;

public class StackArray {

	
	int n = 10; 
	int array[] = new int[10];
	int top = -1;
	
	// push into the stack
	public void push(int data) 
	{
		array[++top] = data;
		
	}
	
	// pop from the stack
	public int pop() 
	{
		if(isEmpty()) 
		{
			
			
			return -1;
		}
		else {
		int val = array[top];
		array[top--] = 0;
		return val;
		}
	}
	
	// check whether stack is empty
	public boolean isEmpty() 
	{
		if(top == -1) 
		{
	 		return true;
		}
		else 
		{
			return false;
		}
	}
	
	// returns the peek of stack
	public int peek() 
	{
		return array[top];
	}
	
	public int size() 
	{
		return top+1;
	}
	
	// print all elements in FILO manner
	public void show() 
	{
		for(int i=0;i<=top;i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
